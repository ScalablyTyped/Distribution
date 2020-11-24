package typings.cometd.anon

import typings.cometd.mod.ReconnectAdvice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hosts extends js.Object {
  
  var hosts: js.UndefOr[js.Array[String]] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var `multiple-clients`: js.UndefOr[Boolean] = js.native
  
  var reconnect: js.UndefOr[ReconnectAdvice] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object Hosts {
  
  @scala.inline
  def apply(): Hosts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hosts]
  }
  
  @scala.inline
  implicit class HostsOps[Self <: Hosts] (val x: Self) extends AnyVal {
    
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
    def setHostsVarargs(value: String*): Self = this.set("hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: js.Array[String]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def `setMultiple-clients`(value: Boolean): Self = this.set("multiple-clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMultiple-clients`: Self = this.set("multiple-clients", js.undefined)
    
    @scala.inline
    def setReconnect(value: ReconnectAdvice): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
