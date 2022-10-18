package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortalResponse extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
  
  /**
    * The endpoint URL of the web portal that users access in order to start streaming sessions.
    */
  var portalEndpoint: PortalEndpoint
}
object CreatePortalResponse {
  
  inline def apply(portalArn: ARN, portalEndpoint: PortalEndpoint): CreatePortalResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], portalEndpoint = portalEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortalResponse]
  }
  
  extension [Self <: CreatePortalResponse](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setPortalEndpoint(value: PortalEndpoint): Self = StObject.set(x, "portalEndpoint", value.asInstanceOf[js.Any])
  }
}
