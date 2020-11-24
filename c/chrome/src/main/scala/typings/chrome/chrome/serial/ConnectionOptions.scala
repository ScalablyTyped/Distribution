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
trait ConnectionOptions extends js.Object {
  
  /** Optional. The requested bitrate of the connection to be opened.
    * For compatibility with the widest range of hardware, this number should match one of commonly-available bitrates,
    * such as 110, 300, 1200, 2400, 4800, 9600, 14400, 19200, 38400, 57600, 115200.
    * There is no guarantee, of course, that the device connected to the serial port will support the requested bitrate, even if the port itself supports that bitrate.
    * 9600 will be passed by default. */
  var bitrate: js.UndefOr[Double] = js.native
  
  /** Optional. The size of the buffer used to receive data. The default value is 4096. */
  var bufferSize: js.UndefOr[Double] = js.native
  
  /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
  var ctsFlowControl: js.UndefOr[Boolean] = js.native
  
  /** Optional. "eight" will be passed by default. */
  var dataBits: js.UndefOr[seven | eight] = js.native
  
  /** Optional. An application-defined string to associate with the connection. */
  var name: js.UndefOr[String] = js.native
  
  /** Optional. "no" will be passed by default. */
  var parityBit: js.UndefOr[no | odd | even] = js.native
  
  /** Optional. Flag indicating whether or not the connection should be left open when the application is suspended (see Manage App Lifecycle: https://developer.chrome.com/apps/app_lifecycle).
    *  The default value is "false." When the application is loaded, any serial connections previously opened with persistent=true can be fetched with getConnections. */
  var peristent: js.UndefOr[Boolean] = js.native
  
  /** Optional. The maximum amount of time (in milliseconds) to wait for new data before raising an onReceiveError event with a "timeout" error.
    * If zero, receive timeout errors will not be raised for the connection.
    * Defaults to 0. */
  var receiveTimeout: js.UndefOr[Double] = js.native
  
  /** Optional. The maximum amount of time (in milliseconds) to wait for a send operation to complete before calling the callback with a "timeout" error.
    * If zero, send timeout errors will not be triggered.
    * Defaults to 0. */
  var sendTimeout: js.UndefOr[Double] = js.native
  
  /** Optional. "one" will be passed by default. */
  var stopBits: js.UndefOr[one | two] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    
    @scala.inline
    def setCtsFlowControl(value: Boolean): Self = this.set("ctsFlowControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtsFlowControl: Self = this.set("ctsFlowControl", js.undefined)
    
    @scala.inline
    def setDataBits(value: seven | eight): Self = this.set("dataBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBits: Self = this.set("dataBits", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParityBit(value: no | odd | even): Self = this.set("parityBit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParityBit: Self = this.set("parityBit", js.undefined)
    
    @scala.inline
    def setPeristent(value: Boolean): Self = this.set("peristent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeristent: Self = this.set("peristent", js.undefined)
    
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
