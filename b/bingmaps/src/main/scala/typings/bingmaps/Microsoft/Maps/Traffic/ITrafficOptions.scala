package typings.bingmaps.Microsoft.Maps.Traffic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITrafficOptions extends js.Object {
  /** Displays the traffic flow layer. */
  var flowVisible: js.UndefOr[Boolean] = js.native
  /** Displays all traffic incidents. */
  var incidentsVisible: js.UndefOr[Boolean] = js.native
  /** Displays the traffic legend. */
  var legendVisible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the opacity of the traffic flow tile layer. Must be a number between 0 and 1. The default is 1 unless the map
    * mode is set to lite, in which case the default is set to 0.7.
    */
  var opacity: js.UndefOr[Double] = js.native
}

object ITrafficOptions {
  @scala.inline
  def apply(): ITrafficOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrafficOptions]
  }
  @scala.inline
  implicit class ITrafficOptionsOps[Self <: ITrafficOptions] (val x: Self) extends AnyVal {
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
    def setFlowVisible(value: Boolean): Self = this.set("flowVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowVisible: Self = this.set("flowVisible", js.undefined)
    @scala.inline
    def setIncidentsVisible(value: Boolean): Self = this.set("incidentsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncidentsVisible: Self = this.set("incidentsVisible", js.undefined)
    @scala.inline
    def setLegendVisible(value: Boolean): Self = this.set("legendVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendVisible: Self = this.set("legendVisible", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

