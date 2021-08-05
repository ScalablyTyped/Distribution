package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/space-membership.SpaceMembershipProps, 'sys'> */
trait OmitSpaceMembershipPropss extends StObject {
  
  var admin: Boolean
  
  var name: String
  
  var roles: js.Array[MetaLinkProps]
}
object OmitSpaceMembershipPropss {
  
  inline def apply(admin: Boolean, name: String, roles: js.Array[MetaLinkProps]): OmitSpaceMembershipPropss = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSpaceMembershipPropss]
  }
  
  extension [Self <: OmitSpaceMembershipPropss](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
