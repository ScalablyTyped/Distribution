package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsResponse extends StObject {
  
  /**
    * An array of objects, one for each finding that meets the criteria specified in the request.
    */
  var findings: js.UndefOr[listOfFinding] = js.undefined
}
object GetFindingsResponse {
  
  inline def apply(): GetFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsResponse]
  }
  
  extension [Self <: GetFindingsResponse](x: Self) {
    
    inline def setFindings(value: listOfFinding): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "findings", js.Array(value*))
  }
}
