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
  def apply(NameServers: DelegationSetNameServers, CallerReference: Nonce = null, Id: ResourceId = null): DelegationSet = {
    val __obj = js.Dynamic.literal(NameServers = NameServers.asInstanceOf[js.Any])
    if (CallerReference != null) __obj.updateDynamic("CallerReference")(CallerReference.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSet]
  }
}

