package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClasses extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String | RegExp | Boolean]] = js.undefined
  var classes: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  var name: js.UndefOr[String | RegExp] = js.undefined
  var styles: js.UndefOr[StringDictionary[String | RegExp]] = js.undefined
}

object AnonClasses {
  @scala.inline
  def apply(
    attributes: StringDictionary[String | RegExp | Boolean] = null,
    classes: String | RegExp | (js.Array[String | RegExp]) = null,
    name: String | RegExp = null,
    styles: StringDictionary[String | RegExp] = null
  ): AnonClasses = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses]
  }
}

