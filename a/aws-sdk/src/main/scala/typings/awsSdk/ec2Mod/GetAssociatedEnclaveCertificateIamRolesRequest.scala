package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssociatedEnclaveCertificateIamRolesRequest extends StObject {
  
  /**
    * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3 object information.
    */
  var CertificateArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}
object GetAssociatedEnclaveCertificateIamRolesRequest {
  
  @scala.inline
  def apply(): GetAssociatedEnclaveCertificateIamRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedEnclaveCertificateIamRolesRequest]
  }
  
  @scala.inline
  implicit class GetAssociatedEnclaveCertificateIamRolesRequestMutableBuilder[Self <: GetAssociatedEnclaveCertificateIamRolesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: ResourceArn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
