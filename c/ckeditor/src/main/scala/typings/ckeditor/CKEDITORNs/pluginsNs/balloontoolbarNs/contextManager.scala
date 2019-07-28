package typings.ckeditor.CKEDITORNs.pluginsNs.balloontoolbarNs

import typings.ckeditor.CKEDITORNs.domNs.selection
import typings.ckeditor.CKEDITORNs.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.balloontoolbar.contextManager")
@js.native
class contextManager protected () extends js.Object {
  def this(editor: editor) = this()
  var editor: typings.ckeditor.CKEDITORNs.editor = js.native
  def add(context: context): Unit = js.native
  def check(): Unit = js.native
  def check(selection: selection): Unit = js.native
  def create(options: contextDefinition): context = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
}

