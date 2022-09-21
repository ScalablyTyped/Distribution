package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceAttributeRequest extends StObject {
  
  /**
    * The type of attribute.
    */
  var AttributeType: InstanceAttributeType
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object DescribeInstanceAttributeRequest {
  
  inline def apply(AttributeType: InstanceAttributeType, InstanceId: InstanceId): DescribeInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(AttributeType = AttributeType.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceAttributeRequest]
  }
  
  extension [Self <: DescribeInstanceAttributeRequest](x: Self) {
    
    inline def setAttributeType(value: InstanceAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
