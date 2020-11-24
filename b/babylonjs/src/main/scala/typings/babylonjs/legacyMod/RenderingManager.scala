package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "RenderingManager")
@js.native
class RenderingManager protected ()
  extends typings.babylonjs.indexMod.RenderingManager {
  /**
    * Instantiates a new rendering group for a particular scene
    * @param scene Defines the scene the groups belongs to
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "RenderingManager")
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
