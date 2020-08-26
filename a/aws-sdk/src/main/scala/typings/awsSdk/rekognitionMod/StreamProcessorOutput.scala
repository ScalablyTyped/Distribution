package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProcessorOutput extends js.Object {
  /**
    * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition stream processor streams the analysis results.
    */
  var KinesisDataStream: js.UndefOr[typings.awsSdk.rekognitionMod.KinesisDataStream] = js.native
}

object StreamProcessorOutput {
  @scala.inline
  def apply(): StreamProcessorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorOutput]
  }
  @scala.inline
  implicit class StreamProcessorOutputOps[Self <: StreamProcessorOutput] (val x: Self) extends AnyVal {
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
    def setKinesisDataStream(value: KinesisDataStream): Self = this.set("KinesisDataStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisDataStream: Self = this.set("KinesisDataStream", js.undefined)
  }
  
}

