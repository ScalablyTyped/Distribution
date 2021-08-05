package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserPoolClientResponse extends StObject {
  
  /**
    * The user pool client that was just created.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
}
object CreateUserPoolClientResponse {
  
  inline def apply(): CreateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserPoolClientResponse]
  }
  
  extension [Self <: CreateUserPoolClientResponse](x: Self) {
    
    inline def setUserPoolClient(value: UserPoolClientType): Self = StObject.set(x, "UserPoolClient", value.asInstanceOf[js.Any])
    
    inline def setUserPoolClientUndefined: Self = StObject.set(x, "UserPoolClient", js.undefined)
  }
}
