package typings.awsSdkSmithyClient.clientMod

import typings.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmithyConfiguration[HandlerOptions] extends js.Object {
  
  val apiVersion: String = js.native
  
  var requestHandler: RequestHandler[_, _, HandlerOptions] = js.native
}
object SmithyConfiguration {
  
  @scala.inline
  def apply[HandlerOptions](apiVersion: String, requestHandler: RequestHandler[_, _, HandlerOptions]): SmithyConfiguration[HandlerOptions] = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], requestHandler = requestHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmithyConfiguration[HandlerOptions]]
  }
  
  @scala.inline
  implicit class SmithyConfigurationOps[Self <: SmithyConfiguration[_], HandlerOptions] (val x: Self with SmithyConfiguration[HandlerOptions]) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHandler(value: RequestHandler[_, _, HandlerOptions]): Self = this.set("requestHandler", value.asInstanceOf[js.Any])
  }
}
