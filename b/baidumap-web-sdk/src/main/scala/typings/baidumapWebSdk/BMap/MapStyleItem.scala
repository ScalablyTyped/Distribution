package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStyleItem extends js.Object {
  var elementType: js.UndefOr[String] = js.native
  var featureType: js.UndefOr[String] = js.native
  var stylers: MapStyleItemStylers = js.native
}

object MapStyleItem {
  @scala.inline
  def apply(stylers: MapStyleItemStylers): MapStyleItem = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleItem]
  }
  @scala.inline
  implicit class MapStyleItemOps[Self <: MapStyleItem] (val x: Self) extends AnyVal {
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
    def setStylers(value: MapStyleItemStylers): Self = this.set("stylers", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementType(value: String): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    @scala.inline
    def setFeatureType(value: String): Self = this.set("featureType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureType: Self = this.set("featureType", js.undefined)
  }
  
}

