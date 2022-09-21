package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.fileManagement.UploadInfo
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileUploader
  extends StObject
     with Editor[dxFileUploaderOptions] {
  
  /**
    * Cancels the file upload.
    */
  def abortUpload(): Unit = js.native
  /**
    * Cancels the file upload.
    */
  def abortUpload(fileIndex: Double): Unit = js.native
  /**
    * Cancels the file upload.
    */
  def abortUpload(file: File): Unit = js.native
  
  /**
    * Removes a file with the specified index.
    */
  def removeFile(fileIndex: Double): Unit = js.native
  /**
    * Removes a file.
    */
  def removeFile(file: File): Unit = js.native
  
  /**
    * Uploads all the selected files.
    */
  def upload(): Unit = js.native
  /**
    * Uploads a file with the specified index.
    */
  def upload(fileIndex: Double): Unit = js.native
  /**
    * Uploads the specified file.
    */
  def upload(file: File): Unit = js.native
}
object dxFileUploader {
  
  trait BeforeSendEvent
    extends StObject
       with EventInfo[dxFileUploader] {
    
    val file: File
    
    val request: XMLHttpRequest
    
    val uploadInfo: js.UndefOr[UploadInfo] = js.undefined
  }
  object BeforeSendEvent {
    
    inline def apply(component: dxFileUploader, element: DxElement_[HTMLElement], file: File, request: XMLHttpRequest): BeforeSendEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeSendEvent]
    }
    
    extension [Self <: BeforeSendEvent](x: Self) {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setUploadInfo(value: UploadInfo): Self = StObject.set(x, "uploadInfo", value.asInstanceOf[js.Any])
      
      inline def setUploadInfoUndefined: Self = StObject.set(x, "uploadInfo", js.undefined)
    }
  }
  
  type ContentReadyEvent = EventInfo[dxFileUploader]
  
  type DisposingEvent = EventInfo[dxFileUploader]
  
  trait DropZoneEnterEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, PointerEvent | MouseEvent] {
    
    val dropZoneElement: DxElement_[HTMLElement]
  }
  object DropZoneEnterEvent {
    
    inline def apply(
      component: dxFileUploader,
      dropZoneElement: DxElement_[HTMLElement],
      element: DxElement_[HTMLElement]
    ): DropZoneEnterEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropZoneElement = dropZoneElement.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropZoneEnterEvent]
    }
    
    extension [Self <: DropZoneEnterEvent](x: Self) {
      
      inline def setDropZoneElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "dropZoneElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropZoneLeaveEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, PointerEvent | MouseEvent] {
    
    val dropZoneElement: DxElement_[HTMLElement]
  }
  object DropZoneLeaveEvent {
    
    inline def apply(
      component: dxFileUploader,
      dropZoneElement: DxElement_[HTMLElement],
      element: DxElement_[HTMLElement]
    ): DropZoneLeaveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropZoneElement = dropZoneElement.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropZoneLeaveEvent]
    }
    
    extension [Self <: DropZoneLeaveEvent](x: Self) {
      
      inline def setDropZoneElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "dropZoneElement", value.asInstanceOf[js.Any])
    }
  }
  
  type FilesUploadedEvent = EventInfo[dxFileUploader]
  
  type InitializedEvent = InitializedEventInfo[dxFileUploader]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxFileUploader]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxFileUploader, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  trait ProgressEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, Event] {
    
    val bytesLoaded: Double
    
    val bytesTotal: Double
    
    val file: File
    
    val request: XMLHttpRequest
    
    val segmentSize: Double
  }
  object ProgressEvent {
    
    inline def apply(
      bytesLoaded: Double,
      bytesTotal: Double,
      component: dxFileUploader,
      element: DxElement_[HTMLElement],
      file: File,
      request: XMLHttpRequest,
      segmentSize: Double
    ): ProgressEvent = {
      val __obj = js.Dynamic.literal(bytesLoaded = bytesLoaded.asInstanceOf[js.Any], bytesTotal = bytesTotal.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], segmentSize = segmentSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressEvent]
    }
    
    extension [Self <: ProgressEvent](x: Self) {
      
      inline def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
      
      inline def setBytesTotal(value: Double): Self = StObject.set(x, "bytesTotal", value.asInstanceOf[js.Any])
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSegmentSize(value: Double): Self = StObject.set(x, "segmentSize", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties = dxFileUploaderOptions
  
  trait UploadAbortedEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, Event] {
    
    val file: File
    
    var message: String
    
    val request: XMLHttpRequest
  }
  object UploadAbortedEvent {
    
    inline def apply(
      component: dxFileUploader,
      element: DxElement_[HTMLElement],
      file: File,
      message: String,
      request: XMLHttpRequest
    ): UploadAbortedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadAbortedEvent]
    }
    
    extension [Self <: UploadAbortedEvent](x: Self) {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadErrorEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, Event] {
    
    val error: Any
    
    val file: File
    
    var message: String
    
    val request: XMLHttpRequest
  }
  object UploadErrorEvent {
    
    inline def apply(
      component: dxFileUploader,
      element: DxElement_[HTMLElement],
      error: Any,
      file: File,
      message: String,
      request: XMLHttpRequest
    ): UploadErrorEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadErrorEvent]
    }
    
    extension [Self <: UploadErrorEvent](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadStartedEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, Event] {
    
    val file: File
    
    val request: XMLHttpRequest
  }
  object UploadStartedEvent {
    
    inline def apply(component: dxFileUploader, element: DxElement_[HTMLElement], file: File, request: XMLHttpRequest): UploadStartedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadStartedEvent]
    }
    
    extension [Self <: UploadStartedEvent](x: Self) {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadedEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, Event] {
    
    val file: File
    
    var message: String
    
    val request: XMLHttpRequest
  }
  object UploadedEvent {
    
    inline def apply(
      component: dxFileUploader,
      element: DxElement_[HTMLElement],
      file: File,
      message: String,
      request: XMLHttpRequest
    ): UploadedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadedEvent]
    }
    
    extension [Self <: UploadedEvent](x: Self) {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxFileUploader, Event] {
    
    val previousValue: js.UndefOr[js.Array[File]] = js.undefined
    
    val value: js.UndefOr[js.Array[File]] = js.undefined
  }
  object ValueChangedEvent {
    
    inline def apply(component: dxFileUploader, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
    
    extension [Self <: ValueChangedEvent](x: Self) {
      
      inline def setPreviousValue(value: js.Array[File]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setPreviousValueVarargs(value: File*): Self = StObject.set(x, "previousValue", js.Array(value*))
      
      inline def setValue(value: js.Array[File]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: File*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
