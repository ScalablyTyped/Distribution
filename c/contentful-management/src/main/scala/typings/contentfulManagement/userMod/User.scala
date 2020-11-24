package typings.contentfulManagement.userMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User
  extends UserProps
     with DefaultElements[UserProps]
object User {
  
  @scala.inline
  def apply(
    activated: Boolean,
    avatarUrl: String,
    confirmed: Boolean,
    email: String,
    firstName: String,
    lastName: String,
    signInCount: Double,
    sys: MetaSysProps,
    toPlainObject: () => UserProps
  ): User = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], avatarUrl = avatarUrl.asInstanceOf[js.Any], confirmed = confirmed.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], signInCount = signInCount.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[User]
  }
}
