package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEntry extends js.Object {
  /**
    * The ID of the domain recordset entry.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  /**
    * When true, specifies whether the domain entry is an alias used by the Lightsail load balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic to your load balancer
    */
  var isAlias: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain.
    */
  var name: js.UndefOr[DomainName] = js.native
  /**
    * (Deprecated) The options for the domain entry.  In releases prior to November 29, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var options: js.UndefOr[DomainEntryOptions] = js.native
  /**
    * The target AWS name server (e.g., ns-111.awsdns-22.com.). For Lightsail load balancers, the value looks like ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com. Be sure to also set isAlias to true when setting up an A record for a load balancer.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The following domain entry types can be used:    A     CNAME     MX     NS     SOA     SRV     TXT   
    */
  var `type`: js.UndefOr[DomainEntryType] = js.native
}

object DomainEntry {
  @scala.inline
  def apply(
    id: NonEmptyString = null,
    isAlias: js.UndefOr[Boolean] = js.undefined,
    name: DomainName = null,
    options: DomainEntryOptions = null,
    target: String = null,
    `type`: DomainEntryType = null
  ): DomainEntry = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlias)) __obj.updateDynamic("isAlias")(isAlias.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEntry]
  }
}

