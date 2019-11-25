package typings.ckeditor.CKEDITOR.config

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait styleObject extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var element: String
  var name: js.UndefOr[String] = js.undefined
  var overrides: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object styleObject {
  @scala.inline
  def apply(
    element: String,
    attributes: StringDictionary[js.Any] = null,
    name: String = null,
    overrides: StringDictionary[js.Any] = null,
    styles: StringDictionary[js.Any] = null
  ): styleObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[styleObject]
  }
}

