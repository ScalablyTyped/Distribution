package typings.babylonjs.spritesIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Sprites/index", "SpriteManager")
@js.native
class SpriteManager protected ()
  extends typings.babylonjs.spriteManagerMod.SpriteManager {
  /**
    * Creates a new sprite manager
    * @param name defines the manager's name
    * @param imgUrl defines the sprite sheet url
    * @param capacity defines the maximum allowed number of sprites
    * @param cellSize defines the size of a sprite cell
    * @param scene defines the hosting scene
    * @param epsilon defines the epsilon value to align texture (0.01 by default)
    * @param samplingMode defines the smapling mode to use with spritesheet
    * @param fromPacked set to false; do not alter
    * @param spriteJSON null otherwise a JSON object defining sprite sheet data; do not alter
    */
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: js.Any,
    scene: Scene
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: js.Any,
    scene: Scene,
    epsilon: Double
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: js.Any,
    scene: Scene,
    epsilon: Double,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: js.Any,
    scene: Scene,
    epsilon: Double,
    samplingMode: Double,
    fromPacked: Boolean
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: js.Any,
    scene: Scene,
    epsilon: Double,
    samplingMode: Double,
    fromPacked: Boolean,
    spriteJSON: js.Any
  ) = this()
}

