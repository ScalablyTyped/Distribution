package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataSourceResponse extends js.Object {
  /**
    * Information that describes where the data source is located and how the data source is configured. The specific information in the description depends on the data source provider.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.native
  /**
    * The Unix timestamp of when the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a description of the error that caused the data source to fail.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * The identifier of the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: js.UndefOr[typings.awsSdk.kendraMod.IndexId] = js.native
  /**
    * The name that you gave the data source when it was created.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that enables the data source to access its resources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
  /**
    * The schedule that Amazon Kendra will update the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
  /**
    * The current status of the data source. When the status is ACTIVE the data source is ready to use. When the status is FAILED, the ErrorMessage field contains the reason that the data source failed.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  /**
    * The Unix timestamp of when the data source was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object DescribeDataSourceResponse {
  @scala.inline
  def apply(): DescribeDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourceResponse]
  }
  @scala.inline
  implicit class DescribeDataSourceResponseOps[Self <: DescribeDataSourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfiguration(value: DataSourceConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setId(value: DataSourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexId: Self = this.set("IndexId", js.undefined)
    @scala.inline
    def setName(value: DataSourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setSchedule(value: ScanSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    @scala.inline
    def setStatus(value: DataSourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setType(value: DataSourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

