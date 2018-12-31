package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to represent a sprite
  * @see http://doc.babylonjs.com/babylon101/sprites
  */
@JSImport("babylonjs", "Sprite")
@js.native
class Sprite protected ()
  extends babylonjsLib.BABYLONNs.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: java.lang.String, manager: babylonjsLib.BABYLONNs.ISpriteManager) = this()
}

