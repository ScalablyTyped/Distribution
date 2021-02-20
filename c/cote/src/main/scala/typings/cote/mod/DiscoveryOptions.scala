package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveryOptions extends StObject {
  
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
  implicit class DiscoveryOptionsMutableBuilder[Self <: DiscoveryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setBroadcast(value: String): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
    
    @scala.inline
    def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    @scala.inline
    def setDisableScreen(value: Boolean): Self = StObject.set(x, "disableScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScreenUndefined: Self = StObject.set(x, "disableScreen", js.undefined)
    
    @scala.inline
    def setHelloInterval(value: Double): Self = StObject.set(x, "helloInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelloIntervalUndefined: Self = StObject.set(x, "helloInterval", js.undefined)
    
    @scala.inline
    def setHelloLogsEnabled(value: Boolean): Self = StObject.set(x, "helloLogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelloLogsEnabledUndefined: Self = StObject.set(x, "helloLogsEnabled", js.undefined)
    
    @scala.inline
    def setIgnoreProcess(value: Boolean): Self = StObject.set(x, "ignoreProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreProcessUndefined: Self = StObject.set(x, "ignoreProcess", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: Double): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setMonitor(value: Boolean): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
    
    @scala.inline
    def setMulticast(value: String): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticastUndefined: Self = StObject.set(x, "multicast", js.undefined)
    
    @scala.inline
    def setNodeTimeout(value: Double): Self = StObject.set(x, "nodeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTimeoutUndefined: Self = StObject.set(x, "nodeTimeout", js.undefined)
    
    @scala.inline
    def setStatusInterval(value: Double): Self = StObject.set(x, "statusInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusIntervalUndefined: Self = StObject.set(x, "statusInterval", js.undefined)
    
    @scala.inline
    def setStatusLogsEnabled(value: Boolean): Self = StObject.set(x, "statusLogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusLogsEnabledUndefined: Self = StObject.set(x, "statusLogsEnabled", js.undefined)
  }
}
