package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParameterGroupResponse extends StObject {
  
  /**
    * A user-specified message for this action (i.e., a reason for deleting the parameter group).
    */
  var DeletionMessage: js.UndefOr[String] = js.native
}
object DeleteParameterGroupResponse {
  
  @scala.inline
  def apply(): DeleteParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParameterGroupResponse]
  }
  
  @scala.inline
  implicit class DeleteParameterGroupResponseMutableBuilder[Self <: DeleteParameterGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionMessage(value: String): Self = StObject.set(x, "DeletionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionMessageUndefined: Self = StObject.set(x, "DeletionMessage", js.undefined)
  }
}
