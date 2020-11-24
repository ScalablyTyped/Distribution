package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoalescingThreshold extends js.Object {
  
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
  implicit class CoalescingThresholdOps[Self <: CoalescingThreshold] (val x: Self) extends AnyVal {
    
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
    def setCoalescingThreshold(value: Double): Self = this.set("coalescingThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoalescingThreshold: Self = this.set("coalescingThreshold", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setDefunctReadTimeoutThreshold(value: Double): Self = this.set("defunctReadTimeoutThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefunctReadTimeoutThreshold: Self = this.set("defunctReadTimeoutThreshold", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepAliveDelay(value: Double): Self = this.set("keepAliveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveDelay: Self = this.set("keepAliveDelay", js.undefined)
    
    @scala.inline
    def setReadTimeout(value: Double): Self = this.set("readTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTimeout: Self = this.set("readTimeout", js.undefined)
    
    @scala.inline
    def setTcpNoDelay(value: Boolean): Self = this.set("tcpNoDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpNoDelay: Self = this.set("tcpNoDelay", js.undefined)
  }
}
