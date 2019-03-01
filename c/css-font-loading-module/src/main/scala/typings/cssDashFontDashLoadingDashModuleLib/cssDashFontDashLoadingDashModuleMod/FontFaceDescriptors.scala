package typings
package cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceDescriptors extends js.Object {
  var featureSettings: js.UndefOr[java.lang.String] = js.undefined
  var stretch: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var unicodeRange: js.UndefOr[java.lang.String] = js.undefined
  var variant: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object FontFaceDescriptors {
  @scala.inline
  def apply(
    featureSettings: java.lang.String = null,
    stretch: java.lang.String = null,
    style: java.lang.String = null,
    unicodeRange: java.lang.String = null,
    variant: java.lang.String = null,
    weight: java.lang.String = null
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

