package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectStackResourceDriftInput extends StObject {
  
  /**
    * The logical name of the resource for which to return drift information.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId = js.native
  
  /**
    * The name of the stack to which the resource belongs.
    */
  var StackName: StackNameOrId = js.native
}
object DetectStackResourceDriftInput {
  
  @scala.inline
  def apply(LogicalResourceId: LogicalResourceId, StackName: StackNameOrId): DetectStackResourceDriftInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackResourceDriftInput]
  }
  
  @scala.inline
  implicit class DetectStackResourceDriftInputMutableBuilder[Self <: DetectStackResourceDriftInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
