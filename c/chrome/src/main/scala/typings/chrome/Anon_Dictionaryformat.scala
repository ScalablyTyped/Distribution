package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dictionaryformat extends js.Object {
  var dictionary_format: js.UndefOr[String] = js.undefined
  var dictionary_language: js.UndefOr[String] = js.undefined
  var dictionary_locale: js.UndefOr[String] = js.undefined
  var dictionary_path: js.UndefOr[String] = js.undefined
}

object Anon_Dictionaryformat {
  @scala.inline
  def apply(
    dictionary_format: String = null,
    dictionary_language: String = null,
    dictionary_locale: String = null,
    dictionary_path: String = null
  ): Anon_Dictionaryformat = {
    val __obj = js.Dynamic.literal()
    if (dictionary_format != null) __obj.updateDynamic("dictionary_format")(dictionary_format)
    if (dictionary_language != null) __obj.updateDynamic("dictionary_language")(dictionary_language)
    if (dictionary_locale != null) __obj.updateDynamic("dictionary_locale")(dictionary_locale)
    if (dictionary_path != null) __obj.updateDynamic("dictionary_path")(dictionary_path)
    __obj.asInstanceOf[Anon_Dictionaryformat]
  }
}

