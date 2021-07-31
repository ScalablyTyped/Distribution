package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityConfigurationInput extends StObject {
  
  /**
    * The name of the security configuration.
    */
  var Name: XmlString
  
  /**
    * The security configuration details in JSON format. For JSON parameters and examples, see Use Security Configurations to Set Up Cluster Security in the Amazon EMR Management Guide.
    */
  var SecurityConfiguration: String
}
object CreateSecurityConfigurationInput {
  
  @scala.inline
  def apply(Name: XmlString, SecurityConfiguration: String): CreateSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SecurityConfiguration = SecurityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigurationInput]
  }
  
  @scala.inline
  implicit class CreateSecurityConfigurationInputMutableBuilder[Self <: CreateSecurityConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfiguration(value: String): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
  }
}
