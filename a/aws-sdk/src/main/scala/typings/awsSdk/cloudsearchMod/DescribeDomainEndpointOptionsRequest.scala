package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainEndpointOptionsRequest extends js.Object {
  /**
    * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active configuration. Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object DescribeDomainEndpointOptionsRequest {
  @scala.inline
  def apply(DomainName: DomainName, Deployed: js.UndefOr[Boolean] = js.undefined): DescribeDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainEndpointOptionsRequest]
  }
}

