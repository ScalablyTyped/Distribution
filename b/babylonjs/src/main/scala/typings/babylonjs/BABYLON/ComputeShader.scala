package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeShader extends StObject {
  
  /* private */ var _bindings: Any = js.native
  
  /* private */ var _cachedDefines: Any = js.native
  
  /* private */ var _context: Any = js.native
  
  /* private */ var _contextIsDirty: Any = js.native
  
  /* private */ var _effect: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _samplers: Any = js.native
  
  /* private */ var _shaderPath: Any = js.native
  
  /**
    * Dispatches (executes) the compute shader
    * @param x Number of workgroups to execute on the X dimension
    * @param y Number of workgroups to execute on the Y dimension (default: 1)
    * @param z Number of workgroups to execute on the Z dimension (default: 1)
    * @returns True if the dispatch could be done, else false (meaning either the compute effect or at least one of the bound resources was not ready)
    */
  def dispatch(x: Double): Boolean = js.native
  def dispatch(x: Double, y: Double): Boolean = js.native
  def dispatch(x: Double, y: Double, z: Double): Boolean = js.native
  def dispatch(x: Double, y: Unit, z: Double): Boolean = js.native
  
  /**
    * Waits for the compute shader to be ready and executes it
    * @param x Number of workgroups to execute on the X dimension
    * @param y Number of workgroups to execute on the Y dimension (default: 1)
    * @param z Number of workgroups to execute on the Z dimension (default: 1)
    * @param delay Delay between the retries while the shader is not ready (in milliseconds - 10 by default)
    * @returns A promise that is resolved once the shader has been sent to the GPU. Note that it does not mean that the shader execution itself is finished!
    */
  def dispatchWhenReady(x: Double): js.Promise[Unit] = js.native
  def dispatchWhenReady(x: Double, y: Double): js.Promise[Unit] = js.native
  def dispatchWhenReady(x: Double, y: Double, z: Double): js.Promise[Unit] = js.native
  def dispatchWhenReady(x: Double, y: Double, z: Double, delay: Double): js.Promise[Unit] = js.native
  def dispatchWhenReady(x: Double, y: Double, z: Unit, delay: Double): js.Promise[Unit] = js.native
  def dispatchWhenReady(x: Double, y: Unit, z: Double): js.Promise[Unit] = js.native
  def dispatchWhenReady(x: Double, y: Unit, z: Double, delay: Double): js.Promise[Unit] = js.native
  def dispatchWhenReady(x: Double, y: Unit, z: Unit, delay: Double): js.Promise[Unit] = js.native
  
  /**
    * Gets the current class name of the material e.g. "ComputeShader"
    * Mainly use in serialization.
    * @returns the class name
    */
  def getClassName(): String = js.native
  
  /**
    * Specifies that the compute shader is ready to be executed (the compute effect and all the resources are ready)
    * @returns true if the compute shader is ready to be executed
    */
  def isReady(): Boolean = js.native
  
  /**
    * The name of the shader
    */
  var name: String = js.native
  
  /**
    * Callback triggered when the shader is compiled
    */
  var onCompiled: Nullable[js.Function1[/* effect */ ComputeEffect, Unit]] = js.native
  
  /**
    * Callback triggered when an error occurs
    */
  var onError: Nullable[js.Function2[/* effect */ ComputeEffect, /* errors */ String, Unit]] = js.native
  
  /**
    * The options used to create the shader
    */
  def options: IComputeShaderOptions = js.native
  
  /**
    * Serializes this compute shader in a JSON representation
    * @returns the serialized compute shader object
    */
  def serialize(): Any = js.native
  
  /**
    * Binds a storage buffer to the shader
    * @param name Binding name of the buffer
    * @param buffer Buffer to bind
    */
  def setStorageBuffer(name: String, buffer: StorageBuffer): Unit = js.native
  
  /**
    * Binds a storage texture to the shader
    * @param name Binding name of the texture
    * @param texture Texture to bind
    */
  def setStorageTexture(name: String, texture: BaseTexture): Unit = js.native
  
  /**
    * Binds a texture to the shader
    * @param name Binding name of the texture
    * @param texture Texture to bind
    * @param bindSampler Bind the sampler corresponding to the texture (default: true). The sampler will be bound just before the binding index of the texture
    */
  def setTexture(name: String, texture: BaseTexture): Unit = js.native
  def setTexture(name: String, texture: BaseTexture, bindSampler: Boolean): Unit = js.native
  
  /**
    * Binds a texture sampler to the shader
    * @param name Binding name of the sampler
    * @param sampler Sampler to bind
    */
  def setTextureSampler(name: String, sampler: TextureSampler): Unit = js.native
  
  /**
    * Binds a uniform buffer to the shader
    * @param name Binding name of the buffer
    * @param buffer Buffer to bind
    */
  def setUniformBuffer(name: String, buffer: UniformBuffer): Unit = js.native
  
  /**
    * The shaderPath used to create the shader
    */
  def shaderPath: Any = js.native
  
  /**
    * Gets the unique id of the compute shader
    */
  val uniqueId: Double = js.native
}
