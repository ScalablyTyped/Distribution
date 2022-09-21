package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterGroupStatus extends StObject {
  
  /**
    * The node IDs of one or more nodes to be rebooted.
    */
  var NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.undefined
  
  /**
    * The status of parameter updates. 
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
}
object ParameterGroupStatus {
  
  inline def apply(): ParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterGroupStatus]
  }
  
  extension [Self <: ParameterGroupStatus](x: Self) {
    
    inline def setNodeIdsToReboot(value: NodeIdentifierList): Self = StObject.set(x, "NodeIdsToReboot", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsToRebootUndefined: Self = StObject.set(x, "NodeIdsToReboot", js.undefined)
    
    inline def setNodeIdsToRebootVarargs(value: String*): Self = StObject.set(x, "NodeIdsToReboot", js.Array(value*))
    
    inline def setParameterApplyStatus(value: String): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
  }
}
