package typings.cqrsDomain.anon

import typings.cqrsDomain.cqrsDomainStrings.inmemory
import typings.cqrsDomain.cqrsDomainStrings.mongodb
import typings.cqrsDomain.cqrsDomainStrings.redis
import typings.cqrsDomain.cqrsDomainStrings.tingodb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Host extends js.Object {
  
  var db: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var `type`: mongodb | redis | tingodb | inmemory = js.native
}
object Host {
  
  @scala.inline
  def apply(`type`: mongodb | redis | tingodb | inmemory): Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
    
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
    def setType(value: mongodb | redis | tingodb | inmemory): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: Double): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
