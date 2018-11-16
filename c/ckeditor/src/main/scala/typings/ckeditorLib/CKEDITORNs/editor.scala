package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.editor")
@js.native
class editor () extends event {
  def this(instanceConfig: config) = this()
  def this(instanceConfig: config, element: ckeditorLib.CKEDITORNs.domNs.element) = this()
  def this(instanceConfig: config, element: ckeditorLib.CKEDITORNs.domNs.element, mode: scala.Double) = this()
  val activeEnterMode: scala.Double = js.native
  val activeFilter: filter = js.native
  val activeShiftEnterMode: scala.Double = js.native
  val blockless: scala.Boolean = js.native
  val config: config = js.native
  val container: ckeditorLib.CKEDITORNs.domNs.element = js.native
  val contextMenu: ckeditorLib.CKEDITORNs.pluginsNs.contextMenu = js.native
  var copyFormatting: ckeditorLib.CKEDITORNs.pluginsNs.copyformattingNs.state = js.native
  var dataProcessor: dataProcessor = js.native
  val document: ckeditorLib.CKEDITORNs.domNs.document = js.native
  val element: ckeditorLib.CKEDITORNs.domNs.element = js.native
  val elementMode: scala.Double = js.native
  val enterMode: scala.Double = js.native
  val filter: filter = js.native
  val focusManager: focusManager = js.native
  val id: java.lang.String = js.native
  val keystrokeHandler: keystrokeHandler = js.native
  val lang: js.Any = js.native
  val langCode: java.lang.String = js.native
  val mode: java.lang.String = js.native
  val name: java.lang.String = js.native
  val pasteFilter: filter = js.native
  val plugins: js.Any = js.native
  val readOnly: scala.Boolean = js.native
  val shiftEnterMode: scala.Double = js.native
  val status: java.lang.String = js.native
  val tabIndex: scala.Double = js.native
  val templates: js.Any = js.native
  val title: js.Any = js.native
  val toolbar: js.Any = js.native
  val ui: ui = js.native
  val widgets: ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.repository = js.native
  val window: ckeditorLib.CKEDITORNs.domNs.window = js.native
  def addCommand(commandName: java.lang.String, commandDefinition: commandDefinition): scala.Unit = js.native
  def addContentsCss(cssPath: java.lang.String): scala.Unit = js.native
  def addFeature(feature: feature): scala.Boolean = js.native
  def addMenuGroup(name: java.lang.String): scala.Unit = js.native
  def addMenuGroup(name: java.lang.String, order: scala.Double): scala.Unit = js.native
  def addMenuItem(name: java.lang.String): scala.Unit = js.native
  def addMenuItem(name: java.lang.String, definition: IMenuItemDefinition): scala.Unit = js.native
  def addMenuItems(definitions: ScalablyTyped.runtime.StringDictionary[IMenuItemDefinition]): scala.Unit = js.native
  def addMode(mode: java.lang.String, exec: js.Function0[scala.Unit]): scala.Unit = js.native
  def addRemoveFormatFilter(func: js.Function1[/* element */ ckeditorLib.CKEDITORNs.domNs.element, scala.Boolean]): scala.Unit = js.native
  def applyStyle(style: style): scala.Unit = js.native
  def attachStyleStateChange(style: style, callback: js.Function1[/* state */ scala.Double, scala.Unit]): scala.Unit = js.native
  def checkDirty(): scala.Boolean = js.native
  def createFakeElement(
    realElement: ckeditorLib.CKEDITORNs.domNs.element,
    className: java.lang.String,
    realElementType: java.lang.String,
    isResizable: scala.Boolean
  ): scala.Unit = js.native
  def createFakeParserElement(
    realElement: ckeditorLib.CKEDITORNs.domNs.element,
    className: java.lang.String,
    realElementType: java.lang.String,
    isResizable: scala.Boolean
  ): scala.Unit = js.native
  def createRange(): ckeditorLib.CKEDITORNs.domNs.range = js.native
  def destroy(): scala.Unit = js.native
  def destroy(noUpdate: scala.Boolean): scala.Unit = js.native
  def editable(): editable = js.native
  def editable(elementOrEditable: ckeditorLib.CKEDITORNs.domNs.element): editable = js.native
  def editable(elementOrEditable: editable): editable = js.native
  def elementPath(): ckeditorLib.CKEDITORNs.domNs.elementPath = js.native
  def elementPath(startNode: ckeditorLib.CKEDITORNs.domNs.node): ckeditorLib.CKEDITORNs.domNs.elementPath = js.native
  def execCommand(commandName: java.lang.String): scala.Boolean = js.native
  def execCommand(commandName: java.lang.String, data: js.Any): scala.Boolean = js.native
  def extractSelectedHtml(): ckeditorLib.CKEDITORNs.domNs.documentFragment | java.lang.String | scala.Unit = js.native
  def extractSelectedHtml(toString: scala.Boolean): ckeditorLib.CKEDITORNs.domNs.documentFragment | java.lang.String | scala.Unit = js.native
  def extractSelectedHtml(toString: scala.Boolean, removeEmptyBlock: scala.Boolean): ckeditorLib.CKEDITORNs.domNs.documentFragment | java.lang.String | scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def forceNextSelectionCheck(): scala.Unit = js.native
  def getClipboardData(callbackOrOptions: ckeditorLib.Anon_Title, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def getClipboardData(
    callbackOrOptions: js.Function1[/* data */ js.Any, scala.Unit],
    callback: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getColorFromDialog(callback: js.Function1[/* color */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getColorFromDialog(
    callback: js.Function1[/* color */ java.lang.String, scala.Unit],
    scope: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def getCommand(commandName: java.lang.String): command = js.native
  def getCommandKeystroke(command: command): scala.Double | scala.Null = js.native
  def getCommandKeystroke(command: java.lang.String): scala.Double | scala.Null = js.native
  def getData(): java.lang.String = js.native
  def getData(internal: scala.Boolean): java.lang.String = js.native
  def getMenuItem(name: java.lang.String): IMenuItemDefinition = js.native
  def getResizable(forContents: scala.Boolean): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def getSelectedHtml(): ckeditorLib.CKEDITORNs.domNs.documentFragment | java.lang.String = js.native
  def getSelectedHtml(toString: ckeditorLib.ckeditorLibNumbers.`false`): ckeditorLib.CKEDITORNs.domNs.documentFragment = js.native
  def getSelectedHtml(toString: ckeditorLib.ckeditorLibNumbers.`true`): java.lang.String = js.native
  def getSelectedHtml(toString: scala.Boolean): ckeditorLib.CKEDITORNs.domNs.documentFragment | java.lang.String = js.native
  @JSName("getSelectedHtml")
  def getSelectedHtml_documentFragment(): ckeditorLib.CKEDITORNs.domNs.documentFragment = js.native
  def getSelection(): ckeditorLib.CKEDITORNs.domNs.selection = js.native
  def getSelection(forceRealSelection: scala.Boolean): ckeditorLib.CKEDITORNs.domNs.selection = js.native
  def getSnapshot(): java.lang.String = js.native
  def getStylesSet(
    callback: js.Function1[
      /* stylesDefinitions */ js.Array[ckeditorLib.CKEDITORNs.styleNs.definition], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getUiColor(): java.lang.String = js.native
  def insertElement(element: ckeditorLib.CKEDITORNs.domNs.element): scala.Unit = js.native
  def insertHtml(html: java.lang.String): scala.Unit = js.native
  def insertHtml(html: java.lang.String, mode: java.lang.String): scala.Unit = js.native
  def insertHtml(html: java.lang.String, mode: java.lang.String, range: ckeditorLib.CKEDITORNs.domNs.range): scala.Unit = js.native
  def insertText(text: java.lang.String): scala.Unit = js.native
  def loadSnapshot(snapshot: js.Any): scala.Unit = js.native
  def lockSelection(): scala.Boolean = js.native
  def lockSelection(sel: ckeditorLib.CKEDITORNs.domNs.selection): scala.Boolean = js.native
  def openDialog(dialogName: java.lang.String, callback: js.Function0[scala.Unit]): dialog = js.native
  def popup(url: java.lang.String): scala.Unit = js.native
  def popup(url: java.lang.String, width: java.lang.String): scala.Unit = js.native
  def popup(url: java.lang.String, width: java.lang.String, height: java.lang.String): scala.Unit = js.native
  def popup(
    url: java.lang.String,
    width: java.lang.String,
    height: java.lang.String,
    options: java.lang.String
  ): scala.Unit = js.native
  def popup(url: java.lang.String, width: java.lang.String, height: scala.Double): scala.Unit = js.native
  def popup(url: java.lang.String, width: java.lang.String, height: scala.Double, options: java.lang.String): scala.Unit = js.native
  def popup(url: java.lang.String, width: scala.Double): scala.Unit = js.native
  def popup(url: java.lang.String, width: scala.Double, height: java.lang.String): scala.Unit = js.native
  def popup(url: java.lang.String, width: scala.Double, height: java.lang.String, options: java.lang.String): scala.Unit = js.native
  def popup(url: java.lang.String, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def popup(url: java.lang.String, width: scala.Double, height: scala.Double, options: java.lang.String): scala.Unit = js.native
  def removeMenuItem(name: java.lang.String): scala.Unit = js.native
  def removeStyle(style: style): scala.Unit = js.native
  def resetDirty(): scala.Unit = js.native
  def resetUndo(): scala.Unit = js.native
  def resize(width: java.lang.String, height: java.lang.String): scala.Unit = js.native
  def resize(width: java.lang.String, height: java.lang.String, isContentHeight: scala.Boolean): scala.Unit = js.native
  def resize(
    width: java.lang.String,
    height: java.lang.String,
    isContentHeight: scala.Boolean,
    resizeInner: scala.Boolean
  ): scala.Unit = js.native
  def resize(width: java.lang.String, height: scala.Double): scala.Unit = js.native
  def resize(width: java.lang.String, height: scala.Double, isContentHeight: scala.Boolean): scala.Unit = js.native
  def resize(
    width: java.lang.String,
    height: scala.Double,
    isContentHeight: scala.Boolean,
    resizeInner: scala.Boolean
  ): scala.Unit = js.native
  def resize(width: scala.Double, height: java.lang.String): scala.Unit = js.native
  def resize(width: scala.Double, height: java.lang.String, isContentHeight: scala.Boolean): scala.Unit = js.native
  def resize(
    width: scala.Double,
    height: java.lang.String,
    isContentHeight: scala.Boolean,
    resizeInner: scala.Boolean
  ): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double, isContentHeight: scala.Boolean): scala.Unit = js.native
  def resize(
    width: scala.Double,
    height: scala.Double,
    isContentHeight: scala.Boolean,
    resizeInner: scala.Boolean
  ): scala.Unit = js.native
  def restoreRealElement(fakeElement: ckeditorLib.CKEDITORNs.domNs.element): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def selectionChange(): scala.Unit = js.native
  def selectionChange(checkNow: scala.Boolean): scala.Unit = js.native
  def setActiveEnterMode(enterMode: scala.Double, shiftEnterMode: scala.Double): scala.Unit = js.native
  def setActiveFilter(filter: filter): scala.Unit = js.native
  def setData(data: java.lang.String): scala.Unit = js.native
  def setData(data: java.lang.String, options: ckeditorLib.Anon_Callback): scala.Unit = js.native
  def setKeystroke(keystroke: js.Array[js.Tuple2[scala.Double, java.lang.String | scala.Boolean]]): scala.Unit = js.native
  def setKeystroke(keystroke: scala.Double, behavior: java.lang.String): scala.Unit = js.native
  def setKeystroke(keystroke: scala.Double, behavior: scala.Boolean): scala.Unit = js.native
  def setMode(newMode: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setReadOnly(): scala.Unit = js.native
  def setReadOnly(isReadOnly: scala.Boolean): scala.Unit = js.native
  def setUiColor(color: java.lang.String): scala.Unit = js.native
  def showNotification(
    message: java.lang.String,
    `type`: ckeditorLib.CKEDITORNs.pluginsNs.notificationNs.`type`,
    progressOrDuration: scala.Double
  ): ckeditorLib.CKEDITORNs.pluginsNs.notification = js.native
  def unlockSelection(): scala.Unit = js.native
  def unlockSelection(restore: scala.Boolean): scala.Unit = js.native
  def updateElement(): scala.Unit = js.native
}

