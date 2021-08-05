package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceFromS3Input extends StObject {
  
  /**
    * The compute statistics for a DataSource. The statistics are generated from the observation data referenced by a DataSource. Amazon ML uses the statistics internally during MLModel training. This parameter must be set to true if the DataSource needs to be used for MLModel training.
    */
  var ComputeStatistics: js.UndefOr[typings.awsSdk.machinelearningMod.ComputeStatistics] = js.undefined
  
  /**
    * A user-supplied identifier that uniquely identifies the DataSource. 
    */
  var DataSourceId: EntityId
  
  /**
    * A user-supplied name or description of the DataSource. 
    */
  var DataSourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The data specification of a DataSource:  DataLocationS3 - The Amazon S3 location of the observation data. DataSchemaLocationS3 - The Amazon S3 location of the DataSchema. DataSchema - A JSON string representing the schema. This is not required if DataSchemaUri is specified.   DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the Datasource.   Sample -  "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"   
    */
  var DataSpec: S3DataSpec
}
object CreateDataSourceFromS3Input {
  
  inline def apply(DataSourceId: EntityId, DataSpec: S3DataSpec): CreateDataSourceFromS3Input = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSpec = DataSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceFromS3Input]
  }
  
  extension [Self <: CreateDataSourceFromS3Input](x: Self) {
    
    inline def setComputeStatistics(value: ComputeStatistics): Self = StObject.set(x, "ComputeStatistics", value.asInstanceOf[js.Any])
    
    inline def setComputeStatisticsUndefined: Self = StObject.set(x, "ComputeStatistics", js.undefined)
    
    inline def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: EntityName): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNameUndefined: Self = StObject.set(x, "DataSourceName", js.undefined)
    
    inline def setDataSpec(value: S3DataSpec): Self = StObject.set(x, "DataSpec", value.asInstanceOf[js.Any])
  }
}
