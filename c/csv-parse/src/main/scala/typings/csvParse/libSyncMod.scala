package typings.csvParse

import typings.csvParse.mod.Options
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyncMod {
  
  inline def apply(input: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(input: String, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(input: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(input: Buffer, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("csv-parse/lib/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
