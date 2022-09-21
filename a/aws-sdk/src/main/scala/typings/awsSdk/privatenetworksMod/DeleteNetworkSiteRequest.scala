package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkSiteRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network site.
    */
  var networkSiteArn: Arn
}
object DeleteNetworkSiteRequest {
  
  inline def apply(networkSiteArn: Arn): DeleteNetworkSiteRequest = {
    val __obj = js.Dynamic.literal(networkSiteArn = networkSiteArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkSiteRequest]
  }
  
  extension [Self <: DeleteNetworkSiteRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setNetworkSiteArn(value: Arn): Self = StObject.set(x, "networkSiteArn", value.asInstanceOf[js.Any])
  }
}
