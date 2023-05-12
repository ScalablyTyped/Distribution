package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FluidRenderingTargetRenderer")
@js.native
open class FluidRenderingTargetRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.FluidRenderingTargetRenderer {
  /**
    * Creates an instance of the class
    * @param scene Scene used to render the fluid object into
    * @param camera Camera used to render the fluid object. If not provided, use the active camera of the scene instead
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, camera: typings.babylonjs.BABYLON.Camera) = this()
}
