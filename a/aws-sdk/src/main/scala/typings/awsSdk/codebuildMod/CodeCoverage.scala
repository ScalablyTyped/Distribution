package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCoverage extends js.Object {
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
    * The date and time that the tests were run.
    */
  var expired: js.UndefOr[Timestamp] = js.native
  /**
    * The path of the test report file.
    */
  var filePath: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the code coverage report.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
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
  /**
    * The ARN of the report.
    */
  var reportARN: js.UndefOr[NonEmptyString] = js.native
}

object CodeCoverage {
  @scala.inline
  def apply(): CodeCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeCoverage]
  }
  @scala.inline
  implicit class CodeCoverageOps[Self <: CodeCoverage] (val x: Self) extends AnyVal {
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
    def setExpired(value: Timestamp): Self = this.set("expired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpired: Self = this.set("expired", js.undefined)
    @scala.inline
    def setFilePath(value: NonEmptyString): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
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
    @scala.inline
    def setReportARN(value: NonEmptyString): Self = this.set("reportARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportARN: Self = this.set("reportARN", js.undefined)
  }
  
}

