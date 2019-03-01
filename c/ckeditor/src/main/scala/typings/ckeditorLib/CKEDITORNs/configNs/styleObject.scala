package typings
package ckeditorLib.CKEDITORNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait styleObject extends js.Object {
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var element: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var overrides: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var styles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object styleObject {
  @scala.inline
  def apply(
    element: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null,
    overrides: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): styleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[styleObject]
  }
}

