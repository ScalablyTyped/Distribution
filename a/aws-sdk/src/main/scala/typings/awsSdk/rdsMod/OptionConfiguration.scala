package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionConfiguration extends StObject {
  
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
  implicit class OptionConfigurationMutableBuilder[Self <: OptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroupMemberships(value: DBSecurityGroupNameList): Self = StObject.set(x, "DBSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupMembershipsUndefined: Self = StObject.set(x, "DBSecurityGroupMemberships", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupMembershipsVarargs(value: String*): Self = StObject.set(x, "DBSecurityGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setOptionName(value: String): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSettings(value: OptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    @scala.inline
    def setOptionSettingsVarargs(value: OptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value :_*))
    
    @scala.inline
    def setOptionVersion(value: String): Self = StObject.set(x, "OptionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionVersionUndefined: Self = StObject.set(x, "OptionVersion", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupMemberships(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupMembershipsUndefined: Self = StObject.set(x, "VpcSecurityGroupMemberships", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupMembershipsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupMemberships", js.Array(value :_*))
  }
}
