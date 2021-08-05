package typings.dateFnsUpgrade

import typings.dateFnsUpgrade.legacyParseMod.LegacyParseOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2Mod {
  
  @JSImport("@date-fns/upgrade/v2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertTokens(format: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTokens")(format.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def legacyParse(argument: js.Any): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyParse")(argument.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def legacyParse(argument: js.Any, options: LegacyParseOptions): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyParse")(argument.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def legacyParseMap(array: js.Array[js.Any]): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyParseMap")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
}
