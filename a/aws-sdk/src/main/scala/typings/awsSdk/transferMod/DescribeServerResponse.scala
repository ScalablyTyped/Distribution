package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServerResponse extends js.Object {
  /**
    * An array containing the properties of the server with the ServerID you specified.
    */
  var Server: DescribedServer = js.native
}

object DescribeServerResponse {
  @scala.inline
  def apply(Server: DescribedServer): DescribeServerResponse = {
    val __obj = js.Dynamic.literal(Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServerResponse]
  }
}

