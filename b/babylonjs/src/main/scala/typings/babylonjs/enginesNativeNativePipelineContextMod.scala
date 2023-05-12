package typings.babylonjs

import typings.babylonjs.enginesIpipelinecontextMod.IPipelineContext
import typings.babylonjs.enginesNativeEngineMod.NativeEngine
import typings.babylonjs.mathsMathDotlikeMod.IMatrixLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesNativeNativePipelineContextMod {
  
  @JSImport("babylonjs/Engines/Native/nativePipelineContext", "NativePipelineContext")
  @js.native
  open class NativePipelineContext protected ()
    extends StObject
       with IPipelineContext {
    def this(engine: NativeEngine) = this()
    
    /**
      * @internal
      */
    def _cacheFloat2(uniformName: String, x: Double, y: Double): Boolean = js.native
    
    /**
      * @internal
      */
    def _cacheFloat3(uniformName: String, x: Double, y: Double, z: Double): Boolean = js.native
    
    /**
      * @internal
      */
    def _cacheFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Boolean = js.native
    
    /**
      * @internal
      */
    def _cacheMatrix(uniformName: String, matrix: IMatrixLike): Boolean = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _uniforms: Any = js.native
    
    /* private */ var _valueCache: Any = js.native
    
    var compilationError: js.UndefOr[js.Error] = js.native
    
    @JSName("isAsync")
    def isAsync_MNativePipelineContext: Boolean = js.native
    
    var isCompiled: Boolean = js.native
    
    var isParallelCompiled: Boolean = js.native
    
    @JSName("isReady")
    def isReady_MNativePipelineContext: Boolean = js.native
    
    var nativeProgram: Any = js.native
    
    var onCompiled: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Sets a boolean on a uniform variable.
      * @param uniformName Name of the variable.
      * @param bool value to be set.
      */
    def setBool(uniformName: String, bool: Boolean): Unit = js.native
    
    /**
      * Sets an float array on a uniform variable.
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setFloatArray(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets an float array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setFloatArray2(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets an float array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setFloatArray3(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets an float array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setFloatArray4(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
  }
}
