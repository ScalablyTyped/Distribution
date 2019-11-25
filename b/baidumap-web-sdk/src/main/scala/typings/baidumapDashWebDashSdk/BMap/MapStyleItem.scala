package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStyleItem extends js.Object {
  var elementType: js.UndefOr[String] = js.undefined
  var featureType: js.UndefOr[String] = js.undefined
  var stylers: MapStyleItemStylers
}

object MapStyleItem {
  @scala.inline
  def apply(stylers: MapStyleItemStylers, elementType: String = null, featureType: String = null): MapStyleItem = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleItem]
  }
}

