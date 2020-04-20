package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a connection.
    */
  var ConnectionArn: typings.awsSdk.codestarconnectionsMod.ConnectionArn = js.native
}

object GetConnectionInput {
  @scala.inline
  def apply(ConnectionArn: ConnectionArn): GetConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionInput]
  }
}

