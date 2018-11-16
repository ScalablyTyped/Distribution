package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Uniform buffer objects.
     *
     * Handles blocks of uniform on the GPU.
     *
     * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
     *
     * For more information, please refer to :
     * https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
     */
@JSGlobal("BABYLON.UniformBuffer")
@js.native
class UniformBuffer protected () extends js.Object {
  /**
           * Instantiates a new Uniform buffer objects.
           *
           * Handles blocks of uniform on the GPU.
           *
           * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
           *
           * For more information, please refer to :
           * @see https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
           * @param engine Define the engine the buffer is associated with
           * @param data Define the data contained in the buffer
           * @param dynamic Define if the buffer is updatable
           */
  def this(engine: Engine) = this()
  /**
           * Instantiates a new Uniform buffer objects.
           *
           * Handles blocks of uniform on the GPU.
           *
           * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
           *
           * For more information, please refer to :
           * @see https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
           * @param engine Define the engine the buffer is associated with
           * @param data Define the data contained in the buffer
           * @param dynamic Define if the buffer is updatable
           */
  def this(engine: Engine, data: js.Array[scala.Double]) = this()
  /**
           * Instantiates a new Uniform buffer objects.
           *
           * Handles blocks of uniform on the GPU.
           *
           * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
           *
           * For more information, please refer to :
           * @see https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
           * @param engine Define the engine the buffer is associated with
           * @param data Define the data contained in the buffer
           * @param dynamic Define if the buffer is updatable
           */
  def this(engine: Engine, data: js.Array[scala.Double], dynamic: scala.Boolean) = this()
  var _buffer: js.Any = js.native
  var _bufferData: js.Any = js.native
  var _currentEffect: js.Any = js.native
  var _data: js.Any = js.native
  var _dynamic: js.UndefOr[js.Any] = js.native
  var _engine: js.Any = js.native
  /**
           * std140 layout specifies how to align data within an UBO structure.
           * See https://khronos.org/registry/OpenGL/specs/gl/glspec45.core.pdf#page=159
           * for specs.
           */
  var _fillAlignment: js.Any = js.native
  var _needSync: js.Any = js.native
  var _noUBO: js.Any = js.native
  var _uniformLocationPointer: js.Any = js.native
  var _uniformLocations: js.Any = js.native
  var _uniformSizes: js.Any = js.native
  var _updateColor3ForEffect: js.Any = js.native
  var _updateColor3ForUniform: js.Any = js.native
  var _updateColor4ForEffect: js.Any = js.native
  var _updateColor4ForUniform: js.Any = js.native
  var _updateFloat2ForEffect: js.Any = js.native
  var _updateFloat2ForUniform: js.Any = js.native
  var _updateFloat3ForEffect: js.Any = js.native
  var _updateFloat3ForUniform: js.Any = js.native
  var _updateFloat4ForEffect: js.Any = js.native
  var _updateFloat4ForUniform: js.Any = js.native
  var _updateFloatForEffect: js.Any = js.native
  var _updateFloatForUniform: js.Any = js.native
  var _updateMatrix2x2ForEffect: js.Any = js.native
  var _updateMatrix2x2ForUniform: js.Any = js.native
  var _updateMatrix3x3ForEffect: js.Any = js.native
  var _updateMatrix3x3ForUniform: js.Any = js.native
  var _updateMatrixForEffect: js.Any = js.native
  var _updateMatrixForUniform: js.Any = js.native
  var _updateVector3ForEffect: js.Any = js.native
  var _updateVector3ForUniform: js.Any = js.native
  var _updateVector4ForEffect: js.Any = js.native
  var _updateVector4ForUniform: js.Any = js.native
  /**
           * Indicates if the WebGL underlying uniform buffer is in sync
           * with the javascript cache data.
           */
  val isSync: scala.Boolean = js.native
  /**
           * Indicates if the buffer is using the WebGL2 UBO implementation,
           * or just falling back on setUniformXXX calls.
           */
  val useUbo: scala.Boolean = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /**
           * Adds a vec3 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param color Define the vec3 from a Color
           */
  def addColor3(name: java.lang.String, color: Color3): scala.Unit = js.native
  /**
           * Adds a vec4 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param color Define the rgb components from a Color
           * @param alpha Define the a component of the vec4
           */
  def addColor4(name: java.lang.String, color: Color3, alpha: scala.Double): scala.Unit = js.native
  /**
           * Adds a vec2 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param x Define the x component value of the vec2
           * @param y Define the y component value of the vec2
           */
  def addFloat2(name: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
           * Adds a vec3 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param x Define the x component value of the vec3
           * @param y Define the y component value of the vec3
           * @param z Define the z component value of the vec3
           */
  def addFloat3(name: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
           * Adds a Matrix 4x4 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param mat A 4x4 matrix.
           */
  def addMatrix(name: java.lang.String, mat: Matrix): scala.Unit = js.native
  /**
           * Adds a Matrix 2x2 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           */
  def addMatrix2x2(name: java.lang.String): scala.Unit = js.native
  /**
           * Adds a Matrix 3x3 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           */
  def addMatrix3x3(name: java.lang.String): scala.Unit = js.native
  /**
           * Adds an uniform in the buffer.
           * Warning : the subsequents calls of this function must be in the same order as declared in the shader
           * for the layout to be correct !
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param size Data size, or data directly.
           */
  def addUniform(name: java.lang.String, size: js.Array[scala.Double]): scala.Unit = js.native
  /**
           * Adds an uniform in the buffer.
           * Warning : the subsequents calls of this function must be in the same order as declared in the shader
           * for the layout to be correct !
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param size Data size, or data directly.
           */
  def addUniform(name: java.lang.String, size: scala.Double): scala.Unit = js.native
  /**
           * Adds a vec3 to the uniform buffer.
           * @param name Name of the uniform, as used in the uniform block in the shader.
           * @param vector Define the vec3 components from a Vector
           */
  def addVector3(name: java.lang.String, vector: Vector3): scala.Unit = js.native
  /**
           * Binds this uniform buffer to an effect.
           * @param effect Define the effect to bind the buffer to
           * @param name Name of the uniform block in the shader.
           */
  def bindToEffect(effect: Effect, name: java.lang.String): scala.Unit = js.native
  /**
           * Effectively creates the WebGL Uniform Buffer, once layout is completed with `addUniform`.
           */
  def create(): scala.Unit = js.native
  /**
           * Disposes the uniform buffer.
           */
  def dispose(): scala.Unit = js.native
  /**
           * The underlying WebGL Uniform buffer.
           * @returns the webgl buffer
           */
  def getBuffer(): Nullable[babylonjsLib.WebGLBuffer] = js.native
  /**
           * The data cache on JS side.
           * @returns the underlying data as a float array
           */
  def getData(): stdLib.Float32Array = js.native
  /**
           * Indicates if the WebGL underlying uniform buffer is dynamic.
           * Also, a dynamic UniformBuffer will disable cache verification and always
           * update the underlying WebGL uniform buffer to the GPU.
           * @returns if Dynamic, otherwise false
           */
  def isDynamic(): scala.Boolean = js.native
  /**
           * Sets a sampler uniform on the effect.
           * @param name Define the name of the sampler.
           * @param texture Define the texture to set in the sampler
           */
  def setTexture(name: java.lang.String, texture: Nullable[BaseTexture]): scala.Unit = js.native
  /**
           * Updates the WebGL Uniform Buffer on the GPU.
           * If the `dynamic` flag is set to true, no cache comparison is done.
           * Otherwise, the buffer will be updated only if the cache differs.
           */
  def update(): scala.Unit = js.native
  /**
           * Lambda to Update vec3 of float from a Color in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateColor3(name: java.lang.String, color: Color3): scala.Unit = js.native
  /**
           * Lambda to Update vec3 of float from a Color in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateColor3(name: java.lang.String, color: Color3, suffix: java.lang.String): scala.Unit = js.native
  /**
           * Lambda to Update vec4 of float from a Color in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateColor4(name: java.lang.String, color: Color3, alpha: scala.Double): scala.Unit = js.native
  /**
           * Lambda to Update vec4 of float from a Color in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateColor4(name: java.lang.String, color: Color3, alpha: scala.Double, suffix: java.lang.String): scala.Unit = js.native
  /**
           * Lambda to Update a single float in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateFloat(name: java.lang.String, x: scala.Double): scala.Unit = js.native
  /**
           * Lambda to Update a vec2 of float in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateFloat2(name: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
           * Lambda to Update a vec2 of float in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateFloat2(name: java.lang.String, x: scala.Double, y: scala.Double, suffix: java.lang.String): scala.Unit = js.native
  /**
           * Lambda to Update a vec3 of float in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateFloat3(name: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
           * Lambda to Update a vec3 of float in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateFloat3(
    name: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    suffix: java.lang.String
  ): scala.Unit = js.native
  /**
           * Lambda to Update a vec4 of float in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateFloat4(name: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Unit = js.native
  /**
           * Lambda to Update a vec4 of float in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateFloat4(
    name: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double,
    suffix: java.lang.String
  ): scala.Unit = js.native
  /**
           * Lambda to Update a 4x4 Matrix in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateMatrix(name: java.lang.String, mat: Matrix): scala.Unit = js.native
  /**
           * Lambda to Update a 2x2 Matrix in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateMatrix2x2(name: java.lang.String, matrix: stdLib.Float32Array): scala.Unit = js.native
  /**
           * Lambda to Update a 3x3 Matrix in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateMatrix3x3(name: java.lang.String, matrix: stdLib.Float32Array): scala.Unit = js.native
  /**
           * Updates the value of an uniform. The `update` method must be called afterwards to make it effective in the GPU.
           * @param uniformName Define the name of the uniform, as used in the uniform block in the shader.
           * @param data Define the flattened data
           * @param size Define the size of the data.
           */
  def updateUniform(uniformName: java.lang.String, data: FloatArray, size: scala.Double): scala.Unit = js.native
  /**
           * Directly updates the value of the uniform in the cache AND on the GPU.
           * @param uniformName Define the name of the uniform, as used in the uniform block in the shader.
           * @param data Define the flattened data
           */
  def updateUniformDirectly(uniformName: java.lang.String, data: FloatArray): scala.Unit = js.native
  /**
           * Lambda to Update vec3 of float from a Vector in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateVector3(name: java.lang.String, vector: Vector3): scala.Unit = js.native
  /**
           * Lambda to Update vec4 of float from a Vector in a uniform buffer.
           * This is dynamic to allow compat with webgl 1 and 2.
           * You will need to pass the name of the uniform as well as the value.
           */
  def updateVector4(name: java.lang.String, vector: Vector4): scala.Unit = js.native
}

/**
     * Uniform buffer objects.
     *
     * Handles blocks of uniform on the GPU.
     *
     * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
     *
     * For more information, please refer to :
     * https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
     */
@JSGlobal("BABYLON.UniformBuffer")
@js.native
object UniformBuffer extends js.Object {
  var _MAX_UNIFORM_SIZE: js.Any = js.native
  var _tempBuffer: js.Any = js.native
}

