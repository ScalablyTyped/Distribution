package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkforceRequest extends StObject {
  
  /**
    * The name of the workforce.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName
}
object DeleteWorkforceRequest {
  
  @scala.inline
  def apply(WorkforceName: WorkforceName): DeleteWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkforceRequest]
  }
  
  @scala.inline
  implicit class DeleteWorkforceRequestMutableBuilder[Self <: DeleteWorkforceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
  }
}
