package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DolbyVisionLevel6Metadata extends js.Object {
  /**
    * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream. Measured in nits.
    */
  var MaxCll: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness in the entire stream. Measured in nits.
    */
  var MaxFall: js.UndefOr[integerMin0Max65535] = js.native
}

object DolbyVisionLevel6Metadata {
  @scala.inline
  def apply(): DolbyVisionLevel6Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DolbyVisionLevel6Metadata]
  }
  @scala.inline
  implicit class DolbyVisionLevel6MetadataOps[Self <: DolbyVisionLevel6Metadata] (val x: Self) extends AnyVal {
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
    def setMaxCll(value: integerMin0Max65535): Self = this.set("MaxCll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCll: Self = this.set("MaxCll", js.undefined)
    @scala.inline
    def setMaxFall(value: integerMin0Max65535): Self = this.set("MaxFall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFall: Self = this.set("MaxFall", js.undefined)
  }
  
}

