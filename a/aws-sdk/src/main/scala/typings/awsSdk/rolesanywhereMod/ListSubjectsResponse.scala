package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubjectsResponse extends StObject {
  
  /**
    * A token that indicates where the output should continue from, if a previous operation did not show all results. To get the next results, call the operation again with this value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of subjects.
    */
  var subjects: js.UndefOr[SubjectSummaries] = js.undefined
}
object ListSubjectsResponse {
  
  inline def apply(): ListSubjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubjectsResponse]
  }
  
  extension [Self <: ListSubjectsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSubjects(value: SubjectSummaries): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def setSubjectsVarargs(value: SubjectSummary*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
