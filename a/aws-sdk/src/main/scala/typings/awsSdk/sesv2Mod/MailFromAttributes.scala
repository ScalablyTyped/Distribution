package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailFromAttributes extends js.Object {
  /**
    * The action that you want to take if the required MX record can't be found when you send an email. When you set this value to UseDefaultValue, the mail is sent using amazonses.com as the MAIL FROM domain. When you set this value to RejectMessage, the Amazon SES API v2 returns a MailFromDomainNotVerified error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the Pending, Failed, and TemporaryFailure states.
    */
  var BehaviorOnMxFailure: typings.awsSdk.sesv2Mod.BehaviorOnMxFailure = js.native
  /**
    * The name of a domain that an email identity uses as a custom MAIL FROM domain.
    */
  var MailFromDomain: MailFromDomainName = js.native
  /**
    * The status of the MAIL FROM domain. This status can have the following values:    PENDING – Amazon SES hasn't started searching for the MX record yet.    SUCCESS – Amazon SES detected the required MX record for the MAIL FROM domain.    FAILED – Amazon SES can't find the required MX record, or the record no longer exists.    TEMPORARY_FAILURE – A temporary issue occurred, which prevented Amazon SES from determining the status of the MAIL FROM domain.  
    */
  var MailFromDomainStatus: typings.awsSdk.sesv2Mod.MailFromDomainStatus = js.native
}

object MailFromAttributes {
  @scala.inline
  def apply(
    BehaviorOnMxFailure: BehaviorOnMxFailure,
    MailFromDomain: MailFromDomainName,
    MailFromDomainStatus: MailFromDomainStatus
  ): MailFromAttributes = {
    val __obj = js.Dynamic.literal(BehaviorOnMxFailure = BehaviorOnMxFailure.asInstanceOf[js.Any], MailFromDomain = MailFromDomain.asInstanceOf[js.Any], MailFromDomainStatus = MailFromDomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFromAttributes]
  }
  @scala.inline
  implicit class MailFromAttributesOps[Self <: MailFromAttributes] (val x: Self) extends AnyVal {
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
    def setBehaviorOnMxFailure(value: BehaviorOnMxFailure): Self = this.set("BehaviorOnMxFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def setMailFromDomain(value: MailFromDomainName): Self = this.set("MailFromDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setMailFromDomainStatus(value: MailFromDomainStatus): Self = this.set("MailFromDomainStatus", value.asInstanceOf[js.Any])
  }
  
}

