package typings.csvStringify

import typings.csvStringify.mod.Input
import typings.csvStringify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSyncMod {
  
  @JSImport("csv-stringify/dist/esm/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(input: Input): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(input: Input, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
