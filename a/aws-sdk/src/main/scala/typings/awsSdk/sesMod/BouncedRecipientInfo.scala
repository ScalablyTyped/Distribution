package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BouncedRecipientInfo extends js.Object {
  /**
    * The reason for the bounce. You must provide either this parameter or RecipientDsnFields.
    */
  var BounceType: js.UndefOr[typings.awsSdk.sesMod.BounceType] = js.native
  /**
    * The email address of the recipient of the bounced email.
    */
  var Recipient: Address = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to receive email for the recipient of the bounced email. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var RecipientArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a BounceType. You must provide either this parameter or BounceType.
    */
  var RecipientDsnFields: js.UndefOr[typings.awsSdk.sesMod.RecipientDsnFields] = js.native
}

object BouncedRecipientInfo {
  @scala.inline
  def apply(
    Recipient: Address,
    BounceType: BounceType = null,
    RecipientArn: AmazonResourceName = null,
    RecipientDsnFields: RecipientDsnFields = null
  ): BouncedRecipientInfo = {
    val __obj = js.Dynamic.literal(Recipient = Recipient.asInstanceOf[js.Any])
    if (BounceType != null) __obj.updateDynamic("BounceType")(BounceType.asInstanceOf[js.Any])
    if (RecipientArn != null) __obj.updateDynamic("RecipientArn")(RecipientArn.asInstanceOf[js.Any])
    if (RecipientDsnFields != null) __obj.updateDynamic("RecipientDsnFields")(RecipientDsnFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[BouncedRecipientInfo]
  }
}

