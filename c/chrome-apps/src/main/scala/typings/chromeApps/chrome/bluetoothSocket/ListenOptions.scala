package typings.chromeApps.chrome.bluetoothSocket

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenOptions extends js.Object {
  /**
    * Length of the socket's listen queue.
    * The default value depends on the operating system's host subsystem.
    * */
  var backlog: js.UndefOr[integer] = js.native
  /**
    * The RFCOMM Channel used by listenUsingRfcomm.
    * If specified, this channel must not be previously
    * in use or the method call will fail. When not specified,
    * an unused channel will be automatically allocated.
    */
  var channel: js.UndefOr[integer] = js.native
  /**
    * The L2CAP PSM used by listenUsingL2cap.
    * If specified, this PSM must not be previously
    * in use or the method call with fail. When not specified,
    * an unused PSM will be automatically allocated.
    * */
  var psm: js.UndefOr[integer] = js.native
}

object ListenOptions {
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  @scala.inline
  implicit class ListenOptionsOps[Self <: ListenOptions] (val x: Self) extends AnyVal {
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
    def setBacklog(value: integer): Self = this.set("backlog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBacklog: Self = this.set("backlog", js.undefined)
    @scala.inline
    def setChannel(value: integer): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setPsm(value: integer): Self = this.set("psm", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePsm: Self = this.set("psm", js.undefined)
  }
  
}

