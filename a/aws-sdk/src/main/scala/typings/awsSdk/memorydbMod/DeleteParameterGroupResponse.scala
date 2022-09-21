package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameterGroupResponse extends StObject {
  
  /**
    * The parameter group that has been deleted.
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.memorydbMod.ParameterGroup] = js.undefined
}
object DeleteParameterGroupResponse {
  
  inline def apply(): DeleteParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParameterGroupResponse]
  }
  
  extension [Self <: DeleteParameterGroupResponse](x: Self) {
    
    inline def setParameterGroup(value: ParameterGroup): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
  }
}
