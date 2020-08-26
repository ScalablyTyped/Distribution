package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelClassRequest extends js.Object {
  /**
    * The channel class that you wish to update this channel to use.
    */
  var ChannelClass: typings.awsSdk.medialiveMod.ChannelClass = js.native
  /**
    * Channel Id of the channel whose class should be updated.
    */
  var ChannelId: string = js.native
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
}

object UpdateChannelClassRequest {
  @scala.inline
  def apply(ChannelClass: ChannelClass, ChannelId: string): UpdateChannelClassRequest = {
    val __obj = js.Dynamic.literal(ChannelClass = ChannelClass.asInstanceOf[js.Any], ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelClassRequest]
  }
  @scala.inline
  implicit class UpdateChannelClassRequestOps[Self <: UpdateChannelClassRequest] (val x: Self) extends AnyVal {
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
    def setChannelClass(value: ChannelClass): Self = this.set("ChannelClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelId(value: string): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationsVarargs(value: OutputDestination*): Self = this.set("Destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: listOfOutputDestination): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
  }
  
}

