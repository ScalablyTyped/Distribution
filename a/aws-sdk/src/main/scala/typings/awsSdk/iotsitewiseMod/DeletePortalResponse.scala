package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePortalResponse extends StObject {
  
  /**
    * The status of the portal, which contains a state (DELETING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus
}
object DeletePortalResponse {
  
  @scala.inline
  def apply(portalStatus: PortalStatus): DeletePortalResponse = {
    val __obj = js.Dynamic.literal(portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortalResponse]
  }
  
  @scala.inline
  implicit class DeletePortalResponseMutableBuilder[Self <: DeletePortalResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
  }
}
