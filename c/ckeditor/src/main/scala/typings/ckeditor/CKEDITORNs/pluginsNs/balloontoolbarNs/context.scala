package typings.ckeditor.CKEDITORNs.pluginsNs.balloontoolbarNs

import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.editor
import typings.ckeditor.CKEDITORNs.uiNs.balloonToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.balloontoolbar.context")
@js.native
class context protected () extends js.Object {
  def this(editor: editor, options: contextDefinition) = this()
  var editor: typings.ckeditor.CKEDITORNs.editor = js.native
  var options: contextDefinition = js.native
  var toolbar: balloonToolbar = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
  def refresh(): Unit = js.native
  def show(): Unit = js.native
  def show(pointedElement: element): Unit = js.native
}

