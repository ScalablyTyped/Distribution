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
  def apply(thingName: ThingName): CreateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingRequest]
  }
  @scala.inline
  implicit class CreateThingRequestOps[Self <: CreateThingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributePayload(value: AttributePayload): Self = this.set("attributePayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributePayload: Self = this.set("attributePayload", js.undefined)
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingGroupName: Self = this.set("billingGroupName", js.undefined)
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
  }
  
}

