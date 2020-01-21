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
  def apply(Arn: KinesisVideoArn = null): KinesisVideoStream = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisVideoStream]
  }
}

