package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserMetadata extends StObject {
  
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.native
  
  /**
    * The given name of the user before a rename operation.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.native
  
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}
object UserMetadata {
  
  @scala.inline
  def apply(): UserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadata]
  }
  
  @scala.inline
  implicit class UserMetadataMutableBuilder[Self <: UserMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: EmailAddressType): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setGivenName(value: UserAttributeValueType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    @scala.inline
    def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setSurname(value: UserAttributeValueType): Self = StObject.set(x, "Surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurnameUndefined: Self = StObject.set(x, "Surname", js.undefined)
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
