package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to describe.
    */
  var datasetArn: Arn = js.native
}

object DescribeDatasetRequest {
  @scala.inline
  def apply(datasetArn: Arn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
}

