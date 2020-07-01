package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateColumnStatisticsForPartitionRequest extends js.Object {
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
    * A list of partition values identifying the partition.
    */
  var PartitionValues: ValueStringList = js.native
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}

object UpdateColumnStatisticsForPartitionRequest {
  @scala.inline
  def apply(
    ColumnStatisticsList: UpdateColumnStatisticsList,
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): UpdateColumnStatisticsForPartitionRequest = {
    val __obj = js.Dynamic.literal(ColumnStatisticsList = ColumnStatisticsList.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateColumnStatisticsForPartitionRequest]
  }
}

