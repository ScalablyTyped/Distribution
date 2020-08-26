package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceRequest extends js.Object {
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.native
  /**
    * The new description for the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * The unique identifier of the data source to update.
    */
  var Id: DataSourceId = js.native
  /**
    * The identifier of the index that contains the data source to update.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * The name of the data source to update. The name of the data source can't be updated. To rename a data source you must delete the data source and re-create it.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the new role to use when the data source is accessing resources on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
  /**
    * The new update schedule for the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
}

object UpdateDataSourceRequest {
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  @scala.inline
  implicit class UpdateDataSourceRequestOps[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
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
    def setId(value: DataSourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfiguration(value: DataSourceConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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
  }
  
}

