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
  def apply(Recipient: Address): BouncedRecipientInfo = {
    val __obj = js.Dynamic.literal(Recipient = Recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BouncedRecipientInfo]
  }
  @scala.inline
  implicit class BouncedRecipientInfoOps[Self <: BouncedRecipientInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecipient(value: Address): Self = this.set("Recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounceType(value: BounceType): Self = this.set("BounceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounceType: Self = this.set("BounceType", js.undefined)
    @scala.inline
    def setRecipientArn(value: AmazonResourceName): Self = this.set("RecipientArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientArn: Self = this.set("RecipientArn", js.undefined)
    @scala.inline
    def setRecipientDsnFields(value: RecipientDsnFields): Self = this.set("RecipientDsnFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientDsnFields: Self = this.set("RecipientDsnFields", js.undefined)
  }
  
}

