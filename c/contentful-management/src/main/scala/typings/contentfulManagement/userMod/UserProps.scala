package typings.contentfulManagement.userMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProps extends js.Object {
  
  /**
    * Activation flag
    */
  var activated: Boolean = js.native
  
  /**
    * Url to the users avatar
    */
  var avatarUrl: String = js.native
  
  /**
    * User confirmation flag
    */
  var confirmed: Boolean = js.native
  
  /**
    * Email address of the user
    */
  var email: String = js.native
  
  /**
    * First name of the user
    */
  var firstName: String = js.native
  
  /**
    * Last name of the user
    */
  var lastName: String = js.native
  
  /**
    * Number of sign ins
    */
  var signInCount: Double = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysProps = js.native
}
object UserProps {
  
  @scala.inline
  def apply(
    activated: Boolean,
    avatarUrl: String,
    confirmed: Boolean,
    email: String,
    firstName: String,
    lastName: String,
    signInCount: Double,
    sys: MetaSysProps
  ): UserProps = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], avatarUrl = avatarUrl.asInstanceOf[js.Any], confirmed = confirmed.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], signInCount = signInCount.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProps]
  }
  
  @scala.inline
  implicit class UserPropsOps[Self <: UserProps] (val x: Self) extends AnyVal {
    
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
    def setActivated(value: Boolean): Self = this.set("activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUrl(value: String): Self = this.set("avatarUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmed(value: Boolean): Self = this.set("confirmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInCount(value: Double): Self = this.set("signInCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
