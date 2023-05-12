package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullEngineOptions extends StObject {
  
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
    */
  var deterministicLockstep: Boolean
  
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
    */
  var lockstepMaxSteps: Double
  
  /**
    * Render height (Default: 256)
    */
  var renderHeight: Double
  
  /**
    * Render width (Default: 512)
    */
  var renderWidth: Double
  
  /**
    * Texture size (Default: 512)
    */
  var textureSize: Double
  
  /**
    * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
    */
  var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.undefined
}
object NullEngineOptions {
  
  inline def apply(
    deterministicLockstep: Boolean,
    lockstepMaxSteps: Double,
    renderHeight: Double,
    renderWidth: Double,
    textureSize: Double
  ): NullEngineOptions = {
    val __obj = js.Dynamic.literal(deterministicLockstep = deterministicLockstep.asInstanceOf[js.Any], lockstepMaxSteps = lockstepMaxSteps.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any], textureSize = textureSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullEngineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullEngineOptions] (val x: Self) extends AnyVal {
    
    inline def setDeterministicLockstep(value: Boolean): Self = StObject.set(x, "deterministicLockstep", value.asInstanceOf[js.Any])
    
    inline def setLockstepMaxSteps(value: Double): Self = StObject.set(x, "lockstepMaxSteps", value.asInstanceOf[js.Any])
    
    inline def setRenderHeight(value: Double): Self = StObject.set(x, "renderHeight", value.asInstanceOf[js.Any])
    
    inline def setRenderWidth(value: Double): Self = StObject.set(x, "renderWidth", value.asInstanceOf[js.Any])
    
    inline def setTextureSize(value: Double): Self = StObject.set(x, "textureSize", value.asInstanceOf[js.Any])
    
    inline def setUseHighPrecisionMatrix(value: Boolean): Self = StObject.set(x, "useHighPrecisionMatrix", value.asInstanceOf[js.Any])
    
    inline def setUseHighPrecisionMatrixUndefined: Self = StObject.set(x, "useHighPrecisionMatrix", js.undefined)
  }
}
