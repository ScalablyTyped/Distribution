package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePortalResponse extends StObject {
  
  /**
    * The status of the portal, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus = js.native
}
object UpdatePortalResponse {
  
  @scala.inline
  def apply(portalStatus: PortalStatus): UpdatePortalResponse = {
    val __obj = js.Dynamic.literal(portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalResponse]
  }
  
  @scala.inline
  implicit class UpdatePortalResponseMutableBuilder[Self <: UpdatePortalResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
  }
}
