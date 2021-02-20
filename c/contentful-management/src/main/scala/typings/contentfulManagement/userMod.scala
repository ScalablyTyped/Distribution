package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  @JSImport("contentful-management/dist/typings/entities/user", "wrapUser")
  @js.native
  def wrapUser(http: AxiosInstance, data: UserProps): User = js.native
  
  @JSImport("contentful-management/dist/typings/entities/user", "wrapUserCollection")
  @js.native
  def wrapUserCollection(http: AxiosInstance, data: CollectionProp[UserProps]): Collection[User, UserProps] = js.native
  
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
  
  @js.native
  trait UserProps extends StObject {
    
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
    implicit class UserPropsMutableBuilder[Self <: UserProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignInCount(value: Double): Self = StObject.set(x, "signInCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
