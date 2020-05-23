package typings.ckeditor.global.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.button")
@js.native
class button protected ()
  extends typings.ckeditor.CKEDITOR.ui.button {
  def this(definition: StringDictionary[js.Any]) = this()
  /* CompleteClass */
  override def getState(): Double = js.native
  /* CompleteClass */
  override def render(editor: editor, output: js.Array[String]): Unit = js.native
  /* CompleteClass */
  override def setState(state: Double): Unit = js.native
  /* CompleteClass */
  override def toFeature(editor: editor): feature = js.native
}

/* static members */
@JSGlobal("CKEDITOR.ui.button")
@js.native
object button extends js.Object {
  val handler: typings.ckeditor.CKEDITOR.ui.handlerDefinition[typings.ckeditor.CKEDITOR.ui.button] = js.native
}

