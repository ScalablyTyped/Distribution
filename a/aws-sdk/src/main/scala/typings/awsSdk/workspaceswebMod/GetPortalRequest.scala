package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPortalRequest extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object GetPortalRequest {
  
  inline def apply(portalArn: ARN): GetPortalRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPortalRequest]
  }
  
  extension [Self <: GetPortalRequest](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
