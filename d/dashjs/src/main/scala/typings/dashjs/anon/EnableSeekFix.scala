package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableSeekFix extends StObject {
  
  var enableSeekFix: js.UndefOr[Boolean] = js.undefined
  
  var enableStallFix: js.UndefOr[Boolean] = js.undefined
  
  var jumpGaps: js.UndefOr[Boolean] = js.undefined
  
  var jumpLargeGaps: js.UndefOr[Boolean] = js.undefined
  
  var smallGapLimit: js.UndefOr[Double] = js.undefined
  
  var stallSeek: js.UndefOr[Double] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object EnableSeekFix {
  
  inline def apply(): EnableSeekFix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSeekFix]
  }
  
  extension [Self <: EnableSeekFix](x: Self) {
    
    inline def setEnableSeekFix(value: Boolean): Self = StObject.set(x, "enableSeekFix", value.asInstanceOf[js.Any])
    
    inline def setEnableSeekFixUndefined: Self = StObject.set(x, "enableSeekFix", js.undefined)
    
    inline def setEnableStallFix(value: Boolean): Self = StObject.set(x, "enableStallFix", value.asInstanceOf[js.Any])
    
    inline def setEnableStallFixUndefined: Self = StObject.set(x, "enableStallFix", js.undefined)
    
    inline def setJumpGaps(value: Boolean): Self = StObject.set(x, "jumpGaps", value.asInstanceOf[js.Any])
    
    inline def setJumpGapsUndefined: Self = StObject.set(x, "jumpGaps", js.undefined)
    
    inline def setJumpLargeGaps(value: Boolean): Self = StObject.set(x, "jumpLargeGaps", value.asInstanceOf[js.Any])
    
    inline def setJumpLargeGapsUndefined: Self = StObject.set(x, "jumpLargeGaps", js.undefined)
    
    inline def setSmallGapLimit(value: Double): Self = StObject.set(x, "smallGapLimit", value.asInstanceOf[js.Any])
    
    inline def setSmallGapLimitUndefined: Self = StObject.set(x, "smallGapLimit", js.undefined)
    
    inline def setStallSeek(value: Double): Self = StObject.set(x, "stallSeek", value.asInstanceOf[js.Any])
    
    inline def setStallSeekUndefined: Self = StObject.set(x, "stallSeek", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
