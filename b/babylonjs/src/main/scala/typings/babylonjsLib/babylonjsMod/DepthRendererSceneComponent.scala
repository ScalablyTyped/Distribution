package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the Depth Renderer scene component responsible to manage a depth buffer usefull
  * in several rendering techniques.
  */
@JSImport("babylonjs", "DepthRendererSceneComponent")
@js.native
class DepthRendererSceneComponent protected ()
  extends babylonjsLib.BABYLONNs.DepthRendererSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

