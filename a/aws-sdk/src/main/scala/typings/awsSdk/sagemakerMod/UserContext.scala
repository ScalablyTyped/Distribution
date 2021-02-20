package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserContext extends StObject {
  
  /**
    * The domain associated with the user.
    */
  var DomainId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user's profile.
    */
  var UserProfileArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the user's profile.
    */
  var UserProfileName: js.UndefOr[String] = js.native
}
object UserContext {
  
  @scala.inline
  def apply(): UserContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContext]
  }
  
  @scala.inline
  implicit class UserContextMutableBuilder[Self <: UserContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainId(value: String): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    @scala.inline
    def setUserProfileArn(value: String): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: String): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
