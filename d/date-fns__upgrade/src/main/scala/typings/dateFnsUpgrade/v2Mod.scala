package typings.dateFnsUpgrade

import typings.dateFnsUpgrade.legacyParseMod.LegacyParseOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@date-fns/upgrade/v2", JSImport.Namespace)
@js.native
object v2Mod extends js.Object {
  
  def convertTokens(format: String): String = js.native
  
  def legacyParse(argument: js.Any): Date = js.native
  def legacyParse(argument: js.Any, options: LegacyParseOptions): Date = js.native
  
  def legacyParseMap(array: js.Array[_]): js.Array[Date] = js.native
}
