package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullEngineOptions extends StObject {
  
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var deterministicLockstep: Boolean = js.native
  
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var lockstepMaxSteps: Double = js.native
  
  /**
    * Render height (Default: 256)
    */
  var renderHeight: Double = js.native
  
  /**
    * Render width (Default: 512)
    */
  var renderWidth: Double = js.native
  
  /**
    * Texture size (Default: 512)
    */
  var textureSize: Double = js.native
  
  /**
    * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
    */
  var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.native
}
object NullEngineOptions {
  
  @scala.inline
  def apply(
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
  implicit class NullEngineOptionsMutableBuilder[Self <: NullEngineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeterministicLockstep(value: Boolean): Self = StObject.set(x, "deterministicLockstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockstepMaxSteps(value: Double): Self = StObject.set(x, "lockstepMaxSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHeight(value: Double): Self = StObject.set(x, "renderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderWidth(value: Double): Self = StObject.set(x, "renderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureSize(value: Double): Self = StObject.set(x, "textureSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHighPrecisionMatrix(value: Boolean): Self = StObject.set(x, "useHighPrecisionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHighPrecisionMatrixUndefined: Self = StObject.set(x, "useHighPrecisionMatrix", js.undefined)
  }
}
