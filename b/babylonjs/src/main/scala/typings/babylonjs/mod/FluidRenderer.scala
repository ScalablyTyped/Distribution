package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FluidRenderer")
@js.native
open class FluidRenderer protected ()
  extends typings.babylonjs.legacyLegacyMod.FluidRenderer {
  /**
    * Initializes the class
    * @param scene Scene in which the objects are part of
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object FluidRenderer {
  
  @JSImport("babylonjs", "FluidRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
