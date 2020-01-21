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
    NetworkId: Int | Double = null,
    NetworkName: stringMin1Max256 = null,
    NitInterval: Int | Double = null
  ): DvbNitSettings = {
    val __obj = js.Dynamic.literal()
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId.asInstanceOf[js.Any])
    if (NetworkName != null) __obj.updateDynamic("NetworkName")(NetworkName.asInstanceOf[js.Any])
    if (NitInterval != null) __obj.updateDynamic("NitInterval")(NitInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbNitSettings]
  }
}

