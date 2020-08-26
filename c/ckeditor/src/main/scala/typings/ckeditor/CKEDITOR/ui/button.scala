package typings.ckeditor.CKEDITOR.ui

import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait button extends js.Object {
  def getState(): Double = js.native
  def render(editor: editor, output: js.Array[String]): Unit = js.native
  def setState(state: Double): Unit = js.native
  def toFeature(editor: editor): feature = js.native
}

object button {
  @scala.inline
  def apply(
    getState: () => Double,
    render: (editor, js.Array[String]) => Unit,
    setState: Double => Unit,
    toFeature: editor => feature
  ): button = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), render = js.Any.fromFunction2(render), setState = js.Any.fromFunction1(setState), toFeature = js.Any.fromFunction1(toFeature))
    __obj.asInstanceOf[button]
  }
  @scala.inline
  implicit class buttonOps[Self <: button] (val x: Self) extends AnyVal {
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
    def setGetState(value: () => Double): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setRender(value: (editor, js.Array[String]) => Unit): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def setSetState(value: Double => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    @scala.inline
    def setToFeature(value: editor => feature): Self = this.set("toFeature", js.Any.fromFunction1(value))
  }
  
}

