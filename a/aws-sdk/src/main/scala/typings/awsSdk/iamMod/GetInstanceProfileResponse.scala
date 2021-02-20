package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceProfileResponse extends StObject {
  
  /**
    * A structure containing details about the instance profile.
    */
  var InstanceProfile: typings.awsSdk.iamMod.InstanceProfile = js.native
}
object GetInstanceProfileResponse {
  
  @scala.inline
  def apply(InstanceProfile: InstanceProfile): GetInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileResponse]
  }
  
  @scala.inline
  implicit class GetInstanceProfileResponseMutableBuilder[Self <: GetInstanceProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "InstanceProfile", value.asInstanceOf[js.Any])
  }
}
