package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowSourceResponse extends StObject {
  
  /**
    * The ARN of the flow that you want to update.
    */
  var FlowArn: js.UndefOr[string] = js.native
  
  /**
    * The settings for the source of the flow.
    */
  var Source: js.UndefOr[typings.awsSdk.mediaconnectMod.Source] = js.native
}
object UpdateFlowSourceResponse {
  
  @scala.inline
  def apply(): UpdateFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowSourceResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowSourceResponseMutableBuilder[Self <: UpdateFlowSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
