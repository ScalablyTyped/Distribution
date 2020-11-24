package typings.braftEditor.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
