package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolClientDescription extends StObject {
  
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The client name from the user pool client description.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.undefined
  
  /**
    * The user pool ID for the user pool where you want to describe the user pool client.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object UserPoolClientDescription {
  
  @scala.inline
  def apply(): UserPoolClientDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolClientDescription]
  }
  
  @scala.inline
  implicit class UserPoolClientDescriptionMutableBuilder[Self <: UserPoolClientDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    @scala.inline
    def setClientName(value: ClientNameType): Self = StObject.set(x, "ClientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNameUndefined: Self = StObject.set(x, "ClientName", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
