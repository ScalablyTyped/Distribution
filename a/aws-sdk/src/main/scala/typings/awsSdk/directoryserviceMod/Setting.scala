package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Setting extends StObject {
  
  /**
    * The name of the directory setting. For example:  TLS_1_0 
    */
  var Name: DirectoryConfigurationSettingName
  
  /**
    * The value of the directory setting for which to retrieve information. For example, for TLS_1_0, the valid values are: Enable and Disable.
    */
  var Value: DirectoryConfigurationSettingValue
}
object Setting {
  
  inline def apply(Name: DirectoryConfigurationSettingName, Value: DirectoryConfigurationSettingValue): Setting = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setting]
  }
  
  extension [Self <: Setting](x: Self) {
    
    inline def setName(value: DirectoryConfigurationSettingName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DirectoryConfigurationSettingValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
