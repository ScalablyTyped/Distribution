package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResendContactReachabilityEmailRequest extends js.Object {
  /**
    * The name of the domain for which you want Route 53 to resend a confirmation email to the registrant contact.
    */
  var domainName: js.UndefOr[DomainName] = js.native
}

object ResendContactReachabilityEmailRequest {
  @scala.inline
  def apply(): ResendContactReachabilityEmailRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResendContactReachabilityEmailRequest]
  }
  @scala.inline
  implicit class ResendContactReachabilityEmailRequestOps[Self <: ResendContactReachabilityEmailRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
  }
  
}

