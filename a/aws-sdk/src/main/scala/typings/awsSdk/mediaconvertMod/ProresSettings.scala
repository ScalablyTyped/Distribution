package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProresSettings extends js.Object {
  /**
    * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes codec to use for this output.
    */
  var CodecProfile: js.UndefOr[ProresCodecProfile] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[ProresFramerateControl] = js.native
  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm] = js.native
  /**
    * Frame rate denominator.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[ProresInterlaceMode] = js.native
  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  var ParControl: js.UndefOr[ProresParControl] = js.native
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[ProresSlowPal] = js.native
  /**
    * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  var Telecine: js.UndefOr[ProresTelecine] = js.native
}

object ProresSettings {
  @scala.inline
  def apply(): ProresSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProresSettings]
  }
  @scala.inline
  implicit class ProresSettingsOps[Self <: ProresSettings] (val x: Self) extends AnyVal {
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
    def setCodecProfile(value: ProresCodecProfile): Self = this.set("CodecProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecProfile: Self = this.set("CodecProfile", js.undefined)
    @scala.inline
    def setFramerateControl(value: ProresFramerateControl): Self = this.set("FramerateControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateControl: Self = this.set("FramerateControl", js.undefined)
    @scala.inline
    def setFramerateConversionAlgorithm(value: ProresFramerateConversionAlgorithm): Self = this.set("FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateConversionAlgorithm: Self = this.set("FramerateConversionAlgorithm", js.undefined)
    @scala.inline
    def setFramerateDenominator(value: integerMin1Max2147483647): Self = this.set("FramerateDenominator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateDenominator: Self = this.set("FramerateDenominator", js.undefined)
    @scala.inline
    def setFramerateNumerator(value: integerMin1Max2147483647): Self = this.set("FramerateNumerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateNumerator: Self = this.set("FramerateNumerator", js.undefined)
    @scala.inline
    def setInterlaceMode(value: ProresInterlaceMode): Self = this.set("InterlaceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterlaceMode: Self = this.set("InterlaceMode", js.undefined)
    @scala.inline
    def setParControl(value: ProresParControl): Self = this.set("ParControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParControl: Self = this.set("ParControl", js.undefined)
    @scala.inline
    def setParDenominator(value: integerMin1Max2147483647): Self = this.set("ParDenominator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParDenominator: Self = this.set("ParDenominator", js.undefined)
    @scala.inline
    def setParNumerator(value: integerMin1Max2147483647): Self = this.set("ParNumerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParNumerator: Self = this.set("ParNumerator", js.undefined)
    @scala.inline
    def setSlowPal(value: ProresSlowPal): Self = this.set("SlowPal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlowPal: Self = this.set("SlowPal", js.undefined)
    @scala.inline
    def setTelecine(value: ProresTelecine): Self = this.set("Telecine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelecine: Self = this.set("Telecine", js.undefined)
  }
  
}

