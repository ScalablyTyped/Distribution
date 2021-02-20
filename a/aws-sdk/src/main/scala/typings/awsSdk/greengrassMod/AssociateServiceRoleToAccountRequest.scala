package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateServiceRoleToAccountRequest extends StObject {
  
  /**
    * The ARN of the service role you wish to associate with your account.
    */
  var RoleArn: string = js.native
}
object AssociateServiceRoleToAccountRequest {
  
  @scala.inline
  def apply(RoleArn: string): AssociateServiceRoleToAccountRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateServiceRoleToAccountRequest]
  }
  
  @scala.inline
  implicit class AssociateServiceRoleToAccountRequestMutableBuilder[Self <: AssociateServiceRoleToAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
