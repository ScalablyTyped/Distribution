package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpriteMap extends IDisposable {
  /**
    * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
    */
  var atlasJSON: ISpriteJSONAtlas
  /**
    * String name of the SpriteMap.
    */
  var name: String
  /**
    * The parameters to initialize the SpriteMap with.
    */
  var options: ISpriteMapOptions
  /**
    * Texture of the SpriteMap.
    */
  var spriteSheet: Texture
}

object ISpriteMap {
  @scala.inline
  def apply(
    atlasJSON: ISpriteJSONAtlas,
    dispose: () => Unit,
    name: String,
    options: ISpriteMapOptions,
    spriteSheet: Texture
  ): ISpriteMap = {
    val __obj = js.Dynamic.literal(atlasJSON = atlasJSON.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], spriteSheet = spriteSheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpriteMap]
  }
}

