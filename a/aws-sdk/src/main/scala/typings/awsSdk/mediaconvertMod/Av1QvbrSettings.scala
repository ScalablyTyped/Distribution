package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Av1QvbrSettings extends StObject {
  
  /**
    * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within av1Settings. Specify the general target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and 9. Optionally, to specify a value between whole numbers, also provide a value for the setting qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.undefined
  
  /**
    * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
    */
  var QvbrQualityLevelFineTune: js.UndefOr[doubleMin0Max1] = js.undefined
}
object Av1QvbrSettings {
  
  inline def apply(): Av1QvbrSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Av1QvbrSettings]
  }
  
  extension [Self <: Av1QvbrSettings](x: Self) {
    
    inline def setQvbrQualityLevel(value: integerMin1Max10): Self = StObject.set(x, "QvbrQualityLevel", value.asInstanceOf[js.Any])
    
    inline def setQvbrQualityLevelFineTune(value: doubleMin0Max1): Self = StObject.set(x, "QvbrQualityLevelFineTune", value.asInstanceOf[js.Any])
    
    inline def setQvbrQualityLevelFineTuneUndefined: Self = StObject.set(x, "QvbrQualityLevelFineTune", js.undefined)
    
    inline def setQvbrQualityLevelUndefined: Self = StObject.set(x, "QvbrQualityLevel", js.undefined)
  }
}
