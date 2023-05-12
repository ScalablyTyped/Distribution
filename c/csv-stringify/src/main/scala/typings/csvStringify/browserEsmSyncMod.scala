package typings.csvStringify

import typings.csvStringify.mod.Input
import typings.csvStringify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserEsmSyncMod {
  
  @JSImport("csv-stringify/browser/esm/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(input: Input): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(input: Input, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
