package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDimension extends js.Object {
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.pinpointMod.AttributeType] = js.native
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property, endpoints are included or excluded from the segment if their attribute values match the criteria values.
    */
  var Values: ListOfString = js.native
}

object AttributeDimension {
  @scala.inline
  def apply(Values: ListOfString, AttributeType: AttributeType = null): AttributeDimension = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDimension]
  }
}

