package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartConfiguration extends js.Object {
  var data: js.UndefOr[ChartData] = js.native
  var options: js.UndefOr[ChartOptions] = js.native
  var plugins: js.UndefOr[js.Array[PluginServiceRegistrationOptions]] = js.native
  var `type`: js.UndefOr[ChartType | String] = js.native
}

object ChartConfiguration {
  @scala.inline
  def apply(): ChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartConfiguration]
  }
  @scala.inline
  implicit class ChartConfigurationOps[Self <: ChartConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: ChartData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setOptions(value: ChartOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: PluginServiceRegistrationOptions*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[PluginServiceRegistrationOptions]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setType(value: ChartType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

