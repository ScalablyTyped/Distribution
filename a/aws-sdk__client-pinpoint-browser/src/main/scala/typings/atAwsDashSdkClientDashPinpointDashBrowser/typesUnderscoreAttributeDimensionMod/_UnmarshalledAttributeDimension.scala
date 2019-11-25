package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAttributeDimensionMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.EXCLUSIVE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.INCLUSIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAttributeDimension extends _AttributeDimension {
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  @JSName("Values")
  var Values__UnmarshalledAttributeDimension: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledAttributeDimension {
  @scala.inline
  def apply(AttributeType: INCLUSIVE | EXCLUSIVE | String = null, Values: js.Array[String] = null): _UnmarshalledAttributeDimension = {
    val __obj = js.Dynamic.literal()
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledAttributeDimension]
  }
}

