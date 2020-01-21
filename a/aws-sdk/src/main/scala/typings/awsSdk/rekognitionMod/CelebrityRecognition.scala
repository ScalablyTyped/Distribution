package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CelebrityRecognition extends js.Object {
  /**
    * Information about a recognized celebrity.
    */
  var Celebrity: js.UndefOr[CelebrityDetail] = js.native
  /**
    * The time, in milliseconds from the start of the video, that the celebrity was recognized.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}

object CelebrityRecognition {
  @scala.inline
  def apply(Celebrity: CelebrityDetail = null, Timestamp: Int | Double = null): CelebrityRecognition = {
    val __obj = js.Dynamic.literal()
    if (Celebrity != null) __obj.updateDynamic("Celebrity")(Celebrity.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CelebrityRecognition]
  }
}

