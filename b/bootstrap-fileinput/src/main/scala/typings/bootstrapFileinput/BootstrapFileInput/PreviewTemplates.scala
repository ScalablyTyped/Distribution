package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var audio: js.UndefOr[String] = js.native
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
  var flash: js.UndefOr[String] = js.native
  /**
    * this template is used ONLY for rendering the initialPreview markup content passed directly as a raw format.
    * The following tags will be parsed and replaced automatically:
    *     {content}: will be replaced with the raw HTML markup as set in initialPreview..
    */
  var generic: js.UndefOr[String] = js.native
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
  var html: js.UndefOr[String] = js.native
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
  var image: js.UndefOr[String] = js.native
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
  var `object`: js.UndefOr[String] = js.native
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
  var text: js.UndefOr[String] = js.native
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
  var video: js.UndefOr[String] = js.native
}

object PreviewTemplates {
  @scala.inline
  def apply(): PreviewTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewTemplates]
  }
  @scala.inline
  implicit class PreviewTemplatesOps[Self <: PreviewTemplates] (val x: Self) extends AnyVal {
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
    def setAudio(value: String): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setFlash(value: String): Self = this.set("flash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlash: Self = this.set("flash", js.undefined)
    @scala.inline
    def setGeneric(value: String): Self = this.set("generic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneric: Self = this.set("generic", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVideo(value: String): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

