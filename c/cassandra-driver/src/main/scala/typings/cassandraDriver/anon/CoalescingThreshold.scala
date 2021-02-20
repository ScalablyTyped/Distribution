package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoalescingThreshold extends StObject {
  
  var coalescingThreshold: js.UndefOr[Double] = js.native
  
  var connectTimeout: js.UndefOr[Double] = js.native
  
  var defunctReadTimeoutThreshold: js.UndefOr[Double] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var keepAliveDelay: js.UndefOr[Double] = js.native
  
  var readTimeout: js.UndefOr[Double] = js.native
  
  var tcpNoDelay: js.UndefOr[Boolean] = js.native
}
object CoalescingThreshold {
  
  @scala.inline
  def apply(): CoalescingThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoalescingThreshold]
  }
  
  @scala.inline
  implicit class CoalescingThresholdMutableBuilder[Self <: CoalescingThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoalescingThreshold(value: Double): Self = StObject.set(x, "coalescingThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoalescingThresholdUndefined: Self = StObject.set(x, "coalescingThreshold", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setDefunctReadTimeoutThreshold(value: Double): Self = StObject.set(x, "defunctReadTimeoutThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefunctReadTimeoutThresholdUndefined: Self = StObject.set(x, "defunctReadTimeoutThreshold", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveDelay(value: Double): Self = StObject.set(x, "keepAliveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveDelayUndefined: Self = StObject.set(x, "keepAliveDelay", js.undefined)
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    @scala.inline
    def setTcpNoDelay(value: Boolean): Self = StObject.set(x, "tcpNoDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpNoDelayUndefined: Self = StObject.set(x, "tcpNoDelay", js.undefined)
  }
}
