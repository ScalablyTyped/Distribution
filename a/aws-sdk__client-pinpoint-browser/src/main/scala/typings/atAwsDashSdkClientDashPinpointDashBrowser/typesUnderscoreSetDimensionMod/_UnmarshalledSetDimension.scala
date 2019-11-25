package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSetDimensionMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.EXCLUSIVE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.INCLUSIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSetDimension extends _SetDimension {
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  @JSName("Values")
  var Values__UnmarshalledSetDimension: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledSetDimension {
  @scala.inline
  def apply(DimensionType: INCLUSIVE | EXCLUSIVE | String = null, Values: js.Array[String] = null): _UnmarshalledSetDimension = {
    val __obj = js.Dynamic.literal()
    if (DimensionType != null) __obj.updateDynamic("DimensionType")(DimensionType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSetDimension]
  }
}

