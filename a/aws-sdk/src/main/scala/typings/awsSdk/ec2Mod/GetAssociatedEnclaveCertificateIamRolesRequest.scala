package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssociatedEnclaveCertificateIamRolesRequest extends js.Object {
  
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
  implicit class GetAssociatedEnclaveCertificateIamRolesRequestOps[Self <: GetAssociatedEnclaveCertificateIamRolesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateArn(value: ResourceArn): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
