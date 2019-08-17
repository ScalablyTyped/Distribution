package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAttributeDimensionMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.EXCLUSIVE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.INCLUSIVE
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AttributeDimension extends js.Object {
  /**
    * The type of dimension:
    *
    * INCLUSIVE - Endpoints that match the criteria are included in the segment.
    *
    * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
    */
  var AttributeType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.undefined
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  var Values: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
}

object _AttributeDimension {
  @scala.inline
  def apply(
    AttributeType: INCLUSIVE | EXCLUSIVE | String = null,
    Values: js.Array[String] | Iterable[String] = null
  ): _AttributeDimension = {
    val __obj = js.Dynamic.literal()
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AttributeDimension]
  }
}

