package typings.barnard59GraphStore

import typings.barnard59GraphStore.getMod.Options
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.streamMod.Stream
import typings.readableStream.mod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barnard59-graph-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(arg: Options): Stream[Quad] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(arg.asInstanceOf[js.Any]).asInstanceOf[Stream[Quad]]
  
  inline def post(arg: typings.barnard59GraphStore.postMod.Options): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(arg.asInstanceOf[js.Any]).asInstanceOf[Writable]
  
  inline def put(arg: typings.barnard59GraphStore.putMod.Options): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(arg.asInstanceOf[js.Any]).asInstanceOf[Writable]
}
