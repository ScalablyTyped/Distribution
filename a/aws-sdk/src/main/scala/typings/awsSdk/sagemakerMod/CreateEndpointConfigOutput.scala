package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointConfigOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration. 
    */
  var EndpointConfigArn: typings.awsSdk.sagemakerMod.EndpointConfigArn = js.native
}

object CreateEndpointConfigOutput {
  @scala.inline
  def apply(EndpointConfigArn: EndpointConfigArn): CreateEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointConfigOutput]
  }
}

