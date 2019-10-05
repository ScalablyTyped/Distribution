package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editor

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
    val __obj = js.Dynamic.literal(ui = ui)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[EditorWithUI]
  }
}

