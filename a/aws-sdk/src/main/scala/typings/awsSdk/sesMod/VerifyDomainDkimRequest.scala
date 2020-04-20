package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyDomainDkimRequest extends js.Object {
  /**
    * The name of the domain to be verified for Easy DKIM signing.
    */
  var Domain: typings.awsSdk.sesMod.Domain = js.native
}

object VerifyDomainDkimRequest {
  @scala.inline
  def apply(Domain: Domain): VerifyDomainDkimRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainDkimRequest]
  }
}

