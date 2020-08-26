package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxisYOptions extends ChartAxisXOptions {
  /**
    * When includeZero is set to true, axisY sets the range in such a way that Zero is a part of it. It is set to true by default.
    * But, whenever y values are very big and difference among dataPoints are hard to judge,
    * setting includeZero to false makes axisY to set a range that makes the differences prominently visible.
    * Default: true
    * Example: true, false
    */
  var includeZero: js.UndefOr[Boolean] = js.native
}

object ChartAxisYOptions {
  @scala.inline
  def apply(): ChartAxisYOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisYOptions]
  }
  @scala.inline
  implicit class ChartAxisYOptionsOps[Self <: ChartAxisYOptions] (val x: Self) extends AnyVal {
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
    def setIncludeZero(value: Boolean): Self = this.set("includeZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeZero: Self = this.set("includeZero", js.undefined)
  }
  
}

