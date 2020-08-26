package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelActivity extends js.Object {
  /**
    * The name of the channel from which the messages are processed.
    */
  var channelName: ChannelName = js.native
  /**
    * The name of the 'channel' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object ChannelActivity {
  @scala.inline
  def apply(channelName: ChannelName, name: ActivityName): ChannelActivity = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelActivity]
  }
  @scala.inline
  implicit class ChannelActivityOps[Self <: ChannelActivity] (val x: Self) extends AnyVal {
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
    def setChannelName(value: ChannelName): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ActivityName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: ActivityName): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

