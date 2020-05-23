package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexSettingsSummary extends js.Object {
  /**
    * Transport stream bit rate.
    */
  var TransportStreamBitrate: js.UndefOr[integerMin1000000Max100000000] = js.native
}

object MultiplexSettingsSummary {
  @scala.inline
  def apply(TransportStreamBitrate: js.UndefOr[integerMin1000000Max100000000] = js.undefined): MultiplexSettingsSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(TransportStreamBitrate)) __obj.updateDynamic("TransportStreamBitrate")(TransportStreamBitrate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexSettingsSummary]
  }
}

