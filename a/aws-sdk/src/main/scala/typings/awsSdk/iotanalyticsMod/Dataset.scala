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
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: DatasetAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: DatasetActions): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setArn(value: DatasetArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setContentDeliveryRulesVarargs(value: DatasetContentDeliveryRule*): Self = this.set("contentDeliveryRules", js.Array(value :_*))
    @scala.inline
    def setContentDeliveryRules(value: DatasetContentDeliveryRules): Self = this.set("contentDeliveryRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDeliveryRules: Self = this.set("contentDeliveryRules", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setName(value: DatasetName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
    @scala.inline
    def setStatus(value: DatasetStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTriggersVarargs(value: DatasetTrigger*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: DatasetTriggers): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    @scala.inline
    def setVersioningConfiguration(value: VersioningConfiguration): Self = this.set("versioningConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioningConfiguration: Self = this.set("versioningConfiguration", js.undefined)
  }
  
}

