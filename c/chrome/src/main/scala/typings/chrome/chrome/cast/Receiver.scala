package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Receiver extends js.Object {
  var capabilities: js.Array[Capability]
  var displayStatus: ReceiverDisplayStatus
  var friendlyName: String
  var label: String
  var receiverType: ReceiverType
  var volume: Volume
}

object Receiver {
  @scala.inline
  def apply(
    capabilities: js.Array[Capability],
    displayStatus: ReceiverDisplayStatus,
    friendlyName: String,
    label: String,
    receiverType: ReceiverType,
    volume: Volume
  ): Receiver = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], receiverType = receiverType.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receiver]
  }
}

