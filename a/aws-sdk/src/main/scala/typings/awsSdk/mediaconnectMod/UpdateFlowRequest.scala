package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowRequest extends StObject {
  
  /**
    * The flow that you want to update.
    */
  var FlowArn: string = js.native
  
  var SourceFailoverConfig: js.UndefOr[UpdateFailoverConfig] = js.native
}
object UpdateFlowRequest {
  
  @scala.inline
  def apply(FlowArn: string): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
  
  @scala.inline
  implicit class UpdateFlowRequestMutableBuilder[Self <: UpdateFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFailoverConfig(value: UpdateFailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
  }
}
