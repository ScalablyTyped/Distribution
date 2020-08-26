package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewOptions extends js.Object {
  /** The bounding rectangle of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var bounds: js.UndefOr[LocationRect] = js.native
  /** The location of the center of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var center: js.UndefOr[Location] = js.native
  /**	The amount the center is shifted in pixels.This property is ignored if center is not specified. */
  var centerOffset: js.UndefOr[Point] = js.native
  /**
    * The directional heading of the map. The heading is represented in geometric degrees with 0 or 360 = North, 90 = East,
    * 180 = South, and 270 = West.
    */
  var heading: js.UndefOr[Double] = js.native
  /** Indicates how the map labels are displayed. */
  var labelOverlay: js.UndefOr[LabelOverlay] = js.native
  /** The map type of the view. */
  var mapTypeId: js.UndefOr[MapTypeId] = js.native
  /** The amount of padding in pixels to be added to each side of the bounds of the map view. */
  var padding: js.UndefOr[Double] = js.native
  /** The angle relative to the horizon to tilt a streetside panorama image. */
  var pitch: js.UndefOr[Double] = js.native
  /** The zoom level of the map view. */
  var zoom: js.UndefOr[Double] = js.native
}

object IViewOptions {
  @scala.inline
  def apply(): IViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewOptions]
  }
  @scala.inline
  implicit class IViewOptionsOps[Self <: IViewOptions] (val x: Self) extends AnyVal {
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
    def setBounds(value: LocationRect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCenter(value: Location): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setCenterOffset(value: Point): Self = this.set("centerOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterOffset: Self = this.set("centerOffset", js.undefined)
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setLabelOverlay(value: LabelOverlay): Self = this.set("labelOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOverlay: Self = this.set("labelOverlay", js.undefined)
    @scala.inline
    def setMapTypeId(value: MapTypeId): Self = this.set("mapTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeId: Self = this.set("mapTypeId", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

