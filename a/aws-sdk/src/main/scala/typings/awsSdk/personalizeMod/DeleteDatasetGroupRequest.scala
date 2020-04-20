package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetGroupRequest extends js.Object {
  /**
    * The ARN of the dataset group to delete.
    */
  var datasetGroupArn: Arn = js.native
}

object DeleteDatasetGroupRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
}

