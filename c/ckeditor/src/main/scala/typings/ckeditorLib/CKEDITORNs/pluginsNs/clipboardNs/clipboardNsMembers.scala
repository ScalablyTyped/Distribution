package typings
package ckeditorLib.CKEDITORNs.pluginsNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.clipboard")
@js.native
object clipboardNsMembers extends js.Object {
  val isCustomCopyCutSupported: scala.Boolean = js.native
  val isCustomDataTypesSupported: scala.Boolean = js.native
  val isFileApiSupported: scala.Boolean = js.native
  val mainPasteEvent: java.lang.String = js.native
  def addPasteButton(
    editor: ckeditorLib.CKEDITORNs.editor,
    name: java.lang.String,
    definition: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def canClipboardApiBeTrusted(dataTransfer: dataTransfer, editor: ckeditorLib.CKEDITORNs.editor): scala.Boolean = js.native
  def getDropTarget(editor: ckeditorLib.CKEDITORNs.editor): ckeditorLib.CKEDITORNs.domNs.domObject = js.native
  def getRangeAtDropPosition(domEvent: stdLib.Event, editor: ckeditorLib.CKEDITORNs.editor): ckeditorLib.CKEDITORNs.domNs.range = js.native
  def initDragDataTransfer(): scala.Unit = js.native
  def initDragDataTransfer(evt: ckeditorLib.CKEDITORNs.domNs.event): scala.Unit = js.native
  def initDragDataTransfer(evt: ckeditorLib.CKEDITORNs.domNs.event, editor: ckeditorLib.CKEDITORNs.editor): scala.Unit = js.native
  def initPasteDataTransfer(): scala.Unit = js.native
  def initPasteDataTransfer(evt: ckeditorLib.CKEDITORNs.domNs.event): scala.Unit = js.native
  def initPasteDataTransfer(evt: ckeditorLib.CKEDITORNs.domNs.event, sourceEditor: ckeditorLib.CKEDITORNs.editor): scala.Unit = js.native
  def preventDefaultDropOnElement(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def resetDragDataTransfer(): scala.Unit = js.native
}

