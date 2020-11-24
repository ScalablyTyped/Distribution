package typings.consul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsulOptions extends js.Object {
  
  var ca: js.UndefOr[js.Array[String]] = js.native
  
  var defaults: js.UndefOr[CommonOptions] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[String] = js.native
  
  var promisify: js.UndefOr[Boolean | js.Function] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
}
object ConsulOptions {
  
  @scala.inline
  def apply(): ConsulOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsulOptions]
  }
  
  @scala.inline
  implicit class ConsulOptionsOps[Self <: ConsulOptions] (val x: Self) extends AnyVal {
    
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
    def setCaVarargs(value: String*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: js.Array[String]): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setDefaults(value: CommonOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPromisify(value: Boolean | js.Function): Self = this.set("promisify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromisify: Self = this.set("promisify", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
}
