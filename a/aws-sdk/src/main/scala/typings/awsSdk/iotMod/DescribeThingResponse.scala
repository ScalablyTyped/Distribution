package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThingResponse extends js.Object {
  
  /**
    * The thing attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The name of the billing group the thing belongs to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  
  /**
    * The default MQTT client ID. For a typical device, the thing name is also used as the default MQTT client ID. Although we don’t require a mapping between a thing's registry name and its use of MQTT client IDs, certificates, or shadow state, we recommend that you choose a thing name and use it as the MQTT client ID for the registry and the Device Shadow service. This lets you better organize your AWS IoT fleet without removing the flexibility of the underlying device certificate model or shadows.
    */
  var defaultClientId: js.UndefOr[ClientId] = js.native
  
  /**
    * The ARN of the thing to describe.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  
  /**
    * The ID of the thing to describe.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  
  /**
    * The current version of the thing record in the registry.  To avoid unintentional changes to the information in the registry, you can pass the version information in the expectedVersion parameter of the UpdateThing and DeleteThing calls. 
    */
  var version: js.UndefOr[Version] = js.native
}
object DescribeThingResponse {
  
  @scala.inline
  def apply(): DescribeThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingResponse]
  }
  
  @scala.inline
  implicit class DescribeThingResponseOps[Self <: DescribeThingResponse] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupName: Self = this.set("billingGroupName", js.undefined)
    
    @scala.inline
    def setDefaultClientId(value: ClientId): Self = this.set("defaultClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClientId: Self = this.set("defaultClientId", js.undefined)
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = this.set("thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingArn: Self = this.set("thingArn", js.undefined)
    
    @scala.inline
    def setThingId(value: ThingId): Self = this.set("thingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingId: Self = this.set("thingId", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
