package typings.awsSdkNodeHttpHandler.nodeHttpHandlerMod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeHttpOptions extends js.Object {
  
  /**
    * The maximum time in milliseconds that the connection phase of a request
    * may take before the connection attempt is abandoned.
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var httpAgent: js.UndefOr[Agent] = js.native
  
  var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.native
  
  /**
    * The maximum time in milliseconds that a socket may remain idle before it
    * is closed.
    */
  var socketTimeout: js.UndefOr[Double] = js.native
}
object NodeHttpOptions {
  
  @scala.inline
  def apply(): NodeHttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeHttpOptions]
  }
  
  @scala.inline
  implicit class NodeHttpOptionsOps[Self <: NodeHttpOptions] (val x: Self) extends AnyVal {
    
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
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setHttpAgent(value: Agent): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    
    @scala.inline
    def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
  }
}
