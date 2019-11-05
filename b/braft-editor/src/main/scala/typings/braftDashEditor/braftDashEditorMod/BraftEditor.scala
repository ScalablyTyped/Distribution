package typings.braftDashEditor.braftDashEditorMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BraftEditor
  extends Component[BraftEditorProps, js.Object, js.Any] {
  def clearEditorContent(): Unit = js.native
  def forceRender(): Unit = js.native
  def getDraftInstance(): js.Any = js.native
  def getFinderInstance(): js.Any = js.native
  def getValue(): EditorState = js.native
  def redo(): Unit = js.native
  def setValue(editorState: EditorState): Unit = js.native
  def undo(): Unit = js.native
}

