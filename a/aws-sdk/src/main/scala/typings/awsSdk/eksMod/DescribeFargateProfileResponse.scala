package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFargateProfileResponse extends js.Object {
  
  /**
    * The full description of your Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.native
}
object DescribeFargateProfileResponse {
  
  @scala.inline
  def apply(): DescribeFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFargateProfileResponse]
  }
  
  @scala.inline
  implicit class DescribeFargateProfileResponseOps[Self <: DescribeFargateProfileResponse] (val x: Self) extends AnyVal {
    
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
