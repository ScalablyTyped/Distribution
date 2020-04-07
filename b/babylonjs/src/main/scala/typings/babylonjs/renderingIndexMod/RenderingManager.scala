package typings.babylonjs.renderingIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Rendering/index", "RenderingManager")
@js.native
class RenderingManager protected ()
  extends typings.babylonjs.renderingManagerMod.RenderingManager {
  /**
    * Instantiates a new rendering group for a particular scene
    * @param scene Defines the scene the groups belongs to
    */
  def this(scene: Scene) = this()
}

/* static members */
@JSImport("babylonjs/Rendering/index", "RenderingManager")
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

