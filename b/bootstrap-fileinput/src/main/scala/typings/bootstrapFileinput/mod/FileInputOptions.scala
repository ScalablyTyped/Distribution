package typings.bootstrapFileinput.mod

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
import scala.scalajs.js.annotation._

trait FileInputOptions extends js.Object {
  /**
    additional ajax settings to pass to the plugin before submitting the delete ajax request in each initial preview thumbnail.
    Applicable only for ajax uploads.
    This can be useful to pass additional tokens to headers or one can use it for setting other ajax options for advanced cases.
    Refer the jQuery ajax documentation for the various settings you can configure.
    */
  var ajaxDeleteSettings: js.UndefOr[JQueryAjaxSettings] = js.undefined
  /**
    additional ajax settings to pass to the plugin before submitting the ajax request for upload.
    Applicable only for ajax uploads.
    This can be useful to pass additional tokens to headers or one can use it for setting other ajax options for advanced cases.
    Refer the jQuery ajax documentation for the various settings you can configure.
    */
  var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.undefined
  /**
    the list of allowed file extensions for upload.
    This by default is set to null which means the plugin supports all file extensions for upload.
    If an invalid file extension is found, then a validation error message as set in msgInvalidFileExtension will be raised.
    Note:
    You need to be careful in case you are setting both allowedFileTypes and allowedFileExtensions. In this case, the allowedFileTypes property is validated first and generally precedes the allowedFileExtensions setting (and the latter validation maybe skipped).
    */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    the list of allowed file types for upload.
    This by default is set to null which means the plugin supports all file types for upload.
    If an invalid file type is found, then a validation error message as set in msgInvalidFileType will be raised.
    Note:
    You need to be careful in case you are setting both allowedFileTypes and allowedFileExtensions. In this case, the allowedFileTypes property is validated first and generally precedes the allowedFileExtensions setting (and the latter validation maybe skipped).
    */
  var allowedFileTypes: js.UndefOr[js.Array[image | html | text | video | audio | flash | `object`]] = js.undefined
  /**
    the list of allowed mime types for preview.
    This is set to null by default which means all possible mime types are allowed.
    This setting works in combination with allowedPreviewTypes to filter only the needed file types allowed for preview.
    */
  var allowedPreviewMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    the list of allowed preview types for your widget.
    This by default supports all file types for preview.
    The plugin by default treats each file as an object if it does not match any of the previous types.
    To disable this behavior, you can remove object from the list of allowedPreviewTypes OR fine tune it through allowedPreviewMimeTypes.
    To disable content preview for all file-types and show the previewIcon instead as a thumbnail, set this to null, empty, or false.
    */
  var allowedPreviewTypes: js.UndefOr[js.Array[image | html | text | video | audio | flash | `object`]] = js.undefined
  /**
    Whether to automatically replace the files in the preview after the maxFileCount limit is reached and a new set of file(s) is/are selected.
    This will only work if a valid maxFileCount is set.
    Defaults to false.
    */
  var autoReplace: js.UndefOr[Boolean] = js.undefined
  /**
    the CSS class for the file picker/browse button. Defaults to btn btn-primary.
    */
  var browseClass: js.UndefOr[String] = js.undefined
  /**
    the icon to display before the label for the file picker/browse button. Defaults to <i class="glyphicon glyphicon-folder-open"></i>&nbsp;.
    */
  var browseIcon: js.UndefOr[String] = js.undefined
  /**
    the label to display for the file picker/browse button. Defaults to Browse ….
    */
  var browseLabel: js.UndefOr[String] = js.undefined
  /**
    the CSS class for the each of the button labels for browse, remove, upload, and cancel.
    Defaults to hidden-xs, which automatically hides the button labels for small screen devices and renders as smaller iconic buttons to fit to the screen.
    */
  var buttonLabelClass: js.UndefOr[String] = js.undefined
  /**
    Any additional CSS class to append to the caption container.
    */
  var captionClass: js.UndefOr[String] = js.undefined
  /**
    the list of additional custom tags that will be replaced in the layout templates.
    */
  var customLayoutTags: js.UndefOr[js.Object] = js.undefined
  /**
    the list of additional custom tags that will be replaced in the preview templates.
    */
  var customPreviewTags: js.UndefOr[js.Object] = js.undefined
  /**
    the default content / markup to show by default in the preview window whenever the files are cleared or the input is cleared.
    This can be useful for use cases like showing the default user profile picture or profile image before upload to overwrite.
    This is a bit different from initialPreview in the sense, that the initialPreview content will always be displayed unless it is deleted or overwritten based on overwriteInitial.
    The defaultPreviewContent on the other hand will only be shown ONLY on initialization OR whenever you clear the preview.
    At other times when files have been selected this will be overwritten temporarily until file(s) selected is/are cleared.
    This property can be useful to display for example a default user profile picture (or saved picture) in the preview window unless the user selects a picture.
    */
  var defaultPreviewContent: js.UndefOr[String] = js.undefined
  /**
    the extra data that will be passed as data to the initial preview delete url/AJAX server call via POST.
    This will be overridden by the initialPreviewConfig['extra'] property.
    This property is only applicable for ajax deletions in initial preview and when you have set a value for initialPreviewConfig['url'] or deleteUrl.
    This can be setup either as an object (associative array of keys and values) or as a function callback.
    Note
    The ajax delete action will send the following data to server via POST:
    key: the key setting as setup in initialPreviewConfig['key']
    any other extra data passed as key: value pairs either via initialPreviewConfig['extra'] OR deleteExtraData if former is not set.
    */
  var deleteExtraData: js.UndefOr[js.Object | js.Function0[js.Object]] = js.undefined
  /**
    the URL for deleting the image/content in the initial preview via AJAX post response. This will be overridden by the initialPreviewConfig['url'] property.
    Note
    The ajax delete action will send the following data to server via POST:
    key: the key setting as setup in initialPreviewConfig['key']
    any other extra data passed as key: value pairs either via initialPreviewConfig['extra'] OR deleteExtraData if former is not set.
    */
  var deleteUrl: js.UndefOr[String] = js.undefined
  /**
    whether to enable a drag and drop zone for dragging and dropping files to.
    This is available only for ajax based uploads.
    Defaults to true.
    */
  var dropZoneEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    title to be displayed in the drag and drop zone.
    This is available only for ajax based uploads.
    Defaults to:
    Drag & drop files here ….
    */
  var dropZoneTitle: js.UndefOr[String] = js.undefined
  /**
    CSS class for the drag & drop zone title.
    Defaults to file-drop-zone-title.
    */
  var dropZoneTitleClass: js.UndefOr[String] = js.undefined
  /**
    the identifier for the container element containing the caption (e.g. '#id').
    If not set, will default to the container with CSS class file-caption inside the main plugin container.
    */
  var elCaptionContainer: js.UndefOr[String] = js.undefined
  /**
    the identifier for the container element containing the caption text (e.g. '#id').
    If not set, will default to the container with CSS class file-caption-name inside the main plugin container.
    */
  var elCaptionText: js.UndefOr[String] = js.undefined
  /**
    the identifier for the container element displaying the error (e.g. '#id').
    If not set, will default to the container with CSS class kv-fileinput-error inside the preview container (identified by elPreviewContainer).
    The msgErrorClass will be automatically appended to this container before displaying the error.
    */
  var elErrorContainer: js.UndefOr[String] = js.undefined
  /**
    the identifier for the container element containing the preview (e.g. '#id').
    If not set, will default to the container with CSS class file-preview inside the main plugin container.
    */
  var elPreviewContainer: js.UndefOr[String] = js.undefined
  /**
    the identifier for the element containing the preview image thumbnails (e.g. '#id').
    If not set, will default to the container with CSS class file-preview-thumbnails inside the main plugin container.
    */
  var elPreviewImage: js.UndefOr[String] = js.undefined
  /**
    the identifier for the element containing the preview progress status (e.g. '#id').
    If not set, will default to the container with CSS class file-preview-status inside the main plugin container.
    */
  var elPreviewStatus: js.UndefOr[String] = js.undefined
  /**
    configuration for setting up file actions for newly selected file thumbnails in the preview window.
    */
  var fileActionsettings: js.UndefOr[FileActionSettings] = js.undefined
  /**
    the settings to validate and identify each file type when a file is selected for upload.
    This is a list of callbacks, which accepts the file mime type and file name as a parameter.
    */
  var fileTypeSettings: js.UndefOr[FileTypeSettings] = js.undefined
  /**
    the initial preview caption text to be displayed.
    If you do not set a value here and initialPreview is set to true this will default to "{preview-file-count} files selected", where {preview-file-count} is the count of the files passed in initialPreview.
    */
  var initialCaption: js.UndefOr[String] = js.undefined
  /**
    The initial preview content to be displayed.
    You can pass the minimal HTML markup for displaying your image, text, or file.
    If set as a string, this will display a single file in the initial preview if there is no delimiter. You can set a delimiter (as defined in initialDelimiter) to show multiple files in initial preview.
    If set as an array, it will display all files in the array as an initial preview (useful for multiple file upload scenarios).
    The following CSS classes will need to be added for displaying each file type as per the plugin style theme:
    image files: Include CSS class file-preview-image
    text files: Include CSS class file-preview-text
    other files: Include CSS class file-preview-other
    */
  var initialPreview: js.UndefOr[String | js.Array[_]] = js.undefined
  /**
    the configuration for setting up important properties for each initialPreview item (that is setup as part of initialPreview).
    */
  var initialPreviewConfig: js.UndefOr[js.Array[PreviewConfig]] = js.undefined
  /**
    the count of initial preview items that will be added to the count of files selected in preview. This is applicable when displaying the right caption, when overwriteInitial is set to false.
    */
  var initialPreviewCount: js.UndefOr[Double] = js.undefined
  /**
    the delimiter to be used for splitting the initial preview content as individual file thumbnails (applicable only if initialPreview is passed as a string instead of array). Defaults to *$$*.
    */
  var initialPreviewDelimiter: js.UndefOr[String] = js.undefined
  /**
    whether the delete button will be displayed for each thumbnail that has been created with initialPreview.
    */
  var initialPreviewShowDelete: js.UndefOr[Boolean] = js.undefined
  /**
    this is an extension of previewThumbTags specifically for initial preview content - but will be configured as an array of objects corresponding to each initial preview thumbnail. The initial preview thumbnails set via initialPreview will read this configuration for replacing tags.
    */
  var initialPreviewThumbTags: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    Language configuration for the plugin to enable the plugin to display messages for your locale (you must set the ISO code for the language).
    You can have multiple language widgets on the same page.
    The locale JS file for the language code must be defined as mentioned in the translations section: http://plugins.krajee.com/file-input#translations
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    the templates configuration for rendering each part of the layout.
    */
  var layoutTemplates: js.UndefOr[LayoutTemplates] = js.undefined
  /**
    Any additional CSS class to append to the main plugin container.
    */
  var mainClass: js.UndefOr[String] = js.undefined
  /**
    the maximum number of files allowed for each multiple upload.
    If set to 0, it means number of files allowed is unlimited.
    Defaults to 0.
    */
  var maxFileCount: js.UndefOr[Double] = js.undefined
  /**
    the maximum file size for upload in KB.
    If set to 0, it means size allowed is unlimited.
    Defaults to 0.
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  /**
    the maximum allowed image height in px if you are uploading image files.
    Defaults to null which means no limit on image height.
    Note that if you set resizeImage property to true, then the entire image will be resized within this height (depending on resizePreference).
    */
  var maxImageHeight: js.UndefOr[Double] = js.undefined
  /**
    the maximum allowed image width in px if you are uploading image files.
    Defaults to null which means no limit on image width.
    Note that if you set resizeImage property to true, then the entire image will be resized within this width (depending on resizePreference).
    */
  var maxImageWidth: js.UndefOr[Double] = js.undefined
  /**
    the minimum number of files allowed for each multiple upload.
    If set to 0, it means number of files are optional.
    Defaults to 0.
    */
  var minFileCount: js.UndefOr[Double] = js.undefined
  /**
    the minimum allowed image height in px if you are uploading image files.
    Defaults to null which means no limit on image height.
    */
  var minImageHeight: js.UndefOr[Double] = js.undefined
  /**
    the message that will be displayed within the progress bar when file upload is aborted or cancelled.
    Defaults to Cancelled.
    */
  var msgCancelled: js.UndefOr[String] = js.undefined
  /**
    the css class for the error message to be displayed in the preview window when the file size exceeds maxSize.
    Defaults to file-error-message.
    */
  var msgErrorClass: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file selected is not found by the FileReader.
    Defaults to:
    File "{name}" not found!
    where:
    {name}: will be replaced by the file name being uploaded
    */
  var msgFileNotFound: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file selected is not readable by the FileReader API.
    Defaults to:
    File "{name}" is not readable.
    where:
    {name}: will be replaced by the file name being uploaded
    */
  var msgFileNotReadable: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file preview upload is aborted.
    Defaults to:
    File preview aborted for "{name}".
    where:
    {name}: will be replaced by the file name being uploaded
    */
  var msgFilePreviewAborted: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed for any other error when previewing the file.
    Defaults to:
    An error occurred while reading the file "{name}".
    where:
    {name}: will be replaced by the file name being uploaded
    */
  var msgFilePreviewError: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file selected is not allowed to be accessed due to a security exception.
    Defaults to:
    Security restrictions prevent reading the file "{name}".
    where:
    {name}: will be replaced by the file name being uploaded
    */
  var msgFileSecured: js.UndefOr[String] = js.undefined
  /**
    message to be displayed when the file count is less than the minimum count as set in minFileCount.
    Defaults to:
    You must select at least {n} {files} to upload. Please retry your upload!
    where:
    {n}: will be replaced by the allowed minimum files as set in minFileCount.
    {files}: will be replaced with fileSingle or filePlural properties in locale file depending on the minFileCount.
    */
  var msgFilesTooLess: js.UndefOr[String] = js.undefined
  /**
    the message to be displayed when the file count exceeds maximum count as set in maxFileCount.
    Defaults to:
    Number of files selected for upload ({n}) exceeds maximum allowed limit of {m}. Please retry your upload!
    where:
    {n}: will be replaced by number of files selected for upload
    {m}: will be replaced by the allowed maximum files as set in maxFileCount
    */
  var msgFilesTooMany: js.UndefOr[String] = js.undefined
  /**
    the message displayed when a folder has been dragged to the drop zone.
    Defaults to:
    Drag & drop files only! {n} folder(s) dropped were skipped.
    The following variables will be replaced:
    {n}: the number of folders dropped.
    */
  var msgFoldersNotAllowed: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file selected for preview is an image and its height exceeds the maxImageHeight setting.
    Defaults to:
    Height of image file "{name}" cannot exceed {size} px.
    where:
    {name}: will be replaced by the file name being uploaded.
    {size}: will be replaced by the maxImageHeight setting.
    */
  var msgImageHeightLarge: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file selected for preview is an image and its height is less than the minImageHeight setting.
    Defaults to:
    Height of image file "{name}" must be at least {size} px.
    where:
    {name}: will be replaced by the file name being uploaded.
    {size}: will be replaced by the minImageHeight setting.
    */
  var msgImageHeightSmall: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file selected for preview is an image and its width exceeds the maxImageWidth setting.
    Defaults to:
    Width of image file "{name}" cannot exceed {size} px.
    where:
    {name}: will be replaced by the file name being uploaded.
    {size}: will be replaced by the maxImageWidth setting.
    */
  var msgImageWidthLarge: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed when the file selected for preview is an image and its width is less than the minImageWidth setting.
    Defaults to:
    Width of image file "{name}" must be at least {size} px.
    where:
    {name}: will be replaced by the file name being uploaded.
    {size}: will be replaced by the minImageWidth setting.
    */
  var msgImageWidthSmall: js.UndefOr[String] = js.undefined
  /**
    the message to be displayed when the file type is not in one of the file extensions set in allowedFileExtensions.
    Defaults to:
    Invalid extension for file "{name}". Only "{extensions}" files are supported.
    where:
    {name}: will be replaced by the file name being uploaded
    {extensions}: will be replaced by the comma separated list of extensions defined in allowedFileExtensions.
    */
  var msgInvalidFileExtension: js.UndefOr[String] = js.undefined
  /**
    the message to be displayed when the file type is not in one of the file types set in allowedFileTypes.
    Defaults to:
    Invalid type for file "{name}". Only "{types}" files are supported.
    where:
    {name}: will be replaced by the file name being uploaded
    {types}: will be replaced by the comma separated list of types defined in allowedFileTypes.
    */
  var msgInvalidFileType: js.UndefOr[String] = js.undefined
  /**
    the message displayed when the files are getting read and loaded for preview.
    Defaults to
    Loading file {index} of {files} …
    The following special variables will be replaced:
    {index}: the sequence number of the current file being loaded.
    {files}: the total number of files selected for upload.
    */
  var msgLoading: js.UndefOr[String] = js.undefined
  /**
    the message that will be displayed when ZERO files are found.
    Defaults to No.
    */
  var msgNo: js.UndefOr[String] = js.undefined
  /**
    the progress message displayed as each file is loaded for preview.
    Defaults to:
    Loading file {index} of {files} - {name} - {percent}% completed.
    The following variables will be replaced:
    {index}: the sequence number of the current file being loaded.
    {files}: the total number of files selected for upload.
    {percent}: the percentage of file read and loaded.
    {name}: the name of the current file being loaded.
    */
  var msgProgress: js.UndefOr[String] = js.undefined
  /**
    the progress message displayed in caption window when multiple (more than one) files are selected.
    Defaults to:
    {n} files selected.
    The following variables will be replaced:
    {n}: the number of files selected.
    */
  var msgSelected: js.UndefOr[String] = js.undefined
  /**
    the message to be displayed when the file size exceeds maximum size.
    Defaults to:
    File "{name}" ({size} KB) exceeds maximum allowed upload size of {maxSize} KB. Please retry your upload!
    where:
    {name}: will be replaced by the file name being uploaded
    {size}: will be replaced by the uploaded file size
    {maxSize}: will be replaced by the maxFileSize parameter.
    */
  var msgSizeTooLarge: js.UndefOr[String] = js.undefined
  /**
    the message to be displayed when an ongoing ajax file upload is aborted by pressing the Cancel button.
    Defaults to The file upload was aborted.
    If this is set to null or empty, the internal ajax error message will be displayed - Defaults to File Upload Error.
    */
  var msgUploadAborted: js.UndefOr[String] = js.undefined
  /**
    the exception message to be displayed within the caption container (instead of msgFilesSelected), when a validation error is encountered.
    Defaults to File Upload Error.
    */
  var msgValidationError: js.UndefOr[String] = js.undefined
  /**
    the css class for the validation error message displayed in the caption container.
    Defaults to text-danger.
    */
  var msgValidationErrorClass: js.UndefOr[String] = js.undefined
  /**
    the icon to be displayed before the validation error in the caption container.
    Defaults to <i class="glyphicon glyphicon-exclamation-sign"></i>
    */
  var msgValidationErrorIcon: js.UndefOr[String] = js.undefined
  /**
    the heading of the modal dialog that displays the zoomed file content.
    This is currently applicable only for text file previews.
    Defaults to Detailed Preview.
    */
  var msgZoomModalHeading: js.UndefOr[String] = js.undefined
  /**
    the title displayed (before the file name) on hover of the zoom button for zooming the file content in a modal window.
    This is currently applicable only for text file previews.
    Defaults to View details.
    */
  var msgZoomTitle: js.UndefOr[String] = js.undefined
  /**
    markup for additional action buttons to display within the initial preview thumbnails (for example displaying an image edit button).
    The following tag can be used in the markup and will be automatically replaced:
    {dataKey}: Will be replaced with the key set within initialPreviewConfig.
    */
  var otherActionButtons: js.UndefOr[String] = js.undefined
  /**
    whether you wish to overwrite the initial preview content and caption setup.
    This defaults to true, whereby, any initialPreview content set will be overwritten, when new file is uploaded or when files are cleared.
    Setting it to false will help displaying a saved image or file from database always - useful especially when using the multiple file upload feature.
    */
  var overwriteInitial: js.UndefOr[Boolean] = js.undefined
  /**
    Any additional CSS class to append to the preview container.
    */
  var previewClass: js.UndefOr[String] = js.undefined
  /**
    the extensions to be auto derived for each file extension (type).
    This is useful if you want to set the same icon for multiple file extension types.
    You need to set this as `key: value` pairs, where the key corresponds to a file extension as set in previewFileIconSettings (e.g. doc, docx, xls etc.).
    The value will be a function callback that accepts the following parameter:
    ext: string, the file extension (without the . [dot]) of the file currently selected in the preview.
    You can configure the callback to match the set of file extensions (via regex or similar) for each `key` and return a boolean output if the file extension matches.
    */
  var previewFileExtSettings: js.UndefOr[PreviewFileExtSettings] = js.undefined
  /**
    the icon to be shown in each preview file thumbnail when an unreadable file type for preview is detected. Defaults to <i class="glyphicon glyphicon-file"></i> &nbsp;.
    */
  var previewFileIcon: js.UndefOr[String] = js.undefined
  /**
    the CSS class to be applied to the preview file icon container. Defaults to file-icon-4x.
    */
  var previewFileIconClass: js.UndefOr[String] = js.undefined
  /**
    the preview icon markup settings for each file extension (type).
    You need to set this as key: value pairs, where the key corresponds to a file extension (e.g. doc, docx, xls etc.), and the value corresponds to the markup of the icon to be rendered.
    If this is not set OR a file extension is not set here, the preview will default to previewFileIcon.
    Note that displaying the icons instead of file content is controlled via allowedPreviewTypes and allowedPreviewMimeTypes
    */
  var previewFileIconSettings: js.UndefOr[PreviewFileIconSettings] = js.undefined
  /**
    the type of files that are to be displayed in the preview window.
    Defaults to image.
    Can be one of the following:
    image: Only image type files will be shown in preview.
    text: Only text type files will be shown in preview.
    any: Both image and text files content will be shown in preview.
    Files other than image or text will be displayed as a thumbnail with the filename in the preview window.
    */
  var previewFileType: js.UndefOr[image | text | any] = js.undefined
  /**
    the format settings (width and height) for rendering each preview file type.
    */
  var previewSettings: js.UndefOr[PreviewSettings] = js.undefined
  /**
    the templates configuration for rendering each preview file type.
    */
  var previewTemplates: js.UndefOr[PreviewTemplates] = js.undefined
  /**
    this will be a list of tags used in thumbnail templates that will be replaced dynamically within the thumbnail markup, when the thumbnail is rendered.
    */
  var previewThumbTags: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    the upload progress bar CSS class to be applied when AJAX upload is in process (applicable only for ajax uploads).
    Defaults to progress-bar progress-bar-success progress-bar-striped active.
    */
  var progressClass: js.UndefOr[String] = js.undefined
  /**
    the upload progress bar CSS class to be applied when AJAX upload is in process (applicable only for ajax uploads).
    Defaults to progress-bar progress-bar-success progress-bar-striped active.
    */
  var progressCompleteClass: js.UndefOr[String] = js.undefined
  /**
    the upload progress bar CSS class to be applied when AJAX upload is cancelled or aborted.
    Defaults to progress-bar progress-bar-danger.
    */
  var progressErrorClass: js.UndefOr[String] = js.undefined
  /**
    the CSS class for the file remove button. Defaults to btn btn-default.
    */
  var removeClass: js.UndefOr[String] = js.undefined
  /**
    whether the file thumbnail should be removed from preview on error. Defaults to false.
    */
  var removeFromPreviewOnError: js.UndefOr[Boolean] = js.undefined
  /**
    the icon to display before the label for the file picker/remove button. Defaults to <i class="glyphicon glyphicon-trash"></i> &nbsp;.
    */
  var removeIcon: js.UndefOr[String] = js.undefined
  /**
    the label to display for the file remove button. Defaults to Remove.
    */
  var removeLabel: js.UndefOr[String] = js.undefined
  /**
    the title to display on hover for the file remove button. Defaults to Clear selected files.
    */
  var removeTitle: js.UndefOr[String] = js.undefined
  /**
    the default image mime type of the converted image after resize.
    Defaults to image/jpeg.
    */
  var resizeDefaultImageType: js.UndefOr[String] = js.undefined
  /**
    whether to add ability to resize uploaded images. Defaults to false.
    Note that resizing images requires HTML5 canvas support which is supported on most modern browsers.
    In addition, you must include the JavaScript-Canvas-to-Blob plugin by blueimp by including canvas-to-blob.js in your application.
    This JS file must be loaded before fileinput.js on the page.
    The JavaScript-Canvas-to-Blob source files are available in js/plugins folder of bootstrap-fileinput project page.
    The canvas-to-blob.js plugin is a polyfill for canvas.toBlob method and is needed for allowing the resized image files via HTML5 canvas to be returned as a blob
    */
  var resizeImage: js.UndefOr[Boolean] = js.undefined
  /**
    the quality of the resized image. This must be a decimal number between 0.00 to 1.00.
    Defaults to 0.92.
    */
  var resizeImageQuality: js.UndefOr[Double] = js.undefined
  /**
    preference to resize the image based on width or height.
    Defaults to width.
    This property is parsed only when resizeImage is true.
    If set to width, the maxImageWidth property is first tested and if image size is greater than this, then the image is resized to maxImageWidth.
    The image height is resized and adjusted in the same ratio as width.
    In case, the image width is already less than maxImageWidth then the maxImageHeight property is used to resize and width is adjusted in same ratio.
    This will behave conversely, when resizePreference is set to height - the maxImageHeight will be first tested against image height and then the rest of steps will be similarly parsed with preference given to height instead of width as before.
    */
  var resizePreference: js.UndefOr[width | height] = js.undefined
  /**
    whether to show details of the error stack from the server log when an error is encountered via ajax response.
    Defaults to true.
    */
  var showAjaxErrorDetails: js.UndefOr[Boolean] = js.undefined
  /**
    Whether to display the file upload cancel button.
    Defaults to true.
    This will be only enabled and displayed when an AJAX upload is in process.
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  /**
    Whether to display the file caption.
    Defaults to true.
    */
  var showCaption: js.UndefOr[Boolean] = js.undefined
  /**
    Whether to display the close icon in the preview.
    Defaults to true.
    This will be only parsed when showPreview is true or when you are using the {close} tag in your preview templates.
    */
  var showClose: js.UndefOr[Boolean] = js.undefined
  /**
    Whether to display the file preview.
    Defaults to true.
    */
  var showPreview: js.UndefOr[Boolean] = js.undefined
  /**
    Whether to display the file remove/clear button.
    Defaults to true.
    */
  var showRemove: js.UndefOr[Boolean] = js.undefined
  /**
    Whether to display the file upload button.
    Defaults to true.
    This will default to a form submit button, unless the uploadUrl is specified.
    */
  var showUpload: js.UndefOr[Boolean] = js.undefined
  /**
    Whether to persist display of the uploaded file thumbnails in the preview window (for ajax uploads) until the remove/clear button is pressed.
    Defaults to true.
    When set to false, a next batch of files selected for upload will clear these thumbnails from preview.
    */
  var showUploadedThumbs: js.UndefOr[Boolean] = js.undefined
  /**
    a callback to convert the filename as a slug string eliminating special characters.
    If not set, it will use the plugin's own internal slugDefault method.
    This callback function includes the filename as parameter and must return a converted filename string.
    */
  var slugCallback: js.UndefOr[js.Function1[/* filename */ String, String]] = js.undefined
  /**
    the encoding to be used while reading a text file.
    Applicable only for previewing text files.
    Defaults to UTF-8.
    */
  var textEncoding: js.UndefOr[String] = js.undefined
  /**
    * Theming
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    whether the batch upload of multiple files will be asynchronous/in parallel.
    Defaults to true.
    */
  var uploadAsync: js.UndefOr[Boolean] = js.undefined
  /**
    the CSS class for the file upload button. Defaults to btn btn-default.
    */
  var uploadClass: js.UndefOr[String] = js.undefined
  /**
    the extra data that will be passed as data to the url/AJAX server call via POST.
    This property is only applicable for ajax uploads and when you have set a value for uploadUrl.
    This can be setup either as an object (associative array of keys and values) or as a function callback.
    As an object, it can be set for example as:
    { id: 100, value: '100 Details' }
    Note that for uploading individual file via thumbnail, the function callback can also receive the thumbnail previewId and index as parameters. These are described below:
    previewId: the identifier for the preview file container (only available when uploading each thumbnail file)
    index: the zero-based sequential index of the loaded file in the preview list (only available when uploading each thumbnail file)
    */
  var uploadExtraData: js.UndefOr[
    js.Object | (js.Function2[/* previewId */ js.UndefOr[String], /* index */ js.UndefOr[Double], js.Object])
  ] = js.undefined
  /**
    the icon to display before the label for the file upload button. Defaults to <i class="glyphicon glyphicon-upload"></i> &nbsp;.
    */
  var uploadIcon: js.UndefOr[String] = js.undefined
  /**
    the label to display for the file upload button. Defaults to Upload.
    */
  var uploadLabel: js.UndefOr[String] = js.undefined
  /**
    the title to display on hover for the file remove button.
    Defaults to Upload selected files.
    */
  var uploadTitle: js.UndefOr[String] = js.undefined
  /**
    the URL for the upload processing action (typically for ajax based processing).
    Defaults to null.
    If this is not set or null, then the upload button action will default to form submission.
    NOTE:
    This is MANDATORY if you want to use advanced features like drag & drop, append/remove files, selectively upload files via ajax etc.
    The plugin automatically send $_FILES data to the server with the input `name` attribute as the key if provided.
    If input name is not set, the key defaults to file-data.
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
  /**
    whether to include initial preview file count (server uploaded files) in validating minFileCount and maxFileCount.
    Defaults to false.
    */
  var validateInitialCount: js.UndefOr[Boolean] = js.undefined
  /**
    the icon for zooming the file content in a new modal dialog.
    This is currently applicable only for text file previews.
    Defaults to <i class="glyphicon glyphicon-zoom-in"></i>
    */
  var zoomIndicator: js.UndefOr[String] = js.undefined
}

object FileInputOptions {
  @scala.inline
  def apply(
    ajaxDeleteSettings: JQueryAjaxSettings = null,
    ajaxSettings: JQueryAjaxSettings = null,
    allowedFileExtensions: js.Array[String] = null,
    allowedFileTypes: js.Array[image | html | text | video | audio | flash | `object`] = null,
    allowedPreviewMimeTypes: js.Array[String] = null,
    allowedPreviewTypes: js.Array[image | html | text | video | audio | flash | `object`] = null,
    autoReplace: js.UndefOr[Boolean] = js.undefined,
    browseClass: String = null,
    browseIcon: String = null,
    browseLabel: String = null,
    buttonLabelClass: String = null,
    captionClass: String = null,
    customLayoutTags: js.Object = null,
    customPreviewTags: js.Object = null,
    defaultPreviewContent: String = null,
    deleteExtraData: js.Object | js.Function0[js.Object] = null,
    deleteUrl: String = null,
    dropZoneEnabled: js.UndefOr[Boolean] = js.undefined,
    dropZoneTitle: String = null,
    dropZoneTitleClass: String = null,
    elCaptionContainer: String = null,
    elCaptionText: String = null,
    elErrorContainer: String = null,
    elPreviewContainer: String = null,
    elPreviewImage: String = null,
    elPreviewStatus: String = null,
    fileActionsettings: FileActionSettings = null,
    fileTypeSettings: FileTypeSettings = null,
    initialCaption: String = null,
    initialPreview: String | js.Array[_] = null,
    initialPreviewConfig: js.Array[PreviewConfig] = null,
    initialPreviewCount: Int | Double = null,
    initialPreviewDelimiter: String = null,
    initialPreviewShowDelete: js.UndefOr[Boolean] = js.undefined,
    initialPreviewThumbTags: StringDictionary[String] = null,
    language: String = null,
    layoutTemplates: LayoutTemplates = null,
    mainClass: String = null,
    maxFileCount: Int | Double = null,
    maxFileSize: Int | Double = null,
    maxImageHeight: Int | Double = null,
    maxImageWidth: Int | Double = null,
    minFileCount: Int | Double = null,
    minImageHeight: Int | Double = null,
    msgCancelled: String = null,
    msgErrorClass: String = null,
    msgFileNotFound: String = null,
    msgFileNotReadable: String = null,
    msgFilePreviewAborted: String = null,
    msgFilePreviewError: String = null,
    msgFileSecured: String = null,
    msgFilesTooLess: String = null,
    msgFilesTooMany: String = null,
    msgFoldersNotAllowed: String = null,
    msgImageHeightLarge: String = null,
    msgImageHeightSmall: String = null,
    msgImageWidthLarge: String = null,
    msgImageWidthSmall: String = null,
    msgInvalidFileExtension: String = null,
    msgInvalidFileType: String = null,
    msgLoading: String = null,
    msgNo: String = null,
    msgProgress: String = null,
    msgSelected: String = null,
    msgSizeTooLarge: String = null,
    msgUploadAborted: String = null,
    msgValidationError: String = null,
    msgValidationErrorClass: String = null,
    msgValidationErrorIcon: String = null,
    msgZoomModalHeading: String = null,
    msgZoomTitle: String = null,
    otherActionButtons: String = null,
    overwriteInitial: js.UndefOr[Boolean] = js.undefined,
    previewClass: String = null,
    previewFileExtSettings: PreviewFileExtSettings = null,
    previewFileIcon: String = null,
    previewFileIconClass: String = null,
    previewFileIconSettings: PreviewFileIconSettings = null,
    previewFileType: image | text | any = null,
    previewSettings: PreviewSettings = null,
    previewTemplates: PreviewTemplates = null,
    previewThumbTags: StringDictionary[String] = null,
    progressClass: String = null,
    progressCompleteClass: String = null,
    progressErrorClass: String = null,
    removeClass: String = null,
    removeFromPreviewOnError: js.UndefOr[Boolean] = js.undefined,
    removeIcon: String = null,
    removeLabel: String = null,
    removeTitle: String = null,
    resizeDefaultImageType: String = null,
    resizeImage: js.UndefOr[Boolean] = js.undefined,
    resizeImageQuality: Int | Double = null,
    resizePreference: width | height = null,
    showAjaxErrorDetails: js.UndefOr[Boolean] = js.undefined,
    showCancel: js.UndefOr[Boolean] = js.undefined,
    showCaption: js.UndefOr[Boolean] = js.undefined,
    showClose: js.UndefOr[Boolean] = js.undefined,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    showRemove: js.UndefOr[Boolean] = js.undefined,
    showUpload: js.UndefOr[Boolean] = js.undefined,
    showUploadedThumbs: js.UndefOr[Boolean] = js.undefined,
    slugCallback: /* filename */ String => String = null,
    textEncoding: String = null,
    theme: String = null,
    uploadAsync: js.UndefOr[Boolean] = js.undefined,
    uploadClass: String = null,
    uploadExtraData: js.Object | (js.Function2[/* previewId */ js.UndefOr[String], /* index */ js.UndefOr[Double], js.Object]) = null,
    uploadIcon: String = null,
    uploadLabel: String = null,
    uploadTitle: String = null,
    uploadUrl: String = null,
    validateInitialCount: js.UndefOr[Boolean] = js.undefined,
    zoomIndicator: String = null
  ): FileInputOptions = {
    val __obj = js.Dynamic.literal()
    if (ajaxDeleteSettings != null) __obj.updateDynamic("ajaxDeleteSettings")(ajaxDeleteSettings.asInstanceOf[js.Any])
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings.asInstanceOf[js.Any])
    if (allowedFileExtensions != null) __obj.updateDynamic("allowedFileExtensions")(allowedFileExtensions.asInstanceOf[js.Any])
    if (allowedFileTypes != null) __obj.updateDynamic("allowedFileTypes")(allowedFileTypes.asInstanceOf[js.Any])
    if (allowedPreviewMimeTypes != null) __obj.updateDynamic("allowedPreviewMimeTypes")(allowedPreviewMimeTypes.asInstanceOf[js.Any])
    if (allowedPreviewTypes != null) __obj.updateDynamic("allowedPreviewTypes")(allowedPreviewTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReplace)) __obj.updateDynamic("autoReplace")(autoReplace.asInstanceOf[js.Any])
    if (browseClass != null) __obj.updateDynamic("browseClass")(browseClass.asInstanceOf[js.Any])
    if (browseIcon != null) __obj.updateDynamic("browseIcon")(browseIcon.asInstanceOf[js.Any])
    if (browseLabel != null) __obj.updateDynamic("browseLabel")(browseLabel.asInstanceOf[js.Any])
    if (buttonLabelClass != null) __obj.updateDynamic("buttonLabelClass")(buttonLabelClass.asInstanceOf[js.Any])
    if (captionClass != null) __obj.updateDynamic("captionClass")(captionClass.asInstanceOf[js.Any])
    if (customLayoutTags != null) __obj.updateDynamic("customLayoutTags")(customLayoutTags.asInstanceOf[js.Any])
    if (customPreviewTags != null) __obj.updateDynamic("customPreviewTags")(customPreviewTags.asInstanceOf[js.Any])
    if (defaultPreviewContent != null) __obj.updateDynamic("defaultPreviewContent")(defaultPreviewContent.asInstanceOf[js.Any])
    if (deleteExtraData != null) __obj.updateDynamic("deleteExtraData")(deleteExtraData.asInstanceOf[js.Any])
    if (deleteUrl != null) __obj.updateDynamic("deleteUrl")(deleteUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(dropZoneEnabled)) __obj.updateDynamic("dropZoneEnabled")(dropZoneEnabled.asInstanceOf[js.Any])
    if (dropZoneTitle != null) __obj.updateDynamic("dropZoneTitle")(dropZoneTitle.asInstanceOf[js.Any])
    if (dropZoneTitleClass != null) __obj.updateDynamic("dropZoneTitleClass")(dropZoneTitleClass.asInstanceOf[js.Any])
    if (elCaptionContainer != null) __obj.updateDynamic("elCaptionContainer")(elCaptionContainer.asInstanceOf[js.Any])
    if (elCaptionText != null) __obj.updateDynamic("elCaptionText")(elCaptionText.asInstanceOf[js.Any])
    if (elErrorContainer != null) __obj.updateDynamic("elErrorContainer")(elErrorContainer.asInstanceOf[js.Any])
    if (elPreviewContainer != null) __obj.updateDynamic("elPreviewContainer")(elPreviewContainer.asInstanceOf[js.Any])
    if (elPreviewImage != null) __obj.updateDynamic("elPreviewImage")(elPreviewImage.asInstanceOf[js.Any])
    if (elPreviewStatus != null) __obj.updateDynamic("elPreviewStatus")(elPreviewStatus.asInstanceOf[js.Any])
    if (fileActionsettings != null) __obj.updateDynamic("fileActionsettings")(fileActionsettings.asInstanceOf[js.Any])
    if (fileTypeSettings != null) __obj.updateDynamic("fileTypeSettings")(fileTypeSettings.asInstanceOf[js.Any])
    if (initialCaption != null) __obj.updateDynamic("initialCaption")(initialCaption.asInstanceOf[js.Any])
    if (initialPreview != null) __obj.updateDynamic("initialPreview")(initialPreview.asInstanceOf[js.Any])
    if (initialPreviewConfig != null) __obj.updateDynamic("initialPreviewConfig")(initialPreviewConfig.asInstanceOf[js.Any])
    if (initialPreviewCount != null) __obj.updateDynamic("initialPreviewCount")(initialPreviewCount.asInstanceOf[js.Any])
    if (initialPreviewDelimiter != null) __obj.updateDynamic("initialPreviewDelimiter")(initialPreviewDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(initialPreviewShowDelete)) __obj.updateDynamic("initialPreviewShowDelete")(initialPreviewShowDelete.asInstanceOf[js.Any])
    if (initialPreviewThumbTags != null) __obj.updateDynamic("initialPreviewThumbTags")(initialPreviewThumbTags.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (layoutTemplates != null) __obj.updateDynamic("layoutTemplates")(layoutTemplates.asInstanceOf[js.Any])
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass.asInstanceOf[js.Any])
    if (maxFileCount != null) __obj.updateDynamic("maxFileCount")(maxFileCount.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxImageHeight != null) __obj.updateDynamic("maxImageHeight")(maxImageHeight.asInstanceOf[js.Any])
    if (maxImageWidth != null) __obj.updateDynamic("maxImageWidth")(maxImageWidth.asInstanceOf[js.Any])
    if (minFileCount != null) __obj.updateDynamic("minFileCount")(minFileCount.asInstanceOf[js.Any])
    if (minImageHeight != null) __obj.updateDynamic("minImageHeight")(minImageHeight.asInstanceOf[js.Any])
    if (msgCancelled != null) __obj.updateDynamic("msgCancelled")(msgCancelled.asInstanceOf[js.Any])
    if (msgErrorClass != null) __obj.updateDynamic("msgErrorClass")(msgErrorClass.asInstanceOf[js.Any])
    if (msgFileNotFound != null) __obj.updateDynamic("msgFileNotFound")(msgFileNotFound.asInstanceOf[js.Any])
    if (msgFileNotReadable != null) __obj.updateDynamic("msgFileNotReadable")(msgFileNotReadable.asInstanceOf[js.Any])
    if (msgFilePreviewAborted != null) __obj.updateDynamic("msgFilePreviewAborted")(msgFilePreviewAborted.asInstanceOf[js.Any])
    if (msgFilePreviewError != null) __obj.updateDynamic("msgFilePreviewError")(msgFilePreviewError.asInstanceOf[js.Any])
    if (msgFileSecured != null) __obj.updateDynamic("msgFileSecured")(msgFileSecured.asInstanceOf[js.Any])
    if (msgFilesTooLess != null) __obj.updateDynamic("msgFilesTooLess")(msgFilesTooLess.asInstanceOf[js.Any])
    if (msgFilesTooMany != null) __obj.updateDynamic("msgFilesTooMany")(msgFilesTooMany.asInstanceOf[js.Any])
    if (msgFoldersNotAllowed != null) __obj.updateDynamic("msgFoldersNotAllowed")(msgFoldersNotAllowed.asInstanceOf[js.Any])
    if (msgImageHeightLarge != null) __obj.updateDynamic("msgImageHeightLarge")(msgImageHeightLarge.asInstanceOf[js.Any])
    if (msgImageHeightSmall != null) __obj.updateDynamic("msgImageHeightSmall")(msgImageHeightSmall.asInstanceOf[js.Any])
    if (msgImageWidthLarge != null) __obj.updateDynamic("msgImageWidthLarge")(msgImageWidthLarge.asInstanceOf[js.Any])
    if (msgImageWidthSmall != null) __obj.updateDynamic("msgImageWidthSmall")(msgImageWidthSmall.asInstanceOf[js.Any])
    if (msgInvalidFileExtension != null) __obj.updateDynamic("msgInvalidFileExtension")(msgInvalidFileExtension.asInstanceOf[js.Any])
    if (msgInvalidFileType != null) __obj.updateDynamic("msgInvalidFileType")(msgInvalidFileType.asInstanceOf[js.Any])
    if (msgLoading != null) __obj.updateDynamic("msgLoading")(msgLoading.asInstanceOf[js.Any])
    if (msgNo != null) __obj.updateDynamic("msgNo")(msgNo.asInstanceOf[js.Any])
    if (msgProgress != null) __obj.updateDynamic("msgProgress")(msgProgress.asInstanceOf[js.Any])
    if (msgSelected != null) __obj.updateDynamic("msgSelected")(msgSelected.asInstanceOf[js.Any])
    if (msgSizeTooLarge != null) __obj.updateDynamic("msgSizeTooLarge")(msgSizeTooLarge.asInstanceOf[js.Any])
    if (msgUploadAborted != null) __obj.updateDynamic("msgUploadAborted")(msgUploadAborted.asInstanceOf[js.Any])
    if (msgValidationError != null) __obj.updateDynamic("msgValidationError")(msgValidationError.asInstanceOf[js.Any])
    if (msgValidationErrorClass != null) __obj.updateDynamic("msgValidationErrorClass")(msgValidationErrorClass.asInstanceOf[js.Any])
    if (msgValidationErrorIcon != null) __obj.updateDynamic("msgValidationErrorIcon")(msgValidationErrorIcon.asInstanceOf[js.Any])
    if (msgZoomModalHeading != null) __obj.updateDynamic("msgZoomModalHeading")(msgZoomModalHeading.asInstanceOf[js.Any])
    if (msgZoomTitle != null) __obj.updateDynamic("msgZoomTitle")(msgZoomTitle.asInstanceOf[js.Any])
    if (otherActionButtons != null) __obj.updateDynamic("otherActionButtons")(otherActionButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteInitial)) __obj.updateDynamic("overwriteInitial")(overwriteInitial.asInstanceOf[js.Any])
    if (previewClass != null) __obj.updateDynamic("previewClass")(previewClass.asInstanceOf[js.Any])
    if (previewFileExtSettings != null) __obj.updateDynamic("previewFileExtSettings")(previewFileExtSettings.asInstanceOf[js.Any])
    if (previewFileIcon != null) __obj.updateDynamic("previewFileIcon")(previewFileIcon.asInstanceOf[js.Any])
    if (previewFileIconClass != null) __obj.updateDynamic("previewFileIconClass")(previewFileIconClass.asInstanceOf[js.Any])
    if (previewFileIconSettings != null) __obj.updateDynamic("previewFileIconSettings")(previewFileIconSettings.asInstanceOf[js.Any])
    if (previewFileType != null) __obj.updateDynamic("previewFileType")(previewFileType.asInstanceOf[js.Any])
    if (previewSettings != null) __obj.updateDynamic("previewSettings")(previewSettings.asInstanceOf[js.Any])
    if (previewTemplates != null) __obj.updateDynamic("previewTemplates")(previewTemplates.asInstanceOf[js.Any])
    if (previewThumbTags != null) __obj.updateDynamic("previewThumbTags")(previewThumbTags.asInstanceOf[js.Any])
    if (progressClass != null) __obj.updateDynamic("progressClass")(progressClass.asInstanceOf[js.Any])
    if (progressCompleteClass != null) __obj.updateDynamic("progressCompleteClass")(progressCompleteClass.asInstanceOf[js.Any])
    if (progressErrorClass != null) __obj.updateDynamic("progressErrorClass")(progressErrorClass.asInstanceOf[js.Any])
    if (removeClass != null) __obj.updateDynamic("removeClass")(removeClass.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFromPreviewOnError)) __obj.updateDynamic("removeFromPreviewOnError")(removeFromPreviewOnError.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (removeLabel != null) __obj.updateDynamic("removeLabel")(removeLabel.asInstanceOf[js.Any])
    if (removeTitle != null) __obj.updateDynamic("removeTitle")(removeTitle.asInstanceOf[js.Any])
    if (resizeDefaultImageType != null) __obj.updateDynamic("resizeDefaultImageType")(resizeDefaultImageType.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeImage)) __obj.updateDynamic("resizeImage")(resizeImage.asInstanceOf[js.Any])
    if (resizeImageQuality != null) __obj.updateDynamic("resizeImageQuality")(resizeImageQuality.asInstanceOf[js.Any])
    if (resizePreference != null) __obj.updateDynamic("resizePreference")(resizePreference.asInstanceOf[js.Any])
    if (!js.isUndefined(showAjaxErrorDetails)) __obj.updateDynamic("showAjaxErrorDetails")(showAjaxErrorDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel.asInstanceOf[js.Any])
    if (!js.isUndefined(showCaption)) __obj.updateDynamic("showCaption")(showCaption.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemove)) __obj.updateDynamic("showRemove")(showRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(showUpload)) __obj.updateDynamic("showUpload")(showUpload.asInstanceOf[js.Any])
    if (!js.isUndefined(showUploadedThumbs)) __obj.updateDynamic("showUploadedThumbs")(showUploadedThumbs.asInstanceOf[js.Any])
    if (slugCallback != null) __obj.updateDynamic("slugCallback")(js.Any.fromFunction1(slugCallback))
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadAsync)) __obj.updateDynamic("uploadAsync")(uploadAsync.asInstanceOf[js.Any])
    if (uploadClass != null) __obj.updateDynamic("uploadClass")(uploadClass.asInstanceOf[js.Any])
    if (uploadExtraData != null) __obj.updateDynamic("uploadExtraData")(uploadExtraData.asInstanceOf[js.Any])
    if (uploadIcon != null) __obj.updateDynamic("uploadIcon")(uploadIcon.asInstanceOf[js.Any])
    if (uploadLabel != null) __obj.updateDynamic("uploadLabel")(uploadLabel.asInstanceOf[js.Any])
    if (uploadTitle != null) __obj.updateDynamic("uploadTitle")(uploadTitle.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(validateInitialCount)) __obj.updateDynamic("validateInitialCount")(validateInitialCount.asInstanceOf[js.Any])
    if (zoomIndicator != null) __obj.updateDynamic("zoomIndicator")(zoomIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInputOptions]
  }
}

