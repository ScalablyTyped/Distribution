package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupConfigurationParameter extends StObject {
  
  /**
    * The name of the group configuration parameter. For the list of parameters that you can use with each configuration item type, see Supported resource types and parameters.
    */
  var Name: GroupConfigurationParameterName
  
  /**
    * The value or values to be used for the specified parameter. For the list of values you can use with each parameter, see Supported resource types and parameters.
    */
  var Values: js.UndefOr[GroupConfigurationParameterValueList] = js.undefined
}
object GroupConfigurationParameter {
  
  inline def apply(Name: GroupConfigurationParameterName): GroupConfigurationParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupConfigurationParameter]
  }
  
  extension [Self <: GroupConfigurationParameter](x: Self) {
    
    inline def setName(value: GroupConfigurationParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: GroupConfigurationParameterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: GroupConfigurationParameterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
