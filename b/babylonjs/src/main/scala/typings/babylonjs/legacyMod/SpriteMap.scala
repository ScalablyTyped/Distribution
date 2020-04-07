package typings.babylonjs.legacyMod

import typings.babylonjs.ispritesMod.ISpriteJSONAtlas
import typings.babylonjs.spriteMapMod.ISpriteMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "SpriteMap")
@js.native
class SpriteMap protected ()
  extends typings.babylonjs.indexMod.SpriteMap {
  /**
    * Creates a new SpriteMap
    * @param name defines the SpriteMaps Name
    * @param atlasJSON is the JSON file that controls the Sprites Frames and Meta
    * @param spriteSheet is the Texture that the Sprites are on.
    * @param options a basic deployment configuration
    * @param scene The Scene that the map is deployed on
    */
  def this(
    name: String,
    atlasJSON: ISpriteJSONAtlas,
    spriteSheet: typings.babylonjs.textureMod.Texture,
    options: ISpriteMapOptions,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}

