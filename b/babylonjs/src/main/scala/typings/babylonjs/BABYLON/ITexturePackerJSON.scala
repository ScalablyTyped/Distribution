package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITexturePackerJSON extends js.Object {
  /**
    * The frame data of the Packer
    */
  var frames: js.Array[Double]
  /**
    * The frame ID
    */
  var name: String
  /**
    * The options of the Packer
    */
  var options: ITexturePackerOptions
  /**
    * The base64 channel data
    */
  var sets: js.Any
}

object ITexturePackerJSON {
  @scala.inline
  def apply(frames: js.Array[Double], name: String, options: ITexturePackerOptions, sets: js.Any): ITexturePackerJSON = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITexturePackerJSON]
  }
}

