package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceProfileResponse extends StObject {
  
  /**
    * A structure containing details about the new instance profile.
    */
  var InstanceProfile: typings.awsSdk.iamMod.InstanceProfile
}
object CreateInstanceProfileResponse {
  
  @scala.inline
  def apply(InstanceProfile: InstanceProfile): CreateInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceProfileResponse]
  }
  
  @scala.inline
  implicit class CreateInstanceProfileResponseMutableBuilder[Self <: CreateInstanceProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "InstanceProfile", value.asInstanceOf[js.Any])
  }
}
