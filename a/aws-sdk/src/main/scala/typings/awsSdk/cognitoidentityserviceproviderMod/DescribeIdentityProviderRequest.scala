package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityProviderRequest extends StObject {
  
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object DescribeIdentityProviderRequest {
  
  @scala.inline
  def apply(ProviderName: ProviderNameType, UserPoolId: UserPoolIdType): DescribeIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityProviderRequest]
  }
  
  @scala.inline
  implicit class DescribeIdentityProviderRequestMutableBuilder[Self <: DescribeIdentityProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
