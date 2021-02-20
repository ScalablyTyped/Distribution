package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityProviderResponse extends StObject {
  
  /**
    * The identity provider that was deleted.
    */
  var IdentityProvider: IdentityProviderType = js.native
}
object DescribeIdentityProviderResponse {
  
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): DescribeIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityProviderResponse]
  }
  
  @scala.inline
  implicit class DescribeIdentityProviderResponseMutableBuilder[Self <: DescribeIdentityProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
