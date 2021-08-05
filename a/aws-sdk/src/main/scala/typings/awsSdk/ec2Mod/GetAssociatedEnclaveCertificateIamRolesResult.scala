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
  
  inline def apply(): GetAssociatedEnclaveCertificateIamRolesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedEnclaveCertificateIamRolesResult]
  }
  
  extension [Self <: GetAssociatedEnclaveCertificateIamRolesResult](x: Self) {
    
    inline def setAssociatedRoles(value: AssociatedRolesList): Self = StObject.set(x, "AssociatedRoles", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRolesUndefined: Self = StObject.set(x, "AssociatedRoles", js.undefined)
    
    inline def setAssociatedRolesVarargs(value: AssociatedRole*): Self = StObject.set(x, "AssociatedRoles", js.Array(value :_*))
  }
}
