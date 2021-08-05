package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.documentFragment
import typings.ckeditor.CKEDITOR.dom.node
import typings.ckeditor.CKEDITOR.dom.range
import typings.ckeditor.CKEDITOR.dom.selection
import typings.ckeditor.CKEDITOR.plugins.copyformatting.state
import typings.ckeditor.CKEDITOR.plugins.notification
import typings.ckeditor.CKEDITOR.plugins.notification.`type`
import typings.ckeditor.CKEDITOR.plugins.widget.repository
import typings.ckeditor.CKEDITOR.style.definition
import typings.ckeditor.anon.Callback
import typings.ckeditor.anon.Title
import typings.ckeditor.ckeditorBooleans.`false`
import typings.ckeditor.ckeditorBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait editor
  extends StObject
     with event {
  
  val activeEnterMode: Double = js.native
  
  val activeFilter: typings.ckeditor.CKEDITOR.filter = js.native
  
  val activeShiftEnterMode: Double = js.native
  
  def addCommand(commandName: String, commandDefinition: commandDefinition): Unit = js.native
  
  def addContentsCss(cssPath: String): Unit = js.native
  
  def addFeature(feature: feature): Boolean = js.native
  
  def addMenuGroup(name: String): Unit = js.native
  def addMenuGroup(name: String, order: Double): Unit = js.native
  
  def addMenuItem(name: String): Unit = js.native
  def addMenuItem(name: String, definition: IMenuItemDefinition): Unit = js.native
  
  def addMenuItems(definitions: StringDictionary[IMenuItemDefinition]): Unit = js.native
  
  def addMode(mode: String, exec: js.Function0[Unit]): Unit = js.native
  
  def addRemoveFormatFilter(func: js.Function1[/* element */ typings.ckeditor.CKEDITOR.dom.element, Boolean]): Unit = js.native
  
  def applyStyle(style: style): Unit = js.native
  
  def attachStyleStateChange(style: style, callback: js.Function1[/* state */ Double, Unit]): Unit = js.native
  
  val blockless: Boolean = js.native
  
  def checkDirty(): Boolean = js.native
  
  val config: typings.ckeditor.CKEDITOR.config = js.native
  
  val container: typings.ckeditor.CKEDITOR.dom.element = js.native
  
  val contextMenu: typings.ckeditor.CKEDITOR.plugins.contextMenu = js.native
  
  var copyFormatting: state = js.native
  
  def createFakeElement(
    realElement: typings.ckeditor.CKEDITOR.dom.element,
    className: String,
    realElementType: String,
    isResizable: Boolean
  ): Unit = js.native
  
  def createFakeParserElement(
    realElement: typings.ckeditor.CKEDITOR.dom.element,
    className: String,
    realElementType: String,
    isResizable: Boolean
  ): Unit = js.native
  
  def createRange(): range = js.native
  
  var dataProcessor: typings.ckeditor.CKEDITOR.dataProcessor = js.native
  
  def destroy(): Unit = js.native
  def destroy(noUpdate: Boolean): Unit = js.native
  
  val document: typings.ckeditor.CKEDITOR.dom.document = js.native
  
  def editable(): typings.ckeditor.CKEDITOR.editable = js.native
  def editable(elementOrEditable: typings.ckeditor.CKEDITOR.dom.element): typings.ckeditor.CKEDITOR.editable = js.native
  def editable(elementOrEditable: typings.ckeditor.CKEDITOR.editable): typings.ckeditor.CKEDITOR.editable = js.native
  
  val element: typings.ckeditor.CKEDITOR.dom.element = js.native
  
  val elementMode: Double = js.native
  
  def elementPath(): typings.ckeditor.CKEDITOR.dom.elementPath = js.native
  def elementPath(startNode: node): typings.ckeditor.CKEDITOR.dom.elementPath = js.native
  
  val enterMode: Double = js.native
  
  def execCommand(commandName: String): Boolean = js.native
  def execCommand(commandName: String, data: js.Any): Boolean = js.native
  
  def extractSelectedHtml(): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: Boolean): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: Boolean, removeEmptyBlock: Boolean): documentFragment | String | Unit = js.native
  def extractSelectedHtml(toString: Unit, removeEmptyBlock: Boolean): documentFragment | String | Unit = js.native
  
  val filter: typings.ckeditor.CKEDITOR.filter = js.native
  
  def focus(): Unit = js.native
  
  val focusManager: typings.ckeditor.CKEDITOR.focusManager = js.native
  
  def forceNextSelectionCheck(): Unit = js.native
  
  def getClipboardData(
    callbackOrOptions: js.Function1[/* data */ js.Any, Unit],
    callback: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  def getClipboardData(callbackOrOptions: Title, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  
  def getColorFromDialog(callback: js.Function1[/* color */ String, Unit]): Unit = js.native
  def getColorFromDialog(callback: js.Function1[/* color */ String, Unit], scope: StringDictionary[js.Any]): Unit = js.native
  
  def getCommand(commandName: String): command = js.native
  
  def getCommandKeystroke(command: String): Double | Null = js.native
  def getCommandKeystroke(command: command): Double | Null = js.native
  
  def getData(): String = js.native
  def getData(internal: Boolean): String = js.native
  
  def getMenuItem(name: String): IMenuItemDefinition = js.native
  
  def getResizable(forContents: Boolean): typings.ckeditor.CKEDITOR.dom.element = js.native
  
  def getSelectedHtml(): documentFragment | String = js.native
  def getSelectedHtml(toString: Boolean): documentFragment | String = js.native
  @JSName("getSelectedHtml")
  def getSelectedHtml_documentFragment(): documentFragment = js.native
  @JSName("getSelectedHtml")
  def getSelectedHtml_false(toString: `false`): documentFragment = js.native
  @JSName("getSelectedHtml")
  def getSelectedHtml_true(toString: `true`): String = js.native
  
  def getSelection(): selection = js.native
  def getSelection(forceRealSelection: Boolean): selection = js.native
  
  def getSnapshot(): String = js.native
  
  def getStylesSet(callback: js.Function1[/* stylesDefinitions */ js.Array[definition], Unit]): Unit = js.native
  
  def getUiColor(): String = js.native
  
  val id: String = js.native
  
  def insertElement(element: typings.ckeditor.CKEDITOR.dom.element): Unit = js.native
  
  def insertHtml(html: String): Unit = js.native
  def insertHtml(html: String, mode: String): Unit = js.native
  def insertHtml(html: String, mode: String, range: range): Unit = js.native
  def insertHtml(html: String, mode: Unit, range: range): Unit = js.native
  
  def insertText(text: String): Unit = js.native
  
  val keystrokeHandler: typings.ckeditor.CKEDITOR.keystrokeHandler = js.native
  
  val lang: js.Any = js.native
  
  val langCode: String = js.native
  
  def loadSnapshot(snapshot: js.Any): Unit = js.native
  
  def lockSelection(): Boolean = js.native
  def lockSelection(sel: selection): Boolean = js.native
  
  val mode: String = js.native
  
  val name: String = js.native
  
  def openDialog(dialogName: String, callback: js.Function0[Unit]): dialog = js.native
  
  val pasteFilter: typings.ckeditor.CKEDITOR.filter = js.native
  
  val plugins: js.Any = js.native
  
  def popup(url: String): Unit = js.native
  def popup(url: String, width: String): Unit = js.native
  def popup(url: String, width: String, height: String): Unit = js.native
  def popup(url: String, width: String, height: String, options: String): Unit = js.native
  def popup(url: String, width: String, height: Double): Unit = js.native
  def popup(url: String, width: String, height: Double, options: String): Unit = js.native
  def popup(url: String, width: String, height: Unit, options: String): Unit = js.native
  def popup(url: String, width: Double): Unit = js.native
  def popup(url: String, width: Double, height: String): Unit = js.native
  def popup(url: String, width: Double, height: String, options: String): Unit = js.native
  def popup(url: String, width: Double, height: Double): Unit = js.native
  def popup(url: String, width: Double, height: Double, options: String): Unit = js.native
  def popup(url: String, width: Double, height: Unit, options: String): Unit = js.native
  def popup(url: String, width: Unit, height: String): Unit = js.native
  def popup(url: String, width: Unit, height: String, options: String): Unit = js.native
  def popup(url: String, width: Unit, height: Double): Unit = js.native
  def popup(url: String, width: Unit, height: Double, options: String): Unit = js.native
  def popup(url: String, width: Unit, height: Unit, options: String): Unit = js.native
  
  val readOnly: Boolean = js.native
  
  def removeMenuItem(name: String): Unit = js.native
  
  def removeStyle(style: style): Unit = js.native
  
  def resetDirty(): Unit = js.native
  
  def resetUndo(): Unit = js.native
  
  def resize(width: String, height: String): Unit = js.native
  def resize(width: String, height: String, isContentHeight: Boolean): Unit = js.native
  def resize(width: String, height: String, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: String, height: String, isContentHeight: Unit, resizeInner: Boolean): Unit = js.native
  def resize(width: String, height: Double): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: Boolean): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: String, height: Double, isContentHeight: Unit, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: String): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: Boolean): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: String, isContentHeight: Unit, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def resize(width: Double, height: Double, isContentHeight: Boolean): Unit = js.native
  def resize(width: Double, height: Double, isContentHeight: Boolean, resizeInner: Boolean): Unit = js.native
  def resize(width: Double, height: Double, isContentHeight: Unit, resizeInner: Boolean): Unit = js.native
  
  def restoreRealElement(fakeElement: typings.ckeditor.CKEDITOR.dom.element): typings.ckeditor.CKEDITOR.dom.element = js.native
  
  def selectionChange(): Unit = js.native
  def selectionChange(checkNow: Boolean): Unit = js.native
  
  def setActiveEnterMode(enterMode: Double, shiftEnterMode: Double): Unit = js.native
  
  def setActiveFilter(filter: typings.ckeditor.CKEDITOR.filter): Unit = js.native
  
  def setData(data: String): Unit = js.native
  def setData(data: String, options: Callback): Unit = js.native
  
  def setKeystroke(keystroke: js.Array[js.Tuple2[Double, String | Boolean]]): Unit = js.native
  def setKeystroke(keystroke: Double, behavior: String): Unit = js.native
  def setKeystroke(keystroke: Double, behavior: Boolean): Unit = js.native
  
  def setMode(newMode: String, callback: js.Function0[Unit]): Unit = js.native
  
  def setReadOnly(): Unit = js.native
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
  
  def setUiColor(color: String): Unit = js.native
  
  val shiftEnterMode: Double = js.native
  
  def showNotification(message: String, `type`: `type`, progressOrDuration: Double): notification = js.native
  
  val status: String = js.native
  
  val tabIndex: Double = js.native
  
  val templates: js.Any = js.native
  
  val title: js.Any = js.native
  
  val toolbar: js.Any = js.native
  
  val ui: typings.ckeditor.CKEDITOR.ui = js.native
  
  def unlockSelection(): Unit = js.native
  def unlockSelection(restore: Boolean): Unit = js.native
  
  def updateElement(): Unit = js.native
  
  val widgets: repository = js.native
  
  val window: typings.ckeditor.CKEDITOR.dom.window = js.native
}
object editor {
  
  trait eventObject extends StObject {
    
    var activeEnterModeChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var activeFilterChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var afterCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var afterInsertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var afterPaste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var afterPasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var afterSetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var afterUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var ariaEditorHelpLabel: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var ariaWidget: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var autogrow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var beforeCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var beforeDestroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var beforeGetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var beforeModeUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var beforeSetMode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var beforeUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var blur: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var change: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var configLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var contentDirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var contentDom: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var contentDomInvalidated: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var contentDomUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var customConfigLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var dataFiltered: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var dataReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var destroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var dialogHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var dialogShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var dirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var doubleclick: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var dragend: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var dragstart: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var drop: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var elementsPathUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var fileUploadRequest: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var fileUploadResponse: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var floatingSpaceLayout: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var focus: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var getData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var getSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var insertElement: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var insertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var insertText: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var instanceReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var key: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var langLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var loadSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var loaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var lockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var maximize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var menuShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var mode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var notificationHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var notificationShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var notificationUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var paste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var pasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var pluginsLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var removeFormatCleanup: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var required: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var resize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var save: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var saveSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var selectionChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var setData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var stylesSet: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var template: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var toDataFormat: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var toHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var unlockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var updateSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var widgetDefinition: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  }
  object eventObject {
    
    inline def apply(): eventObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[eventObject]
    }
    
    extension [Self <: eventObject](x: Self) {
      
      inline def setActiveEnterModeChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "activeEnterModeChange", js.Any.fromFunction1(value))
      
      inline def setActiveEnterModeChangeUndefined: Self = StObject.set(x, "activeEnterModeChange", js.undefined)
      
      inline def setActiveFilterChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "activeFilterChange", js.Any.fromFunction1(value))
      
      inline def setActiveFilterChangeUndefined: Self = StObject.set(x, "activeFilterChange", js.undefined)
      
      inline def setAfterCommandExec(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterCommandExec", js.Any.fromFunction1(value))
      
      inline def setAfterCommandExecUndefined: Self = StObject.set(x, "afterCommandExec", js.undefined)
      
      inline def setAfterInsertHtml(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterInsertHtml", js.Any.fromFunction1(value))
      
      inline def setAfterInsertHtmlUndefined: Self = StObject.set(x, "afterInsertHtml", js.undefined)
      
      inline def setAfterPaste(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterPaste", js.Any.fromFunction1(value))
      
      inline def setAfterPasteFromWord(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterPasteFromWord", js.Any.fromFunction1(value))
      
      inline def setAfterPasteFromWordUndefined: Self = StObject.set(x, "afterPasteFromWord", js.undefined)
      
      inline def setAfterPasteUndefined: Self = StObject.set(x, "afterPaste", js.undefined)
      
      inline def setAfterSetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterSetData", js.Any.fromFunction1(value))
      
      inline def setAfterSetDataUndefined: Self = StObject.set(x, "afterSetData", js.undefined)
      
      inline def setAfterUndoImage(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "afterUndoImage", js.Any.fromFunction1(value))
      
      inline def setAfterUndoImageUndefined: Self = StObject.set(x, "afterUndoImage", js.undefined)
      
      inline def setAriaEditorHelpLabel(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "ariaEditorHelpLabel", js.Any.fromFunction1(value))
      
      inline def setAriaEditorHelpLabelUndefined: Self = StObject.set(x, "ariaEditorHelpLabel", js.undefined)
      
      inline def setAriaWidget(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "ariaWidget", js.Any.fromFunction1(value))
      
      inline def setAriaWidgetUndefined: Self = StObject.set(x, "ariaWidget", js.undefined)
      
      inline def setAutogrow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "autogrow", js.Any.fromFunction1(value))
      
      inline def setAutogrowUndefined: Self = StObject.set(x, "autogrow", js.undefined)
      
      inline def setBeforeCommandExec(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeCommandExec", js.Any.fromFunction1(value))
      
      inline def setBeforeCommandExecUndefined: Self = StObject.set(x, "beforeCommandExec", js.undefined)
      
      inline def setBeforeDestroy(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction1(value))
      
      inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
      
      inline def setBeforeGetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeGetData", js.Any.fromFunction1(value))
      
      inline def setBeforeGetDataUndefined: Self = StObject.set(x, "beforeGetData", js.undefined)
      
      inline def setBeforeModeUnload(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeModeUnload", js.Any.fromFunction1(value))
      
      inline def setBeforeModeUnloadUndefined: Self = StObject.set(x, "beforeModeUnload", js.undefined)
      
      inline def setBeforeSetMode(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeSetMode", js.Any.fromFunction1(value))
      
      inline def setBeforeSetModeUndefined: Self = StObject.set(x, "beforeSetMode", js.undefined)
      
      inline def setBeforeUndoImage(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "beforeUndoImage", js.Any.fromFunction1(value))
      
      inline def setBeforeUndoImageUndefined: Self = StObject.set(x, "beforeUndoImage", js.undefined)
      
      inline def setBlur(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction1(value))
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setConfigLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "configLoaded", js.Any.fromFunction1(value))
      
      inline def setConfigLoadedUndefined: Self = StObject.set(x, "configLoaded", js.undefined)
      
      inline def setContentDirChanged(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDirChanged", js.Any.fromFunction1(value))
      
      inline def setContentDirChangedUndefined: Self = StObject.set(x, "contentDirChanged", js.undefined)
      
      inline def setContentDom(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDom", js.Any.fromFunction1(value))
      
      inline def setContentDomInvalidated(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDomInvalidated", js.Any.fromFunction1(value))
      
      inline def setContentDomInvalidatedUndefined: Self = StObject.set(x, "contentDomInvalidated", js.undefined)
      
      inline def setContentDomUndefined: Self = StObject.set(x, "contentDom", js.undefined)
      
      inline def setContentDomUnload(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "contentDomUnload", js.Any.fromFunction1(value))
      
      inline def setContentDomUnloadUndefined: Self = StObject.set(x, "contentDomUnload", js.undefined)
      
      inline def setCustomConfigLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "customConfigLoaded", js.Any.fromFunction1(value))
      
      inline def setCustomConfigLoadedUndefined: Self = StObject.set(x, "customConfigLoaded", js.undefined)
      
      inline def setDataFiltered(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction1(value))
      
      inline def setDataFilteredUndefined: Self = StObject.set(x, "dataFiltered", js.undefined)
      
      inline def setDataReady(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dataReady", js.Any.fromFunction1(value))
      
      inline def setDataReadyUndefined: Self = StObject.set(x, "dataReady", js.undefined)
      
      inline def setDestroy(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDialogHide(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dialogHide", js.Any.fromFunction1(value))
      
      inline def setDialogHideUndefined: Self = StObject.set(x, "dialogHide", js.undefined)
      
      inline def setDialogShow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dialogShow", js.Any.fromFunction1(value))
      
      inline def setDialogShowUndefined: Self = StObject.set(x, "dialogShow", js.undefined)
      
      inline def setDirChanged(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dirChanged", js.Any.fromFunction1(value))
      
      inline def setDirChangedUndefined: Self = StObject.set(x, "dirChanged", js.undefined)
      
      inline def setDoubleclick(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "doubleclick", js.Any.fromFunction1(value))
      
      inline def setDoubleclickUndefined: Self = StObject.set(x, "doubleclick", js.undefined)
      
      inline def setDragend(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
      
      inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      inline def setDragstart(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
      
      inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      inline def setDrop(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setElementsPathUpdate(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "elementsPathUpdate", js.Any.fromFunction1(value))
      
      inline def setElementsPathUpdateUndefined: Self = StObject.set(x, "elementsPathUpdate", js.undefined)
      
      inline def setFileUploadRequest(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "fileUploadRequest", js.Any.fromFunction1(value))
      
      inline def setFileUploadRequestUndefined: Self = StObject.set(x, "fileUploadRequest", js.undefined)
      
      inline def setFileUploadResponse(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "fileUploadResponse", js.Any.fromFunction1(value))
      
      inline def setFileUploadResponseUndefined: Self = StObject.set(x, "fileUploadResponse", js.undefined)
      
      inline def setFloatingSpaceLayout(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "floatingSpaceLayout", js.Any.fromFunction1(value))
      
      inline def setFloatingSpaceLayoutUndefined: Self = StObject.set(x, "floatingSpaceLayout", js.undefined)
      
      inline def setFocus(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setGetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      inline def setGetSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "getSnapshot", js.Any.fromFunction1(value))
      
      inline def setGetSnapshotUndefined: Self = StObject.set(x, "getSnapshot", js.undefined)
      
      inline def setInsertElement(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "insertElement", js.Any.fromFunction1(value))
      
      inline def setInsertElementUndefined: Self = StObject.set(x, "insertElement", js.undefined)
      
      inline def setInsertHtml(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "insertHtml", js.Any.fromFunction1(value))
      
      inline def setInsertHtmlUndefined: Self = StObject.set(x, "insertHtml", js.undefined)
      
      inline def setInsertText(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "insertText", js.Any.fromFunction1(value))
      
      inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
      
      inline def setInstanceReady(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "instanceReady", js.Any.fromFunction1(value))
      
      inline def setInstanceReadyUndefined: Self = StObject.set(x, "instanceReady", js.undefined)
      
      inline def setKey(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLangLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "langLoaded", js.Any.fromFunction1(value))
      
      inline def setLangLoadedUndefined: Self = StObject.set(x, "langLoaded", js.undefined)
      
      inline def setLoadSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "loadSnapshot", js.Any.fromFunction1(value))
      
      inline def setLoadSnapshotUndefined: Self = StObject.set(x, "loadSnapshot", js.undefined)
      
      inline def setLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setLockSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "lockSnapshot", js.Any.fromFunction1(value))
      
      inline def setLockSnapshotUndefined: Self = StObject.set(x, "lockSnapshot", js.undefined)
      
      inline def setMaximize(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "maximize", js.Any.fromFunction1(value))
      
      inline def setMaximizeUndefined: Self = StObject.set(x, "maximize", js.undefined)
      
      inline def setMenuShow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "menuShow", js.Any.fromFunction1(value))
      
      inline def setMenuShowUndefined: Self = StObject.set(x, "menuShow", js.undefined)
      
      inline def setMode(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNotificationHide(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "notificationHide", js.Any.fromFunction1(value))
      
      inline def setNotificationHideUndefined: Self = StObject.set(x, "notificationHide", js.undefined)
      
      inline def setNotificationShow(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "notificationShow", js.Any.fromFunction1(value))
      
      inline def setNotificationShowUndefined: Self = StObject.set(x, "notificationShow", js.undefined)
      
      inline def setNotificationUpdate(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "notificationUpdate", js.Any.fromFunction1(value))
      
      inline def setNotificationUpdateUndefined: Self = StObject.set(x, "notificationUpdate", js.undefined)
      
      inline def setPaste(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      inline def setPasteFromWord(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "pasteFromWord", js.Any.fromFunction1(value))
      
      inline def setPasteFromWordUndefined: Self = StObject.set(x, "pasteFromWord", js.undefined)
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPluginsLoaded(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "pluginsLoaded", js.Any.fromFunction1(value))
      
      inline def setPluginsLoadedUndefined: Self = StObject.set(x, "pluginsLoaded", js.undefined)
      
      inline def setReadOnly(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "readOnly", js.Any.fromFunction1(value))
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRemoveFormatCleanup(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "removeFormatCleanup", js.Any.fromFunction1(value))
      
      inline def setRemoveFormatCleanupUndefined: Self = StObject.set(x, "removeFormatCleanup", js.undefined)
      
      inline def setRequired(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSave(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      inline def setSaveSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "saveSnapshot", js.Any.fromFunction1(value))
      
      inline def setSaveSnapshotUndefined: Self = StObject.set(x, "saveSnapshot", js.undefined)
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setSelectionChange(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setSetData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      inline def setStylesSet(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "stylesSet", js.Any.fromFunction1(value))
      
      inline def setStylesSetUndefined: Self = StObject.set(x, "stylesSet", js.undefined)
      
      inline def setTemplate(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setToDataFormat(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "toDataFormat", js.Any.fromFunction1(value))
      
      inline def setToDataFormatUndefined: Self = StObject.set(x, "toDataFormat", js.undefined)
      
      inline def setToHtml(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "toHtml", js.Any.fromFunction1(value))
      
      inline def setToHtmlUndefined: Self = StObject.set(x, "toHtml", js.undefined)
      
      inline def setUnlockSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "unlockSnapshot", js.Any.fromFunction1(value))
      
      inline def setUnlockSnapshotUndefined: Self = StObject.set(x, "unlockSnapshot", js.undefined)
      
      inline def setUpdateSnapshot(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "updateSnapshot", js.Any.fromFunction1(value))
      
      inline def setUpdateSnapshotUndefined: Self = StObject.set(x, "updateSnapshot", js.undefined)
      
      inline def setWidgetDefinition(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "widgetDefinition", js.Any.fromFunction1(value))
      
      inline def setWidgetDefinitionUndefined: Self = StObject.set(x, "widgetDefinition", js.undefined)
    }
  }
}
