package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartConfiguration extends js.Object {
  var data: js.UndefOr[ChartData] = js.undefined
  var options: js.UndefOr[ChartOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[PluginServiceRegistrationOptions]] = js.undefined
  var `type`: js.UndefOr[ChartType | java.lang.String] = js.undefined
}

object ChartConfiguration {
  @scala.inline
  def apply(
    data: ChartData = null,
    options: ChartOptions = null,
    plugins: js.Array[PluginServiceRegistrationOptions] = null,
    `type`: ChartType | java.lang.String = null
  ): ChartConfiguration = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (options != null) __obj.updateDynamic("options")(options)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartConfiguration]
  }
}

