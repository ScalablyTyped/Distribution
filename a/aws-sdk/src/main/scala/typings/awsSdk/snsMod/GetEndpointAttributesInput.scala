package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointAttributesInput extends js.Object {
  /**
    * EndpointArn for GetEndpointAttributes input.
    */
  var EndpointArn: String = js.native
}

object GetEndpointAttributesInput {
  @scala.inline
  def apply(EndpointArn: String): GetEndpointAttributesInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointAttributesInput]
  }
}

