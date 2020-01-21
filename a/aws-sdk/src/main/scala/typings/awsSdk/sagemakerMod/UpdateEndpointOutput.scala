package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointOutput extends js.Object {
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
}

