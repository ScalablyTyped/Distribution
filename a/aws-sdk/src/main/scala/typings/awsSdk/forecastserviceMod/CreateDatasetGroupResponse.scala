package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetGroupResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetGroupResponse {
  @scala.inline
  def apply(DatasetGroupArn: Arn = null): CreateDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetGroupResponse]
  }
}

