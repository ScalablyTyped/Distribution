package typings
package ckeditorLib.CKEDITORNs.pluginsNs.indentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.indent.specificDefinition")
@js.native
class specificDefinition () extends js.Object {
  var database: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  val enterBr: scala.Boolean = js.native
  val indentKey: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  val isIndent: scala.Boolean = js.native
  val jobs: ScalablyTyped.runtime.StringDictionary[ckeditorLib.Anon_Refresh] = js.native
  val relatedGlobal: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def execJob(editor: ckeditorLib.CKEDITORNs.editor, priority: scala.Double): scala.Boolean = js.native
  def getContext(node: ckeditorLib.CKEDITORNs.domNs.elementPath): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def refreshJob(editor: ckeditorLib.CKEDITORNs.editor, priority: scala.Double): scala.Double = js.native
}

