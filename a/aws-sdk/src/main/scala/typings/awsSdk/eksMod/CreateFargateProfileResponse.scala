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
  
  inline def apply(): CreateFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFargateProfileResponse]
  }
  
  extension [Self <: CreateFargateProfileResponse](x: Self) {
    
    inline def setFargateProfile(value: FargateProfile): Self = StObject.set(x, "fargateProfile", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileUndefined: Self = StObject.set(x, "fargateProfile", js.undefined)
  }
}
