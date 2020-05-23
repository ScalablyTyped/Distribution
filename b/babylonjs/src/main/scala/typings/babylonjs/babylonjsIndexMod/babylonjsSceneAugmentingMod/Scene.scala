package typings.babylonjs.babylonjsIndexMod.babylonjsSceneAugmentingMod

import typings.babylonjs.meshSimplificationMod.SimplificationQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  /** @hidden (Backing field) */
  var _simplificationQueue: SimplificationQueue
  /**
    * Gets or sets the simplification queue attached to the scene
    * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
    */
  var simplificationQueue: SimplificationQueue
}

object Scene {
  @scala.inline
  def apply(_simplificationQueue: SimplificationQueue, simplificationQueue: SimplificationQueue): Scene = {
    val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
}

