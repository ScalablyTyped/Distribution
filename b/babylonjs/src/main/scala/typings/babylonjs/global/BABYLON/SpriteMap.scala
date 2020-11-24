package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISpriteJSONAtlas
import typings.babylonjs.BABYLON.ISpriteMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SpriteMap")
@js.native
class SpriteMap protected ()
  extends typings.babylonjs.BABYLON.SpriteMap {
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
    spriteSheet: typings.babylonjs.BABYLON.Texture,
    options: ISpriteMapOptions,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
