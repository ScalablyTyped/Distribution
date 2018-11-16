package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents the different options avilable for the video capture.
     */

trait VideoRecorderOptions extends js.Object {
  /** Defines the video the video should be recorded at */
  var fps: scala.Double
  /** Defines the mime type of the video */
  var mimeType: java.lang.String
  /** Defines the chunk size for the recording data */
  var recordChunckSize: scala.Double
}

