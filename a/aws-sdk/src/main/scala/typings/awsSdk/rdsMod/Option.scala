package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  /**
    * If the option requires access to a port, then this DB security group allows access to the port.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.native
  /**
    * The description of the option.
    */
  var OptionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[String] = js.native
  /**
    * The option settings for this option.
    */
  var OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.native
  /**
    * The version of the option.
    */
  var OptionVersion: js.UndefOr[String] = js.native
  /**
    * Indicate if this option is permanent.
    */
  var Permanent: js.UndefOr[Boolean] = js.native
  /**
    * Indicate if this option is persistent.
    */
  var Persistent: js.UndefOr[Boolean] = js.native
  /**
    * If required, the port configured for this option to use.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * If the option requires access to a port, then this VPC security group allows access to the port.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDBSecurityGroupMembershipsVarargs(value: DBSecurityGroupMembership*): Self = this.set("DBSecurityGroupMemberships", js.Array(value :_*))
    @scala.inline
    def setDBSecurityGroupMemberships(value: DBSecurityGroupMembershipList): Self = this.set("DBSecurityGroupMemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSecurityGroupMemberships: Self = this.set("DBSecurityGroupMemberships", js.undefined)
    @scala.inline
    def setOptionDescription(value: String): Self = this.set("OptionDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionDescription: Self = this.set("OptionDescription", js.undefined)
    @scala.inline
    def setOptionName(value: String): Self = this.set("OptionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionName: Self = this.set("OptionName", js.undefined)
    @scala.inline
    def setOptionSettingsVarargs(value: OptionSetting*): Self = this.set("OptionSettings", js.Array(value :_*))
    @scala.inline
    def setOptionSettings(value: OptionSettingConfigurationList): Self = this.set("OptionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionSettings: Self = this.set("OptionSettings", js.undefined)
    @scala.inline
    def setOptionVersion(value: String): Self = this.set("OptionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionVersion: Self = this.set("OptionVersion", js.undefined)
    @scala.inline
    def setPermanent(value: Boolean): Self = this.set("Permanent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermanent: Self = this.set("Permanent", js.undefined)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("Persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("Persistent", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setVpcSecurityGroupMembershipsVarargs(value: VpcSecurityGroupMembership*): Self = this.set("VpcSecurityGroupMemberships", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupMemberships(value: VpcSecurityGroupMembershipList): Self = this.set("VpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupMemberships: Self = this.set("VpcSecurityGroupMemberships", js.undefined)
  }
  
}

