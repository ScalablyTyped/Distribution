package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableDomainAutoRenewRequest extends js.Object {
  /**
    * The name of the domain that you want to enable automatic renewal for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object EnableDomainAutoRenewRequest {
  @scala.inline
  def apply(DomainName: DomainName): EnableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDomainAutoRenewRequest]
  }
}

