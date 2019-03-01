package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: ckeditorLib.CKEDITORNs.domNs.element
  var item: js.Any
}

object Anon_Element {
  @scala.inline
  def apply(element: ckeditorLib.CKEDITORNs.domNs.element, item: js.Any): Anon_Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[Anon_Element]
  }
}

