package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoalescingThreshold extends StObject {
  
  var coalescingThreshold: js.UndefOr[Double] = js.undefined
  
  var connectTimeout: js.UndefOr[Double] = js.undefined
  
  var defunctReadTimeoutThreshold: js.UndefOr[Double] = js.undefined
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var keepAliveDelay: js.UndefOr[Double] = js.undefined
  
  var readTimeout: js.UndefOr[Double] = js.undefined
  
  var tcpNoDelay: js.UndefOr[Boolean] = js.undefined
}
object CoalescingThreshold {
  
  inline def apply(): CoalescingThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoalescingThreshold]
  }
  
  extension [Self <: CoalescingThreshold](x: Self) {
    
    inline def setCoalescingThreshold(value: Double): Self = StObject.set(x, "coalescingThreshold", value.asInstanceOf[js.Any])
    
    inline def setCoalescingThresholdUndefined: Self = StObject.set(x, "coalescingThreshold", js.undefined)
    
    inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    inline def setDefunctReadTimeoutThreshold(value: Double): Self = StObject.set(x, "defunctReadTimeoutThreshold", value.asInstanceOf[js.Any])
    
    inline def setDefunctReadTimeoutThresholdUndefined: Self = StObject.set(x, "defunctReadTimeoutThreshold", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveDelay(value: Double): Self = StObject.set(x, "keepAliveDelay", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveDelayUndefined: Self = StObject.set(x, "keepAliveDelay", js.undefined)
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    inline def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    inline def setTcpNoDelay(value: Boolean): Self = StObject.set(x, "tcpNoDelay", value.asInstanceOf[js.Any])
    
    inline def setTcpNoDelayUndefined: Self = StObject.set(x, "tcpNoDelay", js.undefined)
  }
}
