package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationSet extends js.Object {
  /**
    * The value that you specified for CallerReference when you created the reusable delegation set.
    */
  var CallerReference: js.UndefOr[Nonce] = js.native
  /**
    * The ID that Amazon Route 53 assigns to a reusable delegation set.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation set.
    */
  var NameServers: DelegationSetNameServers = js.native
}

object DelegationSet {
  @scala.inline
  def apply(NameServers: DelegationSetNameServers): DelegationSet = {
    val __obj = js.Dynamic.literal(NameServers = NameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSet]
  }
  @scala.inline
  implicit class DelegationSetOps[Self <: DelegationSet] (val x: Self) extends AnyVal {
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
    def setNameServersVarargs(value: DNSName*): Self = this.set("NameServers", js.Array(value :_*))
    @scala.inline
    def setNameServers(value: DelegationSetNameServers): Self = this.set("NameServers", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallerReference(value: Nonce): Self = this.set("CallerReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallerReference: Self = this.set("CallerReference", js.undefined)
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

