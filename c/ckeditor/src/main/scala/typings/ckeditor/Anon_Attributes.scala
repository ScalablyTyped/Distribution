package typings.ckeditor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var styles: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(attributes: StringDictionary[String] = null, styles: StringDictionary[String] = null): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

