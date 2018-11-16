package typings
package bootstrapDashFileinputLib.bootstrapDashFileinputMod.BootstrapFileInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LayoutTemplates extends js.Object {
  /**
           the template for the file delete action button within the thumbnail footer.
          The following tags will be parsed and replaced automatically:
              {removeClass}: the css class for the remove button. Will be replaced with the removeClass set within fileActionSettings.
              {removeIcon}: the icon for the remove button. Will be replaced with the removeIcon set within fileActionSettings.
              {removeTitle}: the title to display on hover for the remove button. Will be replaced with the removeTitle set within fileActionSettings.
              {dataUrl}: the URL for deleting the file thumbnail for initialPreview content only. Will be replaced with the url set within initialPreviewConfig.
              {dataKey}: the key (additional data) that will be passed to the URL above via POST to the AJAX call. Will be replaced with the key set within initialPreviewConfig.
          */
  var actionDelete: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for the file upload action button within the thumbnail footer.
          The following tags will be parsed and replaced automatically:
              {uploadClass}: the css class for the upload button. Will be replaced with the uploadClass set within fileActionSettings.
              {uploadIcon}: the icon for the upload button. Will be replaced with the uploadIcon set within fileActionSettings.
              {uploadTitle}: the title to display on hover for the upload button. Will be replaced with the uploadTitle set within fileActionSettings.
          */
  var actionUpload: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for the file action buttons to be displayed within the thumbnail footer.
          The following tags will be parsed and replaced automatically:
              {upload}: will be replaced with the output of the actionUpload template.
              {delete}: will be replaced with the output of the actionDelete template.
          */
  var actions: js.UndefOr[java.lang.String] = js.undefined
  /**
          The template for the browse button.
              {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
              {title}: the title to display on button hover.
              {css}: the CSS class for the button. This is derived from settings for browseClass.
              {status}: the disabled status for the button if available (else will be blank).
              {icon}: the button icon as identified by browseIcon.
              {label}: the button label as identified by browseLabel.
          */
  var btnBrowse: js.UndefOr[java.lang.String] = js.undefined
  /**
          The template for upload, remove, and cancel buttons.
          The following tags will be parsed and replaced automatically:
              {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
              {title}: the title to display on button hover.
              {css}: the CSS class for the button. This is derived from settings for uploadClass or removeClass or cancelClass.
              {status}: the disabled status for the button if available (else will be blank).
              {icon}: the button icon as identified by uploadIcon or removeIcon or cancelIcon.
              {label}: the button label as identified by uploadLabel or removeLabel or cancelLabel.
          */
  var btnDefault: js.UndefOr[java.lang.String] = js.undefined
  /**
          The template for upload button when used with ajax (i.e. when uploadUrl is set).
          The following tags will be parsed and replaced automatically:
              {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
              {title}: the title to display on button hover.
              {css}: the CSS class for the button. This is derived from settings for uploadClass.
              {status}: the disabled status for the button if available (else will be blank).
              {icon}: the button icon as identified by uploadIcon.
              {label}: the button label as identified by uploadLabel.
              {href}: applicable only for Upload button for ajax uploads and will be replaced with the uploadUrl property.
          */
  var btnLink: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for rendering the caption.
          The following tags will be parsed and replaced automatically:
              {class}: the CSS class as set in the captionClass property.
          */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for the footer section of each file preview thumbnail.
          The following tags will be parsed and replaced automatically:
              {actions}: will be replaced with the output of the actions template.
              {class}: the CSS class as set in the progressClass or progressCompleteClass property (depending on the progress percentage).
          */
  var footer: js.UndefOr[java.lang.String] = js.undefined
  /**
          the icon to render before the caption text.
          */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for rendering the widget with caption.
          The following tags will be parsed and replaced automatically:
              {class}: the CSS class as set in the mainClass property.
              {close}: will be replaced with the close (cross) icon (by default on top right of the preview window). The layout template to control this markup is layoutTemplates.close.
              {preview}: the content parsed by the previewTemplate and will be displayed only if showPreview is true.
              {caption}: the content parsed by the captionTemplate and will be displayed only if showCaption is true.
              {remove}: the file remove/clear button and will be displayed only if showRemove is true.
              {upload}: the file upload button and will be displayed only if showUpload is true.
              {cancel}: the file upload cancel button that will be displayed when AJAX upload is in process to abort the AJAX upload.
              {browse}: the main file browse button to select your files for input.
          */
  var main1: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for rendering the widget without caption.
          The following tags will be parsed and replaced automatically:
              {class}: the CSS class as set in the mainClass property.
              {close}: will be replaced with the close (cross) icon (by default on top right of the preview window). The layout template to control this markup is layoutTemplates.close.
              {preview}: the content parsed by the previewTemplate and will be displayed only if showPreview is true.
              {caption}: the content parsed by the captionTemplate and will be displayed only if showCaption is true.
              {remove}: the file remove/clear button and will be displayed only if showRemove is true.
              {upload}: the file upload button and will be displayed only if showUpload is true.
              {cancel}: the file upload cancel button that will be displayed when AJAX upload is in process to abort the AJAX upload.
              {browse}: the main file browse button to select your files for input.
          */
  var main2: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for rendering the modal (for text file preview zooming).
          */
  var modal: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for rendering the preview.
          The following tags will be parsed and replaced automatically:
              {class}: the CSS class as set in the previewClass property.
          */
  var preview: js.UndefOr[java.lang.String] = js.undefined
  /**
          the template for the progress bar when upload is in progress (for batch/mass uploads and within each preview thumbnail for async/single uploads).
          The upload progress bar when displayed within each thumbnail will be wrapped inside a container having a CSS class of `file-thumb-progress`.
          The following tags will be parsed and replaced automatically:
              {percent}: will be replaced with the upload progress percentage.
          */
  var progress: js.UndefOr[java.lang.String] = js.undefined
}

