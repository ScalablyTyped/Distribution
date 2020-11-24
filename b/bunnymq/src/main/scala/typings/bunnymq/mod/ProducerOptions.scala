package typings.bunnymq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProducerOptions extends js.Object {
  
  var routingKey: js.UndefOr[String] = js.native
  
  var rpc: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ProducerOptions {
  
  @scala.inline
  def apply(): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerOptions]
  }
  
  @scala.inline
  implicit class ProducerOptionsOps[Self <: ProducerOptions] (val x: Self) extends AnyVal {
    
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
    def setRoutingKey(value: String): Self = this.set("routingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingKey: Self = this.set("routingKey", js.undefined)
    
    @scala.inline
    def setRpc(value: Boolean): Self = this.set("rpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRpc: Self = this.set("rpc", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
