package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateColumnStatisticsForPartitionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A list of the column statistics.
    */
  var ColumnStatisticsList: UpdateColumnStatisticsList
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString
  
  /**
    * A list of partition values identifying the partition.
    */
  var PartitionValues: ValueStringList
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString
}
object UpdateColumnStatisticsForPartitionRequest {
  
  @scala.inline
  def apply(
    ColumnStatisticsList: UpdateColumnStatisticsList,
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString
  ): UpdateColumnStatisticsForPartitionRequest = {
    val __obj = js.Dynamic.literal(ColumnStatisticsList = ColumnStatisticsList.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateColumnStatisticsForPartitionRequest]
  }
  
  @scala.inline
  implicit class UpdateColumnStatisticsForPartitionRequestMutableBuilder[Self <: UpdateColumnStatisticsForPartitionRequest] (val x: Self) extends AnyVal {
    
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
    def setPartitionValues(value: ValueStringList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValuesVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value :_*))
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
