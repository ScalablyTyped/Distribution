package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exec extends js.Object {
  def exec(editor: editor): Boolean = js.native
  def refresh(editor: editor, path: elementPath): Double = js.native
}

object Exec {
  @scala.inline
  def apply(exec: editor => Boolean, refresh: (editor, elementPath) => Double): Exec = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), refresh = js.Any.fromFunction2(refresh))
    __obj.asInstanceOf[Exec]
  }
  @scala.inline
  implicit class ExecOps[Self <: Exec] (val x: Self) extends AnyVal {
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
    def setExec(value: editor => Boolean): Self = this.set("exec", js.Any.fromFunction1(value))
    @scala.inline
    def setRefresh(value: (editor, elementPath) => Double): Self = this.set("refresh", js.Any.fromFunction2(value))
  }
  
}

