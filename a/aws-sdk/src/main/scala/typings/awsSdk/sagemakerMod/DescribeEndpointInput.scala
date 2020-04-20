package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointInput extends js.Object {
  /**
    * The name of the endpoint.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
}

object DescribeEndpointInput {
  @scala.inline
  def apply(EndpointName: EndpointName): DescribeEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointInput]
  }
}

