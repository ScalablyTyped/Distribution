package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to delete.
    */
  var datasetArn: Arn = js.native
}

object DeleteDatasetRequest {
  @scala.inline
  def apply(datasetArn: Arn): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
}

