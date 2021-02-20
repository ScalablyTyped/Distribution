package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSecurityConfigurationRequest extends StObject {
  
  /**
    * The name of the security configuration to delete.
    */
  var Name: NameString = js.native
}
object DeleteSecurityConfigurationRequest {
  
  @scala.inline
  def apply(Name: NameString): DeleteSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteSecurityConfigurationRequestMutableBuilder[Self <: DeleteSecurityConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
