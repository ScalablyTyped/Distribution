package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartFlowResponse extends StObject {
  
  /**
    * The ARN of the flow that you started.
    */
  var FlowArn: js.UndefOr[string] = js.native
  
  /**
    * The status of the flow when the StartFlow process begins.
    */
  var Status: js.UndefOr[typings.awsSdk.mediaconnectMod.Status] = js.native
}
object StartFlowResponse {
  
  @scala.inline
  def apply(): StartFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFlowResponse]
  }
  
  @scala.inline
  implicit class StartFlowResponseMutableBuilder[Self <: StartFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
