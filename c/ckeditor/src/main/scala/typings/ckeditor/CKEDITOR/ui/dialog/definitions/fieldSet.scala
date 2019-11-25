package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fieldSet extends js.Object {
  var children: js.Array[_]
  var label: js.UndefOr[String] = js.undefined
}

object fieldSet {
  @scala.inline
  def apply(children: js.Array[_], label: String = null): fieldSet = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[fieldSet]
  }
}

