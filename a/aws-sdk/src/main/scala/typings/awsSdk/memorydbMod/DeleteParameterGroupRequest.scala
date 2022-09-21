package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameterGroupRequest extends StObject {
  
  /**
    * The name of the parameter group to delete.
    */
  var ParameterGroupName: String
}
object DeleteParameterGroupRequest {
  
  inline def apply(ParameterGroupName: String): DeleteParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameterGroupRequest]
  }
  
  extension [Self <: DeleteParameterGroupRequest](x: Self) {
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
  }
}
