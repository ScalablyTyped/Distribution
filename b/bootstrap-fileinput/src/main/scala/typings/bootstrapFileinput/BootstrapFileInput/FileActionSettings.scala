package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileActionSettings extends js.Object {
  
  /**
    * CSS class for the download button in each file thumbnail.
    */
  var downloadClass: js.UndefOr[String] = js.native
  
  /**
    * icon for download button to be displayed in each file thumbnail.
    */
  var downloadIcon: js.UndefOr[String] = js.native
  
  /**
    * title for download button in each file thumbnail.
    */
  var downloadTitle: js.UndefOr[String] = js.native
  
  /**
    * CSS class for the drag button in each file thumbnail (to sort / rearrange items in initial preview).
    */
  var dragClass: js.UndefOr[String] = js.native
  
  /**
    * icon for drag button to be displayed in each file thumbnail (to sort / rearrange items in initial preview).
    */
  var dragIcon: js.UndefOr[String] = js.native
  
  /**
    * the configuration for the Sortable plugin that will allow you to control the drag settings.
    */
  var dragSettings: js.UndefOr[js.Object] = js.native
  
  /**
    * title for drag button in each file thumbnail (to sort / rearrange items in initial preview).
    */
  var dragTitle: js.UndefOr[String] = js.native
  
  /**
    * an indicator (HTML markup) for error in upload displayed in each file thumbnail.
    */
  var indicatorError: js.UndefOr[String] = js.native
  
  /**
    * title to display on hover of indicator for error in upload in each file thumbnail.
    */
  var indicatorErrorTitle: js.UndefOr[String] = js.native
  
  /**
    * an indicator (HTML markup) for ongoing upload displayed in each file thumbnail.
    */
  var indicatorLoading: js.UndefOr[String] = js.native
  
  /**
    * title to display on hover of indicator for ongoing upload in each file thumbnail.
    */
  var indicatorLoadingTitle: js.UndefOr[String] = js.native
  
  /**
    * an indicator (HTML markup) for new pending upload displayed in each file thumbnail.
    */
  var indicatorNew: js.UndefOr[String] = js.native
  
  /**
    * title to display on hover of indicator for new pending upload in each file thumbnail.
    */
  var indicatorNewTitle: js.UndefOr[String] = js.native
  
  /**
    * an indicator (HTML markup) for paused upload displayed in each file thumbnail (applicable for resumable uploads when enableResumableUpload property to true).
    */
  var indicatorPaused: js.UndefOr[String] = js.native
  
  /**
    * title to display on hover of indicator for paused upload in each file thumbnail (applicable for resumable uploads when enableResumableUpload property to true).
    */
  var indicatorPausedTitle: js.UndefOr[String] = js.native
  
  /**
    * an indicator (HTML markup) for successful upload displayed in each file thumbnail.
    */
  var indicatorSuccess: js.UndefOr[String] = js.native
  
  /**
    * title to display on hover of indicator for successful in each file thumbnail.
    */
  var indicatorSuccessTitle: js.UndefOr[String] = js.native
  
  /**
    * CSS class for the remove button in each file thumbnail.
    */
  var removeClass: js.UndefOr[String] = js.native
  
  /**
    * icon for remove button to be displayed in each file thumbnail.
    */
  var removeIcon: js.UndefOr[String] = js.native
  
  /**
    * title for remove button in each file thumbnail.
    */
  var removeTitle: js.UndefOr[String] = js.native
  
  /**
    * whether to show the download button in the thumbnail.
    * @default true
    */
  var showDownload: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  /**
    * whether to show the drag button in the thumbnail (applicable only for initial preview content)
    * @default true
    */
  var showDrag: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  /**
    * whether to show the remove button in the thumbnail.
    * @default true
    */
  var showRemove: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  /**
    * whether to show the upload button in the thumbnail.
    * @default true // will be always false for resumable uploads
    */
  var showUpload: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  /**
    * whether to show the zoom button in the thumbnail.
    * @default true
    */
  var showZoom: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  /**
    * CSS class for the remove button in each file thumbnail.
    */
  var uploadClass: js.UndefOr[String] = js.native
  
  /**
    * icon for upload button to be displayed in each file thumbnail.
    */
  var uploadIcon: js.UndefOr[String] = js.native
  
  /**
    * title to be displayed for upload button after an upload error is encountered from the server to allow retry of the upload.
    * This will be rendered in such a case for the errored file thumbnail when retryErrorUploads is set to true.
    */
  var uploadRetryIcon: js.UndefOr[String] = js.native
  
  /**
    * title for remove button in each file thumbnail.
    */
  var uploadTitle: js.UndefOr[String] = js.native
  
  /**
    * CSS class for the zoom button in each file thumbnail (to zoom thumbnail content to a detailed modal preview).
    */
  var zoomClass: js.UndefOr[String] = js.native
  
  /**
    * icon for zoom button to be displayed in each file thumbnail (to zoom thumbnail content to a detailed modal preview).
    */
  var zoomIcon: js.UndefOr[String] = js.native
  
  /**
    * title for zoom button in each file thumbnail (to zoom thumbnail content to a detailed modal preview).
    */
  var zoomTitle: js.UndefOr[String] = js.native
}
object FileActionSettings {
  
  @scala.inline
  def apply(): FileActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileActionSettings]
  }
  
  @scala.inline
  implicit class FileActionSettingsOps[Self <: FileActionSettings] (val x: Self) extends AnyVal {
    
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
    def setDownloadClass(value: String): Self = this.set("downloadClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadClass: Self = this.set("downloadClass", js.undefined)
    
    @scala.inline
    def setDownloadIcon(value: String): Self = this.set("downloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadIcon: Self = this.set("downloadIcon", js.undefined)
    
    @scala.inline
    def setDownloadTitle(value: String): Self = this.set("downloadTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadTitle: Self = this.set("downloadTitle", js.undefined)
    
    @scala.inline
    def setDragClass(value: String): Self = this.set("dragClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragClass: Self = this.set("dragClass", js.undefined)
    
    @scala.inline
    def setDragIcon(value: String): Self = this.set("dragIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragIcon: Self = this.set("dragIcon", js.undefined)
    
    @scala.inline
    def setDragSettings(value: js.Object): Self = this.set("dragSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragSettings: Self = this.set("dragSettings", js.undefined)
    
    @scala.inline
    def setDragTitle(value: String): Self = this.set("dragTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragTitle: Self = this.set("dragTitle", js.undefined)
    
    @scala.inline
    def setIndicatorError(value: String): Self = this.set("indicatorError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorError: Self = this.set("indicatorError", js.undefined)
    
    @scala.inline
    def setIndicatorErrorTitle(value: String): Self = this.set("indicatorErrorTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorErrorTitle: Self = this.set("indicatorErrorTitle", js.undefined)
    
    @scala.inline
    def setIndicatorLoading(value: String): Self = this.set("indicatorLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorLoading: Self = this.set("indicatorLoading", js.undefined)
    
    @scala.inline
    def setIndicatorLoadingTitle(value: String): Self = this.set("indicatorLoadingTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorLoadingTitle: Self = this.set("indicatorLoadingTitle", js.undefined)
    
    @scala.inline
    def setIndicatorNew(value: String): Self = this.set("indicatorNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorNew: Self = this.set("indicatorNew", js.undefined)
    
    @scala.inline
    def setIndicatorNewTitle(value: String): Self = this.set("indicatorNewTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorNewTitle: Self = this.set("indicatorNewTitle", js.undefined)
    
    @scala.inline
    def setIndicatorPaused(value: String): Self = this.set("indicatorPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorPaused: Self = this.set("indicatorPaused", js.undefined)
    
    @scala.inline
    def setIndicatorPausedTitle(value: String): Self = this.set("indicatorPausedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorPausedTitle: Self = this.set("indicatorPausedTitle", js.undefined)
    
    @scala.inline
    def setIndicatorSuccess(value: String): Self = this.set("indicatorSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorSuccess: Self = this.set("indicatorSuccess", js.undefined)
    
    @scala.inline
    def setIndicatorSuccessTitle(value: String): Self = this.set("indicatorSuccessTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorSuccessTitle: Self = this.set("indicatorSuccessTitle", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: String): Self = this.set("removeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRemoveIcon(value: String): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    
    @scala.inline
    def setRemoveTitle(value: String): Self = this.set("removeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTitle: Self = this.set("removeTitle", js.undefined)
    
    @scala.inline
    def setShowDownloadFunction0(value: () => Boolean): Self = this.set("showDownload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowDownload(value: Boolean | js.Function0[Boolean]): Self = this.set("showDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDownload: Self = this.set("showDownload", js.undefined)
    
    @scala.inline
    def setShowDragFunction0(value: () => Boolean): Self = this.set("showDrag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowDrag(value: Boolean | js.Function0[Boolean]): Self = this.set("showDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDrag: Self = this.set("showDrag", js.undefined)
    
    @scala.inline
    def setShowRemoveFunction0(value: () => Boolean): Self = this.set("showRemove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowRemove(value: Boolean | js.Function0[Boolean]): Self = this.set("showRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRemove: Self = this.set("showRemove", js.undefined)
    
    @scala.inline
    def setShowUploadFunction0(value: () => Boolean): Self = this.set("showUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowUpload(value: Boolean | js.Function0[Boolean]): Self = this.set("showUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUpload: Self = this.set("showUpload", js.undefined)
    
    @scala.inline
    def setShowZoomFunction0(value: () => Boolean): Self = this.set("showZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowZoom(value: Boolean | js.Function0[Boolean]): Self = this.set("showZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZoom: Self = this.set("showZoom", js.undefined)
    
    @scala.inline
    def setUploadClass(value: String): Self = this.set("uploadClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadClass: Self = this.set("uploadClass", js.undefined)
    
    @scala.inline
    def setUploadIcon(value: String): Self = this.set("uploadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadIcon: Self = this.set("uploadIcon", js.undefined)
    
    @scala.inline
    def setUploadRetryIcon(value: String): Self = this.set("uploadRetryIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadRetryIcon: Self = this.set("uploadRetryIcon", js.undefined)
    
    @scala.inline
    def setUploadTitle(value: String): Self = this.set("uploadTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadTitle: Self = this.set("uploadTitle", js.undefined)
    
    @scala.inline
    def setZoomClass(value: String): Self = this.set("zoomClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomClass: Self = this.set("zoomClass", js.undefined)
    
    @scala.inline
    def setZoomIcon(value: String): Self = this.set("zoomIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomIcon: Self = this.set("zoomIcon", js.undefined)
    
    @scala.inline
    def setZoomTitle(value: String): Self = this.set("zoomTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomTitle: Self = this.set("zoomTitle", js.undefined)
  }
}
