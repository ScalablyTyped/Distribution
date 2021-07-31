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
  
  @scala.inline
  def apply(): UpdateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserPoolClientResponse]
  }
  
  @scala.inline
  implicit class UpdateUserPoolClientResponseMutableBuilder[Self <: UpdateUserPoolClientResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolClient(value: UserPoolClientType): Self = StObject.set(x, "UserPoolClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientUndefined: Self = StObject.set(x, "UserPoolClient", js.undefined)
  }
}
