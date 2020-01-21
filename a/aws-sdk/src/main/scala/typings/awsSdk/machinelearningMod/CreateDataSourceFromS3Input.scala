package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceFromS3Input extends js.Object {
  /**
    * The compute statistics for a DataSource. The statistics are generated from the observation data referenced by a DataSource. Amazon ML uses the statistics internally during MLModel training. This parameter must be set to true if the DataSource needs to be used for MLModel training.
    */
  var ComputeStatistics: js.UndefOr[typings.awsSdk.machinelearningMod.ComputeStatistics] = js.native
  /**
    * A user-supplied identifier that uniquely identifies the DataSource. 
    */
  var DataSourceId: EntityId = js.native
  /**
    * A user-supplied name or description of the DataSource. 
    */
  var DataSourceName: js.UndefOr[EntityName] = js.native
  /**
    * The data specification of a DataSource:  DataLocationS3 - The Amazon S3 location of the observation data. DataSchemaLocationS3 - The Amazon S3 location of the DataSchema. DataSchema - A JSON string representing the schema. This is not required if DataSchemaUri is specified.   DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the Datasource.   Sample -  "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"   
    */
  var DataSpec: S3DataSpec = js.native
}

object CreateDataSourceFromS3Input {
  @scala.inline
  def apply(
    DataSourceId: EntityId,
    DataSpec: S3DataSpec,
    ComputeStatistics: js.UndefOr[Boolean] = js.undefined,
    DataSourceName: EntityName = null
  ): CreateDataSourceFromS3Input = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSpec = DataSpec.asInstanceOf[js.Any])
    if (!js.isUndefined(ComputeStatistics)) __obj.updateDynamic("ComputeStatistics")(ComputeStatistics.asInstanceOf[js.Any])
    if (DataSourceName != null) __obj.updateDynamic("DataSourceName")(DataSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceFromS3Input]
  }
}

