package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class can be used to easily import assets into a scene
  * @see http://doc.babylonjs.com/how_to/how_to_use_assetsmanager
  */
@JSImport("babylonjs", "AssetsManager")
@js.native
class AssetsManager protected ()
  extends babylonjsLib.BABYLONNs.AssetsManager {
  /**
    * Creates a new AssetsManager
    * @param scene defines the scene to work on
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

