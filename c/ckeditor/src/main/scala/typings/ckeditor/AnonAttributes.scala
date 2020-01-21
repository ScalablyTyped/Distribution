package typings.ckeditor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var styles: js.UndefOr[StringDictionary[String]] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(attributes: StringDictionary[String] = null, styles: StringDictionary[String] = null): AnonAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

