package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkteamResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
    */
  var WorkteamArn: js.UndefOr[typings.awsSdk.sagemakerMod.WorkteamArn] = js.native
}
object CreateWorkteamResponse {
  
  @scala.inline
  def apply(): CreateWorkteamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkteamResponse]
  }
  
  @scala.inline
  implicit class CreateWorkteamResponseOps[Self <: CreateWorkteamResponse] (val x: Self) extends AnyVal {
    
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
    def setWorkteamArn(value: WorkteamArn): Self = this.set("WorkteamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkteamArn: Self = this.set("WorkteamArn", js.undefined)
  }
}
