package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressedDestinationSummary extends js.Object {
  /**
    * The email address that's on the suppression list for your account.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress = js.native
  /**
    * The date and time when the suppressed destination was last updated, shown in Unix time format.
    */
  var LastUpdateTime: Timestamp = js.native
  /**
    * The reason that the address was added to the suppression list for your account.
    */
  var Reason: SuppressionListReason = js.native
}

object SuppressedDestinationSummary {
  @scala.inline
  def apply(EmailAddress: EmailAddress, LastUpdateTime: Timestamp, Reason: SuppressionListReason): SuppressedDestinationSummary = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedDestinationSummary]
  }
}

