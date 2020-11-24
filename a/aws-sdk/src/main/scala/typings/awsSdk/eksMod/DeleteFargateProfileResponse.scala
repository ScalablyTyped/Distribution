package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFargateProfileResponse extends js.Object {
  
  /**
    * The deleted Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.native
}
object DeleteFargateProfileResponse {
  
  @scala.inline
  def apply(): DeleteFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFargateProfileResponse]
  }
  
  @scala.inline
  implicit class DeleteFargateProfileResponseOps[Self <: DeleteFargateProfileResponse] (val x: Self) extends AnyVal {
    
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
    def setFargateProfile(value: FargateProfile): Self = this.set("fargateProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFargateProfile: Self = this.set("fargateProfile", js.undefined)
  }
}
