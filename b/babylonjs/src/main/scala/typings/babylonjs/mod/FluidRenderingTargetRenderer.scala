package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FluidRenderingTargetRenderer")
@js.native
open class FluidRenderingTargetRenderer protected ()
  extends typings.babylonjs.legacyLegacyMod.FluidRenderingTargetRenderer {
  /**
    * Creates an instance of the class
    * @param scene Scene used to render the fluid object into
    * @param camera Camera used to render the fluid object. If not provided, use the active camera of the scene instead
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(scene: typings.babylonjs.sceneMod.Scene, camera: typings.babylonjs.camerasCameraMod.Camera) = this()
}
