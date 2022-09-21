package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalarSubjectRequest extends StObject {
  
  /**
    * The unique identifier of the subject. 
    */
  var subjectId: Uuid
}
object ScalarSubjectRequest {
  
  inline def apply(subjectId: Uuid): ScalarSubjectRequest = {
    val __obj = js.Dynamic.literal(subjectId = subjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarSubjectRequest]
  }
  
  extension [Self <: ScalarSubjectRequest](x: Self) {
    
    inline def setSubjectId(value: Uuid): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
  }
}
