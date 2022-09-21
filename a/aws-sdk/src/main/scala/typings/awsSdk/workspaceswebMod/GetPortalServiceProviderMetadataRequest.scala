package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPortalServiceProviderMetadataRequest extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object GetPortalServiceProviderMetadataRequest {
  
  inline def apply(portalArn: ARN): GetPortalServiceProviderMetadataRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPortalServiceProviderMetadataRequest]
  }
  
  extension [Self <: GetPortalServiceProviderMetadataRequest](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
