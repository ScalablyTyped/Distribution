package typings.baseui

import typings.react.mod.DragEvent
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.DataTransferItem
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderMod {
  
  @JSImport("baseui/file-uploader", "FileUploader")
  @js.native
  val FileUploader: FC[FileUploaderProps] = js.native
  
  @JSImport("baseui/file-uploader", "StyledContentMessage")
  @js.native
  val StyledContentMessage: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/file-uploader", "StyledErrorMessage")
  @js.native
  val StyledErrorMessage: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/file-uploader", "StyledFileDragAndDrop")
  @js.native
  val StyledFileDragAndDrop: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/file-uploader", "StyledHiddenInput")
  @js.native
  val StyledHiddenInput: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/file-uploader", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[File], 
    /* event */ SyntheticEvent[HTMLElement, Event], 
    js.Any
  ]
  
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[File], 
    /* rejected */ js.Array[File], 
    /* event */ SyntheticEvent[HTMLElement, Event], 
    js.Any
  ]
  
  trait FileUploaderOverrides[T] extends StObject {
    
    var ButtonComponent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var ContentMessage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var ContentSeparator: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var ErrorMessage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var FileDragAndDrop: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var HiddenInput: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var ProgressMessage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var Spinner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
  }
  object FileUploaderOverrides {
    
    inline def apply[T](): FileUploaderOverrides[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploaderOverrides[T]]
    }
    
    extension [Self <: FileUploaderOverrides[?], T](x: Self & FileUploaderOverrides[T]) {
      
      inline def setButtonComponent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "ButtonComponent", value.asInstanceOf[js.Any])
      
      inline def setButtonComponentUndefined: Self = StObject.set(x, "ButtonComponent", js.undefined)
      
      inline def setContentMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "ContentMessage", value.asInstanceOf[js.Any])
      
      inline def setContentMessageUndefined: Self = StObject.set(x, "ContentMessage", js.undefined)
      
      inline def setContentSeparator(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "ContentSeparator", value.asInstanceOf[js.Any])
      
      inline def setContentSeparatorUndefined: Self = StObject.set(x, "ContentSeparator", js.undefined)
      
      inline def setErrorMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
      
      inline def setFileDragAndDrop(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "FileDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setFileDragAndDropUndefined: Self = StObject.set(x, "FileDragAndDrop", js.undefined)
      
      inline def setHiddenInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "HiddenInput", value.asInstanceOf[js.Any])
      
      inline def setHiddenInputUndefined: Self = StObject.set(x, "HiddenInput", js.undefined)
      
      inline def setProgressMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "ProgressMessage", value.asInstanceOf[js.Any])
      
      inline def setProgressMessageUndefined: Self = StObject.set(x, "ProgressMessage", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSpinner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "Spinner", js.undefined)
    }
  }
  
  trait FileUploaderProps extends StObject {
    
    var accept: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var disableClick: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var getDataTransferItems: js.UndefOr[GetDataTransferItems] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var minSize: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement], js.Any]] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], js.Any]] = js.undefined
    
    var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], js.Any]] = js.undefined
    
    var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], js.Any]] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], js.Any]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], js.Any]] = js.undefined
    
    var onDrop: js.UndefOr[DropFilesEventHandler] = js.undefined
    
    var onDropAccepted: js.UndefOr[DropFileEventHandler] = js.undefined
    
    var onDropRejected: js.UndefOr[DropFileEventHandler] = js.undefined
    
    var onFileDialogCancel: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement], js.Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLElement], js.Any]] = js.undefined
    
    var onRetry: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var overrides: js.UndefOr[FileUploaderOverrides[StyleProps]] = js.undefined
    
    var preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
    
    var progressAmount: js.UndefOr[Double] = js.undefined
    
    var progressMessage: js.UndefOr[String] = js.undefined
  }
  object FileUploaderProps {
    
    inline def apply(): FileUploaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploaderProps]
    }
    
    extension [Self <: FileUploaderProps](x: Self) {
      
      inline def setAccept(value: String | js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      inline def setDisableClick(value: Boolean): Self = StObject.set(x, "disableClick", value.asInstanceOf[js.Any])
      
      inline def setDisableClickUndefined: Self = StObject.set(x, "disableClick", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setGetDataTransferItems(value: /* event */ SyntheticEvent[js.Any, Event] => js.Promise[js.Array[File | DataTransferItem]]): Self = StObject.set(x, "getDataTransferItems", js.Any.fromFunction1(value))
      
      inline def setGetDataTransferItemsUndefined: Self = StObject.set(x, "getDataTransferItems", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* event */ FocusEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCancel(value: () => js.Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDragEnter(value: /* event */ DragEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: /* event */ DragEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: /* event */ DragEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: /* event */ DragEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDrop(
        value: (/* accepted */ js.Array[File], /* rejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any
      ): Self = StObject.set(x, "onDrop", js.Any.fromFunction3(value))
      
      inline def setOnDropAccepted(
        value: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any
      ): Self = StObject.set(x, "onDropAccepted", js.Any.fromFunction2(value))
      
      inline def setOnDropAcceptedUndefined: Self = StObject.set(x, "onDropAccepted", js.undefined)
      
      inline def setOnDropRejected(
        value: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any
      ): Self = StObject.set(x, "onDropRejected", js.Any.fromFunction2(value))
      
      inline def setOnDropRejectedUndefined: Self = StObject.set(x, "onDropRejected", js.undefined)
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnFileDialogCancel(value: () => js.Any): Self = StObject.set(x, "onFileDialogCancel", js.Any.fromFunction0(value))
      
      inline def setOnFileDialogCancelUndefined: Self = StObject.set(x, "onFileDialogCancel", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => js.Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnRetry(value: () => js.Any): Self = StObject.set(x, "onRetry", js.Any.fromFunction0(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      inline def setOverrides(value: FileUploaderOverrides[StyleProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPreventDropOnDocument(value: Boolean): Self = StObject.set(x, "preventDropOnDocument", value.asInstanceOf[js.Any])
      
      inline def setPreventDropOnDocumentUndefined: Self = StObject.set(x, "preventDropOnDocument", js.undefined)
      
      inline def setProgressAmount(value: Double): Self = StObject.set(x, "progressAmount", value.asInstanceOf[js.Any])
      
      inline def setProgressAmountUndefined: Self = StObject.set(x, "progressAmount", js.undefined)
      
      inline def setProgressMessage(value: String): Self = StObject.set(x, "progressMessage", value.asInstanceOf[js.Any])
      
      inline def setProgressMessageUndefined: Self = StObject.set(x, "progressMessage", js.undefined)
    }
  }
  
  type GetDataTransferItems = js.Function1[
    /* event */ SyntheticEvent[js.Any, Event], 
    js.Promise[js.Array[File | DataTransferItem]]
  ]
  
  trait StyleProps extends StObject {
    
    @JSName("$afterFileDrop")
    var $afterFileDrop: Boolean
    
    @JSName("$isDisabled")
    var $isDisabled: Boolean
    
    @JSName("$isDragAccept")
    var $isDragAccept: Boolean
    
    @JSName("$isDragActive")
    var $isDragActive: Boolean
    
    @JSName("$isDragReject")
    var $isDragReject: Boolean
    
    @JSName("$isFocused")
    var $isFocused: Boolean
  }
  object StyleProps {
    
    inline def apply(
      $afterFileDrop: Boolean,
      $isDisabled: Boolean,
      $isDragAccept: Boolean,
      $isDragActive: Boolean,
      $isDragReject: Boolean,
      $isFocused: Boolean
    ): StyleProps = {
      val __obj = js.Dynamic.literal($afterFileDrop = $afterFileDrop.asInstanceOf[js.Any], $isDisabled = $isDisabled.asInstanceOf[js.Any], $isDragAccept = $isDragAccept.asInstanceOf[js.Any], $isDragActive = $isDragActive.asInstanceOf[js.Any], $isDragReject = $isDragReject.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def set$afterFileDrop(value: Boolean): Self = StObject.set(x, "$afterFileDrop", value.asInstanceOf[js.Any])
      
      inline def set$isDisabled(value: Boolean): Self = StObject.set(x, "$isDisabled", value.asInstanceOf[js.Any])
      
      inline def set$isDragAccept(value: Boolean): Self = StObject.set(x, "$isDragAccept", value.asInstanceOf[js.Any])
      
      inline def set$isDragActive(value: Boolean): Self = StObject.set(x, "$isDragActive", value.asInstanceOf[js.Any])
      
      inline def set$isDragReject(value: Boolean): Self = StObject.set(x, "$isDragReject", value.asInstanceOf[js.Any])
      
      inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    }
  }
}
