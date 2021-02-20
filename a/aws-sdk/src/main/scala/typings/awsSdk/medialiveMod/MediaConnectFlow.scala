package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConnectFlow extends StObject {
  
  /**
    * The unique ARN of the MediaConnect Flow being used as a source.
    */
  var FlowArn: js.UndefOr[string] = js.native
}
object MediaConnectFlow {
  
  @scala.inline
  def apply(): MediaConnectFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConnectFlow]
  }
  
  @scala.inline
  implicit class MediaConnectFlowMutableBuilder[Self <: MediaConnectFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
