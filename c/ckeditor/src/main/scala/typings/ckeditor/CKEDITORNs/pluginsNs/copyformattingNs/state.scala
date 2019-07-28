package typings.ckeditor.CKEDITORNs.pluginsNs.copyformattingNs

import typings.ckeditor.CKEDITORNs.editor
import typings.ckeditor.CKEDITORNs.event
import typings.ckeditor.CKEDITORNs.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.copyformatting.state")
@js.native
class state protected () extends event {
  def this(editor: editor) = this()
  var editor: typings.ckeditor.CKEDITORNs.editor = js.native
  var filter: typings.ckeditor.CKEDITORNs.filter = js.native
  var sticky: Boolean = js.native
  var styles: js.Array[style] = js.native
}

