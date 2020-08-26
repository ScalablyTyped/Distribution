package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEvaluationsOutput extends js.Object {
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  /**
    * A list of Evaluation that meet the search criteria. 
    */
  var Results: js.UndefOr[Evaluations] = js.native
}

object DescribeEvaluationsOutput {
  @scala.inline
  def apply(): DescribeEvaluationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEvaluationsOutput]
  }
  @scala.inline
  implicit class DescribeEvaluationsOutputOps[Self <: DescribeEvaluationsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: StringType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResultsVarargs(value: Evaluation*): Self = this.set("Results", js.Array(value :_*))
    @scala.inline
    def setResults(value: Evaluations): Self = this.set("Results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
  }
  
}

