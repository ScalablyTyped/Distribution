package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeCoverageReportSummary extends js.Object {
  
  /**
    * The percentage of branches that are covered by your tests.
    */
  var branchCoveragePercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The number of conditional branches that are covered by your tests.
    */
  var branchesCovered: js.UndefOr[NonNegativeInt] = js.native
  
  /**
    * The number of conditional branches that are not covered by your tests.
    */
  var branchesMissed: js.UndefOr[NonNegativeInt] = js.native
  
  /**
    * The percentage of lines that are covered by your tests.
    */
  var lineCoveragePercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The number of lines that are covered by your tests.
    */
  var linesCovered: js.UndefOr[NonNegativeInt] = js.native
  
  /**
    * The number of lines that are not covered by your tests.
    */
  var linesMissed: js.UndefOr[NonNegativeInt] = js.native
}
object CodeCoverageReportSummary {
  
  @scala.inline
  def apply(): CodeCoverageReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeCoverageReportSummary]
  }
  
  @scala.inline
  implicit class CodeCoverageReportSummaryOps[Self <: CodeCoverageReportSummary] (val x: Self) extends AnyVal {
    
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
    def setBranchCoveragePercentage(value: Percentage): Self = this.set("branchCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchCoveragePercentage: Self = this.set("branchCoveragePercentage", js.undefined)
    
    @scala.inline
    def setBranchesCovered(value: NonNegativeInt): Self = this.set("branchesCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchesCovered: Self = this.set("branchesCovered", js.undefined)
    
    @scala.inline
    def setBranchesMissed(value: NonNegativeInt): Self = this.set("branchesMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchesMissed: Self = this.set("branchesMissed", js.undefined)
    
    @scala.inline
    def setLineCoveragePercentage(value: Percentage): Self = this.set("lineCoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCoveragePercentage: Self = this.set("lineCoveragePercentage", js.undefined)
    
    @scala.inline
    def setLinesCovered(value: NonNegativeInt): Self = this.set("linesCovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesCovered: Self = this.set("linesCovered", js.undefined)
    
    @scala.inline
    def setLinesMissed(value: NonNegativeInt): Self = this.set("linesMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesMissed: Self = this.set("linesMissed", js.undefined)
  }
}
