package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the requested host.
    */
  var HostArn: typings.awsSdk.codestarconnectionsMod.HostArn = js.native
}

object GetHostInput {
  @scala.inline
  def apply(HostArn: HostArn): GetHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostInput]
  }
}

