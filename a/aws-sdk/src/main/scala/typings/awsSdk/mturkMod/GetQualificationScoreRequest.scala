package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQualificationScoreRequest extends StObject {
  
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: EntityId
  
  /**
    * The ID of the Worker whose Qualification is being updated.
    */
  var WorkerId: CustomerId
}
object GetQualificationScoreRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): GetQualificationScoreRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQualificationScoreRequest]
  }
  
  @scala.inline
  implicit class GetQualificationScoreRequestMutableBuilder[Self <: GetQualificationScoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
  }
}
