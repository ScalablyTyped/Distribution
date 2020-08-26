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
  @scala.inline
  implicit class CreateSecurityConfigurationRequestOps[Self <: CreateSecurityConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("EncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

