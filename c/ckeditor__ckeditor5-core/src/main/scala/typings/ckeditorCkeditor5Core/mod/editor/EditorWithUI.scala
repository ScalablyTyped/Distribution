package typings.ckeditorCkeditor5Core.mod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editorwithui
trait EditorWithUI extends js.Object {
  val element: HTMLElement | Null
  val ui: EditorUI
}

object EditorWithUI {
  @scala.inline
  def apply(ui: EditorUI, element: HTMLElement = null): EditorWithUI = {
    val __obj = js.Dynamic.literal(ui = ui.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWithUI]
  }
}

