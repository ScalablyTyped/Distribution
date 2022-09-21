package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectStackDriftInput extends StObject {
  
  /**
    * The logical names of any resources you want to use as filters.
    */
  var LogicalResourceIds: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceIds] = js.undefined
  
  /**
    * The name of the stack for which you want to detect drift.
    */
  var StackName: StackNameOrId
}
object DetectStackDriftInput {
  
  inline def apply(StackName: StackNameOrId): DetectStackDriftInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackDriftInput]
  }
  
  extension [Self <: DetectStackDriftInput](x: Self) {
    
    inline def setLogicalResourceIds(value: LogicalResourceIds): Self = StObject.set(x, "LogicalResourceIds", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdsUndefined: Self = StObject.set(x, "LogicalResourceIds", js.undefined)
    
    inline def setLogicalResourceIdsVarargs(value: LogicalResourceId*): Self = StObject.set(x, "LogicalResourceIds", js.Array(value*))
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
