package typings.chrome.chrome.serial

import typings.chrome.chromeStrings.eight
import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.seven
import typings.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionInfo extends js.Object {
  
  /** Optional. See ConnectionOptions.bitrate.
    * This field may be omitted or inaccurate if a non-standard bitrate is in use, or if an error occurred while querying the underlying device. */
  var bitrate: js.UndefOr[Double] = js.native
  
  /** See ConnectionOptions.bufferSize */
  var bufferSize: Double = js.native
  
  /** The id of the serial port connection. */
  var connectionId: js.UndefOr[Double] = js.native
  
  /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
  var ctsFlowControl: js.UndefOr[Boolean] = js.native
  
  /** Optional. See ConnectionOptions.dataBits. This field may be omitted if an error occurred while querying the underlying device. */
  var dataBits: js.UndefOr[seven | eight] = js.native
  
  /** See ConnectionOptions.name */
  var name: String = js.native
  
  /** Optional. See ConnectionOptions.parityBit. This field may be omitted if an error occurred while querying the underlying device. */
  var parityBit: js.UndefOr[no | odd | even] = js.native
  
  /** Flag indicating whether the connection is blocked from firing onReceive events. */
  var paused: Boolean = js.native
  
  /** See ConnectionOptions.persistent */
  var peristent: Boolean = js.native
  
  /** See ConnectionOptions.receiveTimeout */
  var receiveTimeout: js.UndefOr[Double] = js.native
  
  /** See ConnectionOptions.sendTimeout */
  var sendTimeout: js.UndefOr[Double] = js.native
  
  /** Optional. See ConnectionOptions.stopBits. This field may be omitted if an error occurred while querying the underlying device. */
  var stopBits: js.UndefOr[one | two] = js.native
}
object ConnectionInfo {
  
  @scala.inline
  def apply(bufferSize: Double, name: String, paused: Boolean, peristent: Boolean): ConnectionInfo = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], peristent = peristent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
  
  @scala.inline
  implicit class ConnectionInfoOps[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
    
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
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeristent(value: Boolean): Self = this.set("peristent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setConnectionId(value: Double): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    
    @scala.inline
    def setCtsFlowControl(value: Boolean): Self = this.set("ctsFlowControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtsFlowControl: Self = this.set("ctsFlowControl", js.undefined)
    
    @scala.inline
    def setDataBits(value: seven | eight): Self = this.set("dataBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBits: Self = this.set("dataBits", js.undefined)
    
    @scala.inline
    def setParityBit(value: no | odd | even): Self = this.set("parityBit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParityBit: Self = this.set("parityBit", js.undefined)
    
    @scala.inline
    def setReceiveTimeout(value: Double): Self = this.set("receiveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveTimeout: Self = this.set("receiveTimeout", js.undefined)
    
    @scala.inline
    def setSendTimeout(value: Double): Self = this.set("sendTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendTimeout: Self = this.set("sendTimeout", js.undefined)
    
    @scala.inline
    def setStopBits(value: one | two): Self = this.set("stopBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopBits: Self = this.set("stopBits", js.undefined)
  }
}
