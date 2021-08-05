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
  
  inline def apply(): UserPoolClientDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolClientDescription]
  }
  
  extension [Self <: UserPoolClientDescription](x: Self) {
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setClientName(value: ClientNameType): Self = StObject.set(x, "ClientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameUndefined: Self = StObject.set(x, "ClientName", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
