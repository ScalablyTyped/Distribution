package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to manage multiple sprites on the same spritesheet
     * @see http://doc.babylonjs.com/babylon101/sprites
     */
@JSImport("babylonjs", "SpriteManager")
@js.native
class SpriteManager protected ()
  extends babylonjsLib.BABYLONNs.SpriteManager {
  /**
           * Creates a new sprite manager
           * @param name defines the manager's name
           * @param imgUrl defines the sprite sheet url
           * @param capacity defines the maximum allowed number of sprites
           * @param cellSize defines the size of a sprite cell
           * @param scene defines the hosting scene
           * @param epsilon defines the epsilon value to align texture (0.01 by default)
           * @param samplingMode defines the smapling mode to use with spritesheet
           */
  def this(/** defines the manager's name */
  name: java.lang.String, imgUrl: java.lang.String, capacity: scala.Double, cellSize: js.Any, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Creates a new sprite manager
           * @param name defines the manager's name
           * @param imgUrl defines the sprite sheet url
           * @param capacity defines the maximum allowed number of sprites
           * @param cellSize defines the size of a sprite cell
           * @param scene defines the hosting scene
           * @param epsilon defines the epsilon value to align texture (0.01 by default)
           * @param samplingMode defines the smapling mode to use with spritesheet
           */
  def this(/** defines the manager's name */
  name: java.lang.String, imgUrl: java.lang.String, capacity: scala.Double, cellSize: js.Any, scene: babylonjsLib.BABYLONNs.Scene, epsilon: scala.Double) = this()
  /**
           * Creates a new sprite manager
           * @param name defines the manager's name
           * @param imgUrl defines the sprite sheet url
           * @param capacity defines the maximum allowed number of sprites
           * @param cellSize defines the size of a sprite cell
           * @param scene defines the hosting scene
           * @param epsilon defines the epsilon value to align texture (0.01 by default)
           * @param samplingMode defines the smapling mode to use with spritesheet
           */
  def this(/** defines the manager's name */
  name: java.lang.String, imgUrl: java.lang.String, capacity: scala.Double, cellSize: js.Any, scene: babylonjsLib.BABYLONNs.Scene, epsilon: scala.Double, samplingMode: scala.Double) = this()
}

