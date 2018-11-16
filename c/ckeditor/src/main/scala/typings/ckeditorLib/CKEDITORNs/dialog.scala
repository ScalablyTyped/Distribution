package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dialog")
@js.native
class dialog protected () extends js.Object {
  def this(editor: editor, dialogName: java.lang.String) = this()
  val state: scala.Double = js.native
  def addFocusable(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def addFocusable(element: ckeditorLib.CKEDITORNs.domNs.element, index: scala.Double): scala.Unit = js.native
  def addPage(contents: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def click(id: java.lang.String): js.Any = js.native
  def commitContent(): scala.Unit = js.native
  def disableButton(id: java.lang.String): scala.Unit = js.native
  def enableButton(id: java.lang.String): scala.Unit = js.native
  def foreach(fn: js.Function0[scala.Unit]): dialog = js.native
  def getButton(id: java.lang.String): ckeditorLib.CKEDITORNs.uiNs.dialogNs.button = js.native
  def getContentElement(pageId: java.lang.String, elementId: java.lang.String): ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement = js.native
  def getElement(): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def getName(): java.lang.String = js.native
  def getPageCount(): scala.Double = js.native
  def getParentEditor(): editor = js.native
  def getPosition(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getSelectedElement(): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def getSize(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getValueOf(pageId: java.lang.String, elementId: java.lang.String): js.Any = js.native
  def hide(): scala.Unit = js.native
  def hidePage(id: java.lang.String): scala.Unit = js.native
  def layout(): scala.Unit = js.native
  def move(x: scala.Double, y: scala.Double, save: scala.Boolean): scala.Unit = js.native
  def reset(): dialog = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def selectPage(id: java.lang.String): scala.Unit = js.native
  def setState(state: scala.Double): scala.Unit = js.native
  def setValueOf(pageId: java.lang.String, elementId: java.lang.String, value: js.Any): scala.Unit = js.native
  def setupContent(): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def showPage(id: java.lang.String): scala.Unit = js.native
  def updateStyle(): scala.Unit = js.native
}

@JSGlobal("CKEDITOR.dialog")
@js.native
object dialog extends js.Object {
  def add(name: java.lang.String, dialogDefinition: java.lang.String): scala.Unit = js.native
  def add(
    name: java.lang.String,
    dialogDefinition: js.Function1[
      /* editor */ ckeditorLib.CKEDITORNs.editor, 
      ckeditorLib.CKEDITORNs.dialogNs.IDialogDefinition
    ]
  ): scala.Unit = js.native
  def addIframe(name: java.lang.String, title: java.lang.String, minWidth: scala.Double, minHeight: scala.Double): scala.Unit = js.native
  def addIframe(
    name: java.lang.String,
    title: java.lang.String,
    minWidth: scala.Double,
    minHeight: scala.Double,
    onContentLoad: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def addIframe(
    name: java.lang.String,
    title: java.lang.String,
    minWidth: scala.Double,
    minHeight: scala.Double,
    onContentLoad: js.Function0[scala.Unit],
    userDefinition: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def addUIElement(typeName: java.lang.String, builder: js.Function0[scala.Unit]): scala.Unit = js.native
  def cancelButton(): scala.Unit = js.native
  def exists(name: java.lang.String): scala.Unit = js.native
  def exists(name: scala.Double): scala.Unit = js.native
   // NOTE: documentation says object, but it's an array accessor, so really a string or number will work
  def getCurrent(): ckeditorLib.CKEDITORNs.dialog = js.native
  def isTabEnabled(editor: ckeditorLib.CKEDITORNs.editor, dialogName: java.lang.String, tabName: java.lang.String): scala.Boolean = js.native
  def okButton(): scala.Unit = js.native
}

