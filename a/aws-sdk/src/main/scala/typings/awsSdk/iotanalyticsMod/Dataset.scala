package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  /**
    * The "DatasetAction" objects that automatically create the data set contents.
    */
  var actions: js.UndefOr[DatasetActions] = js.native
  /**
    * The ARN of the data set.
    */
  var arn: js.UndefOr[DatasetArn] = js.native
  /**
    * When data set contents are created they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.native
  /**
    * When the data set was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time the data set was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the data set.
    */
  var name: js.UndefOr[DatasetName] = js.native
  /**
    * [Optional] How long, in days, message data is kept for the data set.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  /**
    * The status of the data set.
    */
  var status: js.UndefOr[DatasetStatus] = js.native
  /**
    * The "DatasetTrigger" objects that specify when the data set is automatically updated.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.native
  /**
    * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.native
}

object Dataset {
  @scala.inline
  def apply(
    actions: DatasetActions = null,
    arn: DatasetArn = null,
    contentDeliveryRules: DatasetContentDeliveryRules = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: DatasetName = null,
    retentionPeriod: RetentionPeriod = null,
    status: DatasetStatus = null,
    triggers: DatasetTriggers = null,
    versioningConfiguration: VersioningConfiguration = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (contentDeliveryRules != null) __obj.updateDynamic("contentDeliveryRules")(contentDeliveryRules.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    if (versioningConfiguration != null) __obj.updateDynamic("versioningConfiguration")(versioningConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

