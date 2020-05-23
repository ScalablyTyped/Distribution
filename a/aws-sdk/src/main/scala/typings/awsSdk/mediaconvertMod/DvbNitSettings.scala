package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbNitSettings extends js.Object {
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * The network name text placed in the network_name_descriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: js.UndefOr[stringMin1Max256] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var NitInterval: js.UndefOr[integerMin25Max10000] = js.native
}

object DvbNitSettings {
  @scala.inline
  def apply(
    NetworkId: js.UndefOr[integerMin0Max65535] = js.undefined,
    NetworkName: stringMin1Max256 = null,
    NitInterval: js.UndefOr[integerMin25Max10000] = js.undefined
  ): DvbNitSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NetworkId)) __obj.updateDynamic("NetworkId")(NetworkId.get.asInstanceOf[js.Any])
    if (NetworkName != null) __obj.updateDynamic("NetworkName")(NetworkName.asInstanceOf[js.Any])
    if (!js.isUndefined(NitInterval)) __obj.updateDynamic("NitInterval")(NitInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbNitSettings]
  }
}

