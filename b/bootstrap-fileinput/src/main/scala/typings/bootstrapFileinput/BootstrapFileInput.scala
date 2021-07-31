package typings.bootstrapFileinput

import org.scalablytyped.runtime.StringDictionary
import typings.bootstrapFileinput.anon.Height
import typings.bootstrapFileinput.bootstrapFileinputStrings.`object`
import typings.bootstrapFileinput.bootstrapFileinputStrings.any
import typings.bootstrapFileinput.bootstrapFileinputStrings.audio
import typings.bootstrapFileinput.bootstrapFileinputStrings.flash
import typings.bootstrapFileinput.bootstrapFileinputStrings.height
import typings.bootstrapFileinput.bootstrapFileinputStrings.html
import typings.bootstrapFileinput.bootstrapFileinputStrings.image
import typings.bootstrapFileinput.bootstrapFileinputStrings.text
import typings.bootstrapFileinput.bootstrapFileinputStrings.video
import typings.bootstrapFileinput.bootstrapFileinputStrings.width
import typings.jquery.JQueryAjaxSettings
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:enable:unified-signatures
object BootstrapFileInput {
  
  trait FileActionSettings extends StObject {
    
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
    def apply(): FileActionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileActionSettings]
    }
    
    @scala.inline
    implicit class FileActionSettingsMutableBuilder[Self <: FileActionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadClass(value: String): Self = StObject.set(x, "downloadClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadClassUndefined: Self = StObject.set(x, "downloadClass", js.undefined)
      
      @scala.inline
      def setDownloadIcon(value: String): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadIconUndefined: Self = StObject.set(x, "downloadIcon", js.undefined)
      
      @scala.inline
      def setDownloadTitle(value: String): Self = StObject.set(x, "downloadTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadTitleUndefined: Self = StObject.set(x, "downloadTitle", js.undefined)
      
      @scala.inline
      def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      @scala.inline
      def setDragIcon(value: String): Self = StObject.set(x, "dragIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragIconUndefined: Self = StObject.set(x, "dragIcon", js.undefined)
      
      @scala.inline
      def setDragSettings(value: js.Object): Self = StObject.set(x, "dragSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragSettingsUndefined: Self = StObject.set(x, "dragSettings", js.undefined)
      
      @scala.inline
      def setDragTitle(value: String): Self = StObject.set(x, "dragTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragTitleUndefined: Self = StObject.set(x, "dragTitle", js.undefined)
      
      @scala.inline
      def setIndicatorError(value: String): Self = StObject.set(x, "indicatorError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorErrorTitle(value: String): Self = StObject.set(x, "indicatorErrorTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorErrorTitleUndefined: Self = StObject.set(x, "indicatorErrorTitle", js.undefined)
      
      @scala.inline
      def setIndicatorErrorUndefined: Self = StObject.set(x, "indicatorError", js.undefined)
      
      @scala.inline
      def setIndicatorLoading(value: String): Self = StObject.set(x, "indicatorLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorLoadingTitle(value: String): Self = StObject.set(x, "indicatorLoadingTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorLoadingTitleUndefined: Self = StObject.set(x, "indicatorLoadingTitle", js.undefined)
      
      @scala.inline
      def setIndicatorLoadingUndefined: Self = StObject.set(x, "indicatorLoading", js.undefined)
      
      @scala.inline
      def setIndicatorNew(value: String): Self = StObject.set(x, "indicatorNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorNewTitle(value: String): Self = StObject.set(x, "indicatorNewTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorNewTitleUndefined: Self = StObject.set(x, "indicatorNewTitle", js.undefined)
      
      @scala.inline
      def setIndicatorNewUndefined: Self = StObject.set(x, "indicatorNew", js.undefined)
      
      @scala.inline
      def setIndicatorPaused(value: String): Self = StObject.set(x, "indicatorPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorPausedTitle(value: String): Self = StObject.set(x, "indicatorPausedTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorPausedTitleUndefined: Self = StObject.set(x, "indicatorPausedTitle", js.undefined)
      
      @scala.inline
      def setIndicatorPausedUndefined: Self = StObject.set(x, "indicatorPaused", js.undefined)
      
      @scala.inline
      def setIndicatorSuccess(value: String): Self = StObject.set(x, "indicatorSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSuccessTitle(value: String): Self = StObject.set(x, "indicatorSuccessTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSuccessTitleUndefined: Self = StObject.set(x, "indicatorSuccessTitle", js.undefined)
      
      @scala.inline
      def setIndicatorSuccessUndefined: Self = StObject.set(x, "indicatorSuccess", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: String): Self = StObject.set(x, "removeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: String): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setRemoveTitle(value: String): Self = StObject.set(x, "removeTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveTitleUndefined: Self = StObject.set(x, "removeTitle", js.undefined)
      
      @scala.inline
      def setShowDownload(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "showDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDownloadFunction0(value: () => Boolean): Self = StObject.set(x, "showDownload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowDownloadUndefined: Self = StObject.set(x, "showDownload", js.undefined)
      
      @scala.inline
      def setShowDrag(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "showDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDragFunction0(value: () => Boolean): Self = StObject.set(x, "showDrag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowDragUndefined: Self = StObject.set(x, "showDrag", js.undefined)
      
      @scala.inline
      def setShowRemove(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveFunction0(value: () => Boolean): Self = StObject.set(x, "showRemove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
      
      @scala.inline
      def setShowUpload(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "showUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUploadFunction0(value: () => Boolean): Self = StObject.set(x, "showUpload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowUploadUndefined: Self = StObject.set(x, "showUpload", js.undefined)
      
      @scala.inline
      def setShowZoom(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "showZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowZoomFunction0(value: () => Boolean): Self = StObject.set(x, "showZoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowZoomUndefined: Self = StObject.set(x, "showZoom", js.undefined)
      
      @scala.inline
      def setUploadClass(value: String): Self = StObject.set(x, "uploadClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadClassUndefined: Self = StObject.set(x, "uploadClass", js.undefined)
      
      @scala.inline
      def setUploadIcon(value: String): Self = StObject.set(x, "uploadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIconUndefined: Self = StObject.set(x, "uploadIcon", js.undefined)
      
      @scala.inline
      def setUploadRetryIcon(value: String): Self = StObject.set(x, "uploadRetryIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadRetryIconUndefined: Self = StObject.set(x, "uploadRetryIcon", js.undefined)
      
      @scala.inline
      def setUploadTitle(value: String): Self = StObject.set(x, "uploadTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTitleUndefined: Self = StObject.set(x, "uploadTitle", js.undefined)
      
      @scala.inline
      def setZoomClass(value: String): Self = StObject.set(x, "zoomClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomClassUndefined: Self = StObject.set(x, "zoomClass", js.undefined)
      
      @scala.inline
      def setZoomIcon(value: String): Self = StObject.set(x, "zoomIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomIconUndefined: Self = StObject.set(x, "zoomIcon", js.undefined)
      
      @scala.inline
      def setZoomTitle(value: String): Self = StObject.set(x, "zoomTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomTitleUndefined: Self = StObject.set(x, "zoomTitle", js.undefined)
    }
  }
  
  trait FileInputOptions extends StObject {
    
    /**
      * additional ajax settings to pass to the plugin before submitting the delete ajax request in each initial preview thumbnail.
      * Applicable only for ajax uploads.
      * This can be useful to pass additional tokens to headers or one can use it for setting other ajax options for advanced cases.
      * Refer the jQuery ajax documentation for the various settings you can configure.
      */
    var ajaxDeleteSettings: js.UndefOr[JQueryAjaxSettings] = js.undefined
    
    /**
      * additional ajax settings to pass to the plugin before submitting the ajax request for upload.
      * Applicable only for ajax uploads.
      * This can be useful to pass additional tokens to headers or one can use it for setting other ajax options for advanced cases.
      * Refer the jQuery ajax documentation for the various settings you can configure.
      */
    var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.undefined
    
    /**
      * the list of allowed file extensions for upload.
      * This by default is set to null which means the plugin supports all file extensions for upload.
      * If an invalid file extension is found, then a validation error message as set in msgInvalidFileExtension will be raised.
      * Note:
      * You need to be careful in case you are setting both allowedFileTypes and allowedFileExtensions.
      * In this case, the allowedFileTypes property is validated first and generally precedes the allowedFileExtensions setting (and the latter validation maybe skipped).
      */
    var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * the list of allowed file types for upload.
      * This by default is set to null which means the plugin supports all file types for upload.
      * If an invalid file type is found, then a validation error message as set in msgInvalidFileType will be raised.
      * Note:
      * You need to be careful in case you are setting both allowedFileTypes and allowedFileExtensions.
      * In this case, the allowedFileTypes property is validated first and generally precedes the allowedFileExtensions setting (and the latter validation maybe skipped).
      */
    var allowedFileTypes: js.UndefOr[js.Array[image | html | text | video | audio | flash | `object`]] = js.undefined
    
    /**
      * the list of allowed mime types for preview.
      * This is set to null by default which means all possible mime types are allowed.
      * This setting works in combination with allowedPreviewTypes to filter only the needed file types allowed for preview.
      */
    var allowedPreviewMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * the list of allowed preview types for your widget.
      * This by default supports all file types for preview.
      * The plugin by default treats each file as an object if it does not match any of the previous types.
      * To disable this behavior, you can remove object from the list of allowedPreviewTypes OR fine tune it through allowedPreviewMimeTypes.
      * To disable content preview for all file-types and show the previewIcon instead as a thumbnail, set this to null, empty, or false.
      */
    var allowedPreviewTypes: js.UndefOr[js.Array[image | html | text | video | audio | flash | `object`]] = js.undefined
    
    /**
      * Whether to automatically replace the files in the preview after the maxFileCount limit is reached and a new set of file(s) is/are selected.
      * This will only work if a valid maxFileCount is set.
      * @default false
      */
    var autoReplace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the CSS class for the file picker/browse button. Defaults to btn btn-primary.
      */
    var browseClass: js.UndefOr[String] = js.undefined
    
    /**
      * the icon to display before the label for the file picker/browse button. Defaults to <i class="glyphicon glyphicon-folder-open"></i>&nbsp;.
      */
    var browseIcon: js.UndefOr[String] = js.undefined
    
    /**
      * the label to display for the file picker/browse button. Defaults to Browse ….
      */
    var browseLabel: js.UndefOr[String] = js.undefined
    
    /**
      * the CSS class for the each of the button labels for browse, remove, upload, and cancel.
      * Defaults to hidden-xs, which automatically hides the button labels for small screen devices and renders as smaller iconic buttons to fit to the screen.
      */
    var buttonLabelClass: js.UndefOr[String] = js.undefined
    
    /**
      * Any additional CSS class to append to the caption container.
      */
    var captionClass: js.UndefOr[String] = js.undefined
    
    /**
      * the list of additional custom tags that will be replaced in the layout templates.
      */
    var customLayoutTags: js.UndefOr[js.Object] = js.undefined
    
    /**
      * the list of additional custom tags that will be replaced in the preview templates.
      */
    var customPreviewTags: js.UndefOr[js.Object] = js.undefined
    
    /**
      * the default content / markup to show by default in the preview window whenever the files are cleared or the input is cleared.
      * This can be useful for use cases like showing the default user profile picture or profile image before upload to overwrite.
      * This is a bit different from initialPreview in the sense, that the initialPreview content will always be displayed unless it is deleted or overwritten based on overwriteInitial.
      * The defaultPreviewContent on the other hand will only be shown ONLY on initialization OR whenever you clear the preview.
      * At other times when files have been selected this will be overwritten temporarily until file(s) selected is/are cleared.
      * This property can be useful to display for example a default user profile picture (or saved picture) in the preview window unless the user selects a picture.
      */
    var defaultPreviewContent: js.UndefOr[String] = js.undefined
    
    /**
      * the extra data that will be passed as data to the initial preview delete url/AJAX server call via POST.
      * This will be overridden by the initialPreviewConfig['extra'] property.
      * This property is only applicable for ajax deletions in initial preview and when you have set a value for initialPreviewConfig['url'] or deleteUrl.
      * This can be setup either as an object (associative array of keys and values) or as a function callback.
      * Note
      * The ajax delete action will send the following data to server via POST:
      *     key: the key setting as setup in initialPreviewConfig['key']
      *     any other extra data passed as key: value pairs either via initialPreviewConfig['extra'] OR deleteExtraData if former is not set.
      */
    var deleteExtraData: js.UndefOr[js.Object | js.Function0[js.Object]] = js.undefined
    
    /**
      * the URL for deleting the image/content in the initial preview via AJAX post response. This will be overridden by the initialPreviewConfig['url'] property.
      * Note
      * The ajax delete action will send the following data to server via POST:
      *     key: the key setting as setup in initialPreviewConfig['key']
      *     any other extra data passed as key: value pairs either via initialPreviewConfig['extra'] OR deleteExtraData if former is not set.
      * You can also set deleteUrl as a function callback which will return a string. In that case, the function will get executed every time at runtime.
      * This will enable you to set a dynamically changing url based on runtime conditions.
      */
    var deleteUrl: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    /**
      * whether to enable a drag and drop zone for dragging and dropping files to.
      * This is available only for ajax based uploads.
      * @default true
      */
    var dropZoneEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * title to be displayed in the drag and drop zone.
      * This is available only for ajax based uploads.
      * Defaults to:
      *     Drag & drop files here ….
      */
    var dropZoneTitle: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class for the drag & drop zone title.
      * Defaults to file-drop-zone-title.
      */
    var dropZoneTitleClass: js.UndefOr[String] = js.undefined
    
    /**
      * the identifier for the container element containing the caption (e.g. '#id').
      * If not set, will default to the container with CSS class file-caption inside the main plugin container.
      */
    var elCaptionContainer: js.UndefOr[String] = js.undefined
    
    /**
      * the identifier for the container element containing the caption text (e.g. '#id').
      * If not set, will default to the container with CSS class file-caption-name inside the main plugin container.
      */
    var elCaptionText: js.UndefOr[String] = js.undefined
    
    /**
      * the identifier for the container element displaying the error (e.g. '#id').
      * If not set, will default to the container with CSS class kv-fileinput-error inside the preview container (identified by elPreviewContainer).
      * The msgErrorClass will be automatically appended to this container before displaying the error.
      */
    var elErrorContainer: js.UndefOr[String] = js.undefined
    
    /**
      * the identifier for the container element containing the preview (e.g. '#id').
      * If not set, will default to the container with CSS class file-preview inside the main plugin container.
      */
    var elPreviewContainer: js.UndefOr[String] = js.undefined
    
    /**
      * the identifier for the element containing the preview image thumbnails (e.g. '#id').
      * If not set, will default to the container with CSS class file-preview-thumbnails inside the main plugin container.
      */
    var elPreviewImage: js.UndefOr[String] = js.undefined
    
    /**
      * the identifier for the element containing the preview progress status (e.g. '#id').
      * If not set, will default to the container with CSS class file-preview-status inside the main plugin container.
      */
    var elPreviewStatus: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to encode all the URLs before triggering the ajax calls.
      * The following URLs are currently set and used within the plugin:
      *     * uploadUrl
      *     * deleteUrl
      *     * initialPreviewDownloadUrl
      *     * url within initialPreviewConfig
      *     * downloadUrl within initialPreviewConfig
      *     * testUrl within resumableUploadOptions
      * @default true
      */
    var encodeUrl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * configuration for setting up file actions for newly selected file thumbnails in the preview window.
      */
    var fileActionSettings: js.UndefOr[FileActionSettings] = js.undefined
    
    /**
      * the settings to validate and identify each file type when a file is selected for upload.
      * This is a list of callbacks, which accepts the file mime type and file name as a parameter.
      */
    var fileTypeSettings: js.UndefOr[FileTypeSettings] = js.undefined
    
    /**
      * Whether to focus the file caption after browsing and selecting a file.
      * @default true
      */
    var focusCaptionOnBrowse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to focus the file caption after clearing / removing the files (using the remove button for example).
      * @default true
      */
    var focusCaptionOnClear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to hide the preview content (image, pdf content, text content, etc.) within the thumbnail.
      * When set to true, only the file name and file size as defined in the thumbnail footer layout template will be displayed.
      * @default false
      */
    var hideThumbnailContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the initial preview caption text to be displayed.
      * If you do not set a value here and initialPreview is set to true this will default to "{preview-file-count} files selected",
      * where {preview-file-count} is the count of the files passed in initialPreview.
      */
    var initialCaption: js.UndefOr[String] = js.undefined
    
    /**
      * The initial preview content to be displayed.
      * You can pass the minimal HTML markup for displaying your image, text, or file.
      * If set as a string, this will display a single file in the initial preview if there is no delimiter.
      * You can set a delimiter (as defined in initialDelimiter) to show multiple files in initial preview.
      * If set as an array, it will display all files in the array as an initial preview (useful for multiple file upload scenarios).
      * The following CSS classes will need to be added for displaying each file type as per the plugin style theme:
      * image files: Include CSS class file-preview-image
      * text files: Include CSS class file-preview-text
      * other files: Include CSS class file-preview-other
      */
    var initialPreview: js.UndefOr[String | js.Array[js.Any]] = js.undefined
    
    /**
      * the configuration for setting up important properties for each initialPreview item (that is setup as part of initialPreview).
      */
    var initialPreviewConfig: js.UndefOr[js.Array[PreviewConfig]] = js.undefined
    
    /**
      * the count of initial preview items that will be added to the count of files selected in preview.
      * This is applicable when displaying the right caption, when overwriteInitial is set to false.
      */
    var initialPreviewCount: js.UndefOr[Double] = js.undefined
    
    /**
      * the delimiter to be used for splitting the initial preview content as individual file thumbnails (applicable only if initialPreview is passed as a string instead of array).
      * Defaults to *$$*.
      */
    var initialPreviewDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * whether the delete button will be displayed for each thumbnail that has been created with initialPreview.
      */
    var initialPreviewShowDelete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * this is an extension of previewThumbTags specifically for initial preview content - but will be configured as an array of objects corresponding to each initial preview thumbnail.
      * The initial preview thumbnails set via initialPreview will read this configuration for replacing tags.
      */
    var initialPreviewThumbTags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Language configuration for the plugin to enable the plugin to display messages for your locale (you must set the ISO code for the language).
      * You can have multiple language widgets on the same page.
      * The locale JS file for the language code must be defined as mentioned in the translations section: http://plugins.krajee.com/file-input#translations
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * the templates configuration for rendering each part of the layout.
      */
    var layoutTemplates: js.UndefOr[LayoutTemplates] = js.undefined
    
    /**
      * Any additional CSS class to append to the main plugin container.
      */
    var mainClass: js.UndefOr[String] = js.undefined
    
    /**
      * the maximum number of files allowed for each multiple upload.
      * If set to 0, it means number of files allowed is unlimited.
      * Defaults to 0.
      */
    var maxFileCount: js.UndefOr[Double] = js.undefined
    
    /**
      * the maximum file size for upload in KB.
      * If set to 0, it means size allowed is unlimited.
      * Defaults to 0.
      */
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * the maximum allowed image height in px if you are uploading image files.
      * Defaults to null which means no limit on image height.
      * Note that if you set resizeImage property to true, then the entire image will be resized within this height (depending on resizePreference).
      */
    var maxImageHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * the maximum allowed image width in px if you are uploading image files.
      * Defaults to null which means no limit on image width.
      * Note that if you set resizeImage property to true, then the entire image will be resized within this width (depending on resizePreference).
      */
    var maxImageWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * the minimum number of files allowed for each multiple upload.
      * If set to 0, it means number of files are optional.
      * Defaults to 0.
      */
    var minFileCount: js.UndefOr[Double] = js.undefined
    
    /**
      * the minimum allowed image height in px if you are uploading image files.
      * Defaults to null which means no limit on image height.
      */
    var minImageHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * the message that will be displayed within the progress bar when file upload is aborted or cancelled.
      * Defaults to Cancelled.
      */
    var msgCancelled: js.UndefOr[String] = js.undefined
    
    /**
      * the css class for the error message to be displayed in the preview window when the file size exceeds maxSize.
      * Defaults to file-error-message.
      */
    var msgErrorClass: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file selected is not found by the FileReader.
      * Defaults to:
      *     File "{name}" not found!
      * where:
      *     {name}: will be replaced by the file name being uploaded
      */
    var msgFileNotFound: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file selected is not readable by the FileReader API.
      * Defaults to:
      *     File "{name}" is not readable.
      * where:
      *     {name}: will be replaced by the file name being uploaded
      */
    var msgFileNotReadable: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file preview upload is aborted.
      * Defaults to:
      *     File preview aborted for "{name}".
      * where:
      *     {name}: will be replaced by the file name being uploaded
      */
    var msgFilePreviewAborted: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed for any other error when previewing the file.
      * Defaults to:
      *     An error occurred while reading the file "{name}".
      * where:
      *     {name}: will be replaced by the file name being uploaded
      */
    var msgFilePreviewError: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file selected is not allowed to be accessed due to a security exception.
      * Defaults to:
      *     Security restrictions prevent reading the file "{name}".
      * where:
      *     {name}: will be replaced by the file name being uploaded
      */
    var msgFileSecured: js.UndefOr[String] = js.undefined
    
    /**
      * message to be displayed when the file count is less than the minimum count as set in minFileCount.
      * Defaults to:
      *     You must select at least {n} {files} to upload. Please retry your upload!
      * where:
      *     {n}: will be replaced by the allowed minimum files as set in minFileCount.
      *     {files}: will be replaced with fileSingle or filePlural properties in locale file depending on the minFileCount.
      */
    var msgFilesTooLess: js.UndefOr[String] = js.undefined
    
    /**
      * the message to be displayed when the file count exceeds maximum count as set in maxFileCount.
      * Defaults to:
      *     Number of files selected for upload ({n}) exceeds maximum allowed limit of {m}. Please retry your upload!
      * where:
      *     {n}: will be replaced by number of files selected for upload
      *     {m}: will be replaced by the allowed maximum files as set in maxFileCount
      */
    var msgFilesTooMany: js.UndefOr[String] = js.undefined
    
    /**
      * the message displayed when a folder has been dragged to the drop zone.
      * Defaults to:
      *     Drag & drop files only! {n} folder(s) dropped were skipped.
      * The following variables will be replaced:
      *     {n}: the number of folders dropped.
      */
    var msgFoldersNotAllowed: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file selected for preview is an image and its height exceeds the maxImageHeight setting.
      * Defaults to:
      *     Height of image file "{name}" cannot exceed {size} px.
      * where:
      *     {name}: will be replaced by the file name being uploaded.
      *     {size}: will be replaced by the maxImageHeight setting.
      */
    var msgImageHeightLarge: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file selected for preview is an image and its height is less than the minImageHeight setting.
      * Defaults to:
      *     Height of image file "{name}" must be at least {size} px.
      * where:
      *     {name}: will be replaced by the file name being uploaded.
      *     {size}: will be replaced by the minImageHeight setting.
      */
    var msgImageHeightSmall: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file selected for preview is an image and its width exceeds the maxImageWidth setting.
      * Defaults to:
      *     Width of image file "{name}" cannot exceed {size} px.
      * where:
      *     {name}: will be replaced by the file name being uploaded.
      *     {size}: will be replaced by the maxImageWidth setting.
      */
    var msgImageWidthLarge: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed when the file selected for preview is an image and its width is less than the minImageWidth setting.
      * Defaults to:
      *     Width of image file "{name}" must be at least {size} px.
      * where:
      *     {name}: will be replaced by the file name being uploaded.
      *     {size}: will be replaced by the minImageWidth setting.
      */
    var msgImageWidthSmall: js.UndefOr[String] = js.undefined
    
    /**
      * the message to be displayed when the file type is not in one of the file extensions set in allowedFileExtensions.
      * Defaults to:
      *     Invalid extension for file "{name}". Only "{extensions}" files are supported.
      * where:
      *     {name}: will be replaced by the file name being uploaded
      *     {extensions}: will be replaced by the comma separated list of extensions defined in allowedFileExtensions.
      */
    var msgInvalidFileExtension: js.UndefOr[String] = js.undefined
    
    /**
      * the message to be displayed when the file type is not in one of the file types set in allowedFileTypes.
      * Defaults to:
      *     Invalid type for file "{name}". Only "{types}" files are supported.
      * where:
      *     {name}: will be replaced by the file name being uploaded
      *     {types}: will be replaced by the comma separated list of types defined in allowedFileTypes.
      */
    var msgInvalidFileType: js.UndefOr[String] = js.undefined
    
    /**
      * the message displayed when the files are getting read and loaded for preview.
      * Defaults to
      *     Loading file {index} of {files} …
      * The following special variables will be replaced:
      *     {index}: the sequence number of the current file being loaded.
      *     {files}: the total number of files selected for upload.
      */
    var msgLoading: js.UndefOr[String] = js.undefined
    
    /**
      * the message that will be displayed when ZERO files are found.
      * Defaults to No.
      */
    var msgNo: js.UndefOr[String] = js.undefined
    
    /**
      * the progress message displayed as each file is loaded for preview.
      * Defaults to:
      *     Loading file {index} of {files} - {name} - {percent}% completed.
      * The following variables will be replaced:
      *     {index}: the sequence number of the current file being loaded.
      *     {files}: the total number of files selected for upload.
      *     {percent}: the percentage of file read and loaded.
      *     {name}: the name of the current file being loaded.
      */
    var msgProgress: js.UndefOr[String] = js.undefined
    
    /**
      * the progress message displayed in caption window when multiple (more than one) files are selected.
      * Defaults to:
      *     {n} files selected.
      * The following variables will be replaced:
      *     {n}: the number of files selected.
      */
    var msgSelected: js.UndefOr[String] = js.undefined
    
    /**
      * the message to be displayed when the file size exceeds maximum size.
      * Defaults to:
      *     File "{name}" ({size} KB) exceeds maximum allowed upload size of {maxSize} KB. Please retry your upload!
      * where:
      *     {name}: will be replaced by the file name being uploaded
      *     {size}: will be replaced by the uploaded file size
      *     {maxSize}: will be replaced by the maxFileSize parameter.
      */
    var msgSizeTooLarge: js.UndefOr[String] = js.undefined
    
    /**
      * the message to be displayed when an ongoing ajax file upload is aborted by pressing the Cancel button.
      * Defaults to The file upload was aborted.
      * If this is set to null or empty, the internal ajax error message will be displayed - Defaults to File Upload Error.
      */
    var msgUploadAborted: js.UndefOr[String] = js.undefined
    
    /**
      * the exception message to be displayed within the caption container (instead of msgFilesSelected), when a validation error is encountered.
      * Defaults to File Upload Error.
      */
    var msgValidationError: js.UndefOr[String] = js.undefined
    
    /**
      * the css class for the validation error message displayed in the caption container.
      * Defaults to text-danger.
      */
    var msgValidationErrorClass: js.UndefOr[String] = js.undefined
    
    /**
      * the icon to be displayed before the validation error in the caption container.
      * Defaults to <i class="glyphicon glyphicon-exclamation-sign"></i>
      */
    var msgValidationErrorIcon: js.UndefOr[String] = js.undefined
    
    /**
      * the heading of the modal dialog that displays the zoomed file content.
      * This is currently applicable only for text file previews.
      * Defaults to Detailed Preview.
      */
    var msgZoomModalHeading: js.UndefOr[String] = js.undefined
    
    /**
      * the title displayed (before the file name) on hover of the zoom button for zooming the file content in a modal window.
      * This is currently applicable only for text file previews.
      * Defaults to View details.
      */
    var msgZoomTitle: js.UndefOr[String] = js.undefined
    
    /**
      * markup for additional action buttons to display within the initial preview thumbnails (for example displaying an image edit button).
      * The following tag can be used in the markup and will be automatically replaced:
      *     {dataKey}: Will be replaced with the key set within initialPreviewConfig.
      */
    var otherActionButtons: js.UndefOr[String] = js.undefined
    
    /**
      * whether you wish to overwrite the initial preview content and caption setup.
      * This defaults to true, whereby, any initialPreview content set will be overwritten, when new file is uploaded or when files are cleared.
      * Setting it to false will help displaying a saved image or file from database always - useful especially when using the multiple file upload feature.
      */
    var overwriteInitial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Any additional CSS class to append to the preview container.
      */
    var previewClass: js.UndefOr[String] = js.undefined
    
    /**
      * the extensions to be auto derived for each file extension (type).
      * This is useful if you want to set the same icon for multiple file extension types.
      * You need to set this as `key: value` pairs, where the key corresponds to a file extension as set in previewFileIconSettings (e.g. doc, docx, xls etc.).
      * The value will be a function callback that accepts the following parameter:
      *     ext: string, the file extension (without the . [dot]) of the file currently selected in the preview.
      * You can configure the callback to match the set of file extensions (via regex or similar) for each `key` and return a boolean output if the file extension matches.
      */
    var previewFileExtSettings: js.UndefOr[PreviewFileExtSettings] = js.undefined
    
    /**
      * the icon to be shown in each preview file thumbnail when an unreadable file type for preview is detected. Defaults to <i class="glyphicon glyphicon-file"></i> &nbsp;.
      */
    var previewFileIcon: js.UndefOr[String] = js.undefined
    
    /**
      * the CSS class to be applied to the preview file icon container. Defaults to file-icon-4x.
      */
    var previewFileIconClass: js.UndefOr[String] = js.undefined
    
    /**
      * the preview icon markup settings for each file extension (type).
      * You need to set this as key: value pairs, where the key corresponds to a file extension (e.g. doc, docx, xls etc.), and the value corresponds to the markup of the icon to be rendered.
      * If this is not set OR a file extension is not set here, the preview will default to previewFileIcon.
      * Note that displaying the icons instead of file content is controlled via allowedPreviewTypes and allowedPreviewMimeTypes
      */
    var previewFileIconSettings: js.UndefOr[PreviewFileIconSettings] = js.undefined
    
    /**
      * the type of files that are to be displayed in the preview window.
      * Defaults to image.
      * Can be one of the following:
      *     image: Only image type files will be shown in preview.
      *     text: Only text type files will be shown in preview.
      *     any: Both image and text files content will be shown in preview.
      * Files other than image or text will be displayed as a thumbnail with the filename in the preview window.
      */
    var previewFileType: js.UndefOr[image | text | any] = js.undefined
    
    /**
      * the format settings (width and height) for rendering each preview file type.
      */
    var previewSettings: js.UndefOr[PreviewSettings] = js.undefined
    
    /**
      * the templates configuration for rendering each preview file type.
      */
    var previewTemplates: js.UndefOr[PreviewTemplates] = js.undefined
    
    /**
      * this will be a list of tags used in thumbnail templates that will be replaced dynamically within the thumbnail markup, when the thumbnail is rendered.
      */
    var previewThumbTags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * the upload progress bar CSS class to be applied when AJAX upload is in process (applicable only for ajax uploads).
      * Defaults to progress-bar progress-bar-success progress-bar-striped active.
      */
    var progressClass: js.UndefOr[String] = js.undefined
    
    /**
      * the upload progress bar CSS class to be applied when AJAX upload is in process (applicable only for ajax uploads).
      * Defaults to progress-bar progress-bar-success progress-bar-striped active.
      */
    var progressCompleteClass: js.UndefOr[String] = js.undefined
    
    /**
      * the upload progress bar CSS class to be applied when AJAX upload is cancelled or aborted.
      * Defaults to progress-bar progress-bar-danger.
      */
    var progressErrorClass: js.UndefOr[String] = js.undefined
    
    /**
      * the CSS class for the file remove button. Defaults to btn btn-default.
      */
    var removeClass: js.UndefOr[String] = js.undefined
    
    /**
      * whether the file thumbnail should be removed from preview on error. Defaults to false.
      */
    var removeFromPreviewOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the icon to display before the label for the file picker/remove button. Defaults to <i class="glyphicon glyphicon-trash"></i> &nbsp;.
      */
    var removeIcon: js.UndefOr[String] = js.undefined
    
    /**
      * the label to display for the file remove button. Defaults to Remove.
      */
    var removeLabel: js.UndefOr[String] = js.undefined
    
    /**
      * the title to display on hover for the file remove button. Defaults to Clear selected files.
      */
    var removeTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Whether file selection is mandatory before upload (for ajax) or submit of the form (for non-ajax). When set to true, and if files are not
      * selected before upload, this will show the error message as set in msgFilerequired.
      * @default false
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the default image mime type of the converted image after resize.
      * Defaults to image/jpeg.
      */
    var resizeDefaultImageType: js.UndefOr[String] = js.undefined
    
    /**
      * whether to add ability to resize uploaded images. Defaults to false.
      * Note that resizing images requires HTML5 canvas support which is supported on most modern browsers.
      * In addition, you must include the JavaScript-Canvas-to-Blob plugin by blueimp by including canvas-to-blob.js in your application.
      * This JS file must be loaded before fileinput.js on the page.
      * The JavaScript-Canvas-to-Blob source files are available in js/plugins folder of bootstrap-fileinput project page.
      * The canvas-to-blob.js plugin is a polyfill for canvas.toBlob method and is needed for allowing the resized image files via HTML5 canvas to be returned as a blob
      */
    var resizeImage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the quality of the resized image. This must be a decimal number between 0.00 to 1.00.
      * Defaults to 0.92.
      */
    var resizeImageQuality: js.UndefOr[Double] = js.undefined
    
    /**
      * preference to resize the image based on width or height.
      * Defaults to width.
      * This property is parsed only when resizeImage is true.
      * If set to width, the maxImageWidth property is first tested and if image size is greater than this, then the image is resized to maxImageWidth.
      * The image height is resized and adjusted in the same ratio as width.
      * In case, the image width is already less than maxImageWidth then the maxImageHeight property is used to resize and width is adjusted in same ratio.
      * This will behave conversely, when resizePreference is set to height - the maxImageHeight will be first tested against image height
      * and then the rest of steps will be similarly parsed with preference given to height instead of width as before.
      */
    var resizePreference: js.UndefOr[width | height] = js.undefined
    
    /**
      * Whether to orient the widget in Right-To-Left (RTL) mode. To view RTL orientation you must set this to true and also must load the
      * css/fileinput-rtl.css file after the css/fileinput.css on your page for RTL styling.
      * @default false
      */
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * whether to show details of the error stack from the server log when an error is encountered via ajax response.
      * @default true
      */
    var showAjaxErrorDetails: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display the file upload cancel button.
      * @default true
      * This will be only enabled and displayed when an AJAX upload is in process.
      */
    var showCancel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display the file caption.
      * @default true
      */
    var showCaption: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display the close icon in the preview.
      * @default true
      * This will be only parsed when showPreview is true or when you are using the {close} tag in your preview templates.
      */
    var showClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display the file preview.
      * @default true
      */
    var showPreview: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display the file remove/clear button.
      * @default true
      */
    var showRemove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display the file upload button.
      * @default true
      * This will default to a form submit button, unless the uploadUrl is specified.
      */
    var showUpload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to persist display of the uploaded file thumbnails in the preview window (for ajax uploads) until the remove/clear button is pressed.
      * @default true
      * When set to false, a next batch of files selected for upload will clear these thumbnails from preview.
      */
    var showUploadedThumbs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a callback to convert the filename as a slug string eliminating special characters.
      * If not set, it will use the plugin's own internal slugDefault method.
      * This callback function includes the filename as parameter and must return a converted filename string.
      */
    var slugCallback: js.UndefOr[js.Function1[/* filename */ String, String]] = js.undefined
    
    /**
      * the encoding to be used while reading a text file.
      * Applicable only for previewing text files.
      * Defaults to UTF-8.
      */
    var textEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * Theming
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * whether the batch upload of multiple files will be asynchronous/in parallel.
      * @default true
      */
    var uploadAsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the CSS class for the file upload button. Defaults to btn btn-default.
      */
    var uploadClass: js.UndefOr[String] = js.undefined
    
    /**
      * the extra data that will be passed as data to the url/AJAX server call via POST.
      * This property is only applicable for ajax uploads and when you have set a value for uploadUrl.
      * This can be setup either as an object (associative array of keys and values) or as a function callback.
      * As an object, it can be set for example as:
      *     { id: 100, value: '100 Details' }
      * Note that for uploading individual file via thumbnail, the function callback can also receive the thumbnail previewId and index as parameters. These are described below:
      *     previewId: the identifier for the preview file container (only available when uploading each thumbnail file)
      *     index: the zero-based sequential index of the loaded file in the preview list (only available when uploading each thumbnail file)
      */
    var uploadExtraData: js.UndefOr[
        js.Object | (js.Function2[/* previewId */ js.UndefOr[String], /* index */ js.UndefOr[Double], js.Object])
      ] = js.undefined
    
    /**
      * the icon to display before the label for the file upload button. Defaults to <i class="glyphicon glyphicon-upload"></i> &nbsp;.
      */
    var uploadIcon: js.UndefOr[String] = js.undefined
    
    /**
      * the label to display for the file upload button. Defaults to Upload.
      */
    var uploadLabel: js.UndefOr[String] = js.undefined
    
    /**
      * the title to display on hover for the file remove button.
      * Defaults to Upload selected files.
      */
    var uploadTitle: js.UndefOr[String] = js.undefined
    
    /**
      * the URL for the upload processing action (typically for ajax based processing).
      * Defaults to null.
      * If this is not set or null, then the upload button action will default to form submission.
      * NOTE:
      *     This is MANDATORY if you want to use advanced features like drag & drop, append/remove files, selectively upload files via ajax etc.
      *     The plugin automatically send $_FILES data to the server with the input `name` attribute as the key if provided.
      *     If input name is not set, the key defaults to file-data.
      * You can also set uploadUrl as a function callback which will return a string. In that case, the function will get executed at runtime
      * just before every ajax call. This will enable you to set a dynamic upload url based on runtime / dynamic conditions.
      */
    var uploadUrl: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    /**
      * the URL for the ajax upload processing action applicable when each individual file thumbnail is separately uploaded. Defaults to null.
      * If this is not set, this will default to the uploadUrl setting. This property is useful for synchronous uploads when uploadAsync is
      * set to false, and you want to set a different server action for batch upload via uploadUrl, but a different server action for single
      * file thumbnail upload via uploadUrlThumb.
      * You can also set uploadThumbUrl as a function callback which will return a string. In that case, the function will get executed at
      * runtime just before every ajax call. This will enable you to set a dynamic upload thumbnail url based on runtime / dynamic conditions.
      */
    var uploadUrlThumb: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    /**
      * whether to include initial preview file count (server uploaded files) in validating minFileCount and maxFileCount.
      * @default false
      */
    var validateInitialCount: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the icon for zooming the file content in a new modal dialog.
      * This is currently applicable only for text file previews.
      * Defaults to <i class="glyphicon glyphicon-zoom-in"></i>
      */
    var zoomIndicator: js.UndefOr[String] = js.undefined
  }
  object FileInputOptions {
    
    @scala.inline
    def apply(): FileInputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileInputOptions]
    }
    
    @scala.inline
    implicit class FileInputOptionsMutableBuilder[Self <: FileInputOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxDeleteSettings(value: JQueryAjaxSettings): Self = StObject.set(x, "ajaxDeleteSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxDeleteSettingsUndefined: Self = StObject.set(x, "ajaxDeleteSettings", js.undefined)
      
      @scala.inline
      def setAjaxSettings(value: JQueryAjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      @scala.inline
      def setAllowedFileExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedFileExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedFileExtensionsUndefined: Self = StObject.set(x, "allowedFileExtensions", js.undefined)
      
      @scala.inline
      def setAllowedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedFileExtensions", js.Array(value :_*))
      
      @scala.inline
      def setAllowedFileTypes(value: js.Array[image | html | text | video | audio | flash | `object`]): Self = StObject.set(x, "allowedFileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedFileTypesUndefined: Self = StObject.set(x, "allowedFileTypes", js.undefined)
      
      @scala.inline
      def setAllowedFileTypesVarargs(value: (image | html | text | video | audio | flash | `object`)*): Self = StObject.set(x, "allowedFileTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedPreviewMimeTypes(value: js.Array[String]): Self = StObject.set(x, "allowedPreviewMimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPreviewMimeTypesUndefined: Self = StObject.set(x, "allowedPreviewMimeTypes", js.undefined)
      
      @scala.inline
      def setAllowedPreviewMimeTypesVarargs(value: String*): Self = StObject.set(x, "allowedPreviewMimeTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedPreviewTypes(value: js.Array[image | html | text | video | audio | flash | `object`]): Self = StObject.set(x, "allowedPreviewTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPreviewTypesUndefined: Self = StObject.set(x, "allowedPreviewTypes", js.undefined)
      
      @scala.inline
      def setAllowedPreviewTypesVarargs(value: (image | html | text | video | audio | flash | `object`)*): Self = StObject.set(x, "allowedPreviewTypes", js.Array(value :_*))
      
      @scala.inline
      def setAutoReplace(value: Boolean): Self = StObject.set(x, "autoReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReplaceUndefined: Self = StObject.set(x, "autoReplace", js.undefined)
      
      @scala.inline
      def setBrowseClass(value: String): Self = StObject.set(x, "browseClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowseClassUndefined: Self = StObject.set(x, "browseClass", js.undefined)
      
      @scala.inline
      def setBrowseIcon(value: String): Self = StObject.set(x, "browseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowseIconUndefined: Self = StObject.set(x, "browseIcon", js.undefined)
      
      @scala.inline
      def setBrowseLabel(value: String): Self = StObject.set(x, "browseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowseLabelUndefined: Self = StObject.set(x, "browseLabel", js.undefined)
      
      @scala.inline
      def setButtonLabelClass(value: String): Self = StObject.set(x, "buttonLabelClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonLabelClassUndefined: Self = StObject.set(x, "buttonLabelClass", js.undefined)
      
      @scala.inline
      def setCaptionClass(value: String): Self = StObject.set(x, "captionClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionClassUndefined: Self = StObject.set(x, "captionClass", js.undefined)
      
      @scala.inline
      def setCustomLayoutTags(value: js.Object): Self = StObject.set(x, "customLayoutTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomLayoutTagsUndefined: Self = StObject.set(x, "customLayoutTags", js.undefined)
      
      @scala.inline
      def setCustomPreviewTags(value: js.Object): Self = StObject.set(x, "customPreviewTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPreviewTagsUndefined: Self = StObject.set(x, "customPreviewTags", js.undefined)
      
      @scala.inline
      def setDefaultPreviewContent(value: String): Self = StObject.set(x, "defaultPreviewContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPreviewContentUndefined: Self = StObject.set(x, "defaultPreviewContent", js.undefined)
      
      @scala.inline
      def setDeleteExtraData(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "deleteExtraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteExtraDataFunction0(value: () => js.Object): Self = StObject.set(x, "deleteExtraData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteExtraDataUndefined: Self = StObject.set(x, "deleteExtraData", js.undefined)
      
      @scala.inline
      def setDeleteUrl(value: String | js.Function0[String]): Self = StObject.set(x, "deleteUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUrlFunction0(value: () => String): Self = StObject.set(x, "deleteUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteUrlUndefined: Self = StObject.set(x, "deleteUrl", js.undefined)
      
      @scala.inline
      def setDropZoneEnabled(value: Boolean): Self = StObject.set(x, "dropZoneEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropZoneEnabledUndefined: Self = StObject.set(x, "dropZoneEnabled", js.undefined)
      
      @scala.inline
      def setDropZoneTitle(value: String): Self = StObject.set(x, "dropZoneTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropZoneTitleClass(value: String): Self = StObject.set(x, "dropZoneTitleClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropZoneTitleClassUndefined: Self = StObject.set(x, "dropZoneTitleClass", js.undefined)
      
      @scala.inline
      def setDropZoneTitleUndefined: Self = StObject.set(x, "dropZoneTitle", js.undefined)
      
      @scala.inline
      def setElCaptionContainer(value: String): Self = StObject.set(x, "elCaptionContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElCaptionContainerUndefined: Self = StObject.set(x, "elCaptionContainer", js.undefined)
      
      @scala.inline
      def setElCaptionText(value: String): Self = StObject.set(x, "elCaptionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElCaptionTextUndefined: Self = StObject.set(x, "elCaptionText", js.undefined)
      
      @scala.inline
      def setElErrorContainer(value: String): Self = StObject.set(x, "elErrorContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElErrorContainerUndefined: Self = StObject.set(x, "elErrorContainer", js.undefined)
      
      @scala.inline
      def setElPreviewContainer(value: String): Self = StObject.set(x, "elPreviewContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElPreviewContainerUndefined: Self = StObject.set(x, "elPreviewContainer", js.undefined)
      
      @scala.inline
      def setElPreviewImage(value: String): Self = StObject.set(x, "elPreviewImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElPreviewImageUndefined: Self = StObject.set(x, "elPreviewImage", js.undefined)
      
      @scala.inline
      def setElPreviewStatus(value: String): Self = StObject.set(x, "elPreviewStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElPreviewStatusUndefined: Self = StObject.set(x, "elPreviewStatus", js.undefined)
      
      @scala.inline
      def setEncodeUrl(value: Boolean): Self = StObject.set(x, "encodeUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUrlUndefined: Self = StObject.set(x, "encodeUrl", js.undefined)
      
      @scala.inline
      def setFileActionSettings(value: FileActionSettings): Self = StObject.set(x, "fileActionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileActionSettingsUndefined: Self = StObject.set(x, "fileActionSettings", js.undefined)
      
      @scala.inline
      def setFileTypeSettings(value: FileTypeSettings): Self = StObject.set(x, "fileTypeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeSettingsUndefined: Self = StObject.set(x, "fileTypeSettings", js.undefined)
      
      @scala.inline
      def setFocusCaptionOnBrowse(value: Boolean): Self = StObject.set(x, "focusCaptionOnBrowse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusCaptionOnBrowseUndefined: Self = StObject.set(x, "focusCaptionOnBrowse", js.undefined)
      
      @scala.inline
      def setFocusCaptionOnClear(value: Boolean): Self = StObject.set(x, "focusCaptionOnClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusCaptionOnClearUndefined: Self = StObject.set(x, "focusCaptionOnClear", js.undefined)
      
      @scala.inline
      def setHideThumbnailContent(value: Boolean): Self = StObject.set(x, "hideThumbnailContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideThumbnailContentUndefined: Self = StObject.set(x, "hideThumbnailContent", js.undefined)
      
      @scala.inline
      def setInitialCaption(value: String): Self = StObject.set(x, "initialCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialCaptionUndefined: Self = StObject.set(x, "initialCaption", js.undefined)
      
      @scala.inline
      def setInitialPreview(value: String | js.Array[js.Any]): Self = StObject.set(x, "initialPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPreviewConfig(value: js.Array[PreviewConfig]): Self = StObject.set(x, "initialPreviewConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPreviewConfigUndefined: Self = StObject.set(x, "initialPreviewConfig", js.undefined)
      
      @scala.inline
      def setInitialPreviewConfigVarargs(value: PreviewConfig*): Self = StObject.set(x, "initialPreviewConfig", js.Array(value :_*))
      
      @scala.inline
      def setInitialPreviewCount(value: Double): Self = StObject.set(x, "initialPreviewCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPreviewCountUndefined: Self = StObject.set(x, "initialPreviewCount", js.undefined)
      
      @scala.inline
      def setInitialPreviewDelimiter(value: String): Self = StObject.set(x, "initialPreviewDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPreviewDelimiterUndefined: Self = StObject.set(x, "initialPreviewDelimiter", js.undefined)
      
      @scala.inline
      def setInitialPreviewShowDelete(value: Boolean): Self = StObject.set(x, "initialPreviewShowDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPreviewShowDeleteUndefined: Self = StObject.set(x, "initialPreviewShowDelete", js.undefined)
      
      @scala.inline
      def setInitialPreviewThumbTags(value: StringDictionary[String]): Self = StObject.set(x, "initialPreviewThumbTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPreviewThumbTagsUndefined: Self = StObject.set(x, "initialPreviewThumbTags", js.undefined)
      
      @scala.inline
      def setInitialPreviewUndefined: Self = StObject.set(x, "initialPreview", js.undefined)
      
      @scala.inline
      def setInitialPreviewVarargs(value: js.Any*): Self = StObject.set(x, "initialPreview", js.Array(value :_*))
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLayoutTemplates(value: LayoutTemplates): Self = StObject.set(x, "layoutTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutTemplatesUndefined: Self = StObject.set(x, "layoutTemplates", js.undefined)
      
      @scala.inline
      def setMainClass(value: String): Self = StObject.set(x, "mainClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainClassUndefined: Self = StObject.set(x, "mainClass", js.undefined)
      
      @scala.inline
      def setMaxFileCount(value: Double): Self = StObject.set(x, "maxFileCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileCountUndefined: Self = StObject.set(x, "maxFileCount", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setMaxImageHeight(value: Double): Self = StObject.set(x, "maxImageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxImageHeightUndefined: Self = StObject.set(x, "maxImageHeight", js.undefined)
      
      @scala.inline
      def setMaxImageWidth(value: Double): Self = StObject.set(x, "maxImageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxImageWidthUndefined: Self = StObject.set(x, "maxImageWidth", js.undefined)
      
      @scala.inline
      def setMinFileCount(value: Double): Self = StObject.set(x, "minFileCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFileCountUndefined: Self = StObject.set(x, "minFileCount", js.undefined)
      
      @scala.inline
      def setMinImageHeight(value: Double): Self = StObject.set(x, "minImageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinImageHeightUndefined: Self = StObject.set(x, "minImageHeight", js.undefined)
      
      @scala.inline
      def setMsgCancelled(value: String): Self = StObject.set(x, "msgCancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgCancelledUndefined: Self = StObject.set(x, "msgCancelled", js.undefined)
      
      @scala.inline
      def setMsgErrorClass(value: String): Self = StObject.set(x, "msgErrorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgErrorClassUndefined: Self = StObject.set(x, "msgErrorClass", js.undefined)
      
      @scala.inline
      def setMsgFileNotFound(value: String): Self = StObject.set(x, "msgFileNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFileNotFoundUndefined: Self = StObject.set(x, "msgFileNotFound", js.undefined)
      
      @scala.inline
      def setMsgFileNotReadable(value: String): Self = StObject.set(x, "msgFileNotReadable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFileNotReadableUndefined: Self = StObject.set(x, "msgFileNotReadable", js.undefined)
      
      @scala.inline
      def setMsgFilePreviewAborted(value: String): Self = StObject.set(x, "msgFilePreviewAborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFilePreviewAbortedUndefined: Self = StObject.set(x, "msgFilePreviewAborted", js.undefined)
      
      @scala.inline
      def setMsgFilePreviewError(value: String): Self = StObject.set(x, "msgFilePreviewError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFilePreviewErrorUndefined: Self = StObject.set(x, "msgFilePreviewError", js.undefined)
      
      @scala.inline
      def setMsgFileSecured(value: String): Self = StObject.set(x, "msgFileSecured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFileSecuredUndefined: Self = StObject.set(x, "msgFileSecured", js.undefined)
      
      @scala.inline
      def setMsgFilesTooLess(value: String): Self = StObject.set(x, "msgFilesTooLess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFilesTooLessUndefined: Self = StObject.set(x, "msgFilesTooLess", js.undefined)
      
      @scala.inline
      def setMsgFilesTooMany(value: String): Self = StObject.set(x, "msgFilesTooMany", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFilesTooManyUndefined: Self = StObject.set(x, "msgFilesTooMany", js.undefined)
      
      @scala.inline
      def setMsgFoldersNotAllowed(value: String): Self = StObject.set(x, "msgFoldersNotAllowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgFoldersNotAllowedUndefined: Self = StObject.set(x, "msgFoldersNotAllowed", js.undefined)
      
      @scala.inline
      def setMsgImageHeightLarge(value: String): Self = StObject.set(x, "msgImageHeightLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgImageHeightLargeUndefined: Self = StObject.set(x, "msgImageHeightLarge", js.undefined)
      
      @scala.inline
      def setMsgImageHeightSmall(value: String): Self = StObject.set(x, "msgImageHeightSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgImageHeightSmallUndefined: Self = StObject.set(x, "msgImageHeightSmall", js.undefined)
      
      @scala.inline
      def setMsgImageWidthLarge(value: String): Self = StObject.set(x, "msgImageWidthLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgImageWidthLargeUndefined: Self = StObject.set(x, "msgImageWidthLarge", js.undefined)
      
      @scala.inline
      def setMsgImageWidthSmall(value: String): Self = StObject.set(x, "msgImageWidthSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgImageWidthSmallUndefined: Self = StObject.set(x, "msgImageWidthSmall", js.undefined)
      
      @scala.inline
      def setMsgInvalidFileExtension(value: String): Self = StObject.set(x, "msgInvalidFileExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgInvalidFileExtensionUndefined: Self = StObject.set(x, "msgInvalidFileExtension", js.undefined)
      
      @scala.inline
      def setMsgInvalidFileType(value: String): Self = StObject.set(x, "msgInvalidFileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgInvalidFileTypeUndefined: Self = StObject.set(x, "msgInvalidFileType", js.undefined)
      
      @scala.inline
      def setMsgLoading(value: String): Self = StObject.set(x, "msgLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgLoadingUndefined: Self = StObject.set(x, "msgLoading", js.undefined)
      
      @scala.inline
      def setMsgNo(value: String): Self = StObject.set(x, "msgNo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgNoUndefined: Self = StObject.set(x, "msgNo", js.undefined)
      
      @scala.inline
      def setMsgProgress(value: String): Self = StObject.set(x, "msgProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgProgressUndefined: Self = StObject.set(x, "msgProgress", js.undefined)
      
      @scala.inline
      def setMsgSelected(value: String): Self = StObject.set(x, "msgSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgSelectedUndefined: Self = StObject.set(x, "msgSelected", js.undefined)
      
      @scala.inline
      def setMsgSizeTooLarge(value: String): Self = StObject.set(x, "msgSizeTooLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgSizeTooLargeUndefined: Self = StObject.set(x, "msgSizeTooLarge", js.undefined)
      
      @scala.inline
      def setMsgUploadAborted(value: String): Self = StObject.set(x, "msgUploadAborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgUploadAbortedUndefined: Self = StObject.set(x, "msgUploadAborted", js.undefined)
      
      @scala.inline
      def setMsgValidationError(value: String): Self = StObject.set(x, "msgValidationError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgValidationErrorClass(value: String): Self = StObject.set(x, "msgValidationErrorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgValidationErrorClassUndefined: Self = StObject.set(x, "msgValidationErrorClass", js.undefined)
      
      @scala.inline
      def setMsgValidationErrorIcon(value: String): Self = StObject.set(x, "msgValidationErrorIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgValidationErrorIconUndefined: Self = StObject.set(x, "msgValidationErrorIcon", js.undefined)
      
      @scala.inline
      def setMsgValidationErrorUndefined: Self = StObject.set(x, "msgValidationError", js.undefined)
      
      @scala.inline
      def setMsgZoomModalHeading(value: String): Self = StObject.set(x, "msgZoomModalHeading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgZoomModalHeadingUndefined: Self = StObject.set(x, "msgZoomModalHeading", js.undefined)
      
      @scala.inline
      def setMsgZoomTitle(value: String): Self = StObject.set(x, "msgZoomTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgZoomTitleUndefined: Self = StObject.set(x, "msgZoomTitle", js.undefined)
      
      @scala.inline
      def setOtherActionButtons(value: String): Self = StObject.set(x, "otherActionButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherActionButtonsUndefined: Self = StObject.set(x, "otherActionButtons", js.undefined)
      
      @scala.inline
      def setOverwriteInitial(value: Boolean): Self = StObject.set(x, "overwriteInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteInitialUndefined: Self = StObject.set(x, "overwriteInitial", js.undefined)
      
      @scala.inline
      def setPreviewClass(value: String): Self = StObject.set(x, "previewClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewClassUndefined: Self = StObject.set(x, "previewClass", js.undefined)
      
      @scala.inline
      def setPreviewFileExtSettings(value: PreviewFileExtSettings): Self = StObject.set(x, "previewFileExtSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewFileExtSettingsUndefined: Self = StObject.set(x, "previewFileExtSettings", js.undefined)
      
      @scala.inline
      def setPreviewFileIcon(value: String): Self = StObject.set(x, "previewFileIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewFileIconClass(value: String): Self = StObject.set(x, "previewFileIconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewFileIconClassUndefined: Self = StObject.set(x, "previewFileIconClass", js.undefined)
      
      @scala.inline
      def setPreviewFileIconSettings(value: PreviewFileIconSettings): Self = StObject.set(x, "previewFileIconSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewFileIconSettingsUndefined: Self = StObject.set(x, "previewFileIconSettings", js.undefined)
      
      @scala.inline
      def setPreviewFileIconUndefined: Self = StObject.set(x, "previewFileIcon", js.undefined)
      
      @scala.inline
      def setPreviewFileType(value: image | text | any): Self = StObject.set(x, "previewFileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewFileTypeUndefined: Self = StObject.set(x, "previewFileType", js.undefined)
      
      @scala.inline
      def setPreviewSettings(value: PreviewSettings): Self = StObject.set(x, "previewSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewSettingsUndefined: Self = StObject.set(x, "previewSettings", js.undefined)
      
      @scala.inline
      def setPreviewTemplates(value: PreviewTemplates): Self = StObject.set(x, "previewTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewTemplatesUndefined: Self = StObject.set(x, "previewTemplates", js.undefined)
      
      @scala.inline
      def setPreviewThumbTags(value: StringDictionary[String]): Self = StObject.set(x, "previewThumbTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewThumbTagsUndefined: Self = StObject.set(x, "previewThumbTags", js.undefined)
      
      @scala.inline
      def setProgressClass(value: String): Self = StObject.set(x, "progressClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressClassUndefined: Self = StObject.set(x, "progressClass", js.undefined)
      
      @scala.inline
      def setProgressCompleteClass(value: String): Self = StObject.set(x, "progressCompleteClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressCompleteClassUndefined: Self = StObject.set(x, "progressCompleteClass", js.undefined)
      
      @scala.inline
      def setProgressErrorClass(value: String): Self = StObject.set(x, "progressErrorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressErrorClassUndefined: Self = StObject.set(x, "progressErrorClass", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: String): Self = StObject.set(x, "removeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setRemoveFromPreviewOnError(value: Boolean): Self = StObject.set(x, "removeFromPreviewOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFromPreviewOnErrorUndefined: Self = StObject.set(x, "removeFromPreviewOnError", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: String): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setRemoveLabel(value: String): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveLabelUndefined: Self = StObject.set(x, "removeLabel", js.undefined)
      
      @scala.inline
      def setRemoveTitle(value: String): Self = StObject.set(x, "removeTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveTitleUndefined: Self = StObject.set(x, "removeTitle", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResizeDefaultImageType(value: String): Self = StObject.set(x, "resizeDefaultImageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeDefaultImageTypeUndefined: Self = StObject.set(x, "resizeDefaultImageType", js.undefined)
      
      @scala.inline
      def setResizeImage(value: Boolean): Self = StObject.set(x, "resizeImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeImageQuality(value: Double): Self = StObject.set(x, "resizeImageQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeImageQualityUndefined: Self = StObject.set(x, "resizeImageQuality", js.undefined)
      
      @scala.inline
      def setResizeImageUndefined: Self = StObject.set(x, "resizeImage", js.undefined)
      
      @scala.inline
      def setResizePreference(value: width | height): Self = StObject.set(x, "resizePreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizePreferenceUndefined: Self = StObject.set(x, "resizePreference", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setShowAjaxErrorDetails(value: Boolean): Self = StObject.set(x, "showAjaxErrorDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAjaxErrorDetailsUndefined: Self = StObject.set(x, "showAjaxErrorDetails", js.undefined)
      
      @scala.inline
      def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
      
      @scala.inline
      def setShowCaption(value: Boolean): Self = StObject.set(x, "showCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCaptionUndefined: Self = StObject.set(x, "showCaption", js.undefined)
      
      @scala.inline
      def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      @scala.inline
      def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      @scala.inline
      def setShowRemove(value: Boolean): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
      
      @scala.inline
      def setShowUpload(value: Boolean): Self = StObject.set(x, "showUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUploadUndefined: Self = StObject.set(x, "showUpload", js.undefined)
      
      @scala.inline
      def setShowUploadedThumbs(value: Boolean): Self = StObject.set(x, "showUploadedThumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUploadedThumbsUndefined: Self = StObject.set(x, "showUploadedThumbs", js.undefined)
      
      @scala.inline
      def setSlugCallback(value: /* filename */ String => String): Self = StObject.set(x, "slugCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlugCallbackUndefined: Self = StObject.set(x, "slugCallback", js.undefined)
      
      @scala.inline
      def setTextEncoding(value: String): Self = StObject.set(x, "textEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEncodingUndefined: Self = StObject.set(x, "textEncoding", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUploadAsync(value: Boolean): Self = StObject.set(x, "uploadAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadAsyncUndefined: Self = StObject.set(x, "uploadAsync", js.undefined)
      
      @scala.inline
      def setUploadClass(value: String): Self = StObject.set(x, "uploadClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadClassUndefined: Self = StObject.set(x, "uploadClass", js.undefined)
      
      @scala.inline
      def setUploadExtraData(
        value: js.Object | (js.Function2[/* previewId */ js.UndefOr[String], /* index */ js.UndefOr[Double], js.Object])
      ): Self = StObject.set(x, "uploadExtraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadExtraDataFunction2(value: (/* previewId */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => js.Object): Self = StObject.set(x, "uploadExtraData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUploadExtraDataUndefined: Self = StObject.set(x, "uploadExtraData", js.undefined)
      
      @scala.inline
      def setUploadIcon(value: String): Self = StObject.set(x, "uploadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIconUndefined: Self = StObject.set(x, "uploadIcon", js.undefined)
      
      @scala.inline
      def setUploadLabel(value: String): Self = StObject.set(x, "uploadLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadLabelUndefined: Self = StObject.set(x, "uploadLabel", js.undefined)
      
      @scala.inline
      def setUploadTitle(value: String): Self = StObject.set(x, "uploadTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTitleUndefined: Self = StObject.set(x, "uploadTitle", js.undefined)
      
      @scala.inline
      def setUploadUrl(value: String | js.Function0[String]): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUrlFunction0(value: () => String): Self = StObject.set(x, "uploadUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUploadUrlThumb(value: String | js.Function0[String]): Self = StObject.set(x, "uploadUrlThumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUrlThumbFunction0(value: () => String): Self = StObject.set(x, "uploadUrlThumb", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUploadUrlThumbUndefined: Self = StObject.set(x, "uploadUrlThumb", js.undefined)
      
      @scala.inline
      def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
      
      @scala.inline
      def setValidateInitialCount(value: Boolean): Self = StObject.set(x, "validateInitialCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateInitialCountUndefined: Self = StObject.set(x, "validateInitialCount", js.undefined)
      
      @scala.inline
      def setZoomIndicator(value: String): Self = StObject.set(x, "zoomIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomIndicatorUndefined: Self = StObject.set(x, "zoomIndicator", js.undefined)
    }
  }
  
  type FileStack = StringDictionary[File]
  
  trait FileTypeSettings extends StObject {
    
    def audio(vType: String, vName: String): Boolean
    
    def flash(vType: String, vName: String): Boolean
    
    def html(vType: String, vName: String): Boolean
    
    def image(vType: String, vName: String): Boolean
    
    def `object`(vType: String, vName: String): Boolean
    
    def other(vType: String, vName: String): Boolean
    
    def text(vType: String, vName: String): Boolean
    
    def video(vType: String, vName: String): Boolean
  }
  object FileTypeSettings {
    
    @scala.inline
    def apply(
      audio: (String, String) => Boolean,
      flash: (String, String) => Boolean,
      html: (String, String) => Boolean,
      image: (String, String) => Boolean,
      `object`: (String, String) => Boolean,
      other: (String, String) => Boolean,
      text: (String, String) => Boolean,
      video: (String, String) => Boolean
    ): FileTypeSettings = {
      val __obj = js.Dynamic.literal(audio = js.Any.fromFunction2(audio), flash = js.Any.fromFunction2(flash), html = js.Any.fromFunction2(html), image = js.Any.fromFunction2(image), other = js.Any.fromFunction2(other), text = js.Any.fromFunction2(text), video = js.Any.fromFunction2(video))
      __obj.updateDynamic("object")(js.Any.fromFunction2(`object`))
      __obj.asInstanceOf[FileTypeSettings]
    }
    
    @scala.inline
    implicit class FileTypeSettingsMutableBuilder[Self <: FileTypeSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: (String, String) => Boolean): Self = StObject.set(x, "audio", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFlash(value: (String, String) => Boolean): Self = StObject.set(x, "flash", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHtml(value: (String, String) => Boolean): Self = StObject.set(x, "html", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImage(value: (String, String) => Boolean): Self = StObject.set(x, "image", js.Any.fromFunction2(value))
      
      @scala.inline
      def setObject(value: (String, String) => Boolean): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOther(value: (String, String) => Boolean): Self = StObject.set(x, "other", js.Any.fromFunction2(value))
      
      @scala.inline
      def setText(value: (String, String) => Boolean): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVideo(value: (String, String) => Boolean): Self = StObject.set(x, "video", js.Any.fromFunction2(value))
    }
  }
  
  trait LayoutTemplates extends StObject {
    
    /**
      * the template for the file delete action button within the thumbnail footer.
      * The following tags will be parsed and replaced automatically:
      *     {removeClass}: the css class for the remove button. Will be replaced with the removeClass set within fileActionSettings.
      *     {removeIcon}: the icon for the remove button. Will be replaced with the removeIcon set within fileActionSettings.
      *     {removeTitle}: the title to display on hover for the remove button. Will be replaced with the removeTitle set within fileActionSettings.
      *     {dataUrl}: the URL for deleting the file thumbnail for initialPreview content only. Will be replaced with the url set within initialPreviewConfig.
      *     {dataKey}: the key (additional data) that will be passed to the URL above via POST to the AJAX call. Will be replaced with the key set within initialPreviewConfig.
      */
    var actionDelete: js.UndefOr[String] = js.undefined
    
    /**
      * the template for the file upload action button within the thumbnail footer.
      * The following tags will be parsed and replaced automatically:
      *     {uploadClass}: the css class for the upload button. Will be replaced with the uploadClass set within fileActionSettings.
      *     {uploadIcon}: the icon for the upload button. Will be replaced with the uploadIcon set within fileActionSettings.
      *     {uploadTitle}: the title to display on hover for the upload button. Will be replaced with the uploadTitle set within fileActionSettings.
      */
    var actionUpload: js.UndefOr[String] = js.undefined
    
    /**
      * the template for the file action buttons to be displayed within the thumbnail footer.
      * The following tags will be parsed and replaced automatically:
      *     {upload}: will be replaced with the output of the actionUpload template.
      *     {delete}: will be replaced with the output of the actionDelete template.
      */
    var actions: js.UndefOr[String] = js.undefined
    
    /**
      * The template for the browse button.
      *     {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
      *     {title}: the title to display on button hover.
      *     {css}: the CSS class for the button. This is derived from settings for browseClass.
      *     {status}: the disabled status for the button if available (else will be blank).
      *     {icon}: the button icon as identified by browseIcon.
      *     {label}: the button label as identified by browseLabel.
      */
    var btnBrowse: js.UndefOr[String] = js.undefined
    
    /**
      * The template for upload, remove, and cancel buttons.
      * The following tags will be parsed and replaced automatically:
      *     {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
      *     {title}: the title to display on button hover.
      *     {css}: the CSS class for the button. This is derived from settings for uploadClass or removeClass or cancelClass.
      *     {status}: the disabled status for the button if available (else will be blank).
      *     {icon}: the button icon as identified by uploadIcon or removeIcon or cancelIcon.
      *     {label}: the button label as identified by uploadLabel or removeLabel or cancelLabel.
      */
    var btnDefault: js.UndefOr[String] = js.undefined
    
    /**
      * The template for upload button when used with ajax (i.e. when uploadUrl is set).
      * The following tags will be parsed and replaced automatically:
      *     {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
      *     {title}: the title to display on button hover.
      *     {css}: the CSS class for the button. This is derived from settings for uploadClass.
      *     {status}: the disabled status for the button if available (else will be blank).
      *     {icon}: the button icon as identified by uploadIcon.
      *     {label}: the button label as identified by uploadLabel.
      *     {href}: applicable only for Upload button for ajax uploads and will be replaced with the uploadUrl property.
      */
    var btnLink: js.UndefOr[String] = js.undefined
    
    /**
      * the template for rendering the caption.
      * The following tags will be parsed and replaced automatically:
      *     {class}: the CSS class as set in the captionClass property.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * the template for the footer section of each file preview thumbnail.
      * The following tags will be parsed and replaced automatically:
      *     {actions}: will be replaced with the output of the actions template.
      *     {class}: the CSS class as set in the progressClass or progressCompleteClass property (depending on the progress percentage).
      */
    var footer: js.UndefOr[String] = js.undefined
    
    /**
      * the icon to render before the caption text.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * the template for rendering the widget with caption.
      * The following tags will be parsed and replaced automatically:
      *     {class}: the CSS class as set in the mainClass property.
      *     {close}: will be replaced with the close (cross) icon (by default on top right of the preview window). The layout template to control this markup is layoutTemplates.close.
      *     {preview}: the content parsed by the previewTemplate and will be displayed only if showPreview is true.
      *     {caption}: the content parsed by the captionTemplate and will be displayed only if showCaption is true.
      *     {remove}: the file remove/clear button and will be displayed only if showRemove is true.
      *     {upload}: the file upload button and will be displayed only if showUpload is true.
      *     {cancel}: the file upload cancel button that will be displayed when AJAX upload is in process to abort the AJAX upload.
      *     {browse}: the main file browse button to select your files for input.
      */
    var main1: js.UndefOr[String] = js.undefined
    
    /**
      * the template for rendering the widget without caption.
      * The following tags will be parsed and replaced automatically:
      *     {class}: the CSS class as set in the mainClass property.
      *     {close}: will be replaced with the close (cross) icon (by default on top right of the preview window). The layout template to control this markup is layoutTemplates.close.
      *     {preview}: the content parsed by the previewTemplate and will be displayed only if showPreview is true.
      *     {caption}: the content parsed by the captionTemplate and will be displayed only if showCaption is true.
      *     {remove}: the file remove/clear button and will be displayed only if showRemove is true.
      *     {upload}: the file upload button and will be displayed only if showUpload is true.
      *     {cancel}: the file upload cancel button that will be displayed when AJAX upload is in process to abort the AJAX upload.
      *     {browse}: the main file browse button to select your files for input.
      */
    var main2: js.UndefOr[String] = js.undefined
    
    /**
      * the template for rendering the modal (for text file preview zooming).
      */
    var modal: js.UndefOr[String] = js.undefined
    
    /**
      * the template for rendering the preview.
      * The following tags will be parsed and replaced automatically:
      *     {class}: the CSS class as set in the previewClass property.
      */
    var preview: js.UndefOr[String] = js.undefined
    
    /**
      * the template for the progress bar when upload is in progress (for batch/mass uploads and within each preview thumbnail for async/single uploads).
      * The upload progress bar when displayed within each thumbnail will be wrapped inside a container having a CSS class of `file-thumb-progress`.
      * The following tags will be parsed and replaced automatically:
      *     {percent}: will be replaced with the upload progress percentage.
      */
    var progress: js.UndefOr[String] = js.undefined
  }
  object LayoutTemplates {
    
    @scala.inline
    def apply(): LayoutTemplates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTemplates]
    }
    
    @scala.inline
    implicit class LayoutTemplatesMutableBuilder[Self <: LayoutTemplates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionDelete(value: String): Self = StObject.set(x, "actionDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionDeleteUndefined: Self = StObject.set(x, "actionDelete", js.undefined)
      
      @scala.inline
      def setActionUpload(value: String): Self = StObject.set(x, "actionUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUploadUndefined: Self = StObject.set(x, "actionUpload", js.undefined)
      
      @scala.inline
      def setActions(value: String): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setBtnBrowse(value: String): Self = StObject.set(x, "btnBrowse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnBrowseUndefined: Self = StObject.set(x, "btnBrowse", js.undefined)
      
      @scala.inline
      def setBtnDefault(value: String): Self = StObject.set(x, "btnDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnDefaultUndefined: Self = StObject.set(x, "btnDefault", js.undefined)
      
      @scala.inline
      def setBtnLink(value: String): Self = StObject.set(x, "btnLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnLinkUndefined: Self = StObject.set(x, "btnLink", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMain1(value: String): Self = StObject.set(x, "main1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain1Undefined: Self = StObject.set(x, "main1", js.undefined)
      
      @scala.inline
      def setMain2(value: String): Self = StObject.set(x, "main2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain2Undefined: Self = StObject.set(x, "main2", js.undefined)
      
      @scala.inline
      def setModal(value: String): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    }
  }
  
  trait PreviewConfig extends StObject {
    
    /**
      * the caption or filename to display for each initial preview item content.
      */
    var caption: String
    
    /**
      * the extra data that will be passed as data to the initial preview delete url / AJAX server call via POST.
      * This will default to deleteExtraData if not set.
      */
    var extra: js.Object | js.Function0[js.Object]
    
    /**
      * the additional frame css class to set for the file's thumbnail frame.
      */
    var frameClass: String
    
    /**
      * the key that will be passed as data to the url via AJAX POST.
      */
    var key: String | js.Object
    
    /**
      * the URL for deleting the image/ content in the initial preview via AJAX post response.This will default to deleteUrl if not set.
      */
    var url: String
    
    /**
      * the CSS width of the image/ content displayed.
      */
    var width: String
  }
  object PreviewConfig {
    
    @scala.inline
    def apply(
      caption: String,
      extra: js.Object | js.Function0[js.Object],
      frameClass: String,
      key: String | js.Object,
      url: String,
      width: String
    ): PreviewConfig = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], frameClass = frameClass.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewConfig]
    }
    
    @scala.inline
    implicit class PreviewConfigMutableBuilder[Self <: PreviewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtra(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraFunction0(value: () => js.Object): Self = StObject.set(x, "extra", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFrameClass(value: String): Self = StObject.set(x, "frameClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String | js.Object): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type PreviewFileExtSettings = StringDictionary[js.Function1[/* ext */ String, Boolean]]
  
  type PreviewFileIconSettings = StringDictionary[String]
  
  trait PreviewInfo extends StObject {
    
    val config: js.Array[PreviewConfig]
    
    val content: js.Array[String]
    
    val tags: js.Array[String]
  }
  object PreviewInfo {
    
    @scala.inline
    def apply(config: js.Array[PreviewConfig], content: js.Array[String], tags: js.Array[String]): PreviewInfo = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewInfo]
    }
    
    @scala.inline
    implicit class PreviewInfoMutableBuilder[Self <: PreviewInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Array[PreviewConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigVarargs(value: PreviewConfig*): Self = StObject.set(x, "config", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait PreviewSettings extends StObject {
    
    var audio: js.UndefOr[Height] = js.undefined
    
    var flash: js.UndefOr[Height] = js.undefined
    
    var html: js.UndefOr[Height] = js.undefined
    
    var image: js.UndefOr[Height] = js.undefined
    
    var `object`: js.UndefOr[Height] = js.undefined
    
    var other: js.UndefOr[Height] = js.undefined
    
    var text: js.UndefOr[Height] = js.undefined
    
    var video: js.UndefOr[Height] = js.undefined
  }
  object PreviewSettings {
    
    @scala.inline
    def apply(): PreviewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewSettings]
    }
    
    @scala.inline
    implicit class PreviewSettingsMutableBuilder[Self <: PreviewSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Height): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setFlash(value: Height): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
      
      @scala.inline
      def setHtml(value: Height): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setImage(value: Height): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setObject(value: Height): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setOther(value: Height): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setText(value: Height): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVideo(value: Height): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait PreviewTemplates extends StObject {
    
    /**
      * the preview template for audio files (supported by HTML 5 audio tag).
      * The following tags will be parsed and replaced automatically:
      *     {previewId}: will be replaced with the generated identifier for the preview frame container.
      *     {data}: will be replaced with the data source for each preview type.
      *     {width}: will be replaced with the width for the file type as set in previewSettings.
      *     {height}: will be replaced with the height for the file type as set in previewSettings.
      *     {caption}: will be replaced with the file name.
      *     {type}: will be replaced with the file type.
      */
    var audio: js.UndefOr[String] = js.undefined
    
    /**
      * the preview template for flash files (supported currently on webkit browsers).
      * The following tags will be parsed and replaced automatically:
      *     {previewId}: will be replaced with the generated identifier for the preview frame container.
      *     {data}: will be replaced with the data source for each preview type.
      *     {width}: will be replaced with the width for the file type as set in previewSettings.
      *     {height}: will be replaced with the height for the file type as set in previewSettings.
      *     {caption}: will be replaced with the file name.
      *     {type}: will be replaced with the file type.
      */
    var flash: js.UndefOr[String] = js.undefined
    
    /**
      * this template is used ONLY for rendering the initialPreview markup content passed directly as a raw format.
      * The following tags will be parsed and replaced automatically:
      *     {content}: will be replaced with the raw HTML markup as set in initialPreview..
      */
    var generic: js.UndefOr[String] = js.undefined
    
    /**
      * the preview template for html files.
      * The following tags will be parsed and replaced automatically:
      *     {previewId}: will be replaced with the generated identifier for the preview frame container.
      *     {data}: will be replaced with the data source for each preview type.
      *     {width}: will be replaced with the width for the file type as set in previewSettings.
      *     {height}: will be replaced with the height for the file type as set in previewSettings.
      *     {caption}: will be replaced with the file name.
      *     {type}: will be replaced with the file type.
      */
    var html: js.UndefOr[String] = js.undefined
    
    /**
      * the preview template for image files.
      * The following tags will be parsed and replaced automatically:
      *     {previewId}: will be replaced with the generated identifier for the preview frame container.
      *     {data}: will be replaced with the data source for each preview type.
      *     {width}: will be replaced with the width for the file type as set in previewSettings.
      *     {height}: will be replaced with the height for the file type as set in previewSettings.
      *     {caption}: will be replaced with the file name.
      *     {type}: will be replaced with the file type.
      */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * the preview template for all other files - by default treated as object. To disable this behavior, configure the allowedPreviewTypes property.
      * The following tags will be parsed and replaced automatically:
      *     {previewId}: will be replaced with the generated identifier for the preview frame container.
      *     {data}: will be replaced with the data source for each preview type.
      *     {width}: will be replaced with the width for the file type as set in previewSettings.
      *     {height}: will be replaced with the height for the file type as set in previewSettings.
      *     {caption}: will be replaced with the file name.
      *     {type}: will be replaced with the file type.
      */
    var `object`: js.UndefOr[String] = js.undefined
    
    /**
      * the preview template for text files.
      * The following tags will be parsed and replaced automatically:
      *     {previewId}: will be replaced with the generated identifier for the preview frame container.
      *     {data}: will be replaced with the data source for each preview type.
      *     {width}: will be replaced with the width for the file type as set in previewSettings.
      *     {height}: will be replaced with the height for the file type as set in previewSettings.
      *     {caption}: will be replaced with the file name.
      *     {type}: will be replaced with the file type.
      *     {dialog}: Will be replaced with the JS code to launch the modal dialog.
      *     {zoomTitle}: This will be replaced with the msgZoomTitle property. This is the title that is displayed on hover of the zoom button (which on clicking will display the text file).
      *     {zoomInd}: This will be replaced with the zoomIndicator property. This is the title that is displayed on hover of the zoom button (which on clicking will display the text file).
      *     {heading}: This represents the modal dialog heading title. This will be replaced with the msgZoomModalHeading property.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * the preview template for video files (supported by HTML 5 video tag).
      * The following tags will be parsed and replaced automatically:
      *     {previewId}: will be replaced with the generated identifier for the preview frame container.
      *     {data}: will be replaced with the data source for each preview type.
      *     {width}: will be replaced with the width for the file type as set in previewSettings.
      *     {height}: will be replaced with the height for the file type as set in previewSettings.
      *     {caption}: will be replaced with the file name.
      *     {type}: will be replaced with the file type.
      */
    var video: js.UndefOr[String] = js.undefined
  }
  object PreviewTemplates {
    
    @scala.inline
    def apply(): PreviewTemplates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewTemplates]
    }
    
    @scala.inline
    implicit class PreviewTemplatesMutableBuilder[Self <: PreviewTemplates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setFlash(value: String): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
      
      @scala.inline
      def setGeneric(value: String): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
}
