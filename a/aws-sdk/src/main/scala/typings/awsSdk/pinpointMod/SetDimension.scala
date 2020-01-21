package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDimension extends js.Object {
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
    */
  var DimensionType: js.UndefOr[typings.awsSdk.pinpointMod.DimensionType] = js.native
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the DimensionType property, endpoints are included or excluded from the segment if their values match the criteria values.
    */
  var Values: ListOfString = js.native
}

object SetDimension {
  @scala.inline
  def apply(Values: ListOfString, DimensionType: DimensionType = null): SetDimension = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    if (DimensionType != null) __obj.updateDynamic("DimensionType")(DimensionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDimension]
  }
}

