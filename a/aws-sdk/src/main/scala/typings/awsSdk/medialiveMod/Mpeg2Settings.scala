package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mpeg2Settings extends js.Object {
  
  /**
    * Choose Off to disable adaptive quantization. Or choose another value to enable the quantizer and set its strength. The strengths are: Auto, Off, Low, Medium, High. When you enable this field, MediaLive allows intra-frame quantizers to vary, which might improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.native
  
  /**
    * Indicates the AFD values that MediaLive will write into the video encode. If you do not know what AFD signaling is, or if your downstream system has not given you guidance, choose AUTO.
  AUTO: MediaLive will try to preserve the input AFD value (in cases where multiple AFD values are valid).
  FIXED: MediaLive will use the value you specify in fixedAFD.
    */
  var AfdSignaling: js.UndefOr[typings.awsSdk.medialiveMod.AfdSignaling] = js.native
  
  /**
    * Specifies whether to include the color space metadata. The metadata describes the color space that applies to the video (the colorSpace field). We recommend that you insert the metadata.
    */
  var ColorMetadata: js.UndefOr[Mpeg2ColorMetadata] = js.native
  
  /**
    * Choose the type of color space conversion to apply to the output. For detailed information on setting up both the input and the output to obtain the desired color space in the output, see the section on \"MediaLive Features - Video - color space\" in the MediaLive User Guide.
  PASSTHROUGH: Keep the color space of the input content - do not convert it.
  AUTO:Convert all content that is SD to rec 601, and convert all content that is HD to rec 709.
    */
  var ColorSpace: js.UndefOr[Mpeg2ColorSpace] = js.native
  
  /**
    * Sets the pixel aspect ratio for the encode.
    */
  var DisplayAspectRatio: js.UndefOr[Mpeg2DisplayRatio] = js.native
  
  /**
    * Optionally specify a noise reduction filter, which can improve quality of compressed content. If you do not choose a filter, no filter will be applied.
  TEMPORAL: This filter is useful for both source content that is noisy (when it has excessive digital artifacts) and source content that is clean.
  When the content is noisy, the filter cleans up the source content before the encoding phase, with these two effects: First, it improves the output video quality because the content has been cleaned up. Secondly, it decreases the bandwidth because MediaLive does not waste bits on encoding noise.
  When the content is reasonably clean, the filter tends to decrease the bitrate.
    */
  var FilterSettings: js.UndefOr[Mpeg2FilterSettings] = js.native
  
  /**
    * Complete this field only when afdSignaling is set to FIXED. Enter the AFD value (4 bits) to write on all frames of the video encode.
    */
  var FixedAfd: js.UndefOr[typings.awsSdk.medialiveMod.FixedAfd] = js.native
  
  /**
    * description": "The framerate denominator. For example, 1001. The framerate is the numerator divided by the denominator. For example, 24000 / 1001 = 23.976 FPS.
    */
  var FramerateDenominator: integerMin1 = js.native
  
  /**
    * The framerate numerator. For example, 24000. The framerate is the numerator divided by the denominator. For example, 24000 / 1001 = 23.976 FPS.
    */
  var FramerateNumerator: integerMin1 = js.native
  
  /**
    * MPEG2: default is open GOP.
    */
  var GopClosedCadence: js.UndefOr[integerMin0] = js.native
  
  /**
    * Relates to the GOP structure. The number of B-frames between reference frames. If you do not know what a B-frame is, use the default.
    */
  var GopNumBFrames: js.UndefOr[integerMin0Max7] = js.native
  
  /**
    * Relates to the GOP structure. The GOP size (keyframe interval) in the units specified in gopSizeUnits. If you do not know what GOP is, use the default.
  If gopSizeUnits is frames, then the gopSize must be an integer and must be greater than or equal to 1.
  If gopSizeUnits is seconds, the gopSize must be greater than 0, but does not need to be an integer.
    */
  var GopSize: js.UndefOr[double] = js.native
  
  /**
    * Relates to the GOP structure. Specifies whether the gopSize is specified in frames or seconds. If you do not plan to change the default gopSize, leave the default. If you specify SECONDS, MediaLive will internally convert the gop size to a frame count.
    */
  var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.native
  
  /**
    * Set the scan type of the output to PROGRESSIVE or INTERLACED (top field first).
    */
  var ScanType: js.UndefOr[Mpeg2ScanType] = js.native
  
  /**
    * Relates to the GOP structure. If you do not know what GOP is, use the default.
  FIXED: Set the number of B-frames in each sub-GOP to the value in gopNumBFrames.
  DYNAMIC: Let MediaLive optimize the number of B-frames in each sub-GOP, to improve visual quality.
    */
  var SubgopLength: js.UndefOr[Mpeg2SubGopLength] = js.native
  
  /**
    * Determines how MediaLive inserts timecodes in the output video. For detailed information about setting up the input and the output for a timecode, see the section on \"MediaLive Features - Timecode configuration\" in the MediaLive User Guide.
  DISABLED: do not include timecodes.
  GOP_TIMECODE: Include timecode metadata in the GOP header.
    */
  var TimecodeInsertion: js.UndefOr[Mpeg2TimecodeInsertionBehavior] = js.native
}
object Mpeg2Settings {
  
  @scala.inline
  def apply(FramerateDenominator: integerMin1, FramerateNumerator: integerMin1): Mpeg2Settings = {
    val __obj = js.Dynamic.literal(FramerateDenominator = FramerateDenominator.asInstanceOf[js.Any], FramerateNumerator = FramerateNumerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mpeg2Settings]
  }
  
  @scala.inline
  implicit class Mpeg2SettingsOps[Self <: Mpeg2Settings] (val x: Self) extends AnyVal {
    
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
    def setFramerateDenominator(value: integerMin1): Self = this.set("FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateNumerator(value: integerMin1): Self = this.set("FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveQuantization(value: Mpeg2AdaptiveQuantization): Self = this.set("AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveQuantization: Self = this.set("AdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setAfdSignaling(value: AfdSignaling): Self = this.set("AfdSignaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfdSignaling: Self = this.set("AfdSignaling", js.undefined)
    
    @scala.inline
    def setColorMetadata(value: Mpeg2ColorMetadata): Self = this.set("ColorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMetadata: Self = this.set("ColorMetadata", js.undefined)
    
    @scala.inline
    def setColorSpace(value: Mpeg2ColorSpace): Self = this.set("ColorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpace: Self = this.set("ColorSpace", js.undefined)
    
    @scala.inline
    def setDisplayAspectRatio(value: Mpeg2DisplayRatio): Self = this.set("DisplayAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAspectRatio: Self = this.set("DisplayAspectRatio", js.undefined)
    
    @scala.inline
    def setFilterSettings(value: Mpeg2FilterSettings): Self = this.set("FilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSettings: Self = this.set("FilterSettings", js.undefined)
    
    @scala.inline
    def setFixedAfd(value: FixedAfd): Self = this.set("FixedAfd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedAfd: Self = this.set("FixedAfd", js.undefined)
    
    @scala.inline
    def setGopClosedCadence(value: integerMin0): Self = this.set("GopClosedCadence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopClosedCadence: Self = this.set("GopClosedCadence", js.undefined)
    
    @scala.inline
    def setGopNumBFrames(value: integerMin0Max7): Self = this.set("GopNumBFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopNumBFrames: Self = this.set("GopNumBFrames", js.undefined)
    
    @scala.inline
    def setGopSize(value: double): Self = this.set("GopSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopSize: Self = this.set("GopSize", js.undefined)
    
    @scala.inline
    def setGopSizeUnits(value: Mpeg2GopSizeUnits): Self = this.set("GopSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopSizeUnits: Self = this.set("GopSizeUnits", js.undefined)
    
    @scala.inline
    def setScanType(value: Mpeg2ScanType): Self = this.set("ScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanType: Self = this.set("ScanType", js.undefined)
    
    @scala.inline
    def setSubgopLength(value: Mpeg2SubGopLength): Self = this.set("SubgopLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubgopLength: Self = this.set("SubgopLength", js.undefined)
    
    @scala.inline
    def setTimecodeInsertion(value: Mpeg2TimecodeInsertionBehavior): Self = this.set("TimecodeInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimecodeInsertion: Self = this.set("TimecodeInsertion", js.undefined)
  }
}
