package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.SeekRequest")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.SeekRequest
  */
class SeekRequest ()
  extends typings.chrome.chrome.cast.media.SeekRequest {
  /* CompleteClass */
  override var currentTime: Double = js.native
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var resumeState: typings.chrome.chrome.cast.media.ResumeState = js.native
}

