package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInstanceAttributeRequest extends js.Object {
  
  /**
    * The type of attribute.
    */
  var AttributeType: InstanceAttributeType = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The value for the attribute. Maximum character limit is 100. 
    */
  var Value: InstanceAttributeValue = js.native
}
object UpdateInstanceAttributeRequest {
  
  @scala.inline
  def apply(AttributeType: InstanceAttributeType, InstanceId: InstanceId, Value: InstanceAttributeValue): UpdateInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(AttributeType = AttributeType.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceAttributeRequest]
  }
  
  @scala.inline
  implicit class UpdateInstanceAttributeRequestOps[Self <: UpdateInstanceAttributeRequest] (val x: Self) extends AnyVal {
    
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
    def setAttributeType(value: InstanceAttributeType): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: InstanceAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
