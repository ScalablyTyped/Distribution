package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardDocument extends js.Object {
  
  var profile: IConnectionProfile = js.native
  
  var serverInfo: ServerInfo = js.native
}
object DashboardDocument {
  
  @scala.inline
  def apply(profile: IConnectionProfile, serverInfo: ServerInfo): DashboardDocument = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardDocument]
  }
  
  @scala.inline
  implicit class DashboardDocumentOps[Self <: DashboardDocument] (val x: Self) extends AnyVal {
    
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
    def setProfile(value: IConnectionProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerInfo(value: ServerInfo): Self = this.set("serverInfo", value.asInstanceOf[js.Any])
  }
}
