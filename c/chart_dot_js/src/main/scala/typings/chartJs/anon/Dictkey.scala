package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var global: ChartOptionsChartFontOpti
}

object Dictkey {
  @scala.inline
  def apply(global: ChartOptionsChartFontOpti, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

