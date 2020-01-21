package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResendContactReachabilityEmailResponse extends js.Object {
  /**
    * The domain name for which you requested a confirmation email.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The email address for the registrant contact at the time that we sent the verification email.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  /**
    *  True if the email address for the registrant contact has already been verified, and false otherwise. If the email address has already been verified, we don't send another confirmation email.
    */
  var isAlreadyVerified: js.UndefOr[Boolean] = js.native
}

object ResendContactReachabilityEmailResponse {
  @scala.inline
  def apply(
    domainName: DomainName = null,
    emailAddress: Email = null,
    isAlreadyVerified: js.UndefOr[scala.Boolean] = js.undefined
  ): ResendContactReachabilityEmailResponse = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlreadyVerified)) __obj.updateDynamic("isAlreadyVerified")(isAlreadyVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResendContactReachabilityEmailResponse]
  }
}

