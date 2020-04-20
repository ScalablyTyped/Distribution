package typings.ckeditor

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends js.Object {
  var element: typings.ckeditor.CKEDITOR.dom.element
  var item: js.Any
}

object AnonElement {
  @scala.inline
  def apply(element: element, item: js.Any): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElement]
  }
}

