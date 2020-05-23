package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedAccount extends js.Object {
  /**
    * The AWS account ID for the account that the request applies to.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The source of the issue or delay in processing the request.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The reason why the request hasn't been processed.
    */
  var errorMessage: js.UndefOr[string] = js.native
}

object UnprocessedAccount {
  @scala.inline
  def apply(accountId: string = null, errorCode: ErrorCode = null, errorMessage: string = null): UnprocessedAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedAccount]
  }
}

