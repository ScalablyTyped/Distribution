package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait styleCommand extends js.Object {
  def exec(editor: editor): Unit = js.native
}

object styleCommand {
  @scala.inline
  def apply(exec: editor => Unit): styleCommand = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
    __obj.asInstanceOf[styleCommand]
  }
  @scala.inline
  implicit class styleCommandOps[Self <: styleCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExec(value: editor => Unit): Self = this.set("exec", js.Any.fromFunction1(value))
  }
  
}

