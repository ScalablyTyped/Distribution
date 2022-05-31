package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SpritePackedManager")
@js.native
class SpritePackedManager protected ()
  extends typings.babylonjs.indexMod.SpritePackedManager {
  /**
    * Creates a new sprite manager from a packed sprite sheet
    * @param name defines the manager's name
    * @param imgUrl defines the sprite sheet url
    * @param capacity defines the maximum allowed number of sprites
    * @param scene defines the hosting scene
    * @param spriteJSON null otherwise a JSON object defining sprite sheet data
    * @param epsilon defines the epsilon value to align texture (0.01 by default)
    * @param samplingMode defines the smapling mode to use with spritesheet
    * @param fromPacked set to true; do not alter
    */
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: String
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: String,
    epsilon: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: Null,
    epsilon: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: Unit,
    epsilon: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: String,
    epsilon: Double,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: String,
    epsilon: Unit,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: Null,
    epsilon: Double,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: Null,
    epsilon: Unit,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: Unit,
    epsilon: Double,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the packed manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    spriteJSON: Unit,
    epsilon: Unit,
    samplingMode: Double
  ) = this()
}
