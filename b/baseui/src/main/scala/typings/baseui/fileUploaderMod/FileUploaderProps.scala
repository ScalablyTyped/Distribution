package typings.baseui.fileUploaderMod

import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.DataTransferItem
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUploaderProps extends js.Object {
  
  var accept: js.UndefOr[String | js.Array[String]] = js.native
  
  var disableClick: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var getDataTransferItems: js.UndefOr[GetDataTransferItems] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement], _]] = js.native
  
  var onCancel: js.UndefOr[js.Function0[_]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], _]] = js.native
  
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.native
  
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.native
  
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.native
  
  var onDrop: js.UndefOr[DropFilesEventHandler] = js.native
  
  var onDropAccepted: js.UndefOr[DropFileEventHandler] = js.native
  
  var onDropRejected: js.UndefOr[DropFileEventHandler] = js.native
  
  var onFileDialogCancel: js.UndefOr[js.Function0[_]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement], _]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLElement], _]] = js.native
  
  var onRetry: js.UndefOr[js.Function0[_]] = js.native
  
  var overrides: js.UndefOr[FileUploaderOverrides[StyleProps]] = js.native
  
  var preventDropOnDocument: js.UndefOr[Boolean] = js.native
  
  var progressAmount: js.UndefOr[Double] = js.native
  
  var progressMessage: js.UndefOr[String] = js.native
}
object FileUploaderProps {
  
  @scala.inline
  def apply(): FileUploaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploaderProps]
  }
  
  @scala.inline
  implicit class FileUploaderPropsOps[Self <: FileUploaderProps] (val x: Self) extends AnyVal {
    
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
    def setAcceptVarargs(value: String*): Self = this.set("accept", js.Array(value :_*))
    
    @scala.inline
    def setAccept(value: String | js.Array[String]): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setDisableClick(value: Boolean): Self = this.set("disableClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableClick: Self = this.set("disableClick", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setGetDataTransferItems(value: /* event */ SyntheticEvent[js.Any, Event] => js.Promise[js.Array[File | DataTransferItem]]): Self = this.set("getDataTransferItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDataTransferItems: Self = this.set("getDataTransferItems", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* event */ FocusEvent[HTMLElement] => _): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => _): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: /* event */ DragEvent[HTMLElement] => _): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: /* event */ DragEvent[HTMLElement] => _): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: /* event */ DragEvent[HTMLElement] => _): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* event */ DragEvent[HTMLElement] => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(
      value: (/* accepted */ js.Array[File], /* rejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any
    ): Self = this.set("onDrop", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDropAccepted(
      value: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any
    ): Self = this.set("onDropAccepted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDropAccepted: Self = this.set("onDropAccepted", js.undefined)
    
    @scala.inline
    def setOnDropRejected(
      value: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any
    ): Self = this.set("onDropRejected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDropRejected: Self = this.set("onDropRejected", js.undefined)
    
    @scala.inline
    def setOnFileDialogCancel(value: () => _): Self = this.set("onFileDialogCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFileDialogCancel: Self = this.set("onFileDialogCancel", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ FocusEvent[HTMLElement] => _): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => _): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnRetry(value: () => _): Self = this.set("onRetry", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRetry: Self = this.set("onRetry", js.undefined)
    
    @scala.inline
    def setOverrides(value: FileUploaderOverrides[StyleProps]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPreventDropOnDocument(value: Boolean): Self = this.set("preventDropOnDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDropOnDocument: Self = this.set("preventDropOnDocument", js.undefined)
    
    @scala.inline
    def setProgressAmount(value: Double): Self = this.set("progressAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressAmount: Self = this.set("progressAmount", js.undefined)
    
    @scala.inline
    def setProgressMessage(value: String): Self = this.set("progressMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressMessage: Self = this.set("progressMessage", js.undefined)
  }
}
