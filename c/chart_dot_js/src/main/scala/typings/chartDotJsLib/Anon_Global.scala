package typings
package chartDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Global
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var global: chartDotJsLib.chartDotJsMod.ChartNs.ChartOptions with chartDotJsLib.chartDotJsMod.ChartNs.ChartFontOptions
}

object Anon_Global {
  @scala.inline
  def apply(
    global: chartDotJsLib.chartDotJsMod.ChartNs.ChartOptions with chartDotJsLib.chartDotJsMod.ChartNs.ChartFontOptions,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Global = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("global")(global)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Global]
  }
}

