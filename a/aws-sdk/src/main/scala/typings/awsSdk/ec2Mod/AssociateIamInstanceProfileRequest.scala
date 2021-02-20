package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateIamInstanceProfileRequest extends StObject {
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}
object AssociateIamInstanceProfileRequest {
  
  @scala.inline
  def apply(IamInstanceProfile: IamInstanceProfileSpecification, InstanceId: InstanceId): AssociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(IamInstanceProfile = IamInstanceProfile.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIamInstanceProfileRequest]
  }
  
  @scala.inline
  implicit class AssociateIamInstanceProfileRequestMutableBuilder[Self <: AssociateIamInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
