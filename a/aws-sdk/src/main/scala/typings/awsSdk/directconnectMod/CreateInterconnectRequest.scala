package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInterconnectRequest extends js.Object {
  /**
    * The port bandwidth, in Gbps. The possible values are 1 and 10.
    */
  var bandwidth: Bandwidth = js.native
  /**
    * The name of the interconnect.
    */
  var interconnectName: InterconnectName = js.native
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
  /**
    * The location of the interconnect.
    */
  var location: LocationCode = js.native
  /**
    * The name of the service provider associated with the interconnect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The tags to associate with the interconnect.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateInterconnectRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    interconnectName: InterconnectName,
    location: LocationCode,
    lagId: LagId = null,
    providerName: ProviderName = null,
    tags: TagList = null
  ): CreateInterconnectRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], interconnectName = interconnectName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterconnectRequest]
  }
}

