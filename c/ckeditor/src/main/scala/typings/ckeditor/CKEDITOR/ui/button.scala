package typings.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.button")
@js.native
class button protected () extends js.Object {
  def this(definition: StringDictionary[js.Any]) = this()
  def getState(): Double = js.native
  def render(editor: editor, output: js.Array[String]): Unit = js.native
  def setState(state: Double): Unit = js.native
  def toFeature(editor: editor): feature = js.native
}

/* static members */
@JSGlobal("CKEDITOR.ui.button")
@js.native
object button extends js.Object {
  val handler: handlerDefinition[button] = js.native
}

