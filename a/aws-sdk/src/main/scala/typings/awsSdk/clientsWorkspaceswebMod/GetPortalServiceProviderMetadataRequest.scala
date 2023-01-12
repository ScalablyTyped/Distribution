package typings.awsSdk.clientsWorkspaceswebMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPortalServiceProviderMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
