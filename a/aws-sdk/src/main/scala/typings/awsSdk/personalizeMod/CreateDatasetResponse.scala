package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetResponse extends js.Object {
  /**
    * The ARN of the dataset.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetResponse {
  @scala.inline
  def apply(datasetArn: Arn = null): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetResponse]
  }
}

