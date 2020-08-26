package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Space extends js.Object {
  /**
    * Set space between bars in bar charts
    */
  var space: js.UndefOr[Double] = js.native
  /**
    * Change the width of bars. If ratio is specified, change the width of bar chart by ratio.
    */
  var width: js.UndefOr[Double | Ratio] = js.native
  /**
    * Set if min or max value will be 0 on bar chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.native
}

object Space {
  @scala.inline
  def apply(): Space = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Space]
  }
  @scala.inline
  implicit class SpaceOps[Self <: Space] (val x: Self) extends AnyVal {
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
    def setSpace(value: Double): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setWidth(value: Double | Ratio): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZerobased(value: Boolean): Self = this.set("zerobased", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZerobased: Self = this.set("zerobased", js.undefined)
  }
  
}

