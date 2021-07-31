package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group or firewall policy whose resource policy you want to retrieve. 
    */
  var ResourceArn: typings.awsSdk.networkfirewallMod.ResourceArn
}
object DescribeResourcePolicyRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): DescribeResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class DescribeResourcePolicyRequestMutableBuilder[Self <: DescribeResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
