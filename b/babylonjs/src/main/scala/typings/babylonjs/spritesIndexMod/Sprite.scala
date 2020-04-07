package typings.babylonjs.spritesIndexMod

import typings.babylonjs.spriteManagerMod.ISpriteManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Sprites/index", "Sprite")
@js.native
class Sprite protected ()
  extends typings.babylonjs.spriteMod.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: String, manager: ISpriteManager) = this()
}

