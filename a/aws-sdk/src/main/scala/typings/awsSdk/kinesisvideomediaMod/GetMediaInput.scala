package typings.awsSdk.kinesisvideomediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMediaInput extends js.Object {
  /**
    * Identifies the starting chunk to get from the specified stream. 
    */
  var StartSelector: typings.awsSdk.kinesisvideomediaMod.StartSelector = js.native
  /**
    * The ARN of the stream from where you want to get the media content. If you don't specify the streamARN, you must specify the streamName.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The Kinesis video stream name from where you want to get the media content. If you don't specify the streamName, you must specify the streamARN.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.StreamName] = js.native
}

object GetMediaInput {
  @scala.inline
  def apply(StartSelector: StartSelector): GetMediaInput = {
    val __obj = js.Dynamic.literal(StartSelector = StartSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaInput]
  }
  @scala.inline
  implicit class GetMediaInputOps[Self <: GetMediaInput] (val x: Self) extends AnyVal {
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
    def setStartSelector(value: StartSelector): Self = this.set("StartSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
  
}

