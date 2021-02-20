package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssignmentResponse extends StObject {
  
  /**
    *  The assignment. The response includes one Assignment element. 
    */
  var Assignment: js.UndefOr[typings.awsSdk.mturkMod.Assignment] = js.native
  
  /**
    *  The HIT associated with this assignment. The response includes one HIT element.
    */
  var HIT: js.UndefOr[typings.awsSdk.mturkMod.HIT] = js.native
}
object GetAssignmentResponse {
  
  @scala.inline
  def apply(): GetAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssignmentResponse]
  }
  
  @scala.inline
  implicit class GetAssignmentResponseMutableBuilder[Self <: GetAssignmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignment(value: Assignment): Self = StObject.set(x, "Assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentUndefined: Self = StObject.set(x, "Assignment", js.undefined)
    
    @scala.inline
    def setHIT(value: HIT): Self = StObject.set(x, "HIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITUndefined: Self = StObject.set(x, "HIT", js.undefined)
  }
}
