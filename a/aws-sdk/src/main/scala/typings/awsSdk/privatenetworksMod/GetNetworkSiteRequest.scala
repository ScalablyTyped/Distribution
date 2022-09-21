package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkSiteRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the network site.
    */
  var networkSiteArn: Arn
}
object GetNetworkSiteRequest {
  
  inline def apply(networkSiteArn: Arn): GetNetworkSiteRequest = {
    val __obj = js.Dynamic.literal(networkSiteArn = networkSiteArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkSiteRequest]
  }
  
  extension [Self <: GetNetworkSiteRequest](x: Self) {
    
    inline def setNetworkSiteArn(value: Arn): Self = StObject.set(x, "networkSiteArn", value.asInstanceOf[js.Any])
  }
}
