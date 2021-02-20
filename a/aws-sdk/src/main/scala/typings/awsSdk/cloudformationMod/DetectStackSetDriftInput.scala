package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectStackSetDriftInput extends StObject {
  
  /**
    *  The ID of the stack set operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  
  /**
    * The name of the stack set on which to perform the drift detection operation.
    */
  var StackSetName: StackSetNameOrId = js.native
}
object DetectStackSetDriftInput {
  
  @scala.inline
  def apply(StackSetName: StackSetNameOrId): DetectStackSetDriftInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackSetDriftInput]
  }
  
  @scala.inline
  implicit class DetectStackSetDriftInputMutableBuilder[Self <: DetectStackSetDriftInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    @scala.inline
    def setOperationPreferences(value: StackSetOperationPreferences): Self = StObject.set(x, "OperationPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationPreferencesUndefined: Self = StObject.set(x, "OperationPreferences", js.undefined)
    
    @scala.inline
    def setStackSetName(value: StackSetNameOrId): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
