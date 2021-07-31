package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserPoolDomainRequest extends StObject {
  
  /**
    * The domain string.
    */
  var Domain: DomainType
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object DeleteUserPoolDomainRequest {
  
  @scala.inline
  def apply(Domain: DomainType, UserPoolId: UserPoolIdType): DeleteUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPoolDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteUserPoolDomainRequestMutableBuilder[Self <: DeleteUserPoolDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
