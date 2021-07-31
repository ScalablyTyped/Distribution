package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoConfig extends StObject {
  
  /**
    * The client ID for your Amazon Cognito user pool.
    */
  var ClientId: typings.awsSdk.sagemakerMod.ClientId
  
  /**
    * A  user pool is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web or mobile app through Amazon Cognito. Your users can also sign in through social identity providers like Google, Facebook, Amazon, or Apple, and through SAML identity providers.
    */
  var UserPool: CognitoUserPool
}
object CognitoConfig {
  
  @scala.inline
  def apply(ClientId: ClientId, UserPool: CognitoUserPool): CognitoConfig = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPool = UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoConfig]
  }
  
  @scala.inline
  implicit class CognitoConfigMutableBuilder[Self <: CognitoConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPool(value: CognitoUserPool): Self = StObject.set(x, "UserPool", value.asInstanceOf[js.Any])
  }
}
