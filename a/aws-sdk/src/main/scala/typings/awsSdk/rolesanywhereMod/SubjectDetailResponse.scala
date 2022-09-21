package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectDetailResponse extends StObject {
  
  /**
    * The state of the subject after a read or write operation.
    */
  var subject: js.UndefOr[SubjectDetail] = js.undefined
}
object SubjectDetailResponse {
  
  inline def apply(): SubjectDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectDetailResponse]
  }
  
  extension [Self <: SubjectDetailResponse](x: Self) {
    
    inline def setSubject(value: SubjectDetail): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
