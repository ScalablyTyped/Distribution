package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapElementStyle extends js.Object {
  /**
    * Hex color used for filling polygons, the background of point icons, and for the center of lines if they have split.
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    * The hex color of a map label.
    */
  var labelColor: js.UndefOr[String] = js.native
  /**
    * The outline hex color of a map label.
    */
  var labelOutlineColor: js.UndefOr[String] = js.native
  /**
    * Species if a map label type is visible or not.
    */
  var labelVisible: js.UndefOr[Boolean] = js.native
  /**
    * Hex color used for the outline around polygons, the outline around point icons, and the color of lines.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Specifies if the map element is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IMapElementStyle {
  @scala.inline
  def apply(): IMapElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapElementStyle]
  }
  @scala.inline
  implicit class IMapElementStyleOps[Self <: IMapElementStyle] (val x: Self) extends AnyVal {
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    @scala.inline
    def setLabelOutlineColor(value: String): Self = this.set("labelOutlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOutlineColor: Self = this.set("labelOutlineColor", js.undefined)
    @scala.inline
    def setLabelVisible(value: Boolean): Self = this.set("labelVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelVisible: Self = this.set("labelVisible", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

