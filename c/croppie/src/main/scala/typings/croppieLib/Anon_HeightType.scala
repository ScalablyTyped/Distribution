package typings
package croppieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightType extends js.Object {
  var height: scala.Double
  var `type`: js.UndefOr[croppieLib.croppieMod.CroppieNs.CropType] = js.undefined
  var width: scala.Double
}

object Anon_HeightType {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, `type`: croppieLib.croppieMod.CroppieNs.CropType = null): Anon_HeightType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_HeightType]
  }
}

