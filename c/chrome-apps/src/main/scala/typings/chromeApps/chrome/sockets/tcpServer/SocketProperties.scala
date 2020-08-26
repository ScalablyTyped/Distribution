package typings.chromeApps.chrome.sockets.tcpServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketProperties
  */
@js.native
trait SocketProperties extends js.Object {
  /** An application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.native
  /**
    * Flag indicating if the socket remains open when the event page of the
    * application is unloaded. The default value is 'false.' When the
    * application is loaded, any sockets previously opened with
    * persistent=true can be fetched with getSockets.
    *
    * @see http://developer.chrome.com/apps/app_lifecycle.html
    */
  var persistent: js.UndefOr[Boolean] = js.native
}

object SocketProperties {
  @scala.inline
  def apply(): SocketProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketProperties]
  }
  @scala.inline
  implicit class SocketPropertiesOps[Self <: SocketProperties] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
  }
  
}

