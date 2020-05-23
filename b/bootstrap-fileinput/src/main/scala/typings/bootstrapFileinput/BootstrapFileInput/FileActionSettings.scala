package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileActionSettings extends js.Object {
  /**
    * CSS class for the download button in each file thumbnail.
    */
  var downloadClass: js.UndefOr[String] = js.undefined
  /**
    * icon for download button to be displayed in each file thumbnail.
    */
  var downloadIcon: js.UndefOr[String] = js.undefined
  /**
    * title for download button in each file thumbnail.
    */
  var downloadTitle: js.UndefOr[String] = js.undefined
  /**
    * CSS class for the drag button in each file thumbnail (to sort / rearrange items in initial preview).
    */
  var dragClass: js.UndefOr[String] = js.undefined
  /**
    * icon for drag button to be displayed in each file thumbnail (to sort / rearrange items in initial preview).
    */
  var dragIcon: js.UndefOr[String] = js.undefined
  /**
    * the configuration for the Sortable plugin that will allow you to control the drag settings.
    */
  var dragSettings: js.UndefOr[js.Object] = js.undefined
  /**
    * title for drag button in each file thumbnail (to sort / rearrange items in initial preview).
    */
  var dragTitle: js.UndefOr[String] = js.undefined
  /**
    * an indicator (HTML markup) for error in upload displayed in each file thumbnail.
    */
  var indicatorError: js.UndefOr[String] = js.undefined
  /**
    * title to display on hover of indicator for error in upload in each file thumbnail.
    */
  var indicatorErrorTitle: js.UndefOr[String] = js.undefined
  /**
    * an indicator (HTML markup) for ongoing upload displayed in each file thumbnail.
    */
  var indicatorLoading: js.UndefOr[String] = js.undefined
  /**
    * title to display on hover of indicator for ongoing upload in each file thumbnail.
    */
  var indicatorLoadingTitle: js.UndefOr[String] = js.undefined
  /**
    * an indicator (HTML markup) for new pending upload displayed in each file thumbnail.
    */
  var indicatorNew: js.UndefOr[String] = js.undefined
  /**
    * title to display on hover of indicator for new pending upload in each file thumbnail.
    */
  var indicatorNewTitle: js.UndefOr[String] = js.undefined
  /**
    * an indicator (HTML markup) for paused upload displayed in each file thumbnail (applicable for resumable uploads when enableResumableUpload property to true).
    */
  var indicatorPaused: js.UndefOr[String] = js.undefined
  /**
    * title to display on hover of indicator for paused upload in each file thumbnail (applicable for resumable uploads when enableResumableUpload property to true).
    */
  var indicatorPausedTitle: js.UndefOr[String] = js.undefined
  /**
    * an indicator (HTML markup) for successful upload displayed in each file thumbnail.
    */
  var indicatorSuccess: js.UndefOr[String] = js.undefined
  /**
    * title to display on hover of indicator for successful in each file thumbnail.
    */
  var indicatorSuccessTitle: js.UndefOr[String] = js.undefined
  /**
    * CSS class for the remove button in each file thumbnail.
    */
  var removeClass: js.UndefOr[String] = js.undefined
  /**
    * icon for remove button to be displayed in each file thumbnail.
    */
  var removeIcon: js.UndefOr[String] = js.undefined
  /**
    * title for remove button in each file thumbnail.
    */
  var removeTitle: js.UndefOr[String] = js.undefined
  /**
    * whether to show the download button in the thumbnail.
    * @default true
    */
  var showDownload: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /**
    * whether to show the drag button in the thumbnail (applicable only for initial preview content)
    * @default true
    */
  var showDrag: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /**
    * whether to show the remove button in the thumbnail.
    * @default true
    */
  var showRemove: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /**
    * whether to show the upload button in the thumbnail.
    * @default true // will be always false for resumable uploads
    */
  var showUpload: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /**
    * whether to show the zoom button in the thumbnail.
    * @default true
    */
  var showZoom: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /**
    * CSS class for the remove button in each file thumbnail.
    */
  var uploadClass: js.UndefOr[String] = js.undefined
  /**
    * icon for upload button to be displayed in each file thumbnail.
    */
  var uploadIcon: js.UndefOr[String] = js.undefined
  /**
    * title to be displayed for upload button after an upload error is encountered from the server to allow retry of the upload.
    * This will be rendered in such a case for the errored file thumbnail when retryErrorUploads is set to true.
    */
  var uploadRetryIcon: js.UndefOr[String] = js.undefined
  /**
    * title for remove button in each file thumbnail.
    */
  var uploadTitle: js.UndefOr[String] = js.undefined
  /**
    * CSS class for the zoom button in each file thumbnail (to zoom thumbnail content to a detailed modal preview).
    */
  var zoomClass: js.UndefOr[String] = js.undefined
  /**
    * icon for zoom button to be displayed in each file thumbnail (to zoom thumbnail content to a detailed modal preview).
    */
  var zoomIcon: js.UndefOr[String] = js.undefined
  /**
    * title for zoom button in each file thumbnail (to zoom thumbnail content to a detailed modal preview).
    */
  var zoomTitle: js.UndefOr[String] = js.undefined
}

object FileActionSettings {
  @scala.inline
  def apply(
    downloadClass: String = null,
    downloadIcon: String = null,
    downloadTitle: String = null,
    dragClass: String = null,
    dragIcon: String = null,
    dragSettings: js.Object = null,
    dragTitle: String = null,
    indicatorError: String = null,
    indicatorErrorTitle: String = null,
    indicatorLoading: String = null,
    indicatorLoadingTitle: String = null,
    indicatorNew: String = null,
    indicatorNewTitle: String = null,
    indicatorPaused: String = null,
    indicatorPausedTitle: String = null,
    indicatorSuccess: String = null,
    indicatorSuccessTitle: String = null,
    removeClass: String = null,
    removeIcon: String = null,
    removeTitle: String = null,
    showDownload: Boolean | js.Function0[Boolean] = null,
    showDrag: Boolean | js.Function0[Boolean] = null,
    showRemove: Boolean | js.Function0[Boolean] = null,
    showUpload: Boolean | js.Function0[Boolean] = null,
    showZoom: Boolean | js.Function0[Boolean] = null,
    uploadClass: String = null,
    uploadIcon: String = null,
    uploadRetryIcon: String = null,
    uploadTitle: String = null,
    zoomClass: String = null,
    zoomIcon: String = null,
    zoomTitle: String = null
  ): FileActionSettings = {
    val __obj = js.Dynamic.literal()
    if (downloadClass != null) __obj.updateDynamic("downloadClass")(downloadClass.asInstanceOf[js.Any])
    if (downloadIcon != null) __obj.updateDynamic("downloadIcon")(downloadIcon.asInstanceOf[js.Any])
    if (downloadTitle != null) __obj.updateDynamic("downloadTitle")(downloadTitle.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (dragIcon != null) __obj.updateDynamic("dragIcon")(dragIcon.asInstanceOf[js.Any])
    if (dragSettings != null) __obj.updateDynamic("dragSettings")(dragSettings.asInstanceOf[js.Any])
    if (dragTitle != null) __obj.updateDynamic("dragTitle")(dragTitle.asInstanceOf[js.Any])
    if (indicatorError != null) __obj.updateDynamic("indicatorError")(indicatorError.asInstanceOf[js.Any])
    if (indicatorErrorTitle != null) __obj.updateDynamic("indicatorErrorTitle")(indicatorErrorTitle.asInstanceOf[js.Any])
    if (indicatorLoading != null) __obj.updateDynamic("indicatorLoading")(indicatorLoading.asInstanceOf[js.Any])
    if (indicatorLoadingTitle != null) __obj.updateDynamic("indicatorLoadingTitle")(indicatorLoadingTitle.asInstanceOf[js.Any])
    if (indicatorNew != null) __obj.updateDynamic("indicatorNew")(indicatorNew.asInstanceOf[js.Any])
    if (indicatorNewTitle != null) __obj.updateDynamic("indicatorNewTitle")(indicatorNewTitle.asInstanceOf[js.Any])
    if (indicatorPaused != null) __obj.updateDynamic("indicatorPaused")(indicatorPaused.asInstanceOf[js.Any])
    if (indicatorPausedTitle != null) __obj.updateDynamic("indicatorPausedTitle")(indicatorPausedTitle.asInstanceOf[js.Any])
    if (indicatorSuccess != null) __obj.updateDynamic("indicatorSuccess")(indicatorSuccess.asInstanceOf[js.Any])
    if (indicatorSuccessTitle != null) __obj.updateDynamic("indicatorSuccessTitle")(indicatorSuccessTitle.asInstanceOf[js.Any])
    if (removeClass != null) __obj.updateDynamic("removeClass")(removeClass.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (removeTitle != null) __obj.updateDynamic("removeTitle")(removeTitle.asInstanceOf[js.Any])
    if (showDownload != null) __obj.updateDynamic("showDownload")(showDownload.asInstanceOf[js.Any])
    if (showDrag != null) __obj.updateDynamic("showDrag")(showDrag.asInstanceOf[js.Any])
    if (showRemove != null) __obj.updateDynamic("showRemove")(showRemove.asInstanceOf[js.Any])
    if (showUpload != null) __obj.updateDynamic("showUpload")(showUpload.asInstanceOf[js.Any])
    if (showZoom != null) __obj.updateDynamic("showZoom")(showZoom.asInstanceOf[js.Any])
    if (uploadClass != null) __obj.updateDynamic("uploadClass")(uploadClass.asInstanceOf[js.Any])
    if (uploadIcon != null) __obj.updateDynamic("uploadIcon")(uploadIcon.asInstanceOf[js.Any])
    if (uploadRetryIcon != null) __obj.updateDynamic("uploadRetryIcon")(uploadRetryIcon.asInstanceOf[js.Any])
    if (uploadTitle != null) __obj.updateDynamic("uploadTitle")(uploadTitle.asInstanceOf[js.Any])
    if (zoomClass != null) __obj.updateDynamic("zoomClass")(zoomClass.asInstanceOf[js.Any])
    if (zoomIcon != null) __obj.updateDynamic("zoomIcon")(zoomIcon.asInstanceOf[js.Any])
    if (zoomTitle != null) __obj.updateDynamic("zoomTitle")(zoomTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileActionSettings]
  }
}

