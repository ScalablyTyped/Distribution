package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesClasses extends js.Object {
  var attributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp | scala.Boolean]
  ] = js.undefined
  var classes: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var name: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var styles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp]] = js.undefined
}

object Anon_AttributesClasses {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp | scala.Boolean] = null,
    classes: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    name: java.lang.String | stdLib.RegExp = null,
    styles: org.scalablytyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp] = null
  ): Anon_AttributesClasses = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Anon_AttributesClasses]
  }
}

