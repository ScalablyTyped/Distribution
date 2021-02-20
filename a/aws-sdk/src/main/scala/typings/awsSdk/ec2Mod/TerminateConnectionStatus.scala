package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateConnectionStatus extends StObject {
  
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.native
  
  /**
    * A message about the status of the client connection, if applicable.
    */
  var CurrentStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
  
  /**
    * The state of the client connection.
    */
  var PreviousStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
}
object TerminateConnectionStatus {
  
  @scala.inline
  def apply(): TerminateConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateConnectionStatus]
  }
  
  @scala.inline
  implicit class TerminateConnectionStatusMutableBuilder[Self <: TerminateConnectionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: String): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    @scala.inline
    def setCurrentStatus(value: ClientVpnConnectionStatus): Self = StObject.set(x, "CurrentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStatusUndefined: Self = StObject.set(x, "CurrentStatus", js.undefined)
    
    @scala.inline
    def setPreviousStatus(value: ClientVpnConnectionStatus): Self = StObject.set(x, "PreviousStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStatusUndefined: Self = StObject.set(x, "PreviousStatus", js.undefined)
  }
}
