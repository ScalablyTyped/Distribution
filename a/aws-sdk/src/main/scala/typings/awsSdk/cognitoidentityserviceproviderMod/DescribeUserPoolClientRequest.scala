package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserPoolClientRequest extends StObject {
  
  /**
    * The app client ID of the app associated with the user pool.
    */
  var ClientId: ClientIdType
  
  /**
    * The user pool ID for the user pool you want to describe.
    */
  var UserPoolId: UserPoolIdType
}
object DescribeUserPoolClientRequest {
  
  inline def apply(ClientId: ClientIdType, UserPoolId: UserPoolIdType): DescribeUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolClientRequest]
  }
  
  extension [Self <: DescribeUserPoolClientRequest](x: Self) {
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
