package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpriteJSONSprite extends js.Object {
  /**
    * string name of the Frame
    */
  var filename: String
  /**
    * ISpriteJSONSpriteFrame basic object of the frame data
    */
  var frame: ISpriteJSONSpriteFrameData
  /**
    * boolean to flag is the frame was rotated.
    */
  var rotated: Boolean
  /**
    * ISpriteJSONSpriteFrame basic object of the source data
    */
  var sourceSize: ISpriteJSONSpriteSourceSize
  /**
    * ISpriteJSONSpriteFrame basic object of the source data
    */
  var spriteSourceSize: ISpriteJSONSpriteFrameData
  /**
    * boolean to flag is the frame was trimmed.
    */
  var trimmed: Boolean
}

object ISpriteJSONSprite {
  @scala.inline
  def apply(
    filename: String,
    frame: ISpriteJSONSpriteFrameData,
    rotated: Boolean,
    sourceSize: ISpriteJSONSpriteSourceSize,
    spriteSourceSize: ISpriteJSONSpriteFrameData,
    trimmed: Boolean
  ): ISpriteJSONSprite = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], rotated = rotated.asInstanceOf[js.Any], sourceSize = sourceSize.asInstanceOf[js.Any], spriteSourceSize = spriteSourceSize.asInstanceOf[js.Any], trimmed = trimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSprite]
  }
}

