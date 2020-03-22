package typings.croppie

import typings.croppie.mod.CropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var height: Double
  var `type`: js.UndefOr[CropType] = js.undefined
  var width: Double
}

object AnonType {
  @scala.inline
  def apply(height: Double, width: Double, `type`: CropType = null): AnonType = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

