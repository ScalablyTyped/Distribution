package typings.bcpDash47.bcpDash47Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var extendedLanguageSubtags: js.UndefOr[js.Array[String]] = js.undefined
  var extensions: js.UndefOr[js.Array[LocaleExtension]] = js.undefined
  var irregular: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var privateuse: js.UndefOr[js.Array[String]] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var regular: js.UndefOr[String] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var variants: js.UndefOr[js.Array[String]] = js.undefined
}

object Schema {
  @scala.inline
  def apply(
    extendedLanguageSubtags: js.Array[String] = null,
    extensions: js.Array[LocaleExtension] = null,
    irregular: String = null,
    language: String = null,
    privateuse: js.Array[String] = null,
    region: String = null,
    regular: String = null,
    script: String = null,
    variants: js.Array[String] = null
  ): Schema = {
    val __obj = js.Dynamic.literal()
    if (extendedLanguageSubtags != null) __obj.updateDynamic("extendedLanguageSubtags")(extendedLanguageSubtags.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (irregular != null) __obj.updateDynamic("irregular")(irregular.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (privateuse != null) __obj.updateDynamic("privateuse")(privateuse.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (regular != null) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

