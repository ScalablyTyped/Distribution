package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceProfileResponse extends StObject {
  
  /**
    * A structure containing details about the instance profile.
    */
  var InstanceProfile: typings.awsSdk.iamMod.InstanceProfile
}
object GetInstanceProfileResponse {
  
  inline def apply(InstanceProfile: InstanceProfile): GetInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileResponse]
  }
  
  extension [Self <: GetInstanceProfileResponse](x: Self) {
    
    inline def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "InstanceProfile", value.asInstanceOf[js.Any])
  }
}
