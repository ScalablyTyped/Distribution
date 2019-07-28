package typings.cssDashFontDashLoadingDashModule.cssDashFontDashLoadingDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceDescriptors extends js.Object {
  var featureSettings: js.UndefOr[String] = js.undefined
  var stretch: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var unicodeRange: js.UndefOr[String] = js.undefined
  var variant: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object FontFaceDescriptors {
  @scala.inline
  def apply(
    featureSettings: String = null,
    stretch: String = null,
    style: String = null,
    unicodeRange: String = null,
    variant: String = null,
    weight: String = null
  ): FontFaceDescriptors = {
    val __obj = js.Dynamic.literal()
    if (featureSettings != null) __obj.updateDynamic("featureSettings")(featureSettings)
    if (stretch != null) __obj.updateDynamic("stretch")(stretch)
    if (style != null) __obj.updateDynamic("style")(style)
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[FontFaceDescriptors]
  }
}

