package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainEndpointOptionsResponse extends js.Object {
  /**
    * The status and configuration of a search domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
}

object DescribeDomainEndpointOptionsResponse {
  @scala.inline
  def apply(DomainEndpointOptions: DomainEndpointOptionsStatus = null): DescribeDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainEndpointOptionsResponse]
  }
}

