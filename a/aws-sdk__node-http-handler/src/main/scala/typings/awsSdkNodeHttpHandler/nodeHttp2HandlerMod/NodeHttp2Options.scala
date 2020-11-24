package typings.awsSdkNodeHttpHandler.nodeHttp2HandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeHttp2Options extends js.Object {
  
  /**
    * The maximum time in milliseconds that a stream may remain idle before it
    * is closed.
    */
  var requestTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The maximum time in milliseconds that a session or socket may remain idle
    * before it is closed.
    * https://nodejs.org/docs/latest-v12.x/api/http2.html#http2_http2session_and_sockets
    */
  var sessionTimeout: js.UndefOr[Double] = js.native
}
object NodeHttp2Options {
  
  @scala.inline
  def apply(): NodeHttp2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeHttp2Options]
  }
  
  @scala.inline
  implicit class NodeHttp2OptionsOps[Self <: NodeHttp2Options] (val x: Self) extends AnyVal {
    
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
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
  }
}
