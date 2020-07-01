package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHostInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the host to be deleted.
    */
  var HostArn: typings.awsSdk.codestarconnectionsMod.HostArn = js.native
}

object DeleteHostInput {
  @scala.inline
  def apply(HostArn: HostArn): DeleteHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostInput]
  }
}

