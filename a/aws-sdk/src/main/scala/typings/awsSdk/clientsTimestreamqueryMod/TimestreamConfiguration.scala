package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestreamConfiguration extends StObject {
  
  /**
    * Name of Timestream database to which the query result will be written.
    */
  var DatabaseName: ResourceName
  
  /**
    *  This is to allow mapping column(s) from the query result to the dimension in the destination table. 
    */
  var DimensionMappings: DimensionMappingList
  
  /**
    * Name of the measure column.
    */
  var MeasureNameColumn: js.UndefOr[SchemaName] = js.undefined
  
  /**
    * Specifies how to map measures to multi-measure records.
    */
  var MixedMeasureMappings: js.UndefOr[MixedMeasureMappingList] = js.undefined
  
  /**
    * Multi-measure mappings.
    */
  var MultiMeasureMappings: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.MultiMeasureMappings] = js.undefined
  
  /**
    * Name of Timestream table that the query result will be written to. The table should be within the same database that is provided in Timestream configuration.
    */
  var TableName: ResourceName
  
  /**
    * Column from query result that should be used as the time column in destination table. Column type for this should be TIMESTAMP.
    */
  var TimeColumn: SchemaName
}
object TimestreamConfiguration {
  
  inline def apply(
    DatabaseName: ResourceName,
    DimensionMappings: DimensionMappingList,
    TableName: ResourceName,
    TimeColumn: SchemaName
  ): TimestreamConfiguration = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], DimensionMappings = DimensionMappings.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], TimeColumn = TimeColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestreamConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDimensionMappings(value: DimensionMappingList): Self = StObject.set(x, "DimensionMappings", value.asInstanceOf[js.Any])
    
    inline def setDimensionMappingsVarargs(value: DimensionMapping*): Self = StObject.set(x, "DimensionMappings", js.Array(value*))
    
    inline def setMeasureNameColumn(value: SchemaName): Self = StObject.set(x, "MeasureNameColumn", value.asInstanceOf[js.Any])
    
    inline def setMeasureNameColumnUndefined: Self = StObject.set(x, "MeasureNameColumn", js.undefined)
    
    inline def setMixedMeasureMappings(value: MixedMeasureMappingList): Self = StObject.set(x, "MixedMeasureMappings", value.asInstanceOf[js.Any])
    
    inline def setMixedMeasureMappingsUndefined: Self = StObject.set(x, "MixedMeasureMappings", js.undefined)
    
    inline def setMixedMeasureMappingsVarargs(value: MixedMeasureMapping*): Self = StObject.set(x, "MixedMeasureMappings", js.Array(value*))
    
    inline def setMultiMeasureMappings(value: MultiMeasureMappings): Self = StObject.set(x, "MultiMeasureMappings", value.asInstanceOf[js.Any])
    
    inline def setMultiMeasureMappingsUndefined: Self = StObject.set(x, "MultiMeasureMappings", js.undefined)
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTimeColumn(value: SchemaName): Self = StObject.set(x, "TimeColumn", value.asInstanceOf[js.Any])
  }
}
