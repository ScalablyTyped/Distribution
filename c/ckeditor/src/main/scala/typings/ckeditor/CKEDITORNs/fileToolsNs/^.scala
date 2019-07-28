package typings.ckeditor.CKEDITORNs.fileToolsNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.editor
import typings.std.Blob
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.fileTools")
@js.native
object ^ extends js.Object {
  var isFileUploadSupported: Boolean = js.native
  def addUploadWidget(editor: editor, name: String, `def`: uploadWidgetDefinition): Unit = js.native
  def bindNotification(editor: editor, fileLoader: fileLoader): Unit = js.native
  def getUploadUrl(config: StringDictionary[js.Any]): String = js.native
  def getUploadUrl(config: StringDictionary[js.Any], `type`: String): String = js.native
  def isTypeSupported(file: Blob, supportedTypes: RegExp): Boolean = js.native
  def markElement(element: element, widgetName: String, loaderId: Double): Unit = js.native
}

