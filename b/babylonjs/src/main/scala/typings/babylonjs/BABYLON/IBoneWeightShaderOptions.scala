package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoneWeightShaderOptions extends StObject {
  
  /** Colors for Uninfluenced bones */
  var colorBase: js.UndefOr[Color3] = js.native
  
  /** Color for 0.75-1 Weight Influence */
  var colorFull: js.UndefOr[Color3] = js.native
  
  /** Color for 0.5-0.75 Weight Influence */
  var colorHalf: js.UndefOr[Color3] = js.native
  
  /** Color for 0.25-0.5 Weight Influence */
  var colorQuarter: js.UndefOr[Color3] = js.native
  
  /** Colors for 0.0-0.25 Weight bones */
  var colorZero: js.UndefOr[Color3] = js.native
  
  /** Skeleton to Map */
  var skeleton: Skeleton = js.native
  
  /** Color for Zero Weight Influence */
  var targetBoneIndex: js.UndefOr[Double] = js.native
}
object IBoneWeightShaderOptions {
  
  @scala.inline
  def apply(skeleton: Skeleton): IBoneWeightShaderOptions = {
    val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBoneWeightShaderOptions]
  }
  
  @scala.inline
  implicit class IBoneWeightShaderOptionsMutableBuilder[Self <: IBoneWeightShaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorBase(value: Color3): Self = StObject.set(x, "colorBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBaseUndefined: Self = StObject.set(x, "colorBase", js.undefined)
    
    @scala.inline
    def setColorFull(value: Color3): Self = StObject.set(x, "colorFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFullUndefined: Self = StObject.set(x, "colorFull", js.undefined)
    
    @scala.inline
    def setColorHalf(value: Color3): Self = StObject.set(x, "colorHalf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorHalfUndefined: Self = StObject.set(x, "colorHalf", js.undefined)
    
    @scala.inline
    def setColorQuarter(value: Color3): Self = StObject.set(x, "colorQuarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorQuarterUndefined: Self = StObject.set(x, "colorQuarter", js.undefined)
    
    @scala.inline
    def setColorZero(value: Color3): Self = StObject.set(x, "colorZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorZeroUndefined: Self = StObject.set(x, "colorZero", js.undefined)
    
    @scala.inline
    def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBoneIndex(value: Double): Self = StObject.set(x, "targetBoneIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBoneIndexUndefined: Self = StObject.set(x, "targetBoneIndex", js.undefined)
  }
}
