package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRiskConfigurationRequest extends StObject {
  
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object DescribeRiskConfigurationRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DescribeRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRiskConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeRiskConfigurationRequestMutableBuilder[Self <: DescribeRiskConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
