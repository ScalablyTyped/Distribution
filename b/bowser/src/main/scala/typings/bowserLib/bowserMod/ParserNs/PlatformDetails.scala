package typings
package bowserLib.bowserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformDetails extends js.Object {
  var model: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

object PlatformDetails {
  @scala.inline
  def apply(model: java.lang.String = null, `type`: java.lang.String = null, vendor: java.lang.String = null): PlatformDetails = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[PlatformDetails]
  }
}

