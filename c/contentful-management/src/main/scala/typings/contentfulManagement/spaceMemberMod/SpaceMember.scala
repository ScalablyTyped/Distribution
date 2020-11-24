package typings.contentfulManagement.spaceMemberMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpaceMember
  extends SpaceMemberProps
     with DefaultElements[SpaceMemberProps]
object SpaceMember {
  
  @scala.inline
  def apply(
    admin: Boolean,
    roles: js.Array[MetaLinkProps],
    sys: MetaSysProps,
    toPlainObject: () => SpaceMemberProps
  ): SpaceMember = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[SpaceMember]
  }
}
