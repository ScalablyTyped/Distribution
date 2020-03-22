package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderXMLOptions extends js.Object {
  var complement: js.UndefOr[js.Object] = js.undefined
  var existingVariables: js.UndefOr[js.Array[Variable]] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var formatters: js.UndefOr[Formatters] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var translations: js.UndefOr[Translations] = js.undefined
}

object RenderXMLOptions {
  @scala.inline
  def apply(
    complement: js.Object = null,
    existingVariables: js.Array[Variable] = null,
    extension: String = null,
    formatters: Formatters = null,
    lang: String = null,
    translations: Translations = null
  ): RenderXMLOptions = {
    val __obj = js.Dynamic.literal()
    if (complement != null) __obj.updateDynamic("complement")(complement.asInstanceOf[js.Any])
    if (existingVariables != null) __obj.updateDynamic("existingVariables")(existingVariables.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderXMLOptions]
  }
}

