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
  
  inline def apply(): DeleteFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFargateProfileResponse]
  }
  
  extension [Self <: DeleteFargateProfileResponse](x: Self) {
    
    inline def setFargateProfile(value: FargateProfile): Self = StObject.set(x, "fargateProfile", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileUndefined: Self = StObject.set(x, "fargateProfile", js.undefined)
  }
}
