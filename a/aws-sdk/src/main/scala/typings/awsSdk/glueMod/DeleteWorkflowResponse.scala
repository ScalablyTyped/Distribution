package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWorkflowResponse extends StObject {
  
  /**
    * Name of the workflow specified in input.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object DeleteWorkflowResponse {
  
  @scala.inline
  def apply(): DeleteWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteWorkflowResponse]
  }
  
  @scala.inline
  implicit class DeleteWorkflowResponseMutableBuilder[Self <: DeleteWorkflowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
