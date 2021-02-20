package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowOutputResponse extends StObject {
  
  /**
    * The ARN of the flow that is associated with the updated output.
    */
  var FlowArn: js.UndefOr[string] = js.native
  
  /**
    * The new settings of the output that you updated.
    */
  var Output: js.UndefOr[typings.awsSdk.mediaconnectMod.Output] = js.native
}
object UpdateFlowOutputResponse {
  
  @scala.inline
  def apply(): UpdateFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowOutputResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowOutputResponseMutableBuilder[Self <: UpdateFlowOutputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    @scala.inline
    def setOutput(value: Output): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
  }
}
