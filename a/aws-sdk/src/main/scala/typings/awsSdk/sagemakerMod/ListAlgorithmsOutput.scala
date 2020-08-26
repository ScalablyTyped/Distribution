package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAlgorithmsOutput extends js.Object {
  /**
    * &gt;An array of AlgorithmSummary objects, each of which lists an algorithm.
    */
  var AlgorithmSummaryList: typings.awsSdk.sagemakerMod.AlgorithmSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListAlgorithmsOutput {
  @scala.inline
  def apply(AlgorithmSummaryList: AlgorithmSummaryList): ListAlgorithmsOutput = {
    val __obj = js.Dynamic.literal(AlgorithmSummaryList = AlgorithmSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlgorithmsOutput]
  }
  @scala.inline
  implicit class ListAlgorithmsOutputOps[Self <: ListAlgorithmsOutput] (val x: Self) extends AnyVal {
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
    def setAlgorithmSummaryListVarargs(value: AlgorithmSummary*): Self = this.set("AlgorithmSummaryList", js.Array(value :_*))
    @scala.inline
    def setAlgorithmSummaryList(value: AlgorithmSummaryList): Self = this.set("AlgorithmSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

