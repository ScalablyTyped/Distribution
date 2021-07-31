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
  
  @scala.inline
  def apply(): CreateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserPoolClientResponse]
  }
  
  @scala.inline
  implicit class CreateUserPoolClientResponseMutableBuilder[Self <: CreateUserPoolClientResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolClient(value: UserPoolClientType): Self = StObject.set(x, "UserPoolClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientUndefined: Self = StObject.set(x, "UserPoolClient", js.undefined)
  }
}
