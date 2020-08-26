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
  @scala.inline
  implicit class VerifyDomainDkimRequestOps[Self <: VerifyDomainDkimRequest] (val x: Self) extends AnyVal {
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
    def setDomain(value: Domain): Self = this.set("Domain", value.asInstanceOf[js.Any])
  }
  
}

