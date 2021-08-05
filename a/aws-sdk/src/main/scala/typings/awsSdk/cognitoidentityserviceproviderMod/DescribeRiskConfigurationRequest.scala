package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRiskConfigurationRequest extends StObject {
  
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object DescribeRiskConfigurationRequest {
  
  inline def apply(UserPoolId: UserPoolIdType): DescribeRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRiskConfigurationRequest]
  }
  
  extension [Self <: DescribeRiskConfigurationRequest](x: Self) {
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
