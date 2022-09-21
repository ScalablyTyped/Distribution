package typings.chartJs

import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersIntlMod {
  
  @JSImport("chart.js/types/helpers/helpers.intl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatNumber(num: Double, locale: String, options: NumberFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(num.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
