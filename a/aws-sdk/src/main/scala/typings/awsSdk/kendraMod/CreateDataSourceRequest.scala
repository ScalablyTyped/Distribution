package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceRequest extends js.Object {
  /**
    * The connector configuration information that is required to access the repository.
    */
  var Configuration: DataSourceConfiguration = js.native
  /**
    * A description for the data source.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * The identifier of the index that should be associated with this data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * A unique name for the data source. A data source name can't be changed without deleting and recreating the data source.
    */
  var Name: DataSourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the data source. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: typings.awsSdk.kendraMod.RoleArn = js.native
  /**
    * Sets the frequency that Amazon Kendra will check the documents in your repository and update the index. If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the StartDataSourceSyncJob operation to update the index.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
  /**
    * A list of key-value pairs that identify the data source. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of repository that contains the data source.
    */
  var Type: DataSourceType = js.native
}

object CreateDataSourceRequest {
  @scala.inline
  def apply(
    Configuration: DataSourceConfiguration,
    IndexId: IndexId,
    Name: DataSourceName,
    RoleArn: RoleArn,
    Type: DataSourceType
  ): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  @scala.inline
  implicit class CreateDataSourceRequestOps[Self <: CreateDataSourceRequest] (val x: Self) extends AnyVal {
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
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: DataSourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DataSourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setSchedule(value: ScanSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

