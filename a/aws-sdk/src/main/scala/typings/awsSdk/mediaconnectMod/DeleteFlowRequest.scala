package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFlowRequest extends StObject {
  
  /**
    * The ARN of the flow that you want to delete.
    */
  var FlowArn: string = js.native
}
object DeleteFlowRequest {
  
  @scala.inline
  def apply(FlowArn: string): DeleteFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowRequest]
  }
  
  @scala.inline
  implicit class DeleteFlowRequestMutableBuilder[Self <: DeleteFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
