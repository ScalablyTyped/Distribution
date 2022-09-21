package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetParameterGroupRequest extends StObject {
  
  /**
    * If true, all parameters in the parameter group are reset to their default values. If false, only the parameters listed by ParameterNames are reset to their default values.
    */
  var AllParameters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the parameter group to reset.
    */
  var ParameterGroupName: String
  
  /**
    * An array of parameter names to reset to their default values. If AllParameters is true, do not use ParameterNames. If AllParameters is false, you must specify the name of at least one parameter to reset.
    */
  var ParameterNames: js.UndefOr[ParameterNameList] = js.undefined
}
object ResetParameterGroupRequest {
  
  inline def apply(ParameterGroupName: String): ResetParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetParameterGroupRequest]
  }
  
  extension [Self <: ResetParameterGroupRequest](x: Self) {
    
    inline def setAllParameters(value: Boolean): Self = StObject.set(x, "AllParameters", value.asInstanceOf[js.Any])
    
    inline def setAllParametersUndefined: Self = StObject.set(x, "AllParameters", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterNames(value: ParameterNameList): Self = StObject.set(x, "ParameterNames", value.asInstanceOf[js.Any])
    
    inline def setParameterNamesUndefined: Self = StObject.set(x, "ParameterNames", js.undefined)
    
    inline def setParameterNamesVarargs(value: String*): Self = StObject.set(x, "ParameterNames", js.Array(value*))
  }
}
