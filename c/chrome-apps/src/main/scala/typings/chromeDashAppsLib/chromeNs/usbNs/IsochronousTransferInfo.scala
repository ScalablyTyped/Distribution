package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsochronousTransferInfo extends js.Object {
  /** The length of each of the packets in this transfer. */
  var packetLength: chromeDashAppsLib.chromeNs.integer
  /** The total number of packets in this transfer. */
  var packets: chromeDashAppsLib.chromeNs.integer
  /**
    * Transfer parameters.
    * The transfer length or data buffer specified in this parameter block is split
    * along packetLength boundaries to form the individual packets of the transfer.
    */
  var transferInfo: GenericTransferInfo
}

