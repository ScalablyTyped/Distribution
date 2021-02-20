package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typings.awsSdk.sagemakerMod.EndpointArn = js.native
}
object UpdateEndpointOutput {
  
  @scala.inline
  def apply(EndpointArn: EndpointArn): UpdateEndpointOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointOutput]
  }
  
  @scala.inline
  implicit class UpdateEndpointOutputMutableBuilder[Self <: UpdateEndpointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
