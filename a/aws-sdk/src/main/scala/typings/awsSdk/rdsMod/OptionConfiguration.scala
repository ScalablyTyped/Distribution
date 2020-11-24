package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionConfiguration extends js.Object {
  
  /**
    * A list of DBSecurityGroupMembership name strings used for this option.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.native
  
  /**
    * The configuration of options to include in a group.
    */
  var OptionName: String = js.native
  
  /**
    * The option settings to include in an option group.
    */
  var OptionSettings: js.UndefOr[OptionSettingsList] = js.native
  
  /**
    * The version for the option.
    */
  var OptionVersion: js.UndefOr[String] = js.native
  
  /**
    * The optional port for the option.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A list of VpcSecurityGroupMembership name strings used for this option.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.native
}
object OptionConfiguration {
  
  @scala.inline
  def apply(OptionName: String): OptionConfiguration = {
    val __obj = js.Dynamic.literal(OptionName = OptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionConfiguration]
  }
  
  @scala.inline
  implicit class OptionConfigurationOps[Self <: OptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setOptionName(value: String): Self = this.set("OptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupMembershipsVarargs(value: String*): Self = this.set("DBSecurityGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setDBSecurityGroupMemberships(value: DBSecurityGroupNameList): Self = this.set("DBSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSecurityGroupMemberships: Self = this.set("DBSecurityGroupMemberships", js.undefined)
    
    @scala.inline
    def setOptionSettingsVarargs(value: OptionSetting*): Self = this.set("OptionSettings", js.Array(value :_*))
    
    @scala.inline
    def setOptionSettings(value: OptionSettingsList): Self = this.set("OptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionSettings: Self = this.set("OptionSettings", js.undefined)
    
    @scala.inline
    def setOptionVersion(value: String): Self = this.set("OptionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionVersion: Self = this.set("OptionVersion", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupMembershipsVarargs(value: String*): Self = this.set("VpcSecurityGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupMemberships(value: VpcSecurityGroupIdList): Self = this.set("VpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupMemberships: Self = this.set("VpcSecurityGroupMemberships", js.undefined)
  }
}
