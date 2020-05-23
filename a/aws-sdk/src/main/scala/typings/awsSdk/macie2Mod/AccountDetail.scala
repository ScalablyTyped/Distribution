package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetail extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var accountId: string = js.native
  /**
    * The email address for the account.
    */
  var email: string = js.native
}

object AccountDetail {
  @scala.inline
  def apply(accountId: string, email: string): AccountDetail = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetail]
  }
}

