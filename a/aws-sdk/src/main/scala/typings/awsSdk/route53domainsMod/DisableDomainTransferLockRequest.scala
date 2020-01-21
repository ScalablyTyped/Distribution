package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableDomainTransferLockRequest extends js.Object {
  /**
    * The name of the domain that you want to remove the transfer lock for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object DisableDomainTransferLockRequest {
  @scala.inline
  def apply(DomainName: DomainName): DisableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisableDomainTransferLockRequest]
  }
}

