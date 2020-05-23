package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingRequest extends js.Object {
  /**
    * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.native
  /**
    * The name of the billing group the thing will be added to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The name of the thing to create. You can't change a thing's name after you create it. To change a thing's name, you must create a new thing, give it the new name, and then delete the old thing.
    */
  var thingName: ThingName = js.native
  /**
    * The name of the thing type associated with the new thing.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object CreateThingRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    attributePayload: AttributePayload = null,
    billingGroupName: BillingGroupName = null,
    thingTypeName: ThingTypeName = null
  ): CreateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    if (attributePayload != null) __obj.updateDynamic("attributePayload")(attributePayload.asInstanceOf[js.Any])
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingRequest]
  }
}

