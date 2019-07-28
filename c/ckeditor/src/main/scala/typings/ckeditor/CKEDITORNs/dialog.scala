package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.dialogNs.IDialogDefinition
import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.uiNs.dialogNs.button
import typings.ckeditor.CKEDITORNs.uiNs.dialogNs.uiElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dialog")
@js.native
class dialog protected () extends js.Object {
  def this(editor: editor, dialogName: String) = this()
  val state: Double = js.native
  def addFocusable(element: element): Unit = js.native
  def addFocusable(element: element, index: Double): Unit = js.native
  def addPage(contents: StringDictionary[js.Any]): Unit = js.native
  def click(id: String): js.Any = js.native
  def commitContent(): Unit = js.native
  def disableButton(id: String): Unit = js.native
  def enableButton(id: String): Unit = js.native
  def foreach(fn: js.Function0[Unit]): dialog = js.native
  def getButton(id: String): button = js.native
  def getContentElement(pageId: String, elementId: String): uiElement = js.native
  def getElement(): element = js.native
  def getName(): String = js.native
  def getPageCount(): Double = js.native
  def getParentEditor(): editor = js.native
  def getPosition(): StringDictionary[js.Any] = js.native
  def getSelectedElement(): element = js.native
  def getSize(): StringDictionary[js.Any] = js.native
  def getValueOf(pageId: String, elementId: String): js.Any = js.native
  def hide(): Unit = js.native
  def hidePage(id: String): Unit = js.native
  def layout(): Unit = js.native
  def move(x: Double, y: Double, save: Boolean): Unit = js.native
  def reset(): dialog = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def selectPage(id: String): Unit = js.native
  def setState(state: Double): Unit = js.native
  def setValueOf(pageId: String, elementId: String, value: js.Any): Unit = js.native
  def setupContent(): Unit = js.native
  def show(): Unit = js.native
  def showPage(id: String): Unit = js.native
  def updateStyle(): Unit = js.native
}

/* static members */
@JSGlobal("CKEDITOR.dialog")
@js.native
object dialog extends js.Object {
  def add(name: String, dialogDefinition: String): Unit = js.native
  def add(name: String, dialogDefinition: js.Function1[/* editor */ editor, IDialogDefinition]): Unit = js.native
  def addIframe(name: String, title: String, minWidth: Double, minHeight: Double): Unit = js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit]
  ): Unit = js.native
  def addIframe(
    name: String,
    title: String,
    minWidth: Double,
    minHeight: Double,
    onContentLoad: js.Function0[Unit],
    userDefinition: StringDictionary[js.Any]
  ): Unit = js.native
  def addUIElement(typeName: String, builder: js.Function0[Unit]): Unit = js.native
  def cancelButton(): Unit = js.native
  def exists(name: String): Unit = js.native
  def exists(name: Double): Unit = js.native
   // NOTE: documentation says object, but it's an array accessor, so really a string or number will work
  def getCurrent(): dialog = js.native
  def isTabEnabled(editor: editor, dialogName: String, tabName: String): Boolean = js.native
  def okButton(): Unit = js.native
}

