package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.spaceMemberMod.SpaceMemberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/entities/space-member.SpaceMemberProps & {toPlainObject (): contentful-management.contentful-management/dist/typings/entities/space-member.SpaceMemberProps} */
trait SpaceMemberPropstoPlainOb extends StObject {
  
  /**
    * User is an admin
    */
  var admin: Boolean
  
  /**
    * Array of Role Links
    */
  var roles: js.Array[MetaLinkProps]
  
  var sys: MetaSysProps
  
  def toPlainObject(): SpaceMemberProps
}
object SpaceMemberPropstoPlainOb {
  
  inline def apply(
    admin: Boolean,
    roles: js.Array[MetaLinkProps],
    sys: MetaSysProps,
    toPlainObject: () => SpaceMemberProps
  ): SpaceMemberPropstoPlainOb = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[SpaceMemberPropstoPlainOb]
  }
  
  extension [Self <: SpaceMemberPropstoPlainOb](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[MetaLinkProps]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: MetaLinkProps*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setToPlainObject(value: () => SpaceMemberProps): Self = StObject.set(x, "toPlainObject", js.Any.fromFunction0(value))
  }
}
