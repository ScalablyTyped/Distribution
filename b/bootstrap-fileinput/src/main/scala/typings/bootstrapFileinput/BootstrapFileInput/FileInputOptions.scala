package typings.bootstrapFileinput.BootstrapFileInput

import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileInputOptions extends js.Object {
  
  /**
    * additional ajax settings to pass to the plugin before submitting the delete ajax request in each initial preview thumbnail.
    * Applicable only for ajax uploads.
    * This can be useful to pass additional tokens to headers or one can use it for setting other ajax options for advanced cases.
    * Refer the jQuery ajax documentation for the various settings you can configure.
    */
  var ajaxDeleteSettings: js.UndefOr[JQueryAjaxSettings] = js.native
  
  /**
    * additional ajax settings to pass to the plugin before submitting the ajax request for upload.
    * Applicable only for ajax uploads.
    * This can be useful to pass additional tokens to headers or one can use it for setting other ajax options for advanced cases.
    * Refer the jQuery ajax documentation for the various settings you can configure.
    */
  var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.native
  
  /**
    * the list of allowed file extensions for upload.
    * This by default is set to null which means the plugin supports all file extensions for upload.
    * If an invalid file extension is found, then a validation error message as set in msgInvalidFileExtension will be raised.
    * Note:
    * You need to be careful in case you are setting both allowedFileTypes and allowedFileExtensions.
    * In this case, the allowedFileTypes property is validated first and generally precedes the allowedFileExtensions setting (and the latter validation maybe skipped).
    */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * the list of allowed file types for upload.
    * This by default is set to null which means the plugin supports all file types for upload.
    * If an invalid file type is found, then a validation error message as set in msgInvalidFileType will be raised.
    * Note:
    * You need to be careful in case you are setting both allowedFileTypes and allowedFileExtensions.
    * In this case, the allowedFileTypes property is validated first and generally precedes the allowedFileExtensions setting (and the latter validation maybe skipped).
    */
  var allowedFileTypes: js.UndefOr[js.Array[image | html | text | video | audio | flash | `object`]] = js.native
  
  /**
    * the list of allowed mime types for preview.
    * This is set to null by default which means all possible mime types are allowed.
    * This setting works in combination with allowedPreviewTypes to filter only the needed file types allowed for preview.
    */
  var allowedPreviewMimeTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * the list of allowed preview types for your widget.
    * This by default supports all file types for preview.
    * The plugin by default treats each file as an object if it does not match any of the previous types.
    * To disable this behavior, you can remove object from the list of allowedPreviewTypes OR fine tune it through allowedPreviewMimeTypes.
    * To disable content preview for all file-types and show the previewIcon instead as a thumbnail, set this to null, empty, or false.
    */
  var allowedPreviewTypes: js.UndefOr[js.Array[image | html | text | video | audio | flash | `object`]] = js.native
  
  /**
    * Whether to automatically replace the files in the preview after the maxFileCount limit is reached and a new set of file(s) is/are selected.
    * This will only work if a valid maxFileCount is set.
    * @default false
    */
  var autoReplace: js.UndefOr[Boolean] = js.native
  
  /**
    * the CSS class for the file picker/browse button. Defaults to btn btn-primary.
    */
  var browseClass: js.UndefOr[String] = js.native
  
  /**
    * the icon to display before the label for the file picker/browse button. Defaults to <i class="glyphicon glyphicon-folder-open"></i>&nbsp;.
    */
  var browseIcon: js.UndefOr[String] = js.native
  
  /**
    * the label to display for the file picker/browse button. Defaults to Browse ….
    */
  var browseLabel: js.UndefOr[String] = js.native
  
  /**
    * the CSS class for the each of the button labels for browse, remove, upload, and cancel.
    * Defaults to hidden-xs, which automatically hides the button labels for small screen devices and renders as smaller iconic buttons to fit to the screen.
    */
  var buttonLabelClass: js.UndefOr[String] = js.native
  
  /**
    * Any additional CSS class to append to the caption container.
    */
  var captionClass: js.UndefOr[String] = js.native
  
  /**
    * the list of additional custom tags that will be replaced in the layout templates.
    */
  var customLayoutTags: js.UndefOr[js.Object] = js.native
  
  /**
    * the list of additional custom tags that will be replaced in the preview templates.
    */
  var customPreviewTags: js.UndefOr[js.Object] = js.native
  
  /**
    * the default content / markup to show by default in the preview window whenever the files are cleared or the input is cleared.
    * This can be useful for use cases like showing the default user profile picture or profile image before upload to overwrite.
    * This is a bit different from initialPreview in the sense, that the initialPreview content will always be displayed unless it is deleted or overwritten based on overwriteInitial.
    * The defaultPreviewContent on the other hand will only be shown ONLY on initialization OR whenever you clear the preview.
    * At other times when files have been selected this will be overwritten temporarily until file(s) selected is/are cleared.
    * This property can be useful to display for example a default user profile picture (or saved picture) in the preview window unless the user selects a picture.
    */
  var defaultPreviewContent: js.UndefOr[String] = js.native
  
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
  var deleteExtraData: js.UndefOr[js.Object | js.Function0[js.Object]] = js.native
  
  /**
    * the URL for deleting the image/content in the initial preview via AJAX post response. This will be overridden by the initialPreviewConfig['url'] property.
    * Note
    * The ajax delete action will send the following data to server via POST:
    *     key: the key setting as setup in initialPreviewConfig['key']
    *     any other extra data passed as key: value pairs either via initialPreviewConfig['extra'] OR deleteExtraData if former is not set.
    * You can also set deleteUrl as a function callback which will return a string. In that case, the function will get executed every time at runtime.
    * This will enable you to set a dynamically changing url based on runtime conditions.
    */
  var deleteUrl: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * whether to enable a drag and drop zone for dragging and dropping files to.
    * This is available only for ajax based uploads.
    * @default true
    */
  var dropZoneEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * title to be displayed in the drag and drop zone.
    * This is available only for ajax based uploads.
    * Defaults to:
    *     Drag & drop files here ….
    */
  var dropZoneTitle: js.UndefOr[String] = js.native
  
  /**
    * CSS class for the drag & drop zone title.
    * Defaults to file-drop-zone-title.
    */
  var dropZoneTitleClass: js.UndefOr[String] = js.native
  
  /**
    * the identifier for the container element containing the caption (e.g. '#id').
    * If not set, will default to the container with CSS class file-caption inside the main plugin container.
    */
  var elCaptionContainer: js.UndefOr[String] = js.native
  
  /**
    * the identifier for the container element containing the caption text (e.g. '#id').
    * If not set, will default to the container with CSS class file-caption-name inside the main plugin container.
    */
  var elCaptionText: js.UndefOr[String] = js.native
  
  /**
    * the identifier for the container element displaying the error (e.g. '#id').
    * If not set, will default to the container with CSS class kv-fileinput-error inside the preview container (identified by elPreviewContainer).
    * The msgErrorClass will be automatically appended to this container before displaying the error.
    */
  var elErrorContainer: js.UndefOr[String] = js.native
  
  /**
    * the identifier for the container element containing the preview (e.g. '#id').
    * If not set, will default to the container with CSS class file-preview inside the main plugin container.
    */
  var elPreviewContainer: js.UndefOr[String] = js.native
  
  /**
    * the identifier for the element containing the preview image thumbnails (e.g. '#id').
    * If not set, will default to the container with CSS class file-preview-thumbnails inside the main plugin container.
    */
  var elPreviewImage: js.UndefOr[String] = js.native
  
  /**
    * the identifier for the element containing the preview progress status (e.g. '#id').
    * If not set, will default to the container with CSS class file-preview-status inside the main plugin container.
    */
  var elPreviewStatus: js.UndefOr[String] = js.native
  
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
  var encodeUrl: js.UndefOr[Boolean] = js.native
  
  /**
    * configuration for setting up file actions for newly selected file thumbnails in the preview window.
    */
  var fileActionSettings: js.UndefOr[FileActionSettings] = js.native
  
  /**
    * the settings to validate and identify each file type when a file is selected for upload.
    * This is a list of callbacks, which accepts the file mime type and file name as a parameter.
    */
  var fileTypeSettings: js.UndefOr[FileTypeSettings] = js.native
  
  /**
    * Whether to focus the file caption after browsing and selecting a file.
    * @default true
    */
  var focusCaptionOnBrowse: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to focus the file caption after clearing / removing the files (using the remove button for example).
    * @default true
    */
  var focusCaptionOnClear: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to hide the preview content (image, pdf content, text content, etc.) within the thumbnail.
    * When set to true, only the file name and file size as defined in the thumbnail footer layout template will be displayed.
    * @default false
    */
  var hideThumbnailContent: js.UndefOr[Boolean] = js.native
  
  /**
    * the initial preview caption text to be displayed.
    * If you do not set a value here and initialPreview is set to true this will default to "{preview-file-count} files selected",
    * where {preview-file-count} is the count of the files passed in initialPreview.
    */
  var initialCaption: js.UndefOr[String] = js.native
  
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
  var initialPreview: js.UndefOr[String | js.Array[_]] = js.native
  
  /**
    * the configuration for setting up important properties for each initialPreview item (that is setup as part of initialPreview).
    */
  var initialPreviewConfig: js.UndefOr[js.Array[PreviewConfig]] = js.native
  
  /**
    * the count of initial preview items that will be added to the count of files selected in preview.
    * This is applicable when displaying the right caption, when overwriteInitial is set to false.
    */
  var initialPreviewCount: js.UndefOr[Double] = js.native
  
  /**
    * the delimiter to be used for splitting the initial preview content as individual file thumbnails (applicable only if initialPreview is passed as a string instead of array).
    * Defaults to *$$*.
    */
  var initialPreviewDelimiter: js.UndefOr[String] = js.native
  
  /**
    * whether the delete button will be displayed for each thumbnail that has been created with initialPreview.
    */
  var initialPreviewShowDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * this is an extension of previewThumbTags specifically for initial preview content - but will be configured as an array of objects corresponding to each initial preview thumbnail.
    * The initial preview thumbnails set via initialPreview will read this configuration for replacing tags.
    */
  var initialPreviewThumbTags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Language configuration for the plugin to enable the plugin to display messages for your locale (you must set the ISO code for the language).
    * You can have multiple language widgets on the same page.
    * The locale JS file for the language code must be defined as mentioned in the translations section: http://plugins.krajee.com/file-input#translations
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * the templates configuration for rendering each part of the layout.
    */
  var layoutTemplates: js.UndefOr[LayoutTemplates] = js.native
  
  /**
    * Any additional CSS class to append to the main plugin container.
    */
  var mainClass: js.UndefOr[String] = js.native
  
  /**
    * the maximum number of files allowed for each multiple upload.
    * If set to 0, it means number of files allowed is unlimited.
    * Defaults to 0.
    */
  var maxFileCount: js.UndefOr[Double] = js.native
  
  /**
    * the maximum file size for upload in KB.
    * If set to 0, it means size allowed is unlimited.
    * Defaults to 0.
    */
  var maxFileSize: js.UndefOr[Double] = js.native
  
  /**
    * the maximum allowed image height in px if you are uploading image files.
    * Defaults to null which means no limit on image height.
    * Note that if you set resizeImage property to true, then the entire image will be resized within this height (depending on resizePreference).
    */
  var maxImageHeight: js.UndefOr[Double] = js.native
  
  /**
    * the maximum allowed image width in px if you are uploading image files.
    * Defaults to null which means no limit on image width.
    * Note that if you set resizeImage property to true, then the entire image will be resized within this width (depending on resizePreference).
    */
  var maxImageWidth: js.UndefOr[Double] = js.native
  
  /**
    * the minimum number of files allowed for each multiple upload.
    * If set to 0, it means number of files are optional.
    * Defaults to 0.
    */
  var minFileCount: js.UndefOr[Double] = js.native
  
  /**
    * the minimum allowed image height in px if you are uploading image files.
    * Defaults to null which means no limit on image height.
    */
  var minImageHeight: js.UndefOr[Double] = js.native
  
  /**
    * the message that will be displayed within the progress bar when file upload is aborted or cancelled.
    * Defaults to Cancelled.
    */
  var msgCancelled: js.UndefOr[String] = js.native
  
  /**
    * the css class for the error message to be displayed in the preview window when the file size exceeds maxSize.
    * Defaults to file-error-message.
    */
  var msgErrorClass: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file selected is not found by the FileReader.
    * Defaults to:
    *     File "{name}" not found!
    * where:
    *     {name}: will be replaced by the file name being uploaded
    */
  var msgFileNotFound: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file selected is not readable by the FileReader API.
    * Defaults to:
    *     File "{name}" is not readable.
    * where:
    *     {name}: will be replaced by the file name being uploaded
    */
  var msgFileNotReadable: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file preview upload is aborted.
    * Defaults to:
    *     File preview aborted for "{name}".
    * where:
    *     {name}: will be replaced by the file name being uploaded
    */
  var msgFilePreviewAborted: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed for any other error when previewing the file.
    * Defaults to:
    *     An error occurred while reading the file "{name}".
    * where:
    *     {name}: will be replaced by the file name being uploaded
    */
  var msgFilePreviewError: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file selected is not allowed to be accessed due to a security exception.
    * Defaults to:
    *     Security restrictions prevent reading the file "{name}".
    * where:
    *     {name}: will be replaced by the file name being uploaded
    */
  var msgFileSecured: js.UndefOr[String] = js.native
  
  /**
    * message to be displayed when the file count is less than the minimum count as set in minFileCount.
    * Defaults to:
    *     You must select at least {n} {files} to upload. Please retry your upload!
    * where:
    *     {n}: will be replaced by the allowed minimum files as set in minFileCount.
    *     {files}: will be replaced with fileSingle or filePlural properties in locale file depending on the minFileCount.
    */
  var msgFilesTooLess: js.UndefOr[String] = js.native
  
  /**
    * the message to be displayed when the file count exceeds maximum count as set in maxFileCount.
    * Defaults to:
    *     Number of files selected for upload ({n}) exceeds maximum allowed limit of {m}. Please retry your upload!
    * where:
    *     {n}: will be replaced by number of files selected for upload
    *     {m}: will be replaced by the allowed maximum files as set in maxFileCount
    */
  var msgFilesTooMany: js.UndefOr[String] = js.native
  
  /**
    * the message displayed when a folder has been dragged to the drop zone.
    * Defaults to:
    *     Drag & drop files only! {n} folder(s) dropped were skipped.
    * The following variables will be replaced:
    *     {n}: the number of folders dropped.
    */
  var msgFoldersNotAllowed: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file selected for preview is an image and its height exceeds the maxImageHeight setting.
    * Defaults to:
    *     Height of image file "{name}" cannot exceed {size} px.
    * where:
    *     {name}: will be replaced by the file name being uploaded.
    *     {size}: will be replaced by the maxImageHeight setting.
    */
  var msgImageHeightLarge: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file selected for preview is an image and its height is less than the minImageHeight setting.
    * Defaults to:
    *     Height of image file "{name}" must be at least {size} px.
    * where:
    *     {name}: will be replaced by the file name being uploaded.
    *     {size}: will be replaced by the minImageHeight setting.
    */
  var msgImageHeightSmall: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file selected for preview is an image and its width exceeds the maxImageWidth setting.
    * Defaults to:
    *     Width of image file "{name}" cannot exceed {size} px.
    * where:
    *     {name}: will be replaced by the file name being uploaded.
    *     {size}: will be replaced by the maxImageWidth setting.
    */
  var msgImageWidthLarge: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed when the file selected for preview is an image and its width is less than the minImageWidth setting.
    * Defaults to:
    *     Width of image file "{name}" must be at least {size} px.
    * where:
    *     {name}: will be replaced by the file name being uploaded.
    *     {size}: will be replaced by the minImageWidth setting.
    */
  var msgImageWidthSmall: js.UndefOr[String] = js.native
  
  /**
    * the message to be displayed when the file type is not in one of the file extensions set in allowedFileExtensions.
    * Defaults to:
    *     Invalid extension for file "{name}". Only "{extensions}" files are supported.
    * where:
    *     {name}: will be replaced by the file name being uploaded
    *     {extensions}: will be replaced by the comma separated list of extensions defined in allowedFileExtensions.
    */
  var msgInvalidFileExtension: js.UndefOr[String] = js.native
  
  /**
    * the message to be displayed when the file type is not in one of the file types set in allowedFileTypes.
    * Defaults to:
    *     Invalid type for file "{name}". Only "{types}" files are supported.
    * where:
    *     {name}: will be replaced by the file name being uploaded
    *     {types}: will be replaced by the comma separated list of types defined in allowedFileTypes.
    */
  var msgInvalidFileType: js.UndefOr[String] = js.native
  
  /**
    * the message displayed when the files are getting read and loaded for preview.
    * Defaults to
    *     Loading file {index} of {files} …
    * The following special variables will be replaced:
    *     {index}: the sequence number of the current file being loaded.
    *     {files}: the total number of files selected for upload.
    */
  var msgLoading: js.UndefOr[String] = js.native
  
  /**
    * the message that will be displayed when ZERO files are found.
    * Defaults to No.
    */
  var msgNo: js.UndefOr[String] = js.native
  
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
  var msgProgress: js.UndefOr[String] = js.native
  
  /**
    * the progress message displayed in caption window when multiple (more than one) files are selected.
    * Defaults to:
    *     {n} files selected.
    * The following variables will be replaced:
    *     {n}: the number of files selected.
    */
  var msgSelected: js.UndefOr[String] = js.native
  
  /**
    * the message to be displayed when the file size exceeds maximum size.
    * Defaults to:
    *     File "{name}" ({size} KB) exceeds maximum allowed upload size of {maxSize} KB. Please retry your upload!
    * where:
    *     {name}: will be replaced by the file name being uploaded
    *     {size}: will be replaced by the uploaded file size
    *     {maxSize}: will be replaced by the maxFileSize parameter.
    */
  var msgSizeTooLarge: js.UndefOr[String] = js.native
  
  /**
    * the message to be displayed when an ongoing ajax file upload is aborted by pressing the Cancel button.
    * Defaults to The file upload was aborted.
    * If this is set to null or empty, the internal ajax error message will be displayed - Defaults to File Upload Error.
    */
  var msgUploadAborted: js.UndefOr[String] = js.native
  
  /**
    * the exception message to be displayed within the caption container (instead of msgFilesSelected), when a validation error is encountered.
    * Defaults to File Upload Error.
    */
  var msgValidationError: js.UndefOr[String] = js.native
  
  /**
    * the css class for the validation error message displayed in the caption container.
    * Defaults to text-danger.
    */
  var msgValidationErrorClass: js.UndefOr[String] = js.native
  
  /**
    * the icon to be displayed before the validation error in the caption container.
    * Defaults to <i class="glyphicon glyphicon-exclamation-sign"></i>
    */
  var msgValidationErrorIcon: js.UndefOr[String] = js.native
  
  /**
    * the heading of the modal dialog that displays the zoomed file content.
    * This is currently applicable only for text file previews.
    * Defaults to Detailed Preview.
    */
  var msgZoomModalHeading: js.UndefOr[String] = js.native
  
  /**
    * the title displayed (before the file name) on hover of the zoom button for zooming the file content in a modal window.
    * This is currently applicable only for text file previews.
    * Defaults to View details.
    */
  var msgZoomTitle: js.UndefOr[String] = js.native
  
  /**
    * markup for additional action buttons to display within the initial preview thumbnails (for example displaying an image edit button).
    * The following tag can be used in the markup and will be automatically replaced:
    *     {dataKey}: Will be replaced with the key set within initialPreviewConfig.
    */
  var otherActionButtons: js.UndefOr[String] = js.native
  
  /**
    * whether you wish to overwrite the initial preview content and caption setup.
    * This defaults to true, whereby, any initialPreview content set will be overwritten, when new file is uploaded or when files are cleared.
    * Setting it to false will help displaying a saved image or file from database always - useful especially when using the multiple file upload feature.
    */
  var overwriteInitial: js.UndefOr[Boolean] = js.native
  
  /**
    * Any additional CSS class to append to the preview container.
    */
  var previewClass: js.UndefOr[String] = js.native
  
  /**
    * the extensions to be auto derived for each file extension (type).
    * This is useful if you want to set the same icon for multiple file extension types.
    * You need to set this as `key: value` pairs, where the key corresponds to a file extension as set in previewFileIconSettings (e.g. doc, docx, xls etc.).
    * The value will be a function callback that accepts the following parameter:
    *     ext: string, the file extension (without the . [dot]) of the file currently selected in the preview.
    * You can configure the callback to match the set of file extensions (via regex or similar) for each `key` and return a boolean output if the file extension matches.
    */
  var previewFileExtSettings: js.UndefOr[PreviewFileExtSettings] = js.native
  
  /**
    * the icon to be shown in each preview file thumbnail when an unreadable file type for preview is detected. Defaults to <i class="glyphicon glyphicon-file"></i> &nbsp;.
    */
  var previewFileIcon: js.UndefOr[String] = js.native
  
  /**
    * the CSS class to be applied to the preview file icon container. Defaults to file-icon-4x.
    */
  var previewFileIconClass: js.UndefOr[String] = js.native
  
  /**
    * the preview icon markup settings for each file extension (type).
    * You need to set this as key: value pairs, where the key corresponds to a file extension (e.g. doc, docx, xls etc.), and the value corresponds to the markup of the icon to be rendered.
    * If this is not set OR a file extension is not set here, the preview will default to previewFileIcon.
    * Note that displaying the icons instead of file content is controlled via allowedPreviewTypes and allowedPreviewMimeTypes
    */
  var previewFileIconSettings: js.UndefOr[PreviewFileIconSettings] = js.native
  
  /**
    * the type of files that are to be displayed in the preview window.
    * Defaults to image.
    * Can be one of the following:
    *     image: Only image type files will be shown in preview.
    *     text: Only text type files will be shown in preview.
    *     any: Both image and text files content will be shown in preview.
    * Files other than image or text will be displayed as a thumbnail with the filename in the preview window.
    */
  var previewFileType: js.UndefOr[image | text | any] = js.native
  
  /**
    * the format settings (width and height) for rendering each preview file type.
    */
  var previewSettings: js.UndefOr[PreviewSettings] = js.native
  
  /**
    * the templates configuration for rendering each preview file type.
    */
  var previewTemplates: js.UndefOr[PreviewTemplates] = js.native
  
  /**
    * this will be a list of tags used in thumbnail templates that will be replaced dynamically within the thumbnail markup, when the thumbnail is rendered.
    */
  var previewThumbTags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * the upload progress bar CSS class to be applied when AJAX upload is in process (applicable only for ajax uploads).
    * Defaults to progress-bar progress-bar-success progress-bar-striped active.
    */
  var progressClass: js.UndefOr[String] = js.native
  
  /**
    * the upload progress bar CSS class to be applied when AJAX upload is in process (applicable only for ajax uploads).
    * Defaults to progress-bar progress-bar-success progress-bar-striped active.
    */
  var progressCompleteClass: js.UndefOr[String] = js.native
  
  /**
    * the upload progress bar CSS class to be applied when AJAX upload is cancelled or aborted.
    * Defaults to progress-bar progress-bar-danger.
    */
  var progressErrorClass: js.UndefOr[String] = js.native
  
  /**
    * the CSS class for the file remove button. Defaults to btn btn-default.
    */
  var removeClass: js.UndefOr[String] = js.native
  
  /**
    * whether the file thumbnail should be removed from preview on error. Defaults to false.
    */
  var removeFromPreviewOnError: js.UndefOr[Boolean] = js.native
  
  /**
    * the icon to display before the label for the file picker/remove button. Defaults to <i class="glyphicon glyphicon-trash"></i> &nbsp;.
    */
  var removeIcon: js.UndefOr[String] = js.native
  
  /**
    * the label to display for the file remove button. Defaults to Remove.
    */
  var removeLabel: js.UndefOr[String] = js.native
  
  /**
    * the title to display on hover for the file remove button. Defaults to Clear selected files.
    */
  var removeTitle: js.UndefOr[String] = js.native
  
  /**
    * Whether file selection is mandatory before upload (for ajax) or submit of the form (for non-ajax). When set to true, and if files are not
    * selected before upload, this will show the error message as set in msgFilerequired.
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * the default image mime type of the converted image after resize.
    * Defaults to image/jpeg.
    */
  var resizeDefaultImageType: js.UndefOr[String] = js.native
  
  /**
    * whether to add ability to resize uploaded images. Defaults to false.
    * Note that resizing images requires HTML5 canvas support which is supported on most modern browsers.
    * In addition, you must include the JavaScript-Canvas-to-Blob plugin by blueimp by including canvas-to-blob.js in your application.
    * This JS file must be loaded before fileinput.js on the page.
    * The JavaScript-Canvas-to-Blob source files are available in js/plugins folder of bootstrap-fileinput project page.
    * The canvas-to-blob.js plugin is a polyfill for canvas.toBlob method and is needed for allowing the resized image files via HTML5 canvas to be returned as a blob
    */
  var resizeImage: js.UndefOr[Boolean] = js.native
  
  /**
    * the quality of the resized image. This must be a decimal number between 0.00 to 1.00.
    * Defaults to 0.92.
    */
  var resizeImageQuality: js.UndefOr[Double] = js.native
  
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
  var resizePreference: js.UndefOr[width | height] = js.native
  
  /**
    * Whether to orient the widget in Right-To-Left (RTL) mode. To view RTL orientation you must set this to true and also must load the
    * css/fileinput-rtl.css file after the css/fileinput.css on your page for RTL styling.
    * @default false
    */
  var rtl: js.UndefOr[Boolean] = js.native
  
  /**
    * whether to show details of the error stack from the server log when an error is encountered via ajax response.
    * @default true
    */
  var showAjaxErrorDetails: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the file upload cancel button.
    * @default true
    * This will be only enabled and displayed when an AJAX upload is in process.
    */
  var showCancel: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the file caption.
    * @default true
    */
  var showCaption: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the close icon in the preview.
    * @default true
    * This will be only parsed when showPreview is true or when you are using the {close} tag in your preview templates.
    */
  var showClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the file preview.
    * @default true
    */
  var showPreview: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the file remove/clear button.
    * @default true
    */
  var showRemove: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the file upload button.
    * @default true
    * This will default to a form submit button, unless the uploadUrl is specified.
    */
  var showUpload: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to persist display of the uploaded file thumbnails in the preview window (for ajax uploads) until the remove/clear button is pressed.
    * @default true
    * When set to false, a next batch of files selected for upload will clear these thumbnails from preview.
    */
  var showUploadedThumbs: js.UndefOr[Boolean] = js.native
  
  /**
    * a callback to convert the filename as a slug string eliminating special characters.
    * If not set, it will use the plugin's own internal slugDefault method.
    * This callback function includes the filename as parameter and must return a converted filename string.
    */
  var slugCallback: js.UndefOr[js.Function1[/* filename */ String, String]] = js.native
  
  /**
    * the encoding to be used while reading a text file.
    * Applicable only for previewing text files.
    * Defaults to UTF-8.
    */
  var textEncoding: js.UndefOr[String] = js.native
  
  /**
    * Theming
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * whether the batch upload of multiple files will be asynchronous/in parallel.
    * @default true
    */
  var uploadAsync: js.UndefOr[Boolean] = js.native
  
  /**
    * the CSS class for the file upload button. Defaults to btn btn-default.
    */
  var uploadClass: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  /**
    * the icon to display before the label for the file upload button. Defaults to <i class="glyphicon glyphicon-upload"></i> &nbsp;.
    */
  var uploadIcon: js.UndefOr[String] = js.native
  
  /**
    * the label to display for the file upload button. Defaults to Upload.
    */
  var uploadLabel: js.UndefOr[String] = js.native
  
  /**
    * the title to display on hover for the file remove button.
    * Defaults to Upload selected files.
    */
  var uploadTitle: js.UndefOr[String] = js.native
  
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
  var uploadUrl: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * the URL for the ajax upload processing action applicable when each individual file thumbnail is separately uploaded. Defaults to null.
    * If this is not set, this will default to the uploadUrl setting. This property is useful for synchronous uploads when uploadAsync is
    * set to false, and you want to set a different server action for batch upload via uploadUrl, but a different server action for single
    * file thumbnail upload via uploadUrlThumb.
    * You can also set uploadThumbUrl as a function callback which will return a string. In that case, the function will get executed at
    * runtime just before every ajax call. This will enable you to set a dynamic upload thumbnail url based on runtime / dynamic conditions.
    */
  var uploadUrlThumb: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * whether to include initial preview file count (server uploaded files) in validating minFileCount and maxFileCount.
    * @default false
    */
  var validateInitialCount: js.UndefOr[Boolean] = js.native
  
  /**
    * the icon for zooming the file content in a new modal dialog.
    * This is currently applicable only for text file previews.
    * Defaults to <i class="glyphicon glyphicon-zoom-in"></i>
    */
  var zoomIndicator: js.UndefOr[String] = js.native
}
object FileInputOptions {
  
  @scala.inline
  def apply(): FileInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInputOptions]
  }
  
  @scala.inline
  implicit class FileInputOptionsOps[Self <: FileInputOptions] (val x: Self) extends AnyVal {
    
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
    def setAjaxDeleteSettings(value: JQueryAjaxSettings): Self = this.set("ajaxDeleteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxDeleteSettings: Self = this.set("ajaxDeleteSettings", js.undefined)
    
    @scala.inline
    def setAjaxSettings(value: JQueryAjaxSettings): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxSettings: Self = this.set("ajaxSettings", js.undefined)
    
    @scala.inline
    def setAllowedFileExtensionsVarargs(value: String*): Self = this.set("allowedFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFileExtensions(value: js.Array[String]): Self = this.set("allowedFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedFileExtensions: Self = this.set("allowedFileExtensions", js.undefined)
    
    @scala.inline
    def setAllowedFileTypesVarargs(value: (image | html | text | video | audio | flash | `object`)*): Self = this.set("allowedFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFileTypes(value: js.Array[image | html | text | video | audio | flash | `object`]): Self = this.set("allowedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedFileTypes: Self = this.set("allowedFileTypes", js.undefined)
    
    @scala.inline
    def setAllowedPreviewMimeTypesVarargs(value: String*): Self = this.set("allowedPreviewMimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPreviewMimeTypes(value: js.Array[String]): Self = this.set("allowedPreviewMimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPreviewMimeTypes: Self = this.set("allowedPreviewMimeTypes", js.undefined)
    
    @scala.inline
    def setAllowedPreviewTypesVarargs(value: (image | html | text | video | audio | flash | `object`)*): Self = this.set("allowedPreviewTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPreviewTypes(value: js.Array[image | html | text | video | audio | flash | `object`]): Self = this.set("allowedPreviewTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPreviewTypes: Self = this.set("allowedPreviewTypes", js.undefined)
    
    @scala.inline
    def setAutoReplace(value: Boolean): Self = this.set("autoReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReplace: Self = this.set("autoReplace", js.undefined)
    
    @scala.inline
    def setBrowseClass(value: String): Self = this.set("browseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowseClass: Self = this.set("browseClass", js.undefined)
    
    @scala.inline
    def setBrowseIcon(value: String): Self = this.set("browseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowseIcon: Self = this.set("browseIcon", js.undefined)
    
    @scala.inline
    def setBrowseLabel(value: String): Self = this.set("browseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowseLabel: Self = this.set("browseLabel", js.undefined)
    
    @scala.inline
    def setButtonLabelClass(value: String): Self = this.set("buttonLabelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonLabelClass: Self = this.set("buttonLabelClass", js.undefined)
    
    @scala.inline
    def setCaptionClass(value: String): Self = this.set("captionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionClass: Self = this.set("captionClass", js.undefined)
    
    @scala.inline
    def setCustomLayoutTags(value: js.Object): Self = this.set("customLayoutTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLayoutTags: Self = this.set("customLayoutTags", js.undefined)
    
    @scala.inline
    def setCustomPreviewTags(value: js.Object): Self = this.set("customPreviewTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPreviewTags: Self = this.set("customPreviewTags", js.undefined)
    
    @scala.inline
    def setDefaultPreviewContent(value: String): Self = this.set("defaultPreviewContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPreviewContent: Self = this.set("defaultPreviewContent", js.undefined)
    
    @scala.inline
    def setDeleteExtraDataFunction0(value: () => js.Object): Self = this.set("deleteExtraData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteExtraData(value: js.Object | js.Function0[js.Object]): Self = this.set("deleteExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteExtraData: Self = this.set("deleteExtraData", js.undefined)
    
    @scala.inline
    def setDeleteUrlFunction0(value: () => String): Self = this.set("deleteUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteUrl(value: String | js.Function0[String]): Self = this.set("deleteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteUrl: Self = this.set("deleteUrl", js.undefined)
    
    @scala.inline
    def setDropZoneEnabled(value: Boolean): Self = this.set("dropZoneEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropZoneEnabled: Self = this.set("dropZoneEnabled", js.undefined)
    
    @scala.inline
    def setDropZoneTitle(value: String): Self = this.set("dropZoneTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropZoneTitle: Self = this.set("dropZoneTitle", js.undefined)
    
    @scala.inline
    def setDropZoneTitleClass(value: String): Self = this.set("dropZoneTitleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropZoneTitleClass: Self = this.set("dropZoneTitleClass", js.undefined)
    
    @scala.inline
    def setElCaptionContainer(value: String): Self = this.set("elCaptionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElCaptionContainer: Self = this.set("elCaptionContainer", js.undefined)
    
    @scala.inline
    def setElCaptionText(value: String): Self = this.set("elCaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElCaptionText: Self = this.set("elCaptionText", js.undefined)
    
    @scala.inline
    def setElErrorContainer(value: String): Self = this.set("elErrorContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElErrorContainer: Self = this.set("elErrorContainer", js.undefined)
    
    @scala.inline
    def setElPreviewContainer(value: String): Self = this.set("elPreviewContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElPreviewContainer: Self = this.set("elPreviewContainer", js.undefined)
    
    @scala.inline
    def setElPreviewImage(value: String): Self = this.set("elPreviewImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElPreviewImage: Self = this.set("elPreviewImage", js.undefined)
    
    @scala.inline
    def setElPreviewStatus(value: String): Self = this.set("elPreviewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElPreviewStatus: Self = this.set("elPreviewStatus", js.undefined)
    
    @scala.inline
    def setEncodeUrl(value: Boolean): Self = this.set("encodeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeUrl: Self = this.set("encodeUrl", js.undefined)
    
    @scala.inline
    def setFileActionSettings(value: FileActionSettings): Self = this.set("fileActionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileActionSettings: Self = this.set("fileActionSettings", js.undefined)
    
    @scala.inline
    def setFileTypeSettings(value: FileTypeSettings): Self = this.set("fileTypeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTypeSettings: Self = this.set("fileTypeSettings", js.undefined)
    
    @scala.inline
    def setFocusCaptionOnBrowse(value: Boolean): Self = this.set("focusCaptionOnBrowse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusCaptionOnBrowse: Self = this.set("focusCaptionOnBrowse", js.undefined)
    
    @scala.inline
    def setFocusCaptionOnClear(value: Boolean): Self = this.set("focusCaptionOnClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusCaptionOnClear: Self = this.set("focusCaptionOnClear", js.undefined)
    
    @scala.inline
    def setHideThumbnailContent(value: Boolean): Self = this.set("hideThumbnailContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideThumbnailContent: Self = this.set("hideThumbnailContent", js.undefined)
    
    @scala.inline
    def setInitialCaption(value: String): Self = this.set("initialCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialCaption: Self = this.set("initialCaption", js.undefined)
    
    @scala.inline
    def setInitialPreviewVarargs(value: js.Any*): Self = this.set("initialPreview", js.Array(value :_*))
    
    @scala.inline
    def setInitialPreview(value: String | js.Array[_]): Self = this.set("initialPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPreview: Self = this.set("initialPreview", js.undefined)
    
    @scala.inline
    def setInitialPreviewConfigVarargs(value: PreviewConfig*): Self = this.set("initialPreviewConfig", js.Array(value :_*))
    
    @scala.inline
    def setInitialPreviewConfig(value: js.Array[PreviewConfig]): Self = this.set("initialPreviewConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPreviewConfig: Self = this.set("initialPreviewConfig", js.undefined)
    
    @scala.inline
    def setInitialPreviewCount(value: Double): Self = this.set("initialPreviewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPreviewCount: Self = this.set("initialPreviewCount", js.undefined)
    
    @scala.inline
    def setInitialPreviewDelimiter(value: String): Self = this.set("initialPreviewDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPreviewDelimiter: Self = this.set("initialPreviewDelimiter", js.undefined)
    
    @scala.inline
    def setInitialPreviewShowDelete(value: Boolean): Self = this.set("initialPreviewShowDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPreviewShowDelete: Self = this.set("initialPreviewShowDelete", js.undefined)
    
    @scala.inline
    def setInitialPreviewThumbTags(value: StringDictionary[String]): Self = this.set("initialPreviewThumbTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPreviewThumbTags: Self = this.set("initialPreviewThumbTags", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLayoutTemplates(value: LayoutTemplates): Self = this.set("layoutTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutTemplates: Self = this.set("layoutTemplates", js.undefined)
    
    @scala.inline
    def setMainClass(value: String): Self = this.set("mainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainClass: Self = this.set("mainClass", js.undefined)
    
    @scala.inline
    def setMaxFileCount(value: Double): Self = this.set("maxFileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileCount: Self = this.set("maxFileCount", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setMaxImageHeight(value: Double): Self = this.set("maxImageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxImageHeight: Self = this.set("maxImageHeight", js.undefined)
    
    @scala.inline
    def setMaxImageWidth(value: Double): Self = this.set("maxImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxImageWidth: Self = this.set("maxImageWidth", js.undefined)
    
    @scala.inline
    def setMinFileCount(value: Double): Self = this.set("minFileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFileCount: Self = this.set("minFileCount", js.undefined)
    
    @scala.inline
    def setMinImageHeight(value: Double): Self = this.set("minImageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinImageHeight: Self = this.set("minImageHeight", js.undefined)
    
    @scala.inline
    def setMsgCancelled(value: String): Self = this.set("msgCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgCancelled: Self = this.set("msgCancelled", js.undefined)
    
    @scala.inline
    def setMsgErrorClass(value: String): Self = this.set("msgErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgErrorClass: Self = this.set("msgErrorClass", js.undefined)
    
    @scala.inline
    def setMsgFileNotFound(value: String): Self = this.set("msgFileNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFileNotFound: Self = this.set("msgFileNotFound", js.undefined)
    
    @scala.inline
    def setMsgFileNotReadable(value: String): Self = this.set("msgFileNotReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFileNotReadable: Self = this.set("msgFileNotReadable", js.undefined)
    
    @scala.inline
    def setMsgFilePreviewAborted(value: String): Self = this.set("msgFilePreviewAborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFilePreviewAborted: Self = this.set("msgFilePreviewAborted", js.undefined)
    
    @scala.inline
    def setMsgFilePreviewError(value: String): Self = this.set("msgFilePreviewError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFilePreviewError: Self = this.set("msgFilePreviewError", js.undefined)
    
    @scala.inline
    def setMsgFileSecured(value: String): Self = this.set("msgFileSecured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFileSecured: Self = this.set("msgFileSecured", js.undefined)
    
    @scala.inline
    def setMsgFilesTooLess(value: String): Self = this.set("msgFilesTooLess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFilesTooLess: Self = this.set("msgFilesTooLess", js.undefined)
    
    @scala.inline
    def setMsgFilesTooMany(value: String): Self = this.set("msgFilesTooMany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFilesTooMany: Self = this.set("msgFilesTooMany", js.undefined)
    
    @scala.inline
    def setMsgFoldersNotAllowed(value: String): Self = this.set("msgFoldersNotAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFoldersNotAllowed: Self = this.set("msgFoldersNotAllowed", js.undefined)
    
    @scala.inline
    def setMsgImageHeightLarge(value: String): Self = this.set("msgImageHeightLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgImageHeightLarge: Self = this.set("msgImageHeightLarge", js.undefined)
    
    @scala.inline
    def setMsgImageHeightSmall(value: String): Self = this.set("msgImageHeightSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgImageHeightSmall: Self = this.set("msgImageHeightSmall", js.undefined)
    
    @scala.inline
    def setMsgImageWidthLarge(value: String): Self = this.set("msgImageWidthLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgImageWidthLarge: Self = this.set("msgImageWidthLarge", js.undefined)
    
    @scala.inline
    def setMsgImageWidthSmall(value: String): Self = this.set("msgImageWidthSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgImageWidthSmall: Self = this.set("msgImageWidthSmall", js.undefined)
    
    @scala.inline
    def setMsgInvalidFileExtension(value: String): Self = this.set("msgInvalidFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgInvalidFileExtension: Self = this.set("msgInvalidFileExtension", js.undefined)
    
    @scala.inline
    def setMsgInvalidFileType(value: String): Self = this.set("msgInvalidFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgInvalidFileType: Self = this.set("msgInvalidFileType", js.undefined)
    
    @scala.inline
    def setMsgLoading(value: String): Self = this.set("msgLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgLoading: Self = this.set("msgLoading", js.undefined)
    
    @scala.inline
    def setMsgNo(value: String): Self = this.set("msgNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgNo: Self = this.set("msgNo", js.undefined)
    
    @scala.inline
    def setMsgProgress(value: String): Self = this.set("msgProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgProgress: Self = this.set("msgProgress", js.undefined)
    
    @scala.inline
    def setMsgSelected(value: String): Self = this.set("msgSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgSelected: Self = this.set("msgSelected", js.undefined)
    
    @scala.inline
    def setMsgSizeTooLarge(value: String): Self = this.set("msgSizeTooLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgSizeTooLarge: Self = this.set("msgSizeTooLarge", js.undefined)
    
    @scala.inline
    def setMsgUploadAborted(value: String): Self = this.set("msgUploadAborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgUploadAborted: Self = this.set("msgUploadAborted", js.undefined)
    
    @scala.inline
    def setMsgValidationError(value: String): Self = this.set("msgValidationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgValidationError: Self = this.set("msgValidationError", js.undefined)
    
    @scala.inline
    def setMsgValidationErrorClass(value: String): Self = this.set("msgValidationErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgValidationErrorClass: Self = this.set("msgValidationErrorClass", js.undefined)
    
    @scala.inline
    def setMsgValidationErrorIcon(value: String): Self = this.set("msgValidationErrorIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgValidationErrorIcon: Self = this.set("msgValidationErrorIcon", js.undefined)
    
    @scala.inline
    def setMsgZoomModalHeading(value: String): Self = this.set("msgZoomModalHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgZoomModalHeading: Self = this.set("msgZoomModalHeading", js.undefined)
    
    @scala.inline
    def setMsgZoomTitle(value: String): Self = this.set("msgZoomTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgZoomTitle: Self = this.set("msgZoomTitle", js.undefined)
    
    @scala.inline
    def setOtherActionButtons(value: String): Self = this.set("otherActionButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherActionButtons: Self = this.set("otherActionButtons", js.undefined)
    
    @scala.inline
    def setOverwriteInitial(value: Boolean): Self = this.set("overwriteInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteInitial: Self = this.set("overwriteInitial", js.undefined)
    
    @scala.inline
    def setPreviewClass(value: String): Self = this.set("previewClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewClass: Self = this.set("previewClass", js.undefined)
    
    @scala.inline
    def setPreviewFileExtSettings(value: PreviewFileExtSettings): Self = this.set("previewFileExtSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewFileExtSettings: Self = this.set("previewFileExtSettings", js.undefined)
    
    @scala.inline
    def setPreviewFileIcon(value: String): Self = this.set("previewFileIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewFileIcon: Self = this.set("previewFileIcon", js.undefined)
    
    @scala.inline
    def setPreviewFileIconClass(value: String): Self = this.set("previewFileIconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewFileIconClass: Self = this.set("previewFileIconClass", js.undefined)
    
    @scala.inline
    def setPreviewFileIconSettings(value: PreviewFileIconSettings): Self = this.set("previewFileIconSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewFileIconSettings: Self = this.set("previewFileIconSettings", js.undefined)
    
    @scala.inline
    def setPreviewFileType(value: image | text | any): Self = this.set("previewFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewFileType: Self = this.set("previewFileType", js.undefined)
    
    @scala.inline
    def setPreviewSettings(value: PreviewSettings): Self = this.set("previewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewSettings: Self = this.set("previewSettings", js.undefined)
    
    @scala.inline
    def setPreviewTemplates(value: PreviewTemplates): Self = this.set("previewTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewTemplates: Self = this.set("previewTemplates", js.undefined)
    
    @scala.inline
    def setPreviewThumbTags(value: StringDictionary[String]): Self = this.set("previewThumbTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewThumbTags: Self = this.set("previewThumbTags", js.undefined)
    
    @scala.inline
    def setProgressClass(value: String): Self = this.set("progressClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressClass: Self = this.set("progressClass", js.undefined)
    
    @scala.inline
    def setProgressCompleteClass(value: String): Self = this.set("progressCompleteClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressCompleteClass: Self = this.set("progressCompleteClass", js.undefined)
    
    @scala.inline
    def setProgressErrorClass(value: String): Self = this.set("progressErrorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressErrorClass: Self = this.set("progressErrorClass", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: String): Self = this.set("removeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRemoveFromPreviewOnError(value: Boolean): Self = this.set("removeFromPreviewOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFromPreviewOnError: Self = this.set("removeFromPreviewOnError", js.undefined)
    
    @scala.inline
    def setRemoveIcon(value: String): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    
    @scala.inline
    def setRemoveLabel(value: String): Self = this.set("removeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveLabel: Self = this.set("removeLabel", js.undefined)
    
    @scala.inline
    def setRemoveTitle(value: String): Self = this.set("removeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTitle: Self = this.set("removeTitle", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResizeDefaultImageType(value: String): Self = this.set("resizeDefaultImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeDefaultImageType: Self = this.set("resizeDefaultImageType", js.undefined)
    
    @scala.inline
    def setResizeImage(value: Boolean): Self = this.set("resizeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeImage: Self = this.set("resizeImage", js.undefined)
    
    @scala.inline
    def setResizeImageQuality(value: Double): Self = this.set("resizeImageQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeImageQuality: Self = this.set("resizeImageQuality", js.undefined)
    
    @scala.inline
    def setResizePreference(value: width | height): Self = this.set("resizePreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizePreference: Self = this.set("resizePreference", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setShowAjaxErrorDetails(value: Boolean): Self = this.set("showAjaxErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAjaxErrorDetails: Self = this.set("showAjaxErrorDetails", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
    
    @scala.inline
    def setShowCaption(value: Boolean): Self = this.set("showCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCaption: Self = this.set("showCaption", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = this.set("showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClose: Self = this.set("showClose", js.undefined)
    
    @scala.inline
    def setShowPreview(value: Boolean): Self = this.set("showPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreview: Self = this.set("showPreview", js.undefined)
    
    @scala.inline
    def setShowRemove(value: Boolean): Self = this.set("showRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRemove: Self = this.set("showRemove", js.undefined)
    
    @scala.inline
    def setShowUpload(value: Boolean): Self = this.set("showUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUpload: Self = this.set("showUpload", js.undefined)
    
    @scala.inline
    def setShowUploadedThumbs(value: Boolean): Self = this.set("showUploadedThumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUploadedThumbs: Self = this.set("showUploadedThumbs", js.undefined)
    
    @scala.inline
    def setSlugCallback(value: /* filename */ String => String): Self = this.set("slugCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSlugCallback: Self = this.set("slugCallback", js.undefined)
    
    @scala.inline
    def setTextEncoding(value: String): Self = this.set("textEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEncoding: Self = this.set("textEncoding", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUploadAsync(value: Boolean): Self = this.set("uploadAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadAsync: Self = this.set("uploadAsync", js.undefined)
    
    @scala.inline
    def setUploadClass(value: String): Self = this.set("uploadClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadClass: Self = this.set("uploadClass", js.undefined)
    
    @scala.inline
    def setUploadExtraDataFunction2(value: (/* previewId */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => js.Object): Self = this.set("uploadExtraData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUploadExtraData(
      value: js.Object | (js.Function2[/* previewId */ js.UndefOr[String], /* index */ js.UndefOr[Double], js.Object])
    ): Self = this.set("uploadExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadExtraData: Self = this.set("uploadExtraData", js.undefined)
    
    @scala.inline
    def setUploadIcon(value: String): Self = this.set("uploadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadIcon: Self = this.set("uploadIcon", js.undefined)
    
    @scala.inline
    def setUploadLabel(value: String): Self = this.set("uploadLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadLabel: Self = this.set("uploadLabel", js.undefined)
    
    @scala.inline
    def setUploadTitle(value: String): Self = this.set("uploadTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadTitle: Self = this.set("uploadTitle", js.undefined)
    
    @scala.inline
    def setUploadUrlFunction0(value: () => String): Self = this.set("uploadUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUploadUrl(value: String | js.Function0[String]): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
    
    @scala.inline
    def setUploadUrlThumbFunction0(value: () => String): Self = this.set("uploadUrlThumb", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUploadUrlThumb(value: String | js.Function0[String]): Self = this.set("uploadUrlThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrlThumb: Self = this.set("uploadUrlThumb", js.undefined)
    
    @scala.inline
    def setValidateInitialCount(value: Boolean): Self = this.set("validateInitialCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateInitialCount: Self = this.set("validateInitialCount", js.undefined)
    
    @scala.inline
    def setZoomIndicator(value: String): Self = this.set("zoomIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomIndicator: Self = this.set("zoomIndicator", js.undefined)
  }
}
