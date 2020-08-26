package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStyleItemStylers
  extends /* k */ StringDictionary[js.UndefOr[String]] {
  var color: js.UndefOr[String] = js.native
  var curZoomRegion: js.UndefOr[String] = js.native
  var curZoomRegionId: js.UndefOr[String] = js.native
  var fontsize: js.UndefOr[String] = js.native
  var level: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[String] = js.native
  var weight: js.UndefOr[String] = js.native
}

object MapStyleItemStylers {
  @scala.inline
  def apply(): MapStyleItemStylers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStyleItemStylers]
  }
  @scala.inline
  implicit class MapStyleItemStylersOps[Self <: MapStyleItemStylers] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCurZoomRegion(value: String): Self = this.set("curZoomRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurZoomRegion: Self = this.set("curZoomRegion", js.undefined)
    @scala.inline
    def setCurZoomRegionId(value: String): Self = this.set("curZoomRegionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurZoomRegionId: Self = this.set("curZoomRegionId", js.undefined)
    @scala.inline
    def setFontsize(value: String): Self = this.set("fontsize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontsize: Self = this.set("fontsize", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

