package typings.babylonjs.spritesIndexMod

import typings.babylonjs.ispritesMod.ISpriteJSONAtlas
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.spriteMapMod.ISpriteMapOptions
import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Sprites/index", "SpriteMap")
@js.native
class SpriteMap protected ()
  extends typings.babylonjs.spriteMapMod.SpriteMap {
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
    spriteSheet: Texture,
    options: ISpriteMapOptions,
    scene: Scene
  ) = this()
}

