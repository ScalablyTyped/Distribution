package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressionAttributes extends js.Object {
  /**
    * A list that contains the reasons that email addresses will be automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.native
}

object SuppressionAttributes {
  @scala.inline
  def apply(SuppressedReasons: SuppressionListReasons = null): SuppressionAttributes = {
    val __obj = js.Dynamic.literal()
    if (SuppressedReasons != null) __obj.updateDynamic("SuppressedReasons")(SuppressedReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionAttributes]
  }
}

