package typings.ckeditor.CKEDITOR.editor

import typings.ckeditor.CKEDITOR.eventInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait eventObject extends js.Object {
  
  var activeEnterModeChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var activeFilterChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var afterCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var afterInsertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var afterPaste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var afterPasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var afterSetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var afterUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var ariaEditorHelpLabel: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var ariaWidget: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var autogrow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var beforeCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var beforeDestroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var beforeGetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var beforeModeUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var beforeSetMode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var beforeUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var blur: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var change: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var configLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var contentDirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var contentDom: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var contentDomInvalidated: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var contentDomUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var customConfigLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var dataFiltered: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var dataReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var destroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var dialogHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var dialogShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var dirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var doubleclick: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var dragend: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var dragstart: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var drop: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var elementsPathUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var fileUploadRequest: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var fileUploadResponse: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var floatingSpaceLayout: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var focus: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var getData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var getSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var insertElement: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var insertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var insertText: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var instanceReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var key: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var langLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var loadSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var loaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var lockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var maximize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var menuShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var mode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var notificationHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var notificationShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var notificationUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var paste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var pasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var pluginsLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var readOnly: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var removeFormatCleanup: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var required: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var resize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var save: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var saveSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var selectionChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var setData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var stylesSet: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var template: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var toDataFormat: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var toHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var unlockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var updateSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  
  var widgetDefinition: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
}
object eventObject {
  
  @scala.inline
  def apply(): eventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[eventObject]
  }
  
  @scala.inline
  implicit class eventObjectOps[Self <: eventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveEnterModeChange(value: /* evt */ eventInfo => Unit): Self = this.set("activeEnterModeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActiveEnterModeChange: Self = this.set("activeEnterModeChange", js.undefined)
    
    @scala.inline
    def setActiveFilterChange(value: /* evt */ eventInfo => Unit): Self = this.set("activeFilterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActiveFilterChange: Self = this.set("activeFilterChange", js.undefined)
    
    @scala.inline
    def setAfterCommandExec(value: /* evt */ eventInfo => Unit): Self = this.set("afterCommandExec", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterCommandExec: Self = this.set("afterCommandExec", js.undefined)
    
    @scala.inline
    def setAfterInsertHtml(value: /* evt */ eventInfo => Unit): Self = this.set("afterInsertHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterInsertHtml: Self = this.set("afterInsertHtml", js.undefined)
    
    @scala.inline
    def setAfterPaste(value: /* evt */ eventInfo => Unit): Self = this.set("afterPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterPaste: Self = this.set("afterPaste", js.undefined)
    
    @scala.inline
    def setAfterPasteFromWord(value: /* evt */ eventInfo => Unit): Self = this.set("afterPasteFromWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterPasteFromWord: Self = this.set("afterPasteFromWord", js.undefined)
    
    @scala.inline
    def setAfterSetData(value: /* evt */ eventInfo => Unit): Self = this.set("afterSetData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterSetData: Self = this.set("afterSetData", js.undefined)
    
    @scala.inline
    def setAfterUndoImage(value: /* evt */ eventInfo => Unit): Self = this.set("afterUndoImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterUndoImage: Self = this.set("afterUndoImage", js.undefined)
    
    @scala.inline
    def setAriaEditorHelpLabel(value: /* evt */ eventInfo => Unit): Self = this.set("ariaEditorHelpLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAriaEditorHelpLabel: Self = this.set("ariaEditorHelpLabel", js.undefined)
    
    @scala.inline
    def setAriaWidget(value: /* evt */ eventInfo => Unit): Self = this.set("ariaWidget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAriaWidget: Self = this.set("ariaWidget", js.undefined)
    
    @scala.inline
    def setAutogrow(value: /* evt */ eventInfo => Unit): Self = this.set("autogrow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutogrow: Self = this.set("autogrow", js.undefined)
    
    @scala.inline
    def setBeforeCommandExec(value: /* evt */ eventInfo => Unit): Self = this.set("beforeCommandExec", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeCommandExec: Self = this.set("beforeCommandExec", js.undefined)
    
    @scala.inline
    def setBeforeDestroy(value: /* evt */ eventInfo => Unit): Self = this.set("beforeDestroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeGetData(value: /* evt */ eventInfo => Unit): Self = this.set("beforeGetData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeGetData: Self = this.set("beforeGetData", js.undefined)
    
    @scala.inline
    def setBeforeModeUnload(value: /* evt */ eventInfo => Unit): Self = this.set("beforeModeUnload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeModeUnload: Self = this.set("beforeModeUnload", js.undefined)
    
    @scala.inline
    def setBeforeSetMode(value: /* evt */ eventInfo => Unit): Self = this.set("beforeSetMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSetMode: Self = this.set("beforeSetMode", js.undefined)
    
    @scala.inline
    def setBeforeUndoImage(value: /* evt */ eventInfo => Unit): Self = this.set("beforeUndoImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeUndoImage: Self = this.set("beforeUndoImage", js.undefined)
    
    @scala.inline
    def setBlur(value: /* evt */ eventInfo => Unit): Self = this.set("blur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setChange(value: /* evt */ eventInfo => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setConfigLoaded(value: /* evt */ eventInfo => Unit): Self = this.set("configLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConfigLoaded: Self = this.set("configLoaded", js.undefined)
    
    @scala.inline
    def setContentDirChanged(value: /* evt */ eventInfo => Unit): Self = this.set("contentDirChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentDirChanged: Self = this.set("contentDirChanged", js.undefined)
    
    @scala.inline
    def setContentDom(value: /* evt */ eventInfo => Unit): Self = this.set("contentDom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentDom: Self = this.set("contentDom", js.undefined)
    
    @scala.inline
    def setContentDomInvalidated(value: /* evt */ eventInfo => Unit): Self = this.set("contentDomInvalidated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentDomInvalidated: Self = this.set("contentDomInvalidated", js.undefined)
    
    @scala.inline
    def setContentDomUnload(value: /* evt */ eventInfo => Unit): Self = this.set("contentDomUnload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentDomUnload: Self = this.set("contentDomUnload", js.undefined)
    
    @scala.inline
    def setCustomConfigLoaded(value: /* evt */ eventInfo => Unit): Self = this.set("customConfigLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomConfigLoaded: Self = this.set("customConfigLoaded", js.undefined)
    
    @scala.inline
    def setDataFiltered(value: /* evt */ eventInfo => Unit): Self = this.set("dataFiltered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataFiltered: Self = this.set("dataFiltered", js.undefined)
    
    @scala.inline
    def setDataReady(value: /* evt */ eventInfo => Unit): Self = this.set("dataReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataReady: Self = this.set("dataReady", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* evt */ eventInfo => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDialogHide(value: /* evt */ eventInfo => Unit): Self = this.set("dialogHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDialogHide: Self = this.set("dialogHide", js.undefined)
    
    @scala.inline
    def setDialogShow(value: /* evt */ eventInfo => Unit): Self = this.set("dialogShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDialogShow: Self = this.set("dialogShow", js.undefined)
    
    @scala.inline
    def setDirChanged(value: /* evt */ eventInfo => Unit): Self = this.set("dirChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDirChanged: Self = this.set("dirChanged", js.undefined)
    
    @scala.inline
    def setDoubleclick(value: /* evt */ eventInfo => Unit): Self = this.set("doubleclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleclick: Self = this.set("doubleclick", js.undefined)
    
    @scala.inline
    def setDragend(value: /* evt */ eventInfo => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* evt */ eventInfo => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setDrop(value: /* evt */ eventInfo => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setElementsPathUpdate(value: /* evt */ eventInfo => Unit): Self = this.set("elementsPathUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteElementsPathUpdate: Self = this.set("elementsPathUpdate", js.undefined)
    
    @scala.inline
    def setFileUploadRequest(value: /* evt */ eventInfo => Unit): Self = this.set("fileUploadRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFileUploadRequest: Self = this.set("fileUploadRequest", js.undefined)
    
    @scala.inline
    def setFileUploadResponse(value: /* evt */ eventInfo => Unit): Self = this.set("fileUploadResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFileUploadResponse: Self = this.set("fileUploadResponse", js.undefined)
    
    @scala.inline
    def setFloatingSpaceLayout(value: /* evt */ eventInfo => Unit): Self = this.set("floatingSpaceLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFloatingSpaceLayout: Self = this.set("floatingSpaceLayout", js.undefined)
    
    @scala.inline
    def setFocus(value: /* evt */ eventInfo => Unit): Self = this.set("focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setGetData(value: /* evt */ eventInfo => Unit): Self = this.set("getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetSnapshot(value: /* evt */ eventInfo => Unit): Self = this.set("getSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSnapshot: Self = this.set("getSnapshot", js.undefined)
    
    @scala.inline
    def setInsertElement(value: /* evt */ eventInfo => Unit): Self = this.set("insertElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertElement: Self = this.set("insertElement", js.undefined)
    
    @scala.inline
    def setInsertHtml(value: /* evt */ eventInfo => Unit): Self = this.set("insertHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertHtml: Self = this.set("insertHtml", js.undefined)
    
    @scala.inline
    def setInsertText(value: /* evt */ eventInfo => Unit): Self = this.set("insertText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setInstanceReady(value: /* evt */ eventInfo => Unit): Self = this.set("instanceReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInstanceReady: Self = this.set("instanceReady", js.undefined)
    
    @scala.inline
    def setKey(value: /* evt */ eventInfo => Unit): Self = this.set("key", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLangLoaded(value: /* evt */ eventInfo => Unit): Self = this.set("langLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLangLoaded: Self = this.set("langLoaded", js.undefined)
    
    @scala.inline
    def setLoadSnapshot(value: /* evt */ eventInfo => Unit): Self = this.set("loadSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadSnapshot: Self = this.set("loadSnapshot", js.undefined)
    
    @scala.inline
    def setLoaded(value: /* evt */ eventInfo => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setLockSnapshot(value: /* evt */ eventInfo => Unit): Self = this.set("lockSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLockSnapshot: Self = this.set("lockSnapshot", js.undefined)
    
    @scala.inline
    def setMaximize(value: /* evt */ eventInfo => Unit): Self = this.set("maximize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMaximize: Self = this.set("maximize", js.undefined)
    
    @scala.inline
    def setMenuShow(value: /* evt */ eventInfo => Unit): Self = this.set("menuShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuShow: Self = this.set("menuShow", js.undefined)
    
    @scala.inline
    def setMode(value: /* evt */ eventInfo => Unit): Self = this.set("mode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNotificationHide(value: /* evt */ eventInfo => Unit): Self = this.set("notificationHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotificationHide: Self = this.set("notificationHide", js.undefined)
    
    @scala.inline
    def setNotificationShow(value: /* evt */ eventInfo => Unit): Self = this.set("notificationShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotificationShow: Self = this.set("notificationShow", js.undefined)
    
    @scala.inline
    def setNotificationUpdate(value: /* evt */ eventInfo => Unit): Self = this.set("notificationUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotificationUpdate: Self = this.set("notificationUpdate", js.undefined)
    
    @scala.inline
    def setPaste(value: /* evt */ eventInfo => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPasteFromWord(value: /* evt */ eventInfo => Unit): Self = this.set("pasteFromWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePasteFromWord: Self = this.set("pasteFromWord", js.undefined)
    
    @scala.inline
    def setPluginsLoaded(value: /* evt */ eventInfo => Unit): Self = this.set("pluginsLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePluginsLoaded: Self = this.set("pluginsLoaded", js.undefined)
    
    @scala.inline
    def setReadOnly(value: /* evt */ eventInfo => Unit): Self = this.set("readOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRemoveFormatCleanup(value: /* evt */ eventInfo => Unit): Self = this.set("removeFormatCleanup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveFormatCleanup: Self = this.set("removeFormatCleanup", js.undefined)
    
    @scala.inline
    def setRequired(value: /* evt */ eventInfo => Unit): Self = this.set("required", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResize(value: /* evt */ eventInfo => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSave(value: /* evt */ eventInfo => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setSaveSnapshot(value: /* evt */ eventInfo => Unit): Self = this.set("saveSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveSnapshot: Self = this.set("saveSnapshot", js.undefined)
    
    @scala.inline
    def setSelectionChange(value: /* evt */ eventInfo => Unit): Self = this.set("selectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectionChange: Self = this.set("selectionChange", js.undefined)
    
    @scala.inline
    def setSetData(value: /* evt */ eventInfo => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setStylesSet(value: /* evt */ eventInfo => Unit): Self = this.set("stylesSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStylesSet: Self = this.set("stylesSet", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* evt */ eventInfo => Unit): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setToDataFormat(value: /* evt */ eventInfo => Unit): Self = this.set("toDataFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToDataFormat: Self = this.set("toDataFormat", js.undefined)
    
    @scala.inline
    def setToHtml(value: /* evt */ eventInfo => Unit): Self = this.set("toHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToHtml: Self = this.set("toHtml", js.undefined)
    
    @scala.inline
    def setUnlockSnapshot(value: /* evt */ eventInfo => Unit): Self = this.set("unlockSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnlockSnapshot: Self = this.set("unlockSnapshot", js.undefined)
    
    @scala.inline
    def setUpdateSnapshot(value: /* evt */ eventInfo => Unit): Self = this.set("updateSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateSnapshot: Self = this.set("updateSnapshot", js.undefined)
    
    @scala.inline
    def setWidgetDefinition(value: /* evt */ eventInfo => Unit): Self = this.set("widgetDefinition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWidgetDefinition: Self = this.set("widgetDefinition", js.undefined)
  }
}
