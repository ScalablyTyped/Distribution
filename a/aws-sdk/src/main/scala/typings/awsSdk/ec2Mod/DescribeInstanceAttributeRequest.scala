package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceAttributeRequest extends StObject {
  
  /**
    * The instance attribute. Note: The enaSupport attribute is not supported at this time.
    */
  var Attribute: InstanceAttributeName
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId
}
object DescribeInstanceAttributeRequest {
  
  inline def apply(Attribute: InstanceAttributeName, InstanceId: InstanceId): DescribeInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceAttributeRequest]
  }
  
  extension [Self <: DescribeInstanceAttributeRequest](x: Self) {
    
    inline def setAttribute(value: InstanceAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
