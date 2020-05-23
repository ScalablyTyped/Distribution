package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbNitSettings extends js.Object {
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: integerMin0Max65536 = js.native
  /**
    * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: stringMin1Max256 = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin25Max10000] = js.native
}

object DvbNitSettings {
  @scala.inline
  def apply(
    NetworkId: integerMin0Max65536,
    NetworkName: stringMin1Max256,
    RepInterval: js.UndefOr[integerMin25Max10000] = js.undefined
  ): DvbNitSettings = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], NetworkName = NetworkName.asInstanceOf[js.Any])
    if (!js.isUndefined(RepInterval)) __obj.updateDynamic("RepInterval")(RepInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbNitSettings]
  }
}

