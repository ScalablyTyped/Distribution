package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H264QvbrSettings extends StObject {
  
  /**
    * Use this setting only when Rate control mode is QVBR and Quality tuning level is Multi-pass HQ. For Max average bitrate values suited to the complexity of your input video, the service limits the average bitrate of the video part of this output to the value that you choose. That is, the total size of the video element is less than or equal to the value you set multiplied by the number of seconds of encoded output.
    */
  var MaxAverageBitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  
  /**
    * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within h264Settings. Specify the general target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and 9. Optionally, to specify a value between whole numbers, also provide a value for the setting qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.native
  
  /**
    * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
    */
  var QvbrQualityLevelFineTune: js.UndefOr[doubleMin0Max1] = js.native
}
object H264QvbrSettings {
  
  @scala.inline
  def apply(): H264QvbrSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264QvbrSettings]
  }
  
  @scala.inline
  implicit class H264QvbrSettingsMutableBuilder[Self <: H264QvbrSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAverageBitrate(value: integerMin1000Max1152000000): Self = StObject.set(x, "MaxAverageBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAverageBitrateUndefined: Self = StObject.set(x, "MaxAverageBitrate", js.undefined)
    
    @scala.inline
    def setQvbrQualityLevel(value: integerMin1Max10): Self = StObject.set(x, "QvbrQualityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQvbrQualityLevelFineTune(value: doubleMin0Max1): Self = StObject.set(x, "QvbrQualityLevelFineTune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQvbrQualityLevelFineTuneUndefined: Self = StObject.set(x, "QvbrQualityLevelFineTune", js.undefined)
    
    @scala.inline
    def setQvbrQualityLevelUndefined: Self = StObject.set(x, "QvbrQualityLevel", js.undefined)
  }
}
