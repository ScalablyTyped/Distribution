package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlackoutSlate extends js.Object {
  /**
    * Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var BlackoutSlateImage: js.UndefOr[InputLocation] = js.native
  /**
    * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
    */
  var NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout] = js.native
  /**
    * Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster.
    */
  var NetworkEndBlackoutImage: js.UndefOr[InputLocation] = js.native
  /**
    * Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
    */
  var NetworkId: js.UndefOr[stringMin34Max34] = js.native
  /**
    * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
    */
  var State: js.UndefOr[BlackoutSlateState] = js.native
}

object BlackoutSlate {
  @scala.inline
  def apply(): BlackoutSlate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlackoutSlate]
  }
  @scala.inline
  implicit class BlackoutSlateOps[Self <: BlackoutSlate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlackoutSlateImage(value: InputLocation): Self = this.set("BlackoutSlateImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackoutSlateImage: Self = this.set("BlackoutSlateImage", js.undefined)
    @scala.inline
    def setNetworkEndBlackout(value: BlackoutSlateNetworkEndBlackout): Self = this.set("NetworkEndBlackout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkEndBlackout: Self = this.set("NetworkEndBlackout", js.undefined)
    @scala.inline
    def setNetworkEndBlackoutImage(value: InputLocation): Self = this.set("NetworkEndBlackoutImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkEndBlackoutImage: Self = this.set("NetworkEndBlackoutImage", js.undefined)
    @scala.inline
    def setNetworkId(value: stringMin34Max34): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkId: Self = this.set("NetworkId", js.undefined)
    @scala.inline
    def setState(value: BlackoutSlateState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

