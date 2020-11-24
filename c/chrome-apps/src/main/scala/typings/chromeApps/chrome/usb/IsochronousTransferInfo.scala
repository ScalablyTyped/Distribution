package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsochronousTransferInfo extends js.Object {
  
  /** The length of each of the packets in this transfer. */
  var packetLength: integer = js.native
  
  /** The total number of packets in this transfer. */
  var packets: integer = js.native
  
  /**
    * Transfer parameters.
    * The transfer length or data buffer specified in this parameter block is split
    * along packetLength boundaries to form the individual packets of the transfer.
    */
  var transferInfo: GenericTransferInfo = js.native
}
object IsochronousTransferInfo {
  
  @scala.inline
  def apply(packetLength: integer, packets: integer, transferInfo: GenericTransferInfo): IsochronousTransferInfo = {
    val __obj = js.Dynamic.literal(packetLength = packetLength.asInstanceOf[js.Any], packets = packets.asInstanceOf[js.Any], transferInfo = transferInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsochronousTransferInfo]
  }
  
  @scala.inline
  implicit class IsochronousTransferInfoOps[Self <: IsochronousTransferInfo] (val x: Self) extends AnyVal {
    
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
    def setPacketLength(value: integer): Self = this.set("packetLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackets(value: integer): Self = this.set("packets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferInfo(value: GenericTransferInfo): Self = this.set("transferInfo", value.asInstanceOf[js.Any])
  }
}
