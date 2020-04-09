package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewTemplates extends js.Object {
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
  def apply(
    audio: String = null,
    flash: String = null,
    generic: String = null,
    html: String = null,
    image: String = null,
    `object`: String = null,
    text: String = null,
    video: String = null
  ): PreviewTemplates = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (flash != null) __obj.updateDynamic("flash")(flash.asInstanceOf[js.Any])
    if (generic != null) __obj.updateDynamic("generic")(generic.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewTemplates]
  }
}

