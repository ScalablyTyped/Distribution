package typings.ckeditor.CKEDITOR.ui

import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait button extends js.Object {
  def getState(): Double
  def render(editor: editor, output: js.Array[String]): Unit
  def setState(state: Double): Unit
  def toFeature(editor: editor): feature
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
}

