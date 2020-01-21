package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatasetRequest extends js.Object {
  /**
    * A list of "DatasetAction" objects.
    */
  var actions: DatasetActions = js.native
  /**
    * When data set contents are created they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.native
  /**
    * The name of the data set to update.
    */
  var datasetName: DatasetName = js.native
  /**
    * How long, in days, data set contents are kept for the data set.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  /**
    * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five DataSetTrigger objects.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.native
  /**
    * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.native
}

object UpdateDatasetRequest {
  @scala.inline
  def apply(
    actions: DatasetActions,
    datasetName: DatasetName,
    contentDeliveryRules: DatasetContentDeliveryRules = null,
    retentionPeriod: RetentionPeriod = null,
    triggers: DatasetTriggers = null,
    versioningConfiguration: VersioningConfiguration = null
  ): UpdateDatasetRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], datasetName = datasetName.asInstanceOf[js.Any])
    if (contentDeliveryRules != null) __obj.updateDynamic("contentDeliveryRules")(contentDeliveryRules.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    if (versioningConfiguration != null) __obj.updateDynamic("versioningConfiguration")(versioningConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetRequest]
  }
}

