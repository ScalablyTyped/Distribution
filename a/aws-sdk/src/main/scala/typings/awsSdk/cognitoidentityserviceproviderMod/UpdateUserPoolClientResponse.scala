package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserPoolClientResponse extends StObject {
  
  /**
    * The user pool client value from the response from the server when an update user pool client request is made.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
}
object UpdateUserPoolClientResponse {
  
  inline def apply(): UpdateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserPoolClientResponse]
  }
  
  extension [Self <: UpdateUserPoolClientResponse](x: Self) {
    
    inline def setUserPoolClient(value: UserPoolClientType): Self = StObject.set(x, "UserPoolClient", value.asInstanceOf[js.Any])
    
    inline def setUserPoolClientUndefined: Self = StObject.set(x, "UserPoolClient", js.undefined)
  }
}
