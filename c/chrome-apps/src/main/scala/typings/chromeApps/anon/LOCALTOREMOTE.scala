package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.local_to_remote_
import typings.chromeApps.chromeAppsStrings.remote_to_local_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LOCALTOREMOTE extends js.Object {
  
  var LOCAL_TO_REMOTE: local_to_remote_ = js.native
  
  var REMOTE_TO_LOCAL: remote_to_local_ = js.native
}
object LOCALTOREMOTE {
  
  @scala.inline
  def apply(LOCAL_TO_REMOTE: local_to_remote_, REMOTE_TO_LOCAL: remote_to_local_): LOCALTOREMOTE = {
    val __obj = js.Dynamic.literal(LOCAL_TO_REMOTE = LOCAL_TO_REMOTE.asInstanceOf[js.Any], REMOTE_TO_LOCAL = REMOTE_TO_LOCAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[LOCALTOREMOTE]
  }
  
  @scala.inline
  implicit class LOCALTOREMOTEOps[Self <: LOCALTOREMOTE] (val x: Self) extends AnyVal {
    
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
    def setLOCAL_TO_REMOTE(value: local_to_remote_): Self = this.set("LOCAL_TO_REMOTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREMOTE_TO_LOCAL(value: remote_to_local_): Self = this.set("REMOTE_TO_LOCAL", value.asInstanceOf[js.Any])
  }
}
