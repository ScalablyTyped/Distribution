package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverage extends StObject {
  
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
    * The date and time that the tests were run.
    */
  var expired: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The path of the test report file.
    */
  var filePath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the code coverage report.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
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
  
  /**
    * The ARN of the report.
    */
  var reportARN: js.UndefOr[NonEmptyString] = js.undefined
}
object CodeCoverage {
  
  @scala.inline
  def apply(): CodeCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeCoverage]
  }
  
  @scala.inline
  implicit class CodeCoverageMutableBuilder[Self <: CodeCoverage] (val x: Self) extends AnyVal {
    
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
    def setExpired(value: Timestamp): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    @scala.inline
    def setFilePath(value: NonEmptyString): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
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
    
    @scala.inline
    def setReportARN(value: NonEmptyString): Self = StObject.set(x, "reportARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportARNUndefined: Self = StObject.set(x, "reportARN", js.undefined)
  }
}
