package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowResponse extends StObject {
  
  var Flow: js.UndefOr[typings.awsSdk.mediaconnectMod.Flow] = js.native
}
object CreateFlowResponse {
  
  @scala.inline
  def apply(): CreateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowResponse]
  }
  
  @scala.inline
  implicit class CreateFlowResponseMutableBuilder[Self <: CreateFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
  }
}
