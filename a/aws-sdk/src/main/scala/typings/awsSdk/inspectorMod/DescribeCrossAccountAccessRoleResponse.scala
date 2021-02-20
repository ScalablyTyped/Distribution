package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCrossAccountAccessRoleResponse extends StObject {
  
  /**
    * The date when the cross-account access role was registered.
    */
  var registeredAt: Timestamp = js.native
  
  /**
    * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
    */
  var roleArn: Arn = js.native
  
  /**
    * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon Inspector to access your AWS account.
    */
  var valid: Bool = js.native
}
object DescribeCrossAccountAccessRoleResponse {
  
  @scala.inline
  def apply(registeredAt: Timestamp, roleArn: Arn, valid: Bool): DescribeCrossAccountAccessRoleResponse = {
    val __obj = js.Dynamic.literal(registeredAt = registeredAt.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCrossAccountAccessRoleResponse]
  }
  
  @scala.inline
  implicit class DescribeCrossAccountAccessRoleResponseMutableBuilder[Self <: DescribeCrossAccountAccessRoleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisteredAt(value: Timestamp): Self = StObject.set(x, "registeredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Bool): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
