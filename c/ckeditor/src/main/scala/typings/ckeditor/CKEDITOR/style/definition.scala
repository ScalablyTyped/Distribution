package typings.ckeditor.CKEDITOR.style

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var element: String
  var name: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[StringDictionary[String]] = js.undefined
  var `type`: js.UndefOr[String | Double] = js.undefined
}

object definition {
  @scala.inline
  def apply(
    element: String,
    attributes: StringDictionary[String] = null,
    name: String = null,
    styles: StringDictionary[String] = null,
    `type`: String | Double = null
  ): definition = {
    val __obj = js.Dynamic.literal(element = element)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[definition]
  }
}

