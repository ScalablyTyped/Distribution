package typings.babylonjs.mod

import typings.babylonjs.effectRendererMod.IEffectRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "EffectRenderer")
@js.native
class EffectRenderer protected ()
  extends typings.babylonjs.legacyMod.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(engine: typings.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(engine: typings.babylonjs.thinEngineMod.ThinEngine, options: IEffectRendererOptions) = this()
}

/* static members */
@JSImport("babylonjs", "EffectRenderer")
@js.native
object EffectRenderer extends js.Object {
  var _DefaultOptions: js.Any = js.native
}

