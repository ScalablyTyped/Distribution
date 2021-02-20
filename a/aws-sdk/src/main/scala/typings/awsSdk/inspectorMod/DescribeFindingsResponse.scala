package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFindingsResponse extends StObject {
  
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
  implicit class DescribeFindingsResponseMutableBuilder[Self <: DescribeFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindings(value: FindingList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "findings", js.Array(value :_*))
  }
}
