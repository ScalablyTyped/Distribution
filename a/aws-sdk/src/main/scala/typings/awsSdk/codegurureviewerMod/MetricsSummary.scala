package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsSummary extends StObject {
  
  /**
    * Total number of recommendations found in the code review.
    */
  var FindingsCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.FindingsCount] = js.undefined
  
  /**
    * Lines of code metered in the code review. For the initial code review pull request and all subsequent revisions, this includes all lines of code in the files added to the pull request. In subsequent revisions, for files that already existed in the pull request, this includes only the changed lines of code. In both cases, this does not include non-code lines such as comments and import statements. For example, if you submit a pull request containing 5 files, each with 500 lines of code, and in a subsequent revision you added a new file with 200 lines of code, and also modified a total of 25 lines across the initial 5 files, MeteredLinesOfCodeCount includes the first 5 files (5 * 500 = 2,500 lines), the new file (200 lines) and the 25 changed lines of code for a total of 2,725 lines of code.
    */
  var MeteredLinesOfCodeCount: js.UndefOr[LinesOfCodeCount] = js.undefined
  
  /**
    * Lines of code suppressed in the code review based on the excludeFiles element in the aws-codeguru-reviewer.yml file. For full repository analyses, this number includes all lines of code in the files that are suppressed. For pull requests, this number only includes the changed lines of code that are suppressed. In both cases, this number does not include non-code lines such as comments and import statements. For example, if you initiate a full repository analysis on a repository containing 5 files, each file with 100 lines of code, and 2 files are listed as excluded in the aws-codeguru-reviewer.yml file, then SuppressedLinesOfCodeCount returns 200 (2 * 100) as the total number of lines of code suppressed. However, if you submit a pull request for the same repository, then SuppressedLinesOfCodeCount only includes the lines in the 2 files that changed. If only 1 of the 2 files changed in the pull request, then SuppressedLinesOfCodeCount returns 100 (1 * 100) as the total number of lines of code suppressed.
    */
  var SuppressedLinesOfCodeCount: js.UndefOr[LinesOfCodeCount] = js.undefined
}
object MetricsSummary {
  
  inline def apply(): MetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsSummary]
  }
  
  extension [Self <: MetricsSummary](x: Self) {
    
    inline def setFindingsCount(value: FindingsCount): Self = StObject.set(x, "FindingsCount", value.asInstanceOf[js.Any])
    
    inline def setFindingsCountUndefined: Self = StObject.set(x, "FindingsCount", js.undefined)
    
    inline def setMeteredLinesOfCodeCount(value: LinesOfCodeCount): Self = StObject.set(x, "MeteredLinesOfCodeCount", value.asInstanceOf[js.Any])
    
    inline def setMeteredLinesOfCodeCountUndefined: Self = StObject.set(x, "MeteredLinesOfCodeCount", js.undefined)
    
    inline def setSuppressedLinesOfCodeCount(value: LinesOfCodeCount): Self = StObject.set(x, "SuppressedLinesOfCodeCount", value.asInstanceOf[js.Any])
    
    inline def setSuppressedLinesOfCodeCountUndefined: Self = StObject.set(x, "SuppressedLinesOfCodeCount", js.undefined)
  }
}
