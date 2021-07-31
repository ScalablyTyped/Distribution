package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionStatusResponse extends StObject {
  
  /**
    * The status of the connection to the instance. For example, 'Connected' or 'Not Connected'.
    */
  var Status: js.UndefOr[ConnectionStatus] = js.undefined
  
  /**
    * The ID of the instance to check connection status. 
    */
  var Target: js.UndefOr[SessionTarget] = js.undefined
}
object GetConnectionStatusResponse {
  
  @scala.inline
  def apply(): GetConnectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionStatusResponse]
  }
  
  @scala.inline
  implicit class GetConnectionStatusResponseMutableBuilder[Self <: GetConnectionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ConnectionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
