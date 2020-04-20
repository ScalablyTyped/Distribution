package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedAccount extends js.Object {
  /**
    * AWS Account ID.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * A reason why the account hasn't been processed.
    */
  var Result: String = js.native
}

object UnprocessedAccount {
  @scala.inline
  def apply(AccountId: AccountId, Result: String): UnprocessedAccount = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedAccount]
  }
}

