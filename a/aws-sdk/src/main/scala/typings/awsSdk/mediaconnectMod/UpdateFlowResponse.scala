package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowResponse extends StObject {
  
  var Flow: js.UndefOr[typings.awsSdk.mediaconnectMod.Flow] = js.native
}
object UpdateFlowResponse {
  
  @scala.inline
  def apply(): UpdateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowResponseMutableBuilder[Self <: UpdateFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
  }
}
