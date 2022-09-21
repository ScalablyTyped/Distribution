package typings.babylonjs.mod

import typings.babylonjs.effectRendererMod.IEffectRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EffectRenderer")
@js.native
open class EffectRenderer protected ()
  extends typings.babylonjs.legacyMod.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param _engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(_engine: typings.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(_engine: typings.babylonjs.thinEngineMod.ThinEngine, options: IEffectRendererOptions) = this()
}
/* static members */
object EffectRenderer {
  
  @JSImport("babylonjs", "EffectRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "EffectRenderer._DefaultOptions")
  @js.native
  def _DefaultOptions: Any = js.native
  inline def _DefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultOptions")(x.asInstanceOf[js.Any])
}
