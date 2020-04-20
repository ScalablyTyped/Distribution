package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRefreshSchemasStatusMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String = js.native
}

object DescribeRefreshSchemasStatusMessage {
  @scala.inline
  def apply(EndpointArn: String): DescribeRefreshSchemasStatusMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRefreshSchemasStatusMessage]
  }
}

