package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RenderingManager")
@js.native
class RenderingManager protected ()
  extends typings.babylonjs.BABYLON.RenderingManager {
  /**
    * Instantiates a new rendering group for a particular scene
    * @param scene Defines the scene the groups belongs to
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}

/* static members */
@JSGlobal("BABYLON.RenderingManager")
@js.native
object RenderingManager extends js.Object {
  /**
    * Used to globally prevent autoclearing scenes.
    */
  var AUTOCLEAR: Boolean = js.native
  /**
    * The max id used for rendering groups (not included)
    */
  var MAX_RENDERINGGROUPS: Double = js.native
  /**
    * The min id used for rendering groups (included)
    */
  var MIN_RENDERINGGROUPS: Double = js.native
}

