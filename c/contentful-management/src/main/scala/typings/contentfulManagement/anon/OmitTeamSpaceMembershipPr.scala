package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/team-space-membership.TeamSpaceMembershipProps, 'sys'> */
trait OmitTeamSpaceMembershipPr extends StObject {
  
  var admin: Boolean
  
  var roles: js.Array[MetaLinkProps]
}
object OmitTeamSpaceMembershipPr {
  
  inline def apply(admin: Boolean, roles: js.Array[MetaLinkProps]): OmitTeamSpaceMembershipPr = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTeamSpaceMembershipPr]
  }
  
  extension [Self <: OmitTeamSpaceMembershipPr](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
