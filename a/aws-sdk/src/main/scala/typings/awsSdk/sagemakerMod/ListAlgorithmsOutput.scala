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
  def apply(AlgorithmSummaryList: AlgorithmSummaryList, NextToken: NextToken = null): ListAlgorithmsOutput = {
    val __obj = js.Dynamic.literal(AlgorithmSummaryList = AlgorithmSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlgorithmsOutput]
  }
}

