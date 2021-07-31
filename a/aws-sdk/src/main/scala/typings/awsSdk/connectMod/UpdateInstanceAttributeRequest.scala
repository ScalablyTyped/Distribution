package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceAttributeRequest extends StObject {
  
  /**
    * The type of attribute.
    */
  var AttributeType: InstanceAttributeType
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The value for the attribute. Maximum character limit is 100. 
    */
  var Value: InstanceAttributeValue
}
object UpdateInstanceAttributeRequest {
  
  @scala.inline
  def apply(AttributeType: InstanceAttributeType, InstanceId: InstanceId, Value: InstanceAttributeValue): UpdateInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(AttributeType = AttributeType.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceAttributeRequest]
  }
  
  @scala.inline
  implicit class UpdateInstanceAttributeRequestMutableBuilder[Self <: UpdateInstanceAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeType(value: InstanceAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: InstanceAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
