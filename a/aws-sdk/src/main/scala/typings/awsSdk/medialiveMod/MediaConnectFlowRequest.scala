package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConnectFlowRequest extends StObject {
  
  /**
    * The ARN of the MediaConnect Flow that you want to use as a source.
    */
  var FlowArn: js.UndefOr[string] = js.native
}
object MediaConnectFlowRequest {
  
  @scala.inline
  def apply(): MediaConnectFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConnectFlowRequest]
  }
  
  @scala.inline
  implicit class MediaConnectFlowRequestMutableBuilder[Self <: MediaConnectFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
