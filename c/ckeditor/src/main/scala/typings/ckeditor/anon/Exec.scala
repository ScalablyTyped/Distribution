package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exec extends js.Object {
  def exec(editor: editor): Boolean
  def refresh(editor: editor, path: elementPath): Double
}

object Exec {
  @scala.inline
  def apply(exec: editor => Boolean, refresh: (editor, elementPath) => Double): Exec = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), refresh = js.Any.fromFunction2(refresh))
    __obj.asInstanceOf[Exec]
  }
}

