package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLunaClientResponse extends js.Object {
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.native
}

object CreateLunaClientResponse {
  @scala.inline
  def apply(ClientArn: ClientArn = null): CreateLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLunaClientResponse]
  }
}

