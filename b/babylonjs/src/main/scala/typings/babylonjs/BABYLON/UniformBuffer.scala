package typings.babylonjs.BABYLON

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniformBuffer extends StObject {
  
  /** @hidden */
  var _alreadyBound: Boolean = js.native
  
  /* private */ var _buffer: js.Any = js.native
  
  /* private */ var _bufferData: js.Any = js.native
  
  /* private */ var _cacheMatrix: js.Any = js.native
  
  /* private */ var _currentEffect: js.Any = js.native
  
  /* private */ var _data: js.Any = js.native
  
  /* private */ var _dynamic: js.Any = js.native
  
  /* private */ var _engine: js.Any = js.native
  
  /**
    * std140 layout specifies how to align data within an UBO structure.
    * See https://khronos.org/registry/OpenGL/specs/gl/glspec45.core.pdf#page=159
    * for specs.
    */
  /* private */ var _fillAlignment: js.Any = js.native
  
  /* private */ var _needSync: js.Any = js.native
  
  /* private */ var _noUBO: js.Any = js.native
  
  /** @hidden */
  def _rebuild(): Unit = js.native
  
  /* private */ var _uniformLocationPointer: js.Any = js.native
  
  /* private */ var _uniformLocations: js.Any = js.native
  
  /* private */ var _uniformSizes: js.Any = js.native
  
  /* private */ var _updateColor3ForEffect: js.Any = js.native
  
  /* private */ var _updateColor3ForUniform: js.Any = js.native
  
  /* private */ var _updateColor4ForEffect: js.Any = js.native
  
  /* private */ var _updateColor4ForUniform: js.Any = js.native
  
  /* private */ var _updateFloat2ForEffect: js.Any = js.native
  
  /* private */ var _updateFloat2ForUniform: js.Any = js.native
  
  /* private */ var _updateFloat3ForEffect: js.Any = js.native
  
  /* private */ var _updateFloat3ForUniform: js.Any = js.native
  
  /* private */ var _updateFloat4ForEffect: js.Any = js.native
  
  /* private */ var _updateFloat4ForUniform: js.Any = js.native
  
  /* private */ var _updateFloatForEffect: js.Any = js.native
  
  /* private */ var _updateFloatForUniform: js.Any = js.native
  
  /* private */ var _updateMatrix2x2ForEffect: js.Any = js.native
  
  /* private */ var _updateMatrix2x2ForUniform: js.Any = js.native
  
  /* private */ var _updateMatrix3x3ForEffect: js.Any = js.native
  
  /* private */ var _updateMatrix3x3ForUniform: js.Any = js.native
  
  /* private */ var _updateMatrixForEffect: js.Any = js.native
  
  /* private */ var _updateMatrixForUniform: js.Any = js.native
  
  /* private */ var _updateVector3ForEffect: js.Any = js.native
  
  /* private */ var _updateVector3ForUniform: js.Any = js.native
  
  /* private */ var _updateVector4ForEffect: js.Any = js.native
  
  /* private */ var _updateVector4ForUniform: js.Any = js.native
  
  /* private */ var _valueCache: js.Any = js.native
  
  /**
    * Adds a vec3 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    * @param color Define the vec3 from a Color
    */
  def addColor3(name: String, color: Color3): Unit = js.native
  
  /**
    * Adds a vec4 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    * @param color Define the rgb components from a Color
    * @param alpha Define the a component of the vec4
    */
  def addColor4(name: String, color: Color3, alpha: Double): Unit = js.native
  
  /**
    * Adds a vec2 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    * @param x Define the x component value of the vec2
    * @param y Define the y component value of the vec2
    */
  def addFloat2(name: String, x: Double, y: Double): Unit = js.native
  
  /**
    * Adds a vec3 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    * @param x Define the x component value of the vec3
    * @param y Define the y component value of the vec3
    * @param z Define the z component value of the vec3
    */
  def addFloat3(name: String, x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    * Adds a Matrix 4x4 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    * @param mat A 4x4 matrix.
    */
  def addMatrix(name: String, mat: Matrix): Unit = js.native
  
  /**
    * Adds a Matrix 2x2 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    */
  def addMatrix2x2(name: String): Unit = js.native
  
  /**
    * Adds a Matrix 3x3 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    */
  def addMatrix3x3(name: String): Unit = js.native
  
  def addUniform(name: String, size: js.Array[Double]): Unit = js.native
  /**
    * Adds an uniform in the buffer.
    * Warning : the subsequents calls of this function must be in the same order as declared in the shader
    * for the layout to be correct !
    * @param name Name of the uniform, as used in the uniform block in the shader.
    * @param size Data size, or data directly.
    */
  def addUniform(name: String, size: Double): Unit = js.native
  
  /**
    * Adds a vec3 to the uniform buffer.
    * @param name Name of the uniform, as used in the uniform block in the shader.
    * @param vector Define the vec3 components from a Vector
    */
  def addVector3(name: String, vector: Vector3): Unit = js.native
  
  /**
    * Binds this uniform buffer to an effect.
    * @param effect Define the effect to bind the buffer to
    * @param name Name of the uniform block in the shader.
    */
  def bindToEffect(effect: Effect, name: String): Unit = js.native
  
  /**
    * Effectively creates the WebGL Uniform Buffer, once layout is completed with `addUniform`.
    */
  def create(): Unit = js.native
  
  /**
    * Disposes the uniform buffer.
    */
  def dispose(): Unit = js.native
  
  /**
    * The underlying WebGL Uniform buffer.
    * @returns the webgl buffer
    */
  def getBuffer(): Nullable[DataBuffer] = js.native
  
  /**
    * The data cache on JS side.
    * @returns the underlying data as a float array
    */
  def getData(): Float32Array = js.native
  
  /**
    * Indicates if the WebGL underlying uniform buffer is dynamic.
    * Also, a dynamic UniformBuffer will disable cache verification and always
    * update the underlying WebGL uniform buffer to the GPU.
    * @returns if Dynamic, otherwise false
    */
  def isDynamic(): Boolean = js.native
  
  /**
    * Indicates if the WebGL underlying uniform buffer is in sync
    * with the javascript cache data.
    */
  def isSync: Boolean = js.native
  
  /**
    * Sets a sampler uniform on the effect.
    * @param name Define the name of the sampler.
    * @param texture Define the texture to set in the sampler
    */
  def setTexture(name: String, texture: Nullable[BaseTexture]): Unit = js.native
  
  /**
    * Updates the WebGL Uniform Buffer on the GPU.
    * If the `dynamic` flag is set to true, no cache comparison is done.
    * Otherwise, the buffer will be updated only if the cache differs.
    */
  def update(): Unit = js.native
  
  /**
    * Lambda to Update vec3 of float from a Color in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateColor3(name: String, color: Color3): Unit = js.native
  def updateColor3(name: String, color: Color3, suffix: String): Unit = js.native
  
  /**
    * Lambda to Update vec4 of float from a Color in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateColor4(name: String, color: Color3, alpha: Double): Unit = js.native
  def updateColor4(name: String, color: Color3, alpha: Double, suffix: String): Unit = js.native
  
  /**
    * Lambda to Update a single float in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateFloat(name: String, x: Double): Unit = js.native
  
  /**
    * Lambda to Update a vec2 of float in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateFloat2(name: String, x: Double, y: Double): Unit = js.native
  def updateFloat2(name: String, x: Double, y: Double, suffix: String): Unit = js.native
  
  /**
    * Lambda to Update a vec3 of float in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateFloat3(name: String, x: Double, y: Double, z: Double): Unit = js.native
  def updateFloat3(name: String, x: Double, y: Double, z: Double, suffix: String): Unit = js.native
  
  /**
    * Lambda to Update a vec4 of float in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateFloat4(name: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def updateFloat4(name: String, x: Double, y: Double, z: Double, w: Double, suffix: String): Unit = js.native
  
  /**
    * Lambda to Update a 4x4 Matrix in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateMatrix(name: String, mat: Matrix): Unit = js.native
  
  /**
    * Lambda to Update a 2x2 Matrix in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateMatrix2x2(name: String, matrix: Float32Array): Unit = js.native
  
  /**
    * Lambda to Update a 3x3 Matrix in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateMatrix3x3(name: String, matrix: Float32Array): Unit = js.native
  
  /**
    * Updates the value of an uniform. The `update` method must be called afterwards to make it effective in the GPU.
    * @param uniformName Define the name of the uniform, as used in the uniform block in the shader.
    * @param data Define the flattened data
    * @param size Define the size of the data.
    */
  def updateUniform(uniformName: String, data: FloatArray, size: Double): Unit = js.native
  
  /**
    * Directly updates the value of the uniform in the cache AND on the GPU.
    * @param uniformName Define the name of the uniform, as used in the uniform block in the shader.
    * @param data Define the flattened data
    */
  def updateUniformDirectly(uniformName: String, data: FloatArray): Unit = js.native
  
  /**
    * Lambda to Update vec3 of float from a Vector in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateVector3(name: String, vector: Vector3): Unit = js.native
  
  /**
    * Lambda to Update vec4 of float from a Vector in a uniform buffer.
    * This is dynamic to allow compat with webgl 1 and 2.
    * You will need to pass the name of the uniform as well as the value.
    */
  def updateVector4(name: String, vector: Vector4): Unit = js.native
  
  /**
    * Indicates if the buffer is using the WebGL2 UBO implementation,
    * or just falling back on setUniformXXX calls.
    */
  def useUbo: Boolean = js.native
}
