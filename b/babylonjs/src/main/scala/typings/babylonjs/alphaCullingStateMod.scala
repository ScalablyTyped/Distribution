package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alphaCullingStateMod {
  
  @JSImport("babylonjs/States/alphaCullingState", "AlphaState")
  @js.native
  /**
    * Initializes the state.
    */
  open class AlphaState () extends StObject {
    
    /* private */ var _alphaBlend: Any = js.native
    
    var _blendConstants: js.Array[Nullable[Double]] = js.native
    
    var _blendEquationParameters: js.Array[Nullable[Double]] = js.native
    
    var _blendFunctionParameters: js.Array[Nullable[Double]] = js.native
    
    /* private */ var _isAlphaBlendDirty: Any = js.native
    
    var _isBlendConstantsDirty: Boolean = js.native
    
    /* private */ var _isBlendEquationParametersDirty: Any = js.native
    
    /* private */ var _isBlendFunctionParametersDirty: Any = js.native
    
    def alphaBlend: Boolean = js.native
    def alphaBlend_=(value: Boolean): Unit = js.native
    
    @JSName("apply")
    def apply(gl: WebGLRenderingContext): Unit = js.native
    
    def isDirty: Boolean = js.native
    
    def reset(): Unit = js.native
    
    def setAlphaBlendConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    
    def setAlphaBlendFunctionParameters(value0: Double, value1: Double, value2: Double, value3: Double): Unit = js.native
    
    def setAlphaEquationParameters(rgb: Double, alpha: Double): Unit = js.native
  }
}
