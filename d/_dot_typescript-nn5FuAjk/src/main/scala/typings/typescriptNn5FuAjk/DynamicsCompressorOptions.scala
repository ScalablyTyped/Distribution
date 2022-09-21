package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicsCompressorOptions
  extends StObject
     with AudioNodeOptions {
  
  var attack: js.UndefOr[Double] = js.undefined
  
  var knee: js.UndefOr[Double] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var release: js.UndefOr[Double] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object DynamicsCompressorOptions {
  
  inline def apply(): DynamicsCompressorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicsCompressorOptions]
  }
  
  extension [Self <: DynamicsCompressorOptions](x: Self) {
    
    inline def setAttack(value: Double): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    inline def setAttackUndefined: Self = StObject.set(x, "attack", js.undefined)
    
    inline def setKnee(value: Double): Self = StObject.set(x, "knee", value.asInstanceOf[js.Any])
    
    inline def setKneeUndefined: Self = StObject.set(x, "knee", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
