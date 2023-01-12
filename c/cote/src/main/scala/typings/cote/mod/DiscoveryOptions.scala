package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryOptions extends StObject {
  
  /**
    * Address to bind to.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Broadcast address if using broadcast.
    */
  var broadcast: js.UndefOr[String] = js.undefined
  
  /**
    * How often to to check for missing nodes in milliseconds.
    */
  var checkInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Prevents Monitor from drawing.
    */
  var disableScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How often to broadcast a hello packet in milliseconds.
    */
  var helloInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Notifies when another service goes online.
    */
  var helloLogsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ignores messages from other services within the same process.
    */
  var ignoreProcess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, disables `helloLogsEnabled` and `statusLogsEnabled` no matter
    * what value they have, and also own hello log.
    */
  var log: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Consider a master node dead if not seen in this many milliseconds.
    */
  var masterTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Skips key equality checks when logging.
    */
  var monitor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Multicast address if using multicast.
    */
  var multicast: js.UndefOr[String] = js.undefined
  
  /**
    * Consider a node dead if not seen in this many milliseconds.
    */
  var nodeTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Milliseconds between emissions of own status for monitoring.
    */
  var statusInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Notifies when another service goes online or offline. If false, disables
    * `helloLogsEnabled` as well.
    */
  var statusLogsEnabled: js.UndefOr[Boolean] = js.undefined
}
object DiscoveryOptions {
  
  inline def apply(): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveryOptions] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBroadcast(value: String): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
    
    inline def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
    
    inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    inline def setDisableScreen(value: Boolean): Self = StObject.set(x, "disableScreen", value.asInstanceOf[js.Any])
    
    inline def setDisableScreenUndefined: Self = StObject.set(x, "disableScreen", js.undefined)
    
    inline def setHelloInterval(value: Double): Self = StObject.set(x, "helloInterval", value.asInstanceOf[js.Any])
    
    inline def setHelloIntervalUndefined: Self = StObject.set(x, "helloInterval", js.undefined)
    
    inline def setHelloLogsEnabled(value: Boolean): Self = StObject.set(x, "helloLogsEnabled", value.asInstanceOf[js.Any])
    
    inline def setHelloLogsEnabledUndefined: Self = StObject.set(x, "helloLogsEnabled", js.undefined)
    
    inline def setIgnoreProcess(value: Boolean): Self = StObject.set(x, "ignoreProcess", value.asInstanceOf[js.Any])
    
    inline def setIgnoreProcessUndefined: Self = StObject.set(x, "ignoreProcess", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMasterTimeout(value: Double): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setMonitor(value: Boolean): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
    
    inline def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
    
    inline def setMulticast(value: String): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
    
    inline def setMulticastUndefined: Self = StObject.set(x, "multicast", js.undefined)
    
    inline def setNodeTimeout(value: Double): Self = StObject.set(x, "nodeTimeout", value.asInstanceOf[js.Any])
    
    inline def setNodeTimeoutUndefined: Self = StObject.set(x, "nodeTimeout", js.undefined)
    
    inline def setStatusInterval(value: Double): Self = StObject.set(x, "statusInterval", value.asInstanceOf[js.Any])
    
    inline def setStatusIntervalUndefined: Self = StObject.set(x, "statusInterval", js.undefined)
    
    inline def setStatusLogsEnabled(value: Boolean): Self = StObject.set(x, "statusLogsEnabled", value.asInstanceOf[js.Any])
    
    inline def setStatusLogsEnabledUndefined: Self = StObject.set(x, "statusLogsEnabled", js.undefined)
  }
}
