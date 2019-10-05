package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.SeekRequest")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.SeekRequest
  */
class SeekRequest () extends js.Object {
  var currentTime: Double = js.native
  var customData: js.Object = js.native
  var resumeState: ResumeState = js.native
}

