package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionConfiguration extends StObject {
  
  /**
    * A list of DBSecurityGroupMembership name strings used for this option.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.undefined
  
  /**
    * The configuration of options to include in a group.
    */
  var OptionName: String
  
  /**
    * The option settings to include in an option group.
    */
  var OptionSettings: js.UndefOr[OptionSettingsList] = js.undefined
  
  /**
    * The version for the option.
    */
  var OptionVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The optional port for the option.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A list of VpcSecurityGroupMembership name strings used for this option.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object OptionConfiguration {
  
  inline def apply(OptionName: String): OptionConfiguration = {
    val __obj = js.Dynamic.literal(OptionName = OptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionConfiguration]
  }
  
  extension [Self <: OptionConfiguration](x: Self) {
    
    inline def setDBSecurityGroupMemberships(value: DBSecurityGroupNameList): Self = StObject.set(x, "DBSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupMembershipsUndefined: Self = StObject.set(x, "DBSecurityGroupMemberships", js.undefined)
    
    inline def setDBSecurityGroupMembershipsVarargs(value: String*): Self = StObject.set(x, "DBSecurityGroupMemberships", js.Array(value :_*))
    
    inline def setOptionName(value: String): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    inline def setOptionSettings(value: OptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    inline def setOptionSettingsVarargs(value: OptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value :_*))
    
    inline def setOptionVersion(value: String): Self = StObject.set(x, "OptionVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionVersionUndefined: Self = StObject.set(x, "OptionVersion", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setVpcSecurityGroupMemberships(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupMembershipsUndefined: Self = StObject.set(x, "VpcSecurityGroupMemberships", js.undefined)
    
    inline def setVpcSecurityGroupMembershipsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupMemberships", js.Array(value :_*))
  }
}
