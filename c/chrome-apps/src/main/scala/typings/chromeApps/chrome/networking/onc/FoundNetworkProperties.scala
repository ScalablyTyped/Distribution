package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundNetworkProperties extends js.Object {
  /** The network operator's long-format name. */
  var LongName: js.UndefOr[String] = js.native
  /** Network ID. */
  var NetworkId: String = js.native
  /** The network operator's short-format name. */
  var ShortName: js.UndefOr[String] = js.native
  /** Network availability. */
  var Status: String = js.native
  /** Access technology used by the network. */
  var Technology: String = js.native
}

object FoundNetworkProperties {
  @scala.inline
  def apply(NetworkId: String, Status: String, Technology: String): FoundNetworkProperties = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Technology = Technology.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundNetworkProperties]
  }
  @scala.inline
  implicit class FoundNetworkPropertiesOps[Self <: FoundNetworkProperties] (val x: Self) extends AnyVal {
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
    def setNetworkId(value: String): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTechnology(value: String): Self = this.set("Technology", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongName(value: String): Self = this.set("LongName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongName: Self = this.set("LongName", js.undefined)
    @scala.inline
    def setShortName(value: String): Self = this.set("ShortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortName: Self = this.set("ShortName", js.undefined)
  }
  
}

