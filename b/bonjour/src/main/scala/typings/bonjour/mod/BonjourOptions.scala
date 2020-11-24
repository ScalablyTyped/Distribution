package typings.bonjour.mod

import typings.bonjour.bonjourStrings.udp4
import typings.bonjour.bonjourStrings.udp6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BonjourOptions extends js.Object {
  
  var interface: js.UndefOr[String] = js.native
  
  var ip: js.UndefOr[String] = js.native
  
  var loopback: js.UndefOr[Boolean] = js.native
  
  var multicast: js.UndefOr[Boolean] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var reuseAddr: js.UndefOr[Boolean] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[udp4 | udp6] = js.native
}
object BonjourOptions {
  
  @scala.inline
  def apply(): BonjourOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BonjourOptions]
  }
  
  @scala.inline
  implicit class BonjourOptionsOps[Self <: BonjourOptions] (val x: Self) extends AnyVal {
    
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
    def setInterface(value: String): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setLoopback(value: Boolean): Self = this.set("loopback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoopback: Self = this.set("loopback", js.undefined)
    
    @scala.inline
    def setMulticast(value: Boolean): Self = this.set("multicast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulticast: Self = this.set("multicast", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setReuseAddr(value: Boolean): Self = this.set("reuseAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseAddr: Self = this.set("reuseAddr", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setType(value: udp4 | udp6): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
