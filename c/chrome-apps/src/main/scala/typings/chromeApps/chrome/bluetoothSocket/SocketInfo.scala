package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketInfo extends js.Object {
  
  /**
    * If the underlying socket is connected,
    * contains the Bluetooth address of the device it is connected to.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * The size of the buffer used to receive data.
    * If no buffer size has been specified explictly,
    * the value is not provided.
    */
  var bufferSize: js.UndefOr[integer] = js.native
  
  /**
    * Flag indicating whether the socket is connected to a remote peer.
    */
  var connected: Boolean = js.native
  
  /**
    * Application-defined string associated with the socket.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Flag indicating whether a connected socket
    * blocks its peer from sending more data, or
    * whether connection requests on a listening
    * socket are dispatched through the onAccept
    * event or queued up in the listen queue backlog.
    * See setPaused. The default value is 'false'.
    */
  var paused: Boolean = js.native
  
  /**
    * Flag indicating if the socket remains
    * open when the event page of the application
    * is unloaded (see SocketProperties.persistent).
    * The default value is 'false'.
    */
  var persistent: Boolean = js.native
  
  /**
    * The socket identifier.
    * */
  var socketId: integer = js.native
  
  /**
    * If the underlying socket is connected,
    * contains information about the service
    * UUID it is connected to, otherwise if
    * the underlying socket is listening,
    * contains information about the service
    * UUID it is listening on.
    */
  var uuid: js.UndefOr[String] = js.native
}
object SocketInfo {
  
  @scala.inline
  def apply(connected: Boolean, paused: Boolean, persistent: Boolean, socketId: integer): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketInfo]
  }
  
  @scala.inline
  implicit class SocketInfoOps[Self <: SocketInfo] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketId(value: integer): Self = this.set("socketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBufferSize(value: integer): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
