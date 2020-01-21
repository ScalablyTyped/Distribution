package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatasetGroupRequest extends js.Object {
  /**
    * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
    */
  var DatasetArns: ArnList = js.native
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: Arn = js.native
}

object UpdateDatasetGroupRequest {
  @scala.inline
  def apply(DatasetArns: ArnList, DatasetGroupArn: Arn): UpdateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetArns = DatasetArns.asInstanceOf[js.Any], DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateDatasetGroupRequest]
  }
}

