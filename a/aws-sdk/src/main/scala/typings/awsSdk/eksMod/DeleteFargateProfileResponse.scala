package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFargateProfileResponse extends StObject {
  
  /**
    * The deleted Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.undefined
}
object DeleteFargateProfileResponse {
  
  @scala.inline
  def apply(): DeleteFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFargateProfileResponse]
  }
  
  @scala.inline
  implicit class DeleteFargateProfileResponseMutableBuilder[Self <: DeleteFargateProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFargateProfile(value: FargateProfile): Self = StObject.set(x, "fargateProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFargateProfileUndefined: Self = StObject.set(x, "fargateProfile", js.undefined)
  }
}
