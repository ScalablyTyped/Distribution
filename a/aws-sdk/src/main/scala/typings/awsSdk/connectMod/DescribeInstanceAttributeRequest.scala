package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceAttributeRequest extends StObject {
  
  /**
    * The type of attribute.
    */
  var AttributeType: InstanceAttributeType = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
}
object DescribeInstanceAttributeRequest {
  
  @scala.inline
  def apply(AttributeType: InstanceAttributeType, InstanceId: InstanceId): DescribeInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(AttributeType = AttributeType.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceAttributeRequest]
  }
  
  @scala.inline
  implicit class DescribeInstanceAttributeRequestMutableBuilder[Self <: DescribeInstanceAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeType(value: InstanceAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
