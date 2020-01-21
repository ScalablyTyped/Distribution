package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMasterConfiguration extends js.Object {
  /**
    * The period of time a signaling channel retains underlivered messages before they are discarded.
    */
  var MessageTtlSeconds: js.UndefOr[typings.awsSdk.kinesisvideoMod.MessageTtlSeconds] = js.native
}

object SingleMasterConfiguration {
  @scala.inline
  def apply(MessageTtlSeconds: Int | Double = null): SingleMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    if (MessageTtlSeconds != null) __obj.updateDynamic("MessageTtlSeconds")(MessageTtlSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleMasterConfiguration]
  }
}

