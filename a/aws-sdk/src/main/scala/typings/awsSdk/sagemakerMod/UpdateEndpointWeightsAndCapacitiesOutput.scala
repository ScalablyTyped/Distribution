package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointWeightsAndCapacitiesOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated endpoint.
    */
  var EndpointArn: typings.awsSdk.sagemakerMod.EndpointArn = js.native
}
object UpdateEndpointWeightsAndCapacitiesOutput {
  
  @scala.inline
  def apply(EndpointArn: EndpointArn): UpdateEndpointWeightsAndCapacitiesOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
  }
  
  @scala.inline
  implicit class UpdateEndpointWeightsAndCapacitiesOutputMutableBuilder[Self <: UpdateEndpointWeightsAndCapacitiesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
