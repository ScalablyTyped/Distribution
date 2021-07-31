package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverageReportSummary extends StObject {
  
  /**
    * The percentage of branches that are covered by your tests.
    */
  var branchCoveragePercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The number of conditional branches that are covered by your tests.
    */
  var branchesCovered: js.UndefOr[NonNegativeInt] = js.undefined
  
  /**
    * The number of conditional branches that are not covered by your tests.
    */
  var branchesMissed: js.UndefOr[NonNegativeInt] = js.undefined
  
  /**
    * The percentage of lines that are covered by your tests.
    */
  var lineCoveragePercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The number of lines that are covered by your tests.
    */
  var linesCovered: js.UndefOr[NonNegativeInt] = js.undefined
  
  /**
    * The number of lines that are not covered by your tests.
    */
  var linesMissed: js.UndefOr[NonNegativeInt] = js.undefined
}
object CodeCoverageReportSummary {
  
  @scala.inline
  def apply(): CodeCoverageReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeCoverageReportSummary]
  }
  
  @scala.inline
  implicit class CodeCoverageReportSummaryMutableBuilder[Self <: CodeCoverageReportSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchCoveragePercentage(value: Percentage): Self = StObject.set(x, "branchCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchCoveragePercentageUndefined: Self = StObject.set(x, "branchCoveragePercentage", js.undefined)
    
    @scala.inline
    def setBranchesCovered(value: NonNegativeInt): Self = StObject.set(x, "branchesCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesCoveredUndefined: Self = StObject.set(x, "branchesCovered", js.undefined)
    
    @scala.inline
    def setBranchesMissed(value: NonNegativeInt): Self = StObject.set(x, "branchesMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesMissedUndefined: Self = StObject.set(x, "branchesMissed", js.undefined)
    
    @scala.inline
    def setLineCoveragePercentage(value: Percentage): Self = StObject.set(x, "lineCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCoveragePercentageUndefined: Self = StObject.set(x, "lineCoveragePercentage", js.undefined)
    
    @scala.inline
    def setLinesCovered(value: NonNegativeInt): Self = StObject.set(x, "linesCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesCoveredUndefined: Self = StObject.set(x, "linesCovered", js.undefined)
    
    @scala.inline
    def setLinesMissed(value: NonNegativeInt): Self = StObject.set(x, "linesMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesMissedUndefined: Self = StObject.set(x, "linesMissed", js.undefined)
  }
}
