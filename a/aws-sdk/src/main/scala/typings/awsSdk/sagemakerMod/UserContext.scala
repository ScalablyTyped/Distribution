package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserContext extends StObject {
  
  /**
    * The domain associated with the user.
    */
  var DomainId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user's profile.
    */
  var UserProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user's profile.
    */
  var UserProfileName: js.UndefOr[String] = js.undefined
}
object UserContext {
  
  inline def apply(): UserContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContext]
  }
  
  extension [Self <: UserContext](x: Self) {
    
    inline def setDomainId(value: String): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setUserProfileArn(value: String): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    inline def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
    
    inline def setUserProfileName(value: String): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
