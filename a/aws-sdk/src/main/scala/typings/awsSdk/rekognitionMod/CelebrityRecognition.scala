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
  def apply(): CelebrityRecognition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CelebrityRecognition]
  }
  @scala.inline
  implicit class CelebrityRecognitionOps[Self <: CelebrityRecognition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCelebrity(value: CelebrityDetail): Self = this.set("Celebrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCelebrity: Self = this.set("Celebrity", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

