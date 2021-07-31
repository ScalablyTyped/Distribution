package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedEnclaveCertificateIamRolesResult extends StObject {
  
  /**
    * Information about the associated IAM roles.
    */
  var AssociatedRoles: js.UndefOr[AssociatedRolesList] = js.undefined
}
object GetAssociatedEnclaveCertificateIamRolesResult {
  
  @scala.inline
  def apply(): GetAssociatedEnclaveCertificateIamRolesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedEnclaveCertificateIamRolesResult]
  }
  
  @scala.inline
  implicit class GetAssociatedEnclaveCertificateIamRolesResultMutableBuilder[Self <: GetAssociatedEnclaveCertificateIamRolesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedRoles(value: AssociatedRolesList): Self = StObject.set(x, "AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRolesUndefined: Self = StObject.set(x, "AssociatedRoles", js.undefined)
    
    @scala.inline
    def setAssociatedRolesVarargs(value: AssociatedRole*): Self = StObject.set(x, "AssociatedRoles", js.Array(value :_*))
  }
}
