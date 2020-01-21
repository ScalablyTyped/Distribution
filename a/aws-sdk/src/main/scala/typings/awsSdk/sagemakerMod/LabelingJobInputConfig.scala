package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobInputConfig extends js.Object {
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.native
  /**
    * The location of the input data.
    */
  var DataSource: LabelingJobDataSource = js.native
}

object LabelingJobInputConfig {
  @scala.inline
  def apply(DataSource: LabelingJobDataSource, DataAttributes: LabelingJobDataAttributes = null): LabelingJobInputConfig = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    if (DataAttributes != null) __obj.updateDynamic("DataAttributes")(DataAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobInputConfig]
  }
}

