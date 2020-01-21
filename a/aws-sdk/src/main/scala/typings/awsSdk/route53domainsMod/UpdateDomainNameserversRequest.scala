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
  def apply(DomainName: DomainName, Nameservers: NameserverList, FIAuthKey: FIAuthKey = null): UpdateDomainNameserversRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Nameservers = Nameservers.asInstanceOf[js.Any])
    if (FIAuthKey != null) __obj.updateDynamic("FIAuthKey")(FIAuthKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameserversRequest]
  }
}

