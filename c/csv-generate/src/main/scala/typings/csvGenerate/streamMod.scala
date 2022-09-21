package typings.csvGenerate

import typings.csvGenerate.mod.Options
import typings.node.bufferMod.global.Buffer
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("csv-generate/dist/esm/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): ReadableStream[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[ReadableStream[Buffer]]
  inline def generate(options: Options): ReadableStream[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Buffer]]
}
