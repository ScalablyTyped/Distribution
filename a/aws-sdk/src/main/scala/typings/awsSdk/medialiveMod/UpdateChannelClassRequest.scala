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
  def apply(ChannelClass: ChannelClass, ChannelId: string, Destinations: listOfOutputDestination = null): UpdateChannelClassRequest = {
    val __obj = js.Dynamic.literal(ChannelClass = ChannelClass.asInstanceOf[js.Any], ChannelId = ChannelId.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelClassRequest]
  }
}

