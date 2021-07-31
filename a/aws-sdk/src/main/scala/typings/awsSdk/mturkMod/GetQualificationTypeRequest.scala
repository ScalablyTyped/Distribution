package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQualificationTypeRequest extends StObject {
  
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: EntityId
}
object GetQualificationTypeRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId): GetQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQualificationTypeRequest]
  }
  
  @scala.inline
  implicit class GetQualificationTypeRequestMutableBuilder[Self <: GetQualificationTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
  }
}
