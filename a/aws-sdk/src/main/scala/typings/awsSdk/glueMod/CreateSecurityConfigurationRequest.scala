package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSecurityConfigurationRequest extends StObject {
  
  /**
    * The encryption configuration for the new security configuration.
    */
  var EncryptionConfiguration: typings.awsSdk.glueMod.EncryptionConfiguration = js.native
  
  /**
    * The name for the new security configuration.
    */
  var Name: NameString = js.native
}
object CreateSecurityConfigurationRequest {
  
  @scala.inline
  def apply(EncryptionConfiguration: EncryptionConfiguration, Name: NameString): CreateSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateSecurityConfigurationRequestMutableBuilder[Self <: CreateSecurityConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
