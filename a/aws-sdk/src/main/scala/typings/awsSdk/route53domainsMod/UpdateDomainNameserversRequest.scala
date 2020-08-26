package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainNameserversRequest extends js.Object {
  /**
    * The name of the domain that you want to change name servers for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * The authorization key for .fi domains
    */
  var FIAuthKey: js.UndefOr[typings.awsSdk.route53domainsMod.FIAuthKey] = js.native
  /**
    * A list of new name servers for the domain.
    */
  var Nameservers: NameserverList = js.native
}

object UpdateDomainNameserversRequest {
  @scala.inline
  def apply(DomainName: DomainName, Nameservers: NameserverList): UpdateDomainNameserversRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Nameservers = Nameservers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameserversRequest]
  }
  @scala.inline
  implicit class UpdateDomainNameserversRequestOps[Self <: UpdateDomainNameserversRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameserversVarargs(value: Nameserver*): Self = this.set("Nameservers", js.Array(value :_*))
    @scala.inline
    def setNameservers(value: NameserverList): Self = this.set("Nameservers", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIAuthKey(value: FIAuthKey): Self = this.set("FIAuthKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFIAuthKey: Self = this.set("FIAuthKey", js.undefined)
  }
  
}

