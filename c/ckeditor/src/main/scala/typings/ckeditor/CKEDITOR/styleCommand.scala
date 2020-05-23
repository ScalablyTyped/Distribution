package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait styleCommand extends js.Object {
  def exec(editor: editor): Unit
}

object styleCommand {
  @scala.inline
  def apply(exec: editor => Unit): styleCommand = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
    __obj.asInstanceOf[styleCommand]
  }
}

