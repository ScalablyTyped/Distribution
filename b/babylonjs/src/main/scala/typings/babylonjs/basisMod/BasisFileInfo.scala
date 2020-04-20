package typings.babylonjs.basisMod

import typings.babylonjs.AnonLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info about the .basis files
  */
trait BasisFileInfo extends js.Object {
  /**
    * If the file has alpha
    */
  var hasAlpha: Boolean
  /**
    * Info about each image of the basis file
    */
  var images: js.Array[AnonLevels]
}

object BasisFileInfo {
  @scala.inline
  def apply(hasAlpha: Boolean, images: js.Array[AnonLevels]): BasisFileInfo = {
    val __obj = js.Dynamic.literal(hasAlpha = hasAlpha.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasisFileInfo]
  }
}

