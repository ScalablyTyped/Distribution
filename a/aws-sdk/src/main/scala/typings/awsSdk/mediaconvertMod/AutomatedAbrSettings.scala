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
  
  /**
    * Optional. Use Automated ABR rules to specify restrictions for the rendition sizes MediaConvert will create in your ABR stack. You can use these rules if your ABR workflow has specific rendition size requirements, but you still want MediaConvert to optimize for video quality and overall file size.
    */
  var Rules: js.UndefOr[listOfAutomatedAbrRule] = js.undefined
}
object AutomatedAbrSettings {
  
  inline def apply(): AutomatedAbrSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedAbrSettings]
  }
  
  extension [Self <: AutomatedAbrSettings](x: Self) {
    
    inline def setMaxAbrBitrate(value: integerMin100000Max100000000): Self = StObject.set(x, "MaxAbrBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxAbrBitrateUndefined: Self = StObject.set(x, "MaxAbrBitrate", js.undefined)
    
    inline def setMaxRenditions(value: integerMin3Max15): Self = StObject.set(x, "MaxRenditions", value.asInstanceOf[js.Any])
    
    inline def setMaxRenditionsUndefined: Self = StObject.set(x, "MaxRenditions", js.undefined)
    
    inline def setMinAbrBitrate(value: integerMin100000Max100000000): Self = StObject.set(x, "MinAbrBitrate", value.asInstanceOf[js.Any])
    
    inline def setMinAbrBitrateUndefined: Self = StObject.set(x, "MinAbrBitrate", js.undefined)
    
    inline def setRules(value: listOfAutomatedAbrRule): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AutomatedAbrRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
