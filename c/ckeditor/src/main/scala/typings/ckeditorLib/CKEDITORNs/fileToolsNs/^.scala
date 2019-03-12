package typings
package ckeditorLib.CKEDITORNs.fileToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.fileTools")
@js.native
object ^ extends js.Object {
  var isFileUploadSupported: scala.Boolean = js.native
  def addUploadWidget(editor: ckeditorLib.CKEDITORNs.editor, name: java.lang.String, `def`: uploadWidgetDefinition): scala.Unit = js.native
  def bindNotification(editor: ckeditorLib.CKEDITORNs.editor, fileLoader: fileLoader): scala.Unit = js.native
  def getUploadUrl(config: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def getUploadUrl(config: org.scalablytyped.runtime.StringDictionary[js.Any], `type`: java.lang.String): java.lang.String = js.native
  def isTypeSupported(file: stdLib.Blob, supportedTypes: stdLib.RegExp): scala.Boolean = js.native
  def markElement(
    element: ckeditorLib.CKEDITORNs.domNs.element,
    widgetName: java.lang.String,
    loaderId: scala.Double
  ): scala.Unit = js.native
}

