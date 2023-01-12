package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBoneWeightShaderOptions extends StObject {
  
  /** Colors for Uninfluenced bones */
  var colorBase: js.UndefOr[Color3] = js.undefined
  
  /** Color for 0.75-1 Weight Influence */
  var colorFull: js.UndefOr[Color3] = js.undefined
  
  /** Color for 0.5-0.75 Weight Influence */
  var colorHalf: js.UndefOr[Color3] = js.undefined
  
  /** Color for 0.25-0.5 Weight Influence */
  var colorQuarter: js.UndefOr[Color3] = js.undefined
  
  /** Colors for 0.0-0.25 Weight bones */
  var colorZero: js.UndefOr[Color3] = js.undefined
  
  /** Skeleton to Map */
  var skeleton: Skeleton
  
  /** Color for Zero Weight Influence */
  var targetBoneIndex: js.UndefOr[Double] = js.undefined
}
object IBoneWeightShaderOptions {
  
  inline def apply(skeleton: Skeleton): IBoneWeightShaderOptions = {
    val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoneWeightShaderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBoneWeightShaderOptions] (val x: Self) extends AnyVal {
    
    inline def setColorBase(value: Color3): Self = StObject.set(x, "colorBase", value.asInstanceOf[js.Any])
    
    inline def setColorBaseUndefined: Self = StObject.set(x, "colorBase", js.undefined)
    
    inline def setColorFull(value: Color3): Self = StObject.set(x, "colorFull", value.asInstanceOf[js.Any])
    
    inline def setColorFullUndefined: Self = StObject.set(x, "colorFull", js.undefined)
    
    inline def setColorHalf(value: Color3): Self = StObject.set(x, "colorHalf", value.asInstanceOf[js.Any])
    
    inline def setColorHalfUndefined: Self = StObject.set(x, "colorHalf", js.undefined)
    
    inline def setColorQuarter(value: Color3): Self = StObject.set(x, "colorQuarter", value.asInstanceOf[js.Any])
    
    inline def setColorQuarterUndefined: Self = StObject.set(x, "colorQuarter", js.undefined)
    
    inline def setColorZero(value: Color3): Self = StObject.set(x, "colorZero", value.asInstanceOf[js.Any])
    
    inline def setColorZeroUndefined: Self = StObject.set(x, "colorZero", js.undefined)
    
    inline def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
    
    inline def setTargetBoneIndex(value: Double): Self = StObject.set(x, "targetBoneIndex", value.asInstanceOf[js.Any])
    
    inline def setTargetBoneIndexUndefined: Self = StObject.set(x, "targetBoneIndex", js.undefined)
  }
}
