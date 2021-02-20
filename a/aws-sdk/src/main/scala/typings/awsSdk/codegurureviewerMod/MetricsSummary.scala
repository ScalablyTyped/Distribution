package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsSummary extends StObject {
  
  /**
    *  Total number of recommendations found in the code review. 
    */
  var FindingsCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.FindingsCount] = js.native
  
  /**
    *  Lines of code metered in the code review. For the initial code review pull request and all subsequent revisions, this includes all lines of code in the files added to the pull request. In subsequent revisions, for files that already existed in the pull request, this includes only the changed lines of code. In both cases, this does not include non-code lines such as comments and import statements. For example, if you submit a pull request containing 5 files, each with 500 lines of code, and in a subsequent revision you added a new file with 200 lines of code, and also modified a total of 25 lines across the initial 5 files, MeteredLinesOfCodeCount includes the first 5 files (5 * 500 = 2,500 lines), the new file (200 lines) and the 25 changed lines of code for a total of 2,725 lines of code. 
    */
  var MeteredLinesOfCodeCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.MeteredLinesOfCodeCount] = js.native
}
object MetricsSummary {
  
  @scala.inline
  def apply(): MetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsSummary]
  }
  
  @scala.inline
  implicit class MetricsSummaryMutableBuilder[Self <: MetricsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingsCount(value: FindingsCount): Self = StObject.set(x, "FindingsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsCountUndefined: Self = StObject.set(x, "FindingsCount", js.undefined)
    
    @scala.inline
    def setMeteredLinesOfCodeCount(value: MeteredLinesOfCodeCount): Self = StObject.set(x, "MeteredLinesOfCodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeteredLinesOfCodeCountUndefined: Self = StObject.set(x, "MeteredLinesOfCodeCount", js.undefined)
  }
}
