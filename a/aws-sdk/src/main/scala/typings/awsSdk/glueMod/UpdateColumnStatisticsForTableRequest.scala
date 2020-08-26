package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateColumnStatisticsForTableRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of the column statistics.
    */
  var ColumnStatisticsList: UpdateColumnStatisticsList = js.native
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString = js.native
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}

object UpdateColumnStatisticsForTableRequest {
  @scala.inline
  def apply(ColumnStatisticsList: UpdateColumnStatisticsList, DatabaseName: NameString, TableName: NameString): UpdateColumnStatisticsForTableRequest = {
    val __obj = js.Dynamic.literal(ColumnStatisticsList = ColumnStatisticsList.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateColumnStatisticsForTableRequest]
  }
  @scala.inline
  implicit class UpdateColumnStatisticsForTableRequestOps[Self <: UpdateColumnStatisticsForTableRequest] (val x: Self) extends AnyVal {
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
    def setColumnStatisticsListVarargs(value: ColumnStatistics*): Self = this.set("ColumnStatisticsList", js.Array(value :_*))
    @scala.inline
    def setColumnStatisticsList(value: UpdateColumnStatisticsList): Self = this.set("ColumnStatisticsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

