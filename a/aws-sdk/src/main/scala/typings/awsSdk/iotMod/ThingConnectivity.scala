package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingConnectivity extends StObject {
  
  /**
    * True if the thing is connected to the AWS IoT service; false if it is not connected.
    */
  var connected: js.UndefOr[Boolean] = js.native
  
  /**
    * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been disconnected for more than a few weeks, the time value might be missing.
    */
  var timestamp: js.UndefOr[ConnectivityTimestamp] = js.native
}
object ThingConnectivity {
  
  @scala.inline
  def apply(): ThingConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingConnectivity]
  }
  
  @scala.inline
  implicit class ThingConnectivityMutableBuilder[Self <: ThingConnectivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    @scala.inline
    def setTimestamp(value: ConnectivityTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
