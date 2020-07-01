package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHostOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the host to be created.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.native
}

object CreateHostOutput {
  @scala.inline
  def apply(HostArn: HostArn = null): CreateHostOutput = {
    val __obj = js.Dynamic.literal()
    if (HostArn != null) __obj.updateDynamic("HostArn")(HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostOutput]
  }
}

