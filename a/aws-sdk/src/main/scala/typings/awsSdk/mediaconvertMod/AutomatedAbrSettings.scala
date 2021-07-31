package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomatedAbrSettings extends StObject {
  
  /**
    * Optional. The maximum target bit rate used in your automated ABR stack. Use this value to set an upper limit on the bandwidth consumed by the highest-quality rendition. This is the rendition that is delivered to viewers with the fastest internet connections. If you don't specify a value, MediaConvert uses 8,000,000 (8 mb/s) by default.
    */
  var MaxAbrBitrate: js.UndefOr[integerMin100000Max100000000] = js.undefined
  
  /**
    * Optional. The maximum number of renditions that MediaConvert will create in your automated ABR stack. The number of renditions is determined automatically, based on analysis of each job, but will never exceed this limit. When you set this to Auto in the console, which is equivalent to excluding it from your JSON job specification, MediaConvert defaults to a limit of 15.
    */
  var MaxRenditions: js.UndefOr[integerMin3Max15] = js.undefined
  
  /**
    * Optional. The minimum target bitrate used in your automated ABR stack. Use this value to set a lower limit on the bitrate of video delivered to viewers with slow internet connections. If you don't specify a value, MediaConvert uses 600,000 (600 kb/s) by default.
    */
  var MinAbrBitrate: js.UndefOr[integerMin100000Max100000000] = js.undefined
}
object AutomatedAbrSettings {
  
  @scala.inline
  def apply(): AutomatedAbrSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedAbrSettings]
  }
  
  @scala.inline
  implicit class AutomatedAbrSettingsMutableBuilder[Self <: AutomatedAbrSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAbrBitrate(value: integerMin100000Max100000000): Self = StObject.set(x, "MaxAbrBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAbrBitrateUndefined: Self = StObject.set(x, "MaxAbrBitrate", js.undefined)
    
    @scala.inline
    def setMaxRenditions(value: integerMin3Max15): Self = StObject.set(x, "MaxRenditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRenditionsUndefined: Self = StObject.set(x, "MaxRenditions", js.undefined)
    
    @scala.inline
    def setMinAbrBitrate(value: integerMin100000Max100000000): Self = StObject.set(x, "MinAbrBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAbrBitrateUndefined: Self = StObject.set(x, "MinAbrBitrate", js.undefined)
  }
}
