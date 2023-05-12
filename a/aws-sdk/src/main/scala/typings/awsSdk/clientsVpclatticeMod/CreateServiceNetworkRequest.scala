package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceNetworkRequest extends StObject {
  
  /**
    * The type of IAM policy.    NONE: The resource does not use an IAM policy. This is the default.    AWS_IAM: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy is required.  
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The name of the service network. The name must be unique to the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
    */
  var name: ServiceNetworkName
  
  /**
    * The tags for the service network.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateServiceNetworkRequest {
  
  inline def apply(name: ServiceNetworkName): CreateServiceNetworkRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceNetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceNetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: ServiceNetworkName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
