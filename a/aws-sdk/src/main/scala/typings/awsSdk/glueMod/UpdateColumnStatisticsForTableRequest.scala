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
  def apply(
    ColumnStatisticsList: UpdateColumnStatisticsList,
    DatabaseName: NameString,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): UpdateColumnStatisticsForTableRequest = {
    val __obj = js.Dynamic.literal(ColumnStatisticsList = ColumnStatisticsList.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateColumnStatisticsForTableRequest]
  }
}

