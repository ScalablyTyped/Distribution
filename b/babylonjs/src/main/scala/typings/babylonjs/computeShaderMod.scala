package typings.babylonjs

import typings.babylonjs.anon.PartialIComputeShaderOpti
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.computeEffectMod.ComputeEffect
import typings.babylonjs.engineComputeShaderMod.ComputeBindingMapping
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.storageBufferMod.StorageBuffer
import typings.babylonjs.textureSamplerMod.TextureSampler
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeShaderMod {
  
  @JSImport("babylonjs/Compute/computeShader", "ComputeShader")
  @js.native
  open class ComputeShader protected () extends StObject {
    /**
      * Instantiates a new compute shader.
      * @param name Defines the name of the compute shader in the scene
      * @param engine Defines the engine the compute shader belongs to
      * @param shaderPath Defines  the route to the shader code in one of three ways:
      *  * object: { compute: "custom" }, used with ShaderStore.ShadersStoreWGSL["customComputeShader"]
      *  * object: { computeElement: "HTMLElementId" }, used with shader code in script tags
      *  * object: { computeSource: "compute shader code string" using with string containing the shader code
      *  * string: try first to find the code in ShaderStore.ShadersStoreWGSL[shaderPath + "ComputeShader"]. If not, assumes it is a file with name shaderPath.compute.fx in index.html folder.
      * @param options Define the options used to create the shader
      */
    def this(name: String, engine: ThinEngine, shaderPath: Any) = this()
    def this(name: String, engine: ThinEngine, shaderPath: Any, options: PartialIComputeShaderOpti) = this()
    
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
  /* static members */
  object ComputeShader {
    
    @JSImport("babylonjs/Compute/computeShader", "ComputeShader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a compute shader from parsed compute shader data
      * @param source defines the JSON representation of the compute shader
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a new compute shader
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): ComputeShader = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[ComputeShader]
  }
  
  trait IComputeShaderOptions extends StObject {
    
    /**
      * list of bindings mapping (key is property name, value is binding location)
      * Must be provided because browsers don't support reflection for wgsl shaders yet (so there's no way to query the binding/group from a variable name)
      * TODO: remove this when browsers support reflection for wgsl shaders
      */
    var bindingsMapping: ComputeBindingMapping
    
    /**
      * The list of defines used in the shader
      */
    var defines: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name of the entry point in the shader source (default: "main")
      */
    var entryPoint: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, will be called with the shader code so that this code can be updated before it is compiled by the GPU
      */
    var processFinalCode: js.UndefOr[Nullable[js.Function1[/* code */ String, String]]] = js.undefined
  }
  object IComputeShaderOptions {
    
    inline def apply(bindingsMapping: ComputeBindingMapping): IComputeShaderOptions = {
      val __obj = js.Dynamic.literal(bindingsMapping = bindingsMapping.asInstanceOf[js.Any])
      __obj.asInstanceOf[IComputeShaderOptions]
    }
    
    extension [Self <: IComputeShaderOptions](x: Self) {
      
      inline def setBindingsMapping(value: ComputeBindingMapping): Self = StObject.set(x, "bindingsMapping", value.asInstanceOf[js.Any])
      
      inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
      
      inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
      
      inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
      
      inline def setProcessFinalCode(value: /* code */ String => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction1(value))
      
      inline def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
      
      inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
    }
  }
}
