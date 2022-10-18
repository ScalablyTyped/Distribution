package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMetadata extends StObject {
  
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
  
  /**
    * The given name of the user before a rename operation.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
  
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
  
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.undefined
}
object UserMetadata {
  
  inline def apply(): UserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadata]
  }
  
  extension [Self <: UserMetadata](x: Self) {
    
    inline def setEmailAddress(value: EmailAddressType): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setGivenName(value: UserAttributeValueType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    inline def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setSurname(value: UserAttributeValueType): Self = StObject.set(x, "Surname", value.asInstanceOf[js.Any])
    
    inline def setSurnameUndefined: Self = StObject.set(x, "Surname", js.undefined)
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
