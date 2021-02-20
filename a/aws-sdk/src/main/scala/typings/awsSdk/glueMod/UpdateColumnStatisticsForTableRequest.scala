package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateColumnStatisticsForTableRequest extends StObject {
  
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
  implicit class UpdateColumnStatisticsForTableRequestMutableBuilder[Self <: UpdateColumnStatisticsForTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setColumnStatisticsList(value: UpdateColumnStatisticsList): Self = StObject.set(x, "ColumnStatisticsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStatisticsListVarargs(value: ColumnStatistics*): Self = StObject.set(x, "ColumnStatisticsList", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
