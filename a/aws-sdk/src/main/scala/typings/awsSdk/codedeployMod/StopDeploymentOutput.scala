package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDeploymentOutput extends StObject {
  
  /**
    * The status of the stop deployment operation:   Pending: The stop operation is pending.   Succeeded: The stop operation was successful.  
    */
  var status: js.UndefOr[StopStatus] = js.undefined
  
  /**
    * An accompanying status message.
    */
  var statusMessage: js.UndefOr[Message] = js.undefined
}
object StopDeploymentOutput {
  
  @scala.inline
  def apply(): StopDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDeploymentOutput]
  }
  
  @scala.inline
  implicit class StopDeploymentOutputMutableBuilder[Self <: StopDeploymentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: StopStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: Message): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
