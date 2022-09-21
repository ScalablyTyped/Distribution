package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePortalRequest extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object DeletePortalRequest {
  
  inline def apply(portalArn: ARN): DeletePortalRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortalRequest]
  }
  
  extension [Self <: DeletePortalRequest](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
