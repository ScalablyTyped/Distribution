package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalStatus extends StObject {
  
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[MonitorErrorDetails] = js.native
  
  /**
    * The current state of the portal.
    */
  var state: PortalState = js.native
}
object PortalStatus {
  
  @scala.inline
  def apply(state: PortalState): PortalStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalStatus]
  }
  
  @scala.inline
  implicit class PortalStatusMutableBuilder[Self <: PortalStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: MonitorErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setState(value: PortalState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
