package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortalResponse extends StObject {
  
  /**
    * The status of the portal, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus
}
object UpdatePortalResponse {
  
  inline def apply(portalStatus: PortalStatus): UpdatePortalResponse = {
    val __obj = js.Dynamic.literal(portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalResponse]
  }
  
  extension [Self <: UpdatePortalResponse](x: Self) {
    
    inline def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
  }
}
