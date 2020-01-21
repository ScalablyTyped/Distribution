package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var classes: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: String
  var priority: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[StringDictionary[String]] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(
    name: String,
    attributes: StringDictionary[String] = null,
    classes: String | js.Array[String] = null,
    priority: Int | Double = null,
    styles: StringDictionary[String] = null
  ): AnonAttributes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

