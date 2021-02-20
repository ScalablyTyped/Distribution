package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSecurityConfigurationInput extends StObject {
  
  /**
    * The name of the security configuration.
    */
  var Name: XmlString = js.native
}
object DeleteSecurityConfigurationInput {
  
  @scala.inline
  def apply(Name: XmlString): DeleteSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityConfigurationInput]
  }
  
  @scala.inline
  implicit class DeleteSecurityConfigurationInputMutableBuilder[Self <: DeleteSecurityConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
