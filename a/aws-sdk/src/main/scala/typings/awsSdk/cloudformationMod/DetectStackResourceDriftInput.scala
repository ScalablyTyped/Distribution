package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectStackResourceDriftInput extends StObject {
  
  /**
    * The logical name of the resource for which to return drift information.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId
  
  /**
    * The name of the stack to which the resource belongs.
    */
  var StackName: StackNameOrId
}
object DetectStackResourceDriftInput {
  
  inline def apply(LogicalResourceId: LogicalResourceId, StackName: StackNameOrId): DetectStackResourceDriftInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackResourceDriftInput]
  }
  
  extension [Self <: DetectStackResourceDriftInput](x: Self) {
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
