package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFargateProfileResponse extends StObject {
  
  /**
    * The full description of your new Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.undefined
}
object CreateFargateProfileResponse {
  
  @scala.inline
  def apply(): CreateFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFargateProfileResponse]
  }
  
  @scala.inline
  implicit class CreateFargateProfileResponseMutableBuilder[Self <: CreateFargateProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFargateProfile(value: FargateProfile): Self = StObject.set(x, "fargateProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFargateProfileUndefined: Self = StObject.set(x, "fargateProfile", js.undefined)
  }
}
