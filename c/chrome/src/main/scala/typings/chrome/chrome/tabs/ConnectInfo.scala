package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectInfo extends js.Object {
  /**
    * Open a port to a specific frame identified by frameId instead of all frames in the tab.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[Double] = js.native
  /** Optional. Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.native
}

object ConnectInfo {
  @scala.inline
  def apply(): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectInfo]
  }
  @scala.inline
  implicit class ConnectInfoOps[Self <: ConnectInfo] (val x: Self) extends AnyVal {
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
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

