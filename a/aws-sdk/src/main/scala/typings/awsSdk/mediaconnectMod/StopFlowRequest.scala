package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to stop.
    */
  var FlowArn: string
}
object StopFlowRequest {
  
  @scala.inline
  def apply(FlowArn: string): StopFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFlowRequest]
  }
  
  @scala.inline
  implicit class StopFlowRequestMutableBuilder[Self <: StopFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
