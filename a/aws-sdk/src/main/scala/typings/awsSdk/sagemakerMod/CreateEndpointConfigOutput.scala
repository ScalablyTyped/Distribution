package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointConfigOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration. 
    */
  var EndpointConfigArn: typings.awsSdk.sagemakerMod.EndpointConfigArn
}
object CreateEndpointConfigOutput {
  
  @scala.inline
  def apply(EndpointConfigArn: EndpointConfigArn): CreateEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointConfigOutput]
  }
  
  @scala.inline
  implicit class CreateEndpointConfigOutputMutableBuilder[Self <: CreateEndpointConfigOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointConfigArn(value: EndpointConfigArn): Self = StObject.set(x, "EndpointConfigArn", value.asInstanceOf[js.Any])
  }
}
