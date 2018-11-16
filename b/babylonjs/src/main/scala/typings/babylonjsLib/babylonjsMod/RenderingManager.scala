package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This is the manager responsible of all the rendering for meshes sprites and particles.
     * It is enable to manage the different groups as well as the different necessary sort functions.
     * This should not be used directly aside of the few static configurations
     */
@JSImport("babylonjs", "RenderingManager")
@js.native
class RenderingManager protected ()
  extends babylonjsLib.BABYLONNs.RenderingManager {
  /**
           * Instantiates a new rendering group for a particular scene
           * @param scene Defines the scene the groups belongs to
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * This is the manager responsible of all the rendering for meshes sprites and particles.
     * It is enable to manage the different groups as well as the different necessary sort functions.
     * This should not be used directly aside of the few static configurations
     */
@JSImport("babylonjs", "RenderingManager")
@js.native
object RenderingManager extends js.Object {
  /**
           * Used to globally prevent autoclearing scenes.
           */
  var AUTOCLEAR: scala.Boolean = js.native
  /**
           * The max id used for rendering groups (not included)
           */
  var MAX_RENDERINGGROUPS: scala.Double = js.native
  /**
           * The min id used for rendering groups (included)
           */
  var MIN_RENDERINGGROUPS: scala.Double = js.native
}

