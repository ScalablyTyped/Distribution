package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMemberResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the account that was associated with the master account.
    */
  var arn: js.UndefOr[string] = js.native
}

object CreateMemberResponse {
  @scala.inline
  def apply(arn: string = null): CreateMemberResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMemberResponse]
  }
}

