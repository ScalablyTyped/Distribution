package typings.ckeditor.CKEDITORNs.pluginsNs.indentNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Anon_Editor
import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.domNs.elementPath
import typings.ckeditor.CKEDITORNs.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.indent.specificDefinition")
@js.native
class specificDefinition () extends js.Object {
  var database: StringDictionary[js.Any] = js.native
  val enterBr: Boolean = js.native
  val indentKey: StringDictionary[js.Any] = js.native
  val isIndent: Boolean = js.native
  val jobs: StringDictionary[Anon_Editor] = js.native
  val relatedGlobal: StringDictionary[js.Any] = js.native
  def execJob(editor: editor, priority: Double): Boolean = js.native
  def getContext(node: elementPath): element = js.native
  def refreshJob(editor: editor, priority: Double): Double = js.native
}

