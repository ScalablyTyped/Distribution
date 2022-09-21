package typings.babylonjs

import typings.babylonjs.anon.PartialIComputeShaderOpti
import typings.babylonjs.computeEffectMod.IComputeEffectCreationOptions
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeIndexMod {
  
  @JSImport("babylonjs/Compute/index", "ComputeEffect")
  @js.native
  open class ComputeEffect protected ()
    extends typings.babylonjs.computeEffectMod.ComputeEffect {
    /**
      * Creates a compute effect that can be used to execute a compute shader
      * @param baseName Name of the effect
      * @param options Set of all options to create the effect
      * @param engine The engine the effect is created for
      * @param key Effect Key identifying uniquely compiled shader variants
      */
    def this(baseName: Any, options: IComputeEffectCreationOptions, engine: Engine) = this()
    def this(baseName: Any, options: IComputeEffectCreationOptions, engine: Engine, key: String) = this()
  }
  /* static members */
  object ComputeEffect {
    
    @JSImport("babylonjs/Compute/index", "ComputeEffect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Enable logging of the shader code when a compilation error occurs
      */
    @JSImport("babylonjs/Compute/index", "ComputeEffect.LogShaderCodeOnCompilationError")
    @js.native
    def LogShaderCodeOnCompilationError: Boolean = js.native
    inline def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
    
    /**
      * This function will add a new compute shader to the shader store
      * @param name the name of the shader
      * @param computeShader compute shader content
      */
    inline def RegisterShader(name: String, computeShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], computeShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Compute/index", "ComputeEffect._UniqueIdSeed")
    @js.native
    def _UniqueIdSeed: Any = js.native
    inline def _UniqueIdSeed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UniqueIdSeed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Compute/index", "ComputeShader")
  @js.native
  open class ComputeShader protected ()
    extends typings.babylonjs.computeShaderMod.ComputeShader {
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
  }
  /* static members */
  object ComputeShader {
    
    @JSImport("babylonjs/Compute/index", "ComputeShader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a compute shader from parsed compute shader data
      * @param source defines the JSON representation of the compute shader
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a new compute shader
      */
    inline def Parse(source: Any, scene: Scene, rootUrl: String): typings.babylonjs.computeShaderMod.ComputeShader = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.computeShaderMod.ComputeShader]
  }
}
