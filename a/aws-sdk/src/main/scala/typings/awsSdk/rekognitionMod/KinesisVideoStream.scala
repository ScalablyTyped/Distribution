package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisVideoStream extends js.Object {
  /**
    * ARN of the Kinesis video stream stream that streams the source video.
    */
  var Arn: js.UndefOr[KinesisVideoArn] = js.native
}

object KinesisVideoStream {
  @scala.inline
  def apply(): KinesisVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisVideoStream]
  }
  @scala.inline
  implicit class KinesisVideoStreamOps[Self <: KinesisVideoStream] (val x: Self) extends AnyVal {
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
    def setArn(value: KinesisVideoArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
  }
  
}

