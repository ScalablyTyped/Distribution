package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
}
object DeleteEndpointMessage {
  
  @scala.inline
  def apply(EndpointArn: String): DeleteEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointMessage]
  }
  
  @scala.inline
  implicit class DeleteEndpointMessageMutableBuilder[Self <: DeleteEndpointMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
