package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFargateProfileResponse extends StObject {
  
  /**
    * The full description of your Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.undefined
}
object DescribeFargateProfileResponse {
  
  inline def apply(): DescribeFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFargateProfileResponse]
  }
  
  extension [Self <: DescribeFargateProfileResponse](x: Self) {
    
    inline def setFargateProfile(value: FargateProfile): Self = StObject.set(x, "fargateProfile", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileUndefined: Self = StObject.set(x, "fargateProfile", js.undefined)
  }
}
