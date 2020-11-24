package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkteamResponse extends js.Object {
  
  /**
    * A Workteam object that describes the updated work team.
    */
  var Workteam: typings.awsSdk.sagemakerMod.Workteam = js.native
}
object UpdateWorkteamResponse {
  
  @scala.inline
  def apply(Workteam: Workteam): UpdateWorkteamResponse = {
    val __obj = js.Dynamic.literal(Workteam = Workteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamResponse]
  }
  
  @scala.inline
  implicit class UpdateWorkteamResponseOps[Self <: UpdateWorkteamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkteam(value: Workteam): Self = this.set("Workteam", value.asInstanceOf[js.Any])
  }
}
