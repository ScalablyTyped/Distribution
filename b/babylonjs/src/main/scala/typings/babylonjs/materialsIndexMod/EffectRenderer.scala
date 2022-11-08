package typings.babylonjs.materialsIndexMod

import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsEffectRendererMod.IEffectRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "EffectRenderer")
@js.native
open class EffectRenderer protected ()
  extends typings.babylonjs.materialsEffectRendererMod.EffectRenderer {
  /**
    * Creates an effect renderer
    * @param engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(engine: ThinEngine) = this()
  def this(engine: ThinEngine, options: IEffectRendererOptions) = this()
}
