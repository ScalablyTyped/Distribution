package typings.awsSdkMiddlewareUserAgent.configurationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentResolvedConfig extends js.Object {
  
  var customUserAgent: js.UndefOr[String] = js.native
  
  var defaultUserAgent: String = js.native
  
  var runtime: String = js.native
}
object UserAgentResolvedConfig {
  
  @scala.inline
  def apply(defaultUserAgent: String, runtime: String): UserAgentResolvedConfig = {
    val __obj = js.Dynamic.literal(defaultUserAgent = defaultUserAgent.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentResolvedConfig]
  }
  
  @scala.inline
  implicit class UserAgentResolvedConfigOps[Self <: UserAgentResolvedConfig] (val x: Self) extends AnyVal {
    
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
    def setDefaultUserAgent(value: String): Self = this.set("defaultUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUserAgent(value: String): Self = this.set("customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUserAgent: Self = this.set("customUserAgent", js.undefined)
  }
}
