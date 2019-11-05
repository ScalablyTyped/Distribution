package typings.braftDashEditor.braftDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braft-editor", JSImport.Default)
@js.native
class default () extends BraftEditor

/* static members */
@JSImport("braft-editor", JSImport.Default)
@js.native
object default extends js.Object {
  def createEditorState(content: String): EditorState = js.native
  def createEditorState(content: String, options: js.Object): EditorState = js.native
  def createEditorState(content: js.Any): EditorState = js.native
  def createEditorState(content: js.Any, options: js.Object): EditorState = js.native
  def use(extension: js.Array[js.Object]): Unit = js.native
  def use(extension: js.Object): Unit = js.native
}

