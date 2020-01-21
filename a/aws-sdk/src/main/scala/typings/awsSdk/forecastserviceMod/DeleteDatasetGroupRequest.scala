package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to delete.
    */
  var DatasetGroupArn: Arn = js.native
}

object DeleteDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
}

