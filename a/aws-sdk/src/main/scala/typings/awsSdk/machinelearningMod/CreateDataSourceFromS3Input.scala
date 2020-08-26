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
  def apply(DataSourceId: EntityId, DataSpec: S3DataSpec): CreateDataSourceFromS3Input = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSpec = DataSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceFromS3Input]
  }
  @scala.inline
  implicit class CreateDataSourceFromS3InputOps[Self <: CreateDataSourceFromS3Input] (val x: Self) extends AnyVal {
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
    def setDataSourceId(value: EntityId): Self = this.set("DataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSpec(value: S3DataSpec): Self = this.set("DataSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputeStatistics(value: ComputeStatistics): Self = this.set("ComputeStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeStatistics: Self = this.set("ComputeStatistics", js.undefined)
    @scala.inline
    def setDataSourceName(value: EntityName): Self = this.set("DataSourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceName: Self = this.set("DataSourceName", js.undefined)
  }
  
}

