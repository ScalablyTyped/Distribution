package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsResponse extends StObject {
  
  /**
    * An array of objects, one for each finding that meets the criteria specified in the request.
    */
  var findings: js.UndefOr[listOfFinding] = js.native
}
object GetFindingsResponse {
  
  @scala.inline
  def apply(): GetFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsResponse]
  }
  
  @scala.inline
  implicit class GetFindingsResponseMutableBuilder[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: listOfFinding): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    @scala.inline
    def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "findings", js.Array(value :_*))
  }
}
