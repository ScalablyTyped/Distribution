package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveryOptions extends js.Object {
  
  /**
    * Address to bind to.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Broadcast address if using broadcast.
    */
  var broadcast: js.UndefOr[String] = js.native
  
  /**
    * How often to to check for missing nodes in milliseconds.
    */
  var checkInterval: js.UndefOr[Double] = js.native
  
  /**
    * Prevents Monitor from drawing.
    */
  var disableScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * How often to broadcast a hello packet in milliseconds.
    */
  var helloInterval: js.UndefOr[Double] = js.native
  
  /**
    * Notifies when another service goes online.
    */
  var helloLogsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Ignores messages from other services within the same process.
    */
  var ignoreProcess: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, disables `helloLogsEnabled` and `statusLogsEnabled` no matter
    * what value they have, and also own hello log.
    */
  var log: js.UndefOr[Boolean] = js.native
  
  /**
    * Consider a master node dead if not seen in this many milliseconds.
    */
  var masterTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Skips key equality checks when logging.
    */
  var monitor: js.UndefOr[Boolean] = js.native
  
  /**
    * Multicast address if using multicast.
    */
  var multicast: js.UndefOr[String] = js.native
  
  /**
    * Consider a node dead if not seen in this many milliseconds.
    */
  var nodeTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Milliseconds between emissions of own status for monitoring.
    */
  var statusInterval: js.UndefOr[Double] = js.native
  
  /**
    * Notifies when another service goes online or offline. If false, disables
    * `helloLogsEnabled` as well.
    */
  var statusLogsEnabled: js.UndefOr[Boolean] = js.native
}
object DiscoveryOptions {
  
  @scala.inline
  def apply(): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryOptions]
  }
  
  @scala.inline
  implicit class DiscoveryOptionsOps[Self <: DiscoveryOptions] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBroadcast(value: String): Self = this.set("broadcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadcast: Self = this.set("broadcast", js.undefined)
    
    @scala.inline
    def setCheckInterval(value: Double): Self = this.set("checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckInterval: Self = this.set("checkInterval", js.undefined)
    
    @scala.inline
    def setDisableScreen(value: Boolean): Self = this.set("disableScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScreen: Self = this.set("disableScreen", js.undefined)
    
    @scala.inline
    def setHelloInterval(value: Double): Self = this.set("helloInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelloInterval: Self = this.set("helloInterval", js.undefined)
    
    @scala.inline
    def setHelloLogsEnabled(value: Boolean): Self = this.set("helloLogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelloLogsEnabled: Self = this.set("helloLogsEnabled", js.undefined)
    
    @scala.inline
    def setIgnoreProcess(value: Boolean): Self = this.set("ignoreProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreProcess: Self = this.set("ignoreProcess", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: Double): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    
    @scala.inline
    def setMonitor(value: Boolean): Self = this.set("monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitor: Self = this.set("monitor", js.undefined)
    
    @scala.inline
    def setMulticast(value: String): Self = this.set("multicast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulticast: Self = this.set("multicast", js.undefined)
    
    @scala.inline
    def setNodeTimeout(value: Double): Self = this.set("nodeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTimeout: Self = this.set("nodeTimeout", js.undefined)
    
    @scala.inline
    def setStatusInterval(value: Double): Self = this.set("statusInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusInterval: Self = this.set("statusInterval", js.undefined)
    
    @scala.inline
    def setStatusLogsEnabled(value: Boolean): Self = this.set("statusLogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusLogsEnabled: Self = this.set("statusLogsEnabled", js.undefined)
  }
}
