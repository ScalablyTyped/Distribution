package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAuditFindingsResponse extends StObject {
  
  /**
    * The findings (results) of the audit.
    */
  var findings: js.UndefOr[AuditFindings] = js.native
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAuditFindingsResponse {
  
  @scala.inline
  def apply(): ListAuditFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditFindingsResponse]
  }
  
  @scala.inline
  implicit class ListAuditFindingsResponseMutableBuilder[Self <: ListAuditFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: AuditFindings): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    @scala.inline
    def setFindingsVarargs(value: AuditFinding*): Self = StObject.set(x, "findings", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
