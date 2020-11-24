package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.spaceMemberMod.SpaceMemberProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/entities/space-member.SpaceMemberProps & {toPlainObject (): contentful-management.contentful-management/dist/typings/entities/space-member.SpaceMemberProps} */
@js.native
trait SpaceMemberPropstoPlainOb extends js.Object {
  
  /**
    * User is an admin
    */
  var admin: Boolean = js.native
  
  /**
    * Array of Role Links
    */
  var roles: js.Array[MetaLinkProps] = js.native
  
  var sys: MetaSysProps = js.native
  
  def toPlainObject(): SpaceMemberProps = js.native
}
object SpaceMemberPropstoPlainOb {
  
  @scala.inline
  def apply(
    admin: Boolean,
    roles: js.Array[MetaLinkProps],
    sys: MetaSysProps,
    toPlainObject: () => SpaceMemberProps
  ): SpaceMemberPropstoPlainOb = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[SpaceMemberPropstoPlainOb]
  }
  
  @scala.inline
  implicit class SpaceMemberPropstoPlainObOps[Self <: SpaceMemberPropstoPlainOb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: MetaLinkProps*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[MetaLinkProps]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPlainObject(value: () => SpaceMemberProps): Self = this.set("toPlainObject", js.Any.fromFunction0(value))
  }
}
