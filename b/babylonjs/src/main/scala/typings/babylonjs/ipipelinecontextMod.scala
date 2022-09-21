package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.mathLikeMod.IColor3Like
import typings.babylonjs.mathLikeMod.IColor4Like
import typings.babylonjs.mathLikeMod.IMatrixLike
import typings.babylonjs.mathLikeMod.IQuaternionLike
import typings.babylonjs.mathLikeMod.IVector2Like
import typings.babylonjs.mathLikeMod.IVector3Like
import typings.babylonjs.mathLikeMod.IVector4Like
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipipelinecontextMod {
  
  @js.native
  trait IPipelineContext extends StObject {
    
    /** @hidden */
    def _fillEffectInformation(
      effect: Effect,
      uniformBuffersNames: StringDictionary[Double],
      uniformsNames: js.Array[String],
      uniforms: StringDictionary[Nullable[WebGLUniformLocation]],
      samplerList: js.Array[String],
      samplers: StringDictionary[Double],
      attributesNames: js.Array[String],
      attributes: js.Array[Double]
    ): Unit = js.native
    
    /** @hidden */
    def _getFragmentShaderCode(): String | Null = js.native
    
    /** @hidden */
    def _getVertexShaderCode(): String | Null = js.native
    
    /** @hidden */
    def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ Any, Unit]): Unit = js.native
    
    /** @hidden */
    var _name: js.UndefOr[String] = js.native
    
    /** Releases the resources associated with the pipeline. */
    def dispose(): Unit = js.native
    
    /**
      * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
      */
    var isAsync: Boolean = js.native
    
    /**
      * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
      */
    var isReady: Boolean = js.native
    
    /**
      * Sets an array on a uniform variable.
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setArray(uniformName: String, array: js.Array[Double]): Unit = js.native
    def setArray(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets an array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setArray2(uniformName: String, array: js.Array[Double]): Unit = js.native
    def setArray2(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets an array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setArray3(uniformName: String, array: js.Array[Double]): Unit = js.native
    def setArray3(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets an array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setArray4(uniformName: String, array: js.Array[Double]): Unit = js.native
    def setArray4(uniformName: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets a Color3 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param color3 Value to be set.
      */
    def setColor3(uniformName: String, color3: IColor3Like): Unit = js.native
    
    /**
      * Sets a Color4 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param color3 Value to be set.
      * @param alpha Alpha value to be set.
      */
    def setColor4(uniformName: String, color3: IColor3Like, alpha: Double): Unit = js.native
    
    /**
      * Sets a Color4 on a uniform variable
      * @param uniformName defines the name of the variable
      * @param color4 defines the value to be set
      */
    def setDirectColor4(uniformName: String, color4: IColor4Like): Unit = js.native
    
    /**
      * Sets a float on a uniform variable.
      * @param uniformName Name of the variable.
      * @param value value to be set.
      */
    def setFloat(uniformName: String, value: Double): Unit = js.native
    
    /**
      * Sets a float2 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First float in float2.
      * @param y Second float in float2.
      */
    def setFloat2(uniformName: String, x: Double, y: Double): Unit = js.native
    
    /**
      * Sets a float3 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First float in float3.
      * @param y Second float in float3.
      * @param z Third float in float3.
      */
    def setFloat3(uniformName: String, x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * Sets a float4 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First float in float4.
      * @param y Second float in float4.
      * @param z Third float in float4.
      * @param w Fourth float in float4.
      */
    def setFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
    
    /**
      * Sets an integer value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param value Value to be set.
      */
    def setInt(uniformName: String, value: Double): Unit = js.native
    
    /**
      * Sets an int2 value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First int in int2.
      * @param y Second int in int2.
      */
    def setInt2(uniformName: String, x: Double, y: Double): Unit = js.native
    
    /**
      * Sets an int3 value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First int in int3.
      * @param y Second int in int3.
      * @param z Third int in int3.
      */
    def setInt3(uniformName: String, x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * Sets an int4 value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First int in int4.
      * @param y Second int in int4.
      * @param z Third int in int4.
      * @param w Fourth int in int4.
      */
    def setInt4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
    
    /**
      * Sets an int array on a uniform variable.
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setIntArray(uniformName: String, array: js.typedarray.Int32Array): Unit = js.native
    
    /**
      * Sets an int array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setIntArray2(uniformName: String, array: js.typedarray.Int32Array): Unit = js.native
    
    /**
      * Sets an int array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setIntArray3(uniformName: String, array: js.typedarray.Int32Array): Unit = js.native
    
    /**
      * Sets an int array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      */
    def setIntArray4(uniformName: String, array: js.typedarray.Int32Array): Unit = js.native
    
    /**
      * Sets matrices on a uniform variable.
      * @param uniformName Name of the variable.
      * @param matrices matrices to be set.
      */
    def setMatrices(uniformName: String, matrices: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets matrix on a uniform variable.
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      */
    def setMatrix(uniformName: String, matrix: IMatrixLike): Unit = js.native
    
    /**
      * Sets a 2x2 matrix on a uniform variable. (Specified as [1,2,3,4] will result in [1,2][3,4] matrix)
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      */
    def setMatrix2x2(uniformName: String, matrix: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets a 3x3 matrix on a uniform variable. (Specified as [1,2,3,4,5,6,7,8,9] will result in [1,2,3][4,5,6][7,8,9] matrix)
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      */
    def setMatrix3x3(uniformName: String, matrix: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Sets a Quaternion on a uniform variable.
      * @param uniformName Name of the variable.
      * @param quaternion Value to be set.
      */
    def setQuaternion(uniformName: String, quaternion: IQuaternionLike): Unit = js.native
    
    /**
      * Sets a Vector2 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param vector2 vector2 to be set.
      */
    def setVector2(uniformName: String, vector2: IVector2Like): Unit = js.native
    
    /**
      * Sets a Vector3 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param vector3 Value to be set.
      */
    def setVector3(uniformName: String, vector3: IVector3Like): Unit = js.native
    
    /**
      * Sets a Vector4 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param vector4 Value to be set.
      */
    def setVector4(uniformName: String, vector4: IVector4Like): Unit = js.native
  }
}
