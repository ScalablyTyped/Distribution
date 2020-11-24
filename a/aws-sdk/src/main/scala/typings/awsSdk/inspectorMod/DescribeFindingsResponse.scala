package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFindingsResponse extends js.Object {
  
  /**
    * Finding details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
  
  /**
    * Information about the finding.
    */
  var findings: FindingList = js.native
}
object DescribeFindingsResponse {
  
  @scala.inline
  def apply(failedItems: FailedItems, findings: FindingList): DescribeFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsResponse]
  }
  
  @scala.inline
  implicit class DescribeFindingsResponseOps[Self <: DescribeFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = this.set("failedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsVarargs(value: Finding*): Self = this.set("findings", js.Array(value :_*))
    
    @scala.inline
    def setFindings(value: FindingList): Self = this.set("findings", value.asInstanceOf[js.Any])
  }
}
