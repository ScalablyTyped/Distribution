package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceProfileRequest extends StObject {
  
  /**
    * The name of the instance profile to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
}
object GetInstanceProfileRequest {
  
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType): GetInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileRequest]
  }
  
  @scala.inline
  implicit class GetInstanceProfileRequestMutableBuilder[Self <: GetInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceProfileName(value: instanceProfileNameType): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
  }
}
