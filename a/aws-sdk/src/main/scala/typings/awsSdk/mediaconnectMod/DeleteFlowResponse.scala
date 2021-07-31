package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFlowResponse extends StObject {
  
  /**
    * The ARN of the flow that was deleted.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The status of the flow when the DeleteFlow process begins.
    */
  var Status: js.UndefOr[typings.awsSdk.mediaconnectMod.Status] = js.undefined
}
object DeleteFlowResponse {
  
  @scala.inline
  def apply(): DeleteFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFlowResponse]
  }
  
  @scala.inline
  implicit class DeleteFlowResponseMutableBuilder[Self <: DeleteFlowResponse] (val x: Self) extends AnyVal {
    
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
