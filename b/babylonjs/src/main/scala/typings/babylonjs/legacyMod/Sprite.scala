package typings.babylonjs.legacyMod

import typings.babylonjs.spriteManagerMod.ISpriteManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "Sprite")
@js.native
class Sprite protected ()
  extends typings.babylonjs.indexMod.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: String, manager: ISpriteManager) = this()
}

