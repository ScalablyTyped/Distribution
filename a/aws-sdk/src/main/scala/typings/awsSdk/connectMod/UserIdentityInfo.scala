package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentityInfo extends StObject {
  
  /**
    * The email address. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var Email: js.UndefOr[typings.awsSdk.connectMod.Email] = js.undefined
  
  /**
    * The first name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var FirstName: js.UndefOr[AgentFirstName] = js.undefined
  
  /**
    * The last name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var LastName: js.UndefOr[AgentLastName] = js.undefined
}
object UserIdentityInfo {
  
  @scala.inline
  def apply(): UserIdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityInfo]
  }
  
  @scala.inline
  implicit class UserIdentityInfoMutableBuilder[Self <: UserIdentityInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setFirstName(value: AgentFirstName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: AgentLastName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
  }
}
