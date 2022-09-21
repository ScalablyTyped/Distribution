package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderMaterial
  extends StObject
     with PushMaterial {
  
  /* private */ var _cachedWorldViewMatrix: Any = js.native
  
  /* private */ var _cachedWorldViewProjectionMatrix: Any = js.native
  
  /* private */ var _checkUniform: Any = js.native
  
  /* private */ var _colors3: Any = js.native
  
  /* private */ var _colors3Arrays: Any = js.native
  
  /* private */ var _colors4: Any = js.native
  
  /* private */ var _colors4Arrays: Any = js.native
  
  /* private */ var _externalTextures: Any = js.native
  
  /* private */ var _floats: Any = js.native
  
  /* private */ var _floatsArrays: Any = js.native
  
  /* private */ var _ints: Any = js.native
  
  /* private */ var _matrices: Any = js.native
  
  /* private */ var _matrices2x2: Any = js.native
  
  /* private */ var _matrices3x3: Any = js.native
  
  /* private */ var _matrixArrays: Any = js.native
  
  /* private */ var _multiview: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _quaternions: Any = js.native
  
  /* private */ var _quaternionsArrays: Any = js.native
  
  /* private */ var _shaderPath: Any = js.native
  
  /* private */ var _storageBuffers: Any = js.native
  
  /* private */ var _textureArrays: Any = js.native
  
  /* private */ var _textureSamplers: Any = js.native
  
  /* private */ var _textures: Any = js.native
  
  /* private */ var _uniformBuffers: Any = js.native
  
  /* private */ var _vectors2: Any = js.native
  
  /* private */ var _vectors2Arrays: Any = js.native
  
  /* private */ var _vectors3: Any = js.native
  
  /* private */ var _vectors3Arrays: Any = js.native
  
  /* private */ var _vectors4: Any = js.native
  
  /* private */ var _vectors4Arrays: Any = js.native
  
  def bind(world: Matrix, mesh: Unit, effectOverride: Unit, subMesh: SubMesh): Unit = js.native
  def bind(world: Matrix, mesh: Unit, effectOverride: Nullable[Effect]): Unit = js.native
  def bind(world: Matrix, mesh: Unit, effectOverride: Nullable[Effect], subMesh: SubMesh): Unit = js.native
  def bind(world: Matrix, mesh: Mesh, effectOverride: Unit, subMesh: SubMesh): Unit = js.native
  def bind(world: Matrix, mesh: Mesh, effectOverride: Nullable[Effect]): Unit = js.native
  def bind(world: Matrix, mesh: Mesh, effectOverride: Nullable[Effect], subMesh: SubMesh): Unit = js.native
  
  def bindOnlyWorldMatrix(world: Matrix, effectOverride: Nullable[Effect]): Unit = js.native
  
  def isReady(mesh: Unit, useInstances: Boolean, subMesh: SubMesh): Boolean = js.native
  def isReady(mesh: Unit, useInstances: Unit, subMesh: SubMesh): Boolean = js.native
  def isReady(mesh: AbstractMesh, useInstances: Boolean, subMesh: SubMesh): Boolean = js.native
  def isReady(mesh: AbstractMesh, useInstances: Unit, subMesh: SubMesh): Boolean = js.native
  
  /**
    * Gets the options used to compile the shader.
    * They can be modified to trigger a new compilation
    */
  def options: IShaderMaterialOptions = js.native
  
  /**
    * Set a vec2 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setArray2(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a vec3 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setArray3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a vec4 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setArray4(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a vec3 in the shader from a Color3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setColor3(name: String, value: Color3): ShaderMaterial = js.native
  
  /**
    * Set a vec3 array in the shader from a Color3 array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setColor3Array(name: String, value: js.Array[Color3]): ShaderMaterial = js.native
  
  /**
    * Set a vec4 in the shader from a Color4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setColor4(name: String, value: Color4): ShaderMaterial = js.native
  
  /**
    * Set a vec4 array in the shader from a Color4 array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setColor4Array(name: String, value: js.Array[Color4]): ShaderMaterial = js.native
  
  /**
    * Set an internal texture in the shader.
    * @param name Define the name of the uniform samplers as defined in the shader
    * @param texture Define the texture to bind to this sampler
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setExternalTexture(name: String, texture: ExternalTexture): ShaderMaterial = js.native
  
  /**
    * Set a float in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setFloat(name: String, value: Double): ShaderMaterial = js.native
  
  /**
    * Set an array of floats in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setFloats(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  
  /**
    * Set a int in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setInt(name: String, value: Double): ShaderMaterial = js.native
  
  /**
    * Set a float32Array in the shader from a matrix array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setMatrices(name: String, value: js.Array[Matrix]): ShaderMaterial = js.native
  
  /**
    * Set a mat4 in the shader from a Matrix.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setMatrix(name: String, value: Matrix): ShaderMaterial = js.native
  
  def setMatrix2x2(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a mat2 in the shader from a Float32Array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setMatrix2x2(name: String, value: js.typedarray.Float32Array): ShaderMaterial = js.native
  
  def setMatrix3x3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a mat3 in the shader from a Float32Array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setMatrix3x3(name: String, value: js.typedarray.Float32Array): ShaderMaterial = js.native
  
  /**
    * Set a vec4 in the shader from a Quaternion.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setQuaternion(name: String, value: Quaternion): ShaderMaterial = js.native
  
  /**
    * Set a vec4 array in the shader from a Quaternion array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setQuaternionArray(name: String, value: js.Array[Quaternion]): ShaderMaterial = js.native
  
  /**
    * Set a storage buffer in the shader
    * @param name Define the name of the storage buffer as defined in the shader
    * @param buffer Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setStorageBuffer(name: String, buffer: StorageBuffer): ShaderMaterial = js.native
  
  /**
    * Set a texture in the shader.
    * @param name Define the name of the uniform samplers as defined in the shader
    * @param texture Define the texture to bind to this sampler
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setTexture(name: String, texture: BaseTexture): ShaderMaterial = js.native
  
  /**
    * Set a texture array in the shader.
    * @param name Define the name of the uniform sampler array as defined in the shader
    * @param textures Define the list of textures to bind to this sampler
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setTextureArray(name: String, textures: js.Array[BaseTexture]): ShaderMaterial = js.native
  
  /**
    * Set a texture sampler in the shader
    * @param name Define the name of the uniform as defined in the shader
    * @param sampler Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setTextureSampler(name: String, sampler: TextureSampler): ShaderMaterial = js.native
  
  /**
    * Set a uniform buffer in the shader
    * @param name Define the name of the uniform as defined in the shader
    * @param buffer Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setUniformBuffer(name: String, buffer: UniformBuffer): ShaderMaterial = js.native
  
  /**
    * Set a vec2 in the shader from a Vector2.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setVector2(name: String, value: Vector2): ShaderMaterial = js.native
  
  /**
    * Set a vec3 in the shader from a Vector3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setVector3(name: String, value: Vector3): ShaderMaterial = js.native
  
  /**
    * Set a vec4 in the shader from a Vector4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the material itself allowing "fluent" like uniform updates
    */
  def setVector4(name: String, value: Vector4): ShaderMaterial = js.native
  
  /**
    * Gets the shader path used to define the shader code
    * It can be modified to trigger a new compilation
    */
  def shaderPath: Any = js.native
  /**
    * Sets the shader path used to define the shader code
    * It can be modified to trigger a new compilation
    */
  def shaderPath_=(shaderPath: Any): Unit = js.native
  
  /** Snippet ID if the material was created from the snippet server */
  var snippetId: String = js.native
}
