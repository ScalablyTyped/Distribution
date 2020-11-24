package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssociatedEnclaveCertificateIamRolesResult extends js.Object {
  
  /**
    * Information about the associated IAM roles.
    */
  var AssociatedRoles: js.UndefOr[AssociatedRolesList] = js.native
}
object GetAssociatedEnclaveCertificateIamRolesResult {
  
  @scala.inline
  def apply(): GetAssociatedEnclaveCertificateIamRolesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedEnclaveCertificateIamRolesResult]
  }
  
  @scala.inline
  implicit class GetAssociatedEnclaveCertificateIamRolesResultOps[Self <: GetAssociatedEnclaveCertificateIamRolesResult] (val x: Self) extends AnyVal {
    
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
    def setAssociatedRolesVarargs(value: AssociatedRole*): Self = this.set("AssociatedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedRoles(value: AssociatedRolesList): Self = this.set("AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedRoles: Self = this.set("AssociatedRoles", js.undefined)
  }
}
