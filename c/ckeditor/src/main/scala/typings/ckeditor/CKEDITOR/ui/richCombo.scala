package typings.ckeditor.CKEDITOR.ui

import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait richCombo extends js.Object {
  def render(editor: editor, output: js.Array[String]): Unit
}

object richCombo {
  @scala.inline
  def apply(render: (editor, js.Array[String]) => Unit): richCombo = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[richCombo]
  }
}

