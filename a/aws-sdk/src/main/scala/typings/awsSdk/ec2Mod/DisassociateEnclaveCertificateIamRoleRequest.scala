package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateEnclaveCertificateIamRoleRequest extends StObject {
  
  /**
    * The ARN of the ACM certificate from which to disassociate the IAM role.
    */
  var CertificateArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the IAM role to disassociate.
    */
  var RoleArn: js.UndefOr[ResourceArn] = js.undefined
}
object DisassociateEnclaveCertificateIamRoleRequest {
  
  @scala.inline
  def apply(): DisassociateEnclaveCertificateIamRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateEnclaveCertificateIamRoleRequest]
  }
  
  @scala.inline
  implicit class DisassociateEnclaveCertificateIamRoleRequestMutableBuilder[Self <: DisassociateEnclaveCertificateIamRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: ResourceArn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setRoleArn(value: ResourceArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
