package typings.babylonjs.ispritesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpriteJSONAtlas extends js.Object {
  /**
    * Array of objects that contain the frame data.
    */
  var frames: js.Array[ISpriteJSONSprite]
  /**
    * object basic object containing the sprite meta data.
    */
  var meta: js.UndefOr[js.Object] = js.undefined
}

object ISpriteJSONAtlas {
  @scala.inline
  def apply(frames: js.Array[ISpriteJSONSprite], meta: js.Object = null): ISpriteJSONAtlas = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONAtlas]
  }
}

