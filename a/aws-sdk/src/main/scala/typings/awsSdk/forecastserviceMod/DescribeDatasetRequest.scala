package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: Arn = js.native
}

object DescribeDatasetRequest {
  @scala.inline
  def apply(DatasetArn: Arn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
}

