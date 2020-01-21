package typings.ckeditor

import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEditor extends js.Object {
  def exec(editor: editor): Boolean
  def refresh(editor: editor, path: elementPath): Double
}

object AnonEditor {
  @scala.inline
  def apply(exec: editor => Boolean, refresh: (editor, elementPath) => Double): AnonEditor = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), refresh = js.Any.fromFunction2(refresh))
  
    __obj.asInstanceOf[AnonEditor]
  }
}

