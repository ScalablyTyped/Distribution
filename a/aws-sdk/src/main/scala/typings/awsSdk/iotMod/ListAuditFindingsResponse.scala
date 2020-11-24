package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAuditFindingsResponse extends js.Object {
  
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
  implicit class ListAuditFindingsResponseOps[Self <: ListAuditFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFindingsVarargs(value: AuditFinding*): Self = this.set("findings", js.Array(value :_*))
    
    @scala.inline
    def setFindings(value: AuditFindings): Self = this.set("findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindings: Self = this.set("findings", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
