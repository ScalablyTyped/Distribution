package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDRInfo extends js.Object {
  /**
    * The index of the beginning of the data in the binary file.
    */
  var dataPosition: Double
  /**
    * The height of the texture in pixels.
    */
  var height: Double
  /**
    * The width of the texture in pixels.
    */
  var width: Double
}

object HDRInfo {
  @scala.inline
  def apply(dataPosition: Double, height: Double, width: Double): HDRInfo = {
    val __obj = js.Dynamic.literal(dataPosition = dataPosition.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HDRInfo]
  }
}

