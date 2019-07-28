package typings.ckeditor.CKEDITORNs.pluginsNs.clipboardNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.domNs.domObject
import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.domNs.range
import typings.ckeditor.CKEDITORNs.editor
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.clipboard")
@js.native
object ^ extends js.Object {
  val isCustomCopyCutSupported: Boolean = js.native
  val isCustomDataTypesSupported: Boolean = js.native
  val isFileApiSupported: Boolean = js.native
  val mainPasteEvent: String = js.native
  def addPasteButton(editor: editor, name: String, definition: StringDictionary[js.Any]): Unit = js.native
  def canClipboardApiBeTrusted(dataTransfer: dataTransfer, editor: editor): Boolean = js.native
  def getDropTarget(editor: editor): domObject = js.native
  def getRangeAtDropPosition(domEvent: Event, editor: editor): range = js.native
  def initDragDataTransfer(): Unit = js.native
  def initDragDataTransfer(evt: typings.ckeditor.CKEDITORNs.domNs.event): Unit = js.native
  def initDragDataTransfer(evt: typings.ckeditor.CKEDITORNs.domNs.event, editor: editor): Unit = js.native
  def initPasteDataTransfer(): Unit = js.native
  def initPasteDataTransfer(evt: typings.ckeditor.CKEDITORNs.domNs.event): Unit = js.native
  def initPasteDataTransfer(evt: typings.ckeditor.CKEDITORNs.domNs.event, sourceEditor: editor): Unit = js.native
  def preventDefaultDropOnElement(element: element): Unit = js.native
  def resetDragDataTransfer(): Unit = js.native
}

