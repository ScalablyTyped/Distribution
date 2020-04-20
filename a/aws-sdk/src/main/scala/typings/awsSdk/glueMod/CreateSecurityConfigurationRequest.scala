package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityConfigurationRequest extends js.Object {
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
}

