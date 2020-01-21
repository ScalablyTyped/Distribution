package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMLModelsOutput extends js.Object {
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  /**
    * A list of MLModel that meet the search criteria.
    */
  var Results: js.UndefOr[MLModels] = js.native
}

object DescribeMLModelsOutput {
  @scala.inline
  def apply(NextToken: StringType = null, Results: MLModels = null): DescribeMLModelsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Results != null) __obj.updateDynamic("Results")(Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMLModelsOutput]
  }
}

