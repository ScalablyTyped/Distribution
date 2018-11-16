package typings
package bootstrapDashFileinputLib.bootstrapDashFileinputMod.BootstrapFileInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PreviewTemplates extends js.Object {
  /**
          the preview template for audio files (supported by HTML 5 audio tag).
          The following tags will be parsed and replaced automatically:
              {previewId}: will be replaced with the generated identifier for the preview frame container.
              {data}: will be replaced with the data source for each preview type.
              {width}: will be replaced with the width for the file type as set in previewSettings.
              {height}: will be replaced with the height for the file type as set in previewSettings.
              {caption}: will be replaced with the file name.
              {type}: will be replaced with the file type.
          */
  var audio: js.UndefOr[java.lang.String] = js.undefined
  /**
          the preview template for flash files (supported currently on webkit browsers).
          The following tags will be parsed and replaced automatically:
              {previewId}: will be replaced with the generated identifier for the preview frame container.
              {data}: will be replaced with the data source for each preview type.
              {width}: will be replaced with the width for the file type as set in previewSettings.
              {height}: will be replaced with the height for the file type as set in previewSettings.
              {caption}: will be replaced with the file name.
              {type}: will be replaced with the file type.
          */
  var flash: js.UndefOr[java.lang.String] = js.undefined
  /**
          this template is used ONLY for rendering the initialPreview markup content passed directly as a raw format.
          The following tags will be parsed and replaced automatically:
              {content}: will be replaced with the raw HTML markup as set in initialPreview..
          */
  var generic: js.UndefOr[java.lang.String] = js.undefined
  /**
          the preview template for html files.
          The following tags will be parsed and replaced automatically:
              {previewId}: will be replaced with the generated identifier for the preview frame container.
              {data}: will be replaced with the data source for each preview type.
              {width}: will be replaced with the width for the file type as set in previewSettings.
              {height}: will be replaced with the height for the file type as set in previewSettings.
              {caption}: will be replaced with the file name.
              {type}: will be replaced with the file type.
          */
  var html: js.UndefOr[java.lang.String] = js.undefined
  /**
          the preview template for image files.
          The following tags will be parsed and replaced automatically:
              {previewId}: will be replaced with the generated identifier for the preview frame container.
              {data}: will be replaced with the data source for each preview type.
              {width}: will be replaced with the width for the file type as set in previewSettings.
              {height}: will be replaced with the height for the file type as set in previewSettings.
              {caption}: will be replaced with the file name.
              {type}: will be replaced with the file type.
          */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
          the preview template for all other files - by default treated as object. To disable this behavior, configure the allowedPreviewTypes property.
          The following tags will be parsed and replaced automatically:
              {previewId}: will be replaced with the generated identifier for the preview frame container.
              {data}: will be replaced with the data source for each preview type.
              {width}: will be replaced with the width for the file type as set in previewSettings.
              {height}: will be replaced with the height for the file type as set in previewSettings.
              {caption}: will be replaced with the file name.
              {type}: will be replaced with the file type.
          */
  var `object`: js.UndefOr[java.lang.String] = js.undefined
  /**
          the preview template for text files.
          The following tags will be parsed and replaced automatically:
              {previewId}: will be replaced with the generated identifier for the preview frame container.
              {data}: will be replaced with the data source for each preview type.
              {width}: will be replaced with the width for the file type as set in previewSettings.
              {height}: will be replaced with the height for the file type as set in previewSettings.
              {caption}: will be replaced with the file name.
              {type}: will be replaced with the file type.
              {dialog}: Will be replaced with the JS code to launch the modal dialog.
              {zoomTitle}: This will be replaced with the msgZoomTitle property. This is the title that is displayed on hover of the zoom button (which on clicking will display the text file).
              {zoomInd}: This will be replaced with the zoomIndicator property. This is the title that is displayed on hover of the zoom button (which on clicking will display the text file).
              {heading}: This represents the modal dialog heading title. This will be replaced with the msgZoomModalHeading property.
          */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
          the preview template for video files (supported by HTML 5 video tag).
          The following tags will be parsed and replaced automatically:
              {previewId}: will be replaced with the generated identifier for the preview frame container.
              {data}: will be replaced with the data source for each preview type.
              {width}: will be replaced with the width for the file type as set in previewSettings.
              {height}: will be replaced with the height for the file type as set in previewSettings.
              {caption}: will be replaced with the file name.
              {type}: will be replaced with the file type.
          */
  var video: js.UndefOr[java.lang.String] = js.undefined
}

