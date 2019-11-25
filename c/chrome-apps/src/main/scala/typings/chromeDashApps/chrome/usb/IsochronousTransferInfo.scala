package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsochronousTransferInfo extends js.Object {
  /** The length of each of the packets in this transfer. */
  var packetLength: integer
  /** The total number of packets in this transfer. */
  var packets: integer
  /**
    * Transfer parameters.
    * The transfer length or data buffer specified in this parameter block is split
    * along packetLength boundaries to form the individual packets of the transfer.
    */
  var transferInfo: GenericTransferInfo
}

object IsochronousTransferInfo {
  @scala.inline
  def apply(packetLength: integer, packets: integer, transferInfo: GenericTransferInfo): IsochronousTransferInfo = {
    val __obj = js.Dynamic.literal(packetLength = packetLength.asInstanceOf[js.Any], packets = packets.asInstanceOf[js.Any], transferInfo = transferInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IsochronousTransferInfo]
  }
}

