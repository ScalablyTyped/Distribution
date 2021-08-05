package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  @JSImport("contentful-management/dist/typings/entities/user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapUser(http: AxiosInstance, data: UserProps): User = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapUser")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[User]
  
  inline def wrapUserCollection(http: AxiosInstance, data: CollectionProp[UserProps]): Collection[User, UserProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapUserCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[User, UserProps]]
  
  trait User
    extends StObject
       with UserProps
       with DefaultElements[UserProps]
  object User {
    
    inline def apply(
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
  
  trait UserProps extends StObject {
    
    /**
      * Activation flag
      */
    var activated: Boolean
    
    /**
      * Url to the users avatar
      */
    var avatarUrl: String
    
    /**
      * User confirmation flag
      */
    var confirmed: Boolean
    
    /**
      * Email address of the user
      */
    var email: String
    
    /**
      * First name of the user
      */
    var firstName: String
    
    /**
      * Last name of the user
      */
    var lastName: String
    
    /**
      * Number of sign ins
      */
    var signInCount: Double
    
    /**
      * System metadata
      */
    var sys: MetaSysProps
  }
  object UserProps {
    
    inline def apply(
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
    
    extension [Self <: UserProps](x: Self) {
      
      inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setSignInCount(value: Double): Self = StObject.set(x, "signInCount", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
