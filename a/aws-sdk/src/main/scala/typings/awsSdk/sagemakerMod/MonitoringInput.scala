package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringInput extends StObject {
  
  /**
    * The endpoint for a monitoring job.
    */
  var EndpointInput: typings.awsSdk.sagemakerMod.EndpointInput = js.native
}
object MonitoringInput {
  
  @scala.inline
  def apply(EndpointInput: EndpointInput): MonitoringInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringInput]
  }
  
  @scala.inline
  implicit class MonitoringInputMutableBuilder[Self <: MonitoringInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
  }
}
