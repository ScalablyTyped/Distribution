package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorCorrector extends js.Object {
  /**
    * Brightness level.
    */
  var Brightness: js.UndefOr[integerMin1Max100] = js.native
  /**
    * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses Elemental tone mapping technology to approximate the outcome of manually regrading from HDR to SDR.
    */
  var ColorSpaceConversion: js.UndefOr[typings.awsSdk.mediaconvertMod.ColorSpaceConversion] = js.native
  /**
    * Contrast level.
    */
  var Contrast: js.UndefOr[integerMin1Max100] = js.native
  /**
    * Use these settings when you convert to the HDR 10 color space. Specify the SMPTE ST 2086 Mastering Display Color Volume static metadata that you want signaled in the output. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator. When you set Color space conversion (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings are required. You must set values for Max frame average light level (maxFrameAverageLightLevel) and Max content light level (maxContentLightLevel); these settings don't have a default value. The default values for the other HDR 10 metadata settings are defined by the P3D65 color space. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  var Hdr10Metadata: js.UndefOr[typings.awsSdk.mediaconvertMod.Hdr10Metadata] = js.native
  /**
    * Hue in degrees.
    */
  var Hue: js.UndefOr[integerMinNegative180Max180] = js.native
  /**
    * Saturation level.
    */
  var Saturation: js.UndefOr[integerMin1Max100] = js.native
}

object ColorCorrector {
  @scala.inline
  def apply(): ColorCorrector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorCorrector]
  }
  @scala.inline
  implicit class ColorCorrectorOps[Self <: ColorCorrector] (val x: Self) extends AnyVal {
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
    def setBrightness(value: integerMin1Max100): Self = this.set("Brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrightness: Self = this.set("Brightness", js.undefined)
    @scala.inline
    def setColorSpaceConversion(value: ColorSpaceConversion): Self = this.set("ColorSpaceConversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSpaceConversion: Self = this.set("ColorSpaceConversion", js.undefined)
    @scala.inline
    def setContrast(value: integerMin1Max100): Self = this.set("Contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContrast: Self = this.set("Contrast", js.undefined)
    @scala.inline
    def setHdr10Metadata(value: Hdr10Metadata): Self = this.set("Hdr10Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHdr10Metadata: Self = this.set("Hdr10Metadata", js.undefined)
    @scala.inline
    def setHue(value: integerMinNegative180Max180): Self = this.set("Hue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHue: Self = this.set("Hue", js.undefined)
    @scala.inline
    def setSaturation(value: integerMin1Max100): Self = this.set("Saturation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaturation: Self = this.set("Saturation", js.undefined)
  }
  
}

