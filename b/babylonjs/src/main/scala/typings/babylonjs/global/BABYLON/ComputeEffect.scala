package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IComputeEffectCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ComputeEffect")
@js.native
open class ComputeEffect protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ComputeEffect {
  /**
    * Creates a compute effect that can be used to execute a compute shader
    * @param baseName Name of the effect
    * @param options Set of all options to create the effect
    * @param engine The engine the effect is created for
    * @param key Effect Key identifying uniquely compiled shader variants
    */
  def this(baseName: Any, options: IComputeEffectCreationOptions, engine: typings.babylonjs.BABYLON.Engine) = this()
  def this(
    baseName: Any,
    options: IComputeEffectCreationOptions,
    engine: typings.babylonjs.BABYLON.Engine,
    key: String
  ) = this()
}
/* static members */
object ComputeEffect {
  
  @JSGlobal("BABYLON.ComputeEffect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Enable logging of the shader code when a compilation error occurs
    */
  @JSGlobal("BABYLON.ComputeEffect.LogShaderCodeOnCompilationError")
  @js.native
  def LogShaderCodeOnCompilationError: Boolean = js.native
  inline def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
  
  /**
    * This function will add a new compute shader to the shader store
    * @param name the name of the shader
    * @param computeShader compute shader content
    */
  inline def RegisterShader(name: String, computeShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], computeShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("BABYLON.ComputeEffect._UniqueIdSeed")
  @js.native
  def _UniqueIdSeed: Any = js.native
  inline def _UniqueIdSeed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UniqueIdSeed")(x.asInstanceOf[js.Any])
}
