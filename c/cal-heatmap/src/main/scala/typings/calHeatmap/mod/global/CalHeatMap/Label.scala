package typings.calHeatmap.mod.global.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Position and alignment of the domain label. */
@js.native
trait Label extends js.Object {
  /**
    * Horizontal align of the domain. Default: "center"
    * Valid values: {"left", "center", "right"}
    */
  var align: js.UndefOr[String] = js.native
  /**
    * Height of the domain label in pixels.
    * By leaving it to null, the label will be set to 2 times the height of the subDomain cell.
    * If you want to remove the label, set domainLabelFormat to "" (empty string), instead
    * of setting the label height to 0. Default: null
    * Valid values: any integer
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * More control about label positioning, if the default value does not fit your need,
    * especially when label is rotated, or when using a big font-size. Default: {x:0, y:0}
    */
  var offset: js.UndefOr[LabelOffset] = js.native
  /**
    * Position of the label, relative to the domain. Default: "bottom"
    * Valid values: {"top", "right", "bottom", "left"}
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Rotation for a vertical label. Default: null
    * Valid values: {null, "left", "right"}
    */
  var rotate: js.UndefOr[String] = js.native
  /**
    * Only used when label is rotated, defines the width of the label. Default: 100
    * Valid values: any intger
    */
  var width: js.UndefOr[Double] = js.native
}

object Label {
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOffset(value: LabelOffset): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRotate(value: String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

