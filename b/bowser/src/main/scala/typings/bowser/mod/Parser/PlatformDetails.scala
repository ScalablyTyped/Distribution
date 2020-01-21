package typings.bowser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformDetails extends js.Object {
  var model: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var vendor: js.UndefOr[String] = js.undefined
}

object PlatformDetails {
  @scala.inline
  def apply(model: String = null, `type`: String = null, vendor: String = null): PlatformDetails = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformDetails]
  }
}

