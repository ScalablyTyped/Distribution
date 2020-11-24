package typings.cloudflareApps.CloudflareApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
  var appId: String = js.native
  
  var options: InstallOptions = js.native
  
  var scope: InstallScope = js.native
}
object App {
  
  @scala.inline
  def apply(appId: String, options: InstallOptions, scope: InstallScope): App = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: InstallOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: InstallScope): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
