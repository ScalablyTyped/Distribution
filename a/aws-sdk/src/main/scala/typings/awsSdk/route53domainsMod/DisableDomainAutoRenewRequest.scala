package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableDomainAutoRenewRequest extends js.Object {
  /**
    * The name of the domain that you want to disable automatic renewal for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object DisableDomainAutoRenewRequest {
  @scala.inline
  def apply(DomainName: DomainName): DisableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainAutoRenewRequest]
  }
}

