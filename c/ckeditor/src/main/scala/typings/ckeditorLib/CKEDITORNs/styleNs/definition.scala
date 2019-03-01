package typings
package ckeditorLib.CKEDITORNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends js.Object {
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var element: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object definition {
  @scala.inline
  def apply(
    element: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    name: java.lang.String = null,
    styles: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    `type`: java.lang.String | scala.Double = null
  ): definition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[definition]
  }
}

