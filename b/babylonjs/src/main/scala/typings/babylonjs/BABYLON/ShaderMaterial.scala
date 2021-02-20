package typings.babylonjs.BABYLON

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderMaterial extends Material {
  
  var _cachedDefines: js.Any = js.native
  
  var _cachedWorldViewMatrix: js.Any = js.native
  
  var _cachedWorldViewProjectionMatrix: js.Any = js.native
  
  var _checkCache: js.Any = js.native
  
  var _checkUniform: js.Any = js.native
  
  var _colors3: js.Any = js.native
  
  var _colors3Arrays: js.Any = js.native
  
  var _colors4: js.Any = js.native
  
  var _colors4Arrays: js.Any = js.native
  
  var _floats: js.Any = js.native
  
  var _floatsArrays: js.Any = js.native
  
  var _ints: js.Any = js.native
  
  var _matrices: js.Any = js.native
  
  var _matrices2x2: js.Any = js.native
  
  var _matrices3x3: js.Any = js.native
  
  var _matrixArrays: js.Any = js.native
  
  var _multiview: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _renderId: js.Any = js.native
  
  var _shaderPath: js.Any = js.native
  
  var _textureArrays: js.Any = js.native
  
  var _textures: js.Any = js.native
  
  var _vectors2: js.Any = js.native
  
  var _vectors2Arrays: js.Any = js.native
  
  var _vectors3: js.Any = js.native
  
  var _vectors3Arrays: js.Any = js.native
  
  var _vectors4: js.Any = js.native
  
  var _vectors4Arrays: js.Any = js.native
  
  def bind(world: Matrix, mesh: js.UndefOr[scala.Nothing], effectOverride: Nullable[Effect]): Unit = js.native
  def bind(world: Matrix, mesh: Mesh, effectOverride: Nullable[Effect]): Unit = js.native
  
  def bindOnlyWorldMatrix(world: Matrix, effectOverride: Nullable[Effect]): Unit = js.native
  
  /**
    * Gets the options used to compile the shader.
    * They can be modified to trigger a new compilation
    */
  def options: IShaderMaterialOptions = js.native
  
  /**
    * Set a vec2 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setArray2(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a vec3 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setArray3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a vec4 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setArray4(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a vec3 in the shader from a Color3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor3(name: String, value: Color3): ShaderMaterial = js.native
  
  /**
    * Set a vec3 array in the shader from a Color3 array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor3Array(name: String, value: js.Array[Color3]): ShaderMaterial = js.native
  
  /**
    * Set a vec4 in the shader from a Color4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor4(name: String, value: Color4): ShaderMaterial = js.native
  
  /**
    * Set a vec4 array in the shader from a Color4 array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor4Array(name: String, value: js.Array[Color4]): ShaderMaterial = js.native
  
  /**
    * Set a float in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setFloat(name: String, value: Double): ShaderMaterial = js.native
  
  /**
    * Set an array of floats in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setFloats(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a int in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setInt(name: String, value: Double): ShaderMaterial = js.native
  
  /**
    * Set a float32Array in the shader from a matrix array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrices(name: String, value: js.Array[Matrix]): ShaderMaterial = js.native
  
  /**
    * Set a mat4 in the shader from a Matrix.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrix(name: String, value: Matrix): ShaderMaterial = js.native
  
  def setMatrix2x2(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a mat2 in the shader from a Float32Array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrix2x2(name: String, value: Float32Array): ShaderMaterial = js.native
  
  def setMatrix3x3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a mat3 in the shader from a Float32Array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrix3x3(name: String, value: Float32Array): ShaderMaterial = js.native
  
  /**
    * Set a texture in the shader.
    * @param name Define the name of the uniform samplers as defined in the shader
    * @param texture Define the texture to bind to this sampler
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setTexture(name: String, texture: BaseTexture): ShaderMaterial = js.native
  
  /**
    * Set a texture array in the shader.
    * @param name Define the name of the uniform sampler array as defined in the shader
    * @param textures Define the list of textures to bind to this sampler
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setTextureArray(name: String, textures: js.Array[BaseTexture]): ShaderMaterial = js.native
  
  /**
    * Set a vec2 in the shader from a Vector2.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setVector2(name: String, value: Vector2): ShaderMaterial = js.native
  
  /**
    * Set a vec3 in the shader from a Vector3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setVector3(name: String, value: Vector3): ShaderMaterial = js.native
  
  /**
    * Set a vec4 in the shader from a Vector4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setVector4(name: String, value: Vector4): ShaderMaterial = js.native
  
  /**
    * Gets the shader path used to define the shader code
    * It can be modified to trigger a new compilation
    */
  def shaderPath: js.Any = js.native
  /**
    * Sets the shader path used to define the shader code
    * It can be modified to trigger a new compilation
    */
  def shaderPath_=(shaderPath: js.Any): Unit = js.native
  
  /** Snippet ID if the material was created from the snippet server */
  var snippetId: String = js.native
}
