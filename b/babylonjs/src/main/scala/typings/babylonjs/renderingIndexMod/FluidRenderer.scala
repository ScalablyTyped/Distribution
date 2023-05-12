package typings.babylonjs.renderingIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "FluidRenderer")
@js.native
open class FluidRenderer protected ()
  extends typings.babylonjs.renderingFluidRendererIndexMod.FluidRenderer {
  /**
    * Initializes the class
    * @param scene Scene in which the objects are part of
    */
  def this(scene: Scene) = this()
}
/* static members */
object FluidRenderer {
  
  @JSImport("babylonjs/Rendering/index", "FluidRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
