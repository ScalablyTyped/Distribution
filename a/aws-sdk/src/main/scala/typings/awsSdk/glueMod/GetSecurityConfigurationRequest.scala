package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityConfigurationRequest extends StObject {
  
  /**
    * The name of the security configuration to retrieve.
    */
  var Name: NameString = js.native
}
object GetSecurityConfigurationRequest {
  
  @scala.inline
  def apply(Name: NameString): GetSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetSecurityConfigurationRequestMutableBuilder[Self <: GetSecurityConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
