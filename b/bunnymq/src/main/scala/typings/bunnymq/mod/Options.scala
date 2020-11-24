package typings.bunnymq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var consumerSuffix: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * Number of fetched messages at once on the channel.
    *
    */
  var prefetch: js.UndefOr[Double] = js.native
  
  /**
    * Requeue put back message into the broker if consumer crashes/trigger exception.
    *
    */
  var requeue: js.UndefOr[Boolean] = js.native
  
  var rpcTimeout: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var transport: js.UndefOr[js.Any] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setConsumerSuffix(value: String): Self = this.set("consumerSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerSuffix: Self = this.set("consumerSuffix", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setPrefetch(value: Double): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    
    @scala.inline
    def setRequeue(value: Boolean): Self = this.set("requeue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequeue: Self = this.set("requeue", js.undefined)
    
    @scala.inline
    def setRpcTimeout(value: Double): Self = this.set("rpcTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRpcTimeout: Self = this.set("rpcTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTransport(value: js.Any): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}
