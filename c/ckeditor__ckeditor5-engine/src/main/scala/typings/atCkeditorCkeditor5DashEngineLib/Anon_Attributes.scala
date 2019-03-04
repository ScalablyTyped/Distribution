package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var classes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var priority: js.UndefOr[scala.Double] = js.undefined
  var styles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    name: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    classes: java.lang.String | js.Array[java.lang.String] = null,
    priority: scala.Int | scala.Double = null,
    styles: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(name = name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

