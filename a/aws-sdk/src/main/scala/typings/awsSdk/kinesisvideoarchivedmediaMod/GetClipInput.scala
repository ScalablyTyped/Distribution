package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClipInput extends js.Object {
  /**
    * The time range of the requested clip and the source of the timestamps.
    */
  var ClipFragmentSelector: typings.awsSdk.kinesisvideoarchivedmediaMod.ClipFragmentSelector = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip.  You must specify either the StreamName or the StreamARN. 
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream for which to retrieve the media clip.  You must specify either the StreamName or the StreamARN. 
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName] = js.native
}

object GetClipInput {
  @scala.inline
  def apply(
    ClipFragmentSelector: ClipFragmentSelector,
    StreamARN: ResourceARN = null,
    StreamName: StreamName = null
  ): GetClipInput = {
    val __obj = js.Dynamic.literal(ClipFragmentSelector = ClipFragmentSelector.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClipInput]
  }
}

