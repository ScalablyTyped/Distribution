package typings
package ckeditorLib.CKEDITORNs.pluginsNs.balloontoolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.balloontoolbar.contextManager")
@js.native
class contextManager protected () extends js.Object {
  def this(editor: ckeditorLib.CKEDITORNs.editor) = this()
  var editor: ckeditorLib.CKEDITORNs.editor = js.native
  def add(context: context): scala.Unit = js.native
  def check(): scala.Unit = js.native
  def check(selection: ckeditorLib.CKEDITORNs.domNs.selection): scala.Unit = js.native
  def create(options: contextDefinition): context = js.native
  def destroy(): scala.Unit = js.native
  def hide(): scala.Unit = js.native
}

