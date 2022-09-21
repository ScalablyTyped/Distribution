package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IEffectRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EffectRenderer")
@js.native
open class EffectRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param _engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(_engine: typings.babylonjs.BABYLON.ThinEngine) = this()
  def this(_engine: typings.babylonjs.BABYLON.ThinEngine, options: IEffectRendererOptions) = this()
}
/* static members */
object EffectRenderer {
  
  @JSGlobal("BABYLON.EffectRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.EffectRenderer._DefaultOptions")
  @js.native
  def _DefaultOptions: Any = js.native
  inline def _DefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultOptions")(x.asInstanceOf[js.Any])
}
