package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParameterGroupRequest extends StObject {
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String
  
  /**
    * An array of name-value pairs for the parameters in the group. Each element in the array represents a single parameter.
    */
  var ParameterNameValues: ParameterNameValueList
}
object UpdateParameterGroupRequest {
  
  inline def apply(ParameterGroupName: String, ParameterNameValues: ParameterNameValueList): UpdateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParameterGroupRequest]
  }
  
  extension [Self <: UpdateParameterGroupRequest](x: Self) {
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValues(value: ParameterNameValueList): Self = StObject.set(x, "ParameterNameValues", value.asInstanceOf[js.Any])
    
    inline def setParameterNameValuesVarargs(value: ParameterNameValue*): Self = StObject.set(x, "ParameterNameValues", js.Array(value :_*))
  }
}
