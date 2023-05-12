package typings.babylonjs.renderingIndexMod

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "FluidRenderingTargetRenderer")
@js.native
open class FluidRenderingTargetRenderer protected ()
  extends typings.babylonjs.renderingFluidRendererIndexMod.FluidRenderingTargetRenderer {
  /**
    * Creates an instance of the class
    * @param scene Scene used to render the fluid object into
    * @param camera Camera used to render the fluid object. If not provided, use the active camera of the scene instead
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, camera: Camera) = this()
}
