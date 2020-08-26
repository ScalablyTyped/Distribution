package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSetRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.native
  /**
    * An ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId = js.native
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: DataSetImportMode = js.native
  /**
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typings.awsSdk.quicksightMod.LogicalTableMap] = js.native
  /**
    * The display name for the dataset.
    */
  var Name: ResourceName = js.native
  /**
    * A list of resource permissions on the dataset.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: typings.awsSdk.quicksightMod.PhysicalTableMap = js.native
  /**
    * The row-level security configuration for the data that you want to create.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.native
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDataSetRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: ResourceId,
    ImportMode: DataSetImportMode,
    Name: ResourceName,
    PhysicalTableMap: PhysicalTableMap
  ): CreateDataSetRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], ImportMode = ImportMode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PhysicalTableMap = PhysicalTableMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetRequest]
  }
  @scala.inline
  implicit class CreateDataSetRequestOps[Self <: CreateDataSetRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSetId(value: ResourceId): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportMode(value: DataSetImportMode): Self = this.set("ImportMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysicalTableMap(value: PhysicalTableMap): Self = this.set("PhysicalTableMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnGroupsVarargs(value: ColumnGroup*): Self = this.set("ColumnGroups", js.Array(value :_*))
    @scala.inline
    def setColumnGroups(value: ColumnGroupList): Self = this.set("ColumnGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGroups: Self = this.set("ColumnGroups", js.undefined)
    @scala.inline
    def setLogicalTableMap(value: LogicalTableMap): Self = this.set("LogicalTableMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalTableMap: Self = this.set("LogicalTableMap", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    @scala.inline
    def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = this.set("RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowLevelPermissionDataSet: Self = this.set("RowLevelPermissionDataSet", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

