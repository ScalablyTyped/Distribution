package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDataSourceDescription extends js.Object {
  /**
    * The ID of the reference data source. This is the ID that Kinesis Data Analytics assigns when you add the reference data source to your application using the CreateApplication or UpdateApplication operation.
    */
  var ReferenceId: Id = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var ReferenceSchema: js.UndefOr[SourceSchema] = js.native
  /**
    * Provides the Amazon S3 bucket name, the object key name that contains the reference data. 
    */
  var S3ReferenceDataSourceDescription: typings.awsSdk.kinesisanalyticsv2Mod.S3ReferenceDataSourceDescription = js.native
  /**
    * The in-application table name created by the specific reference data source configuration.
    */
  var TableName: InAppTableName = js.native
}

object ReferenceDataSourceDescription {
  @scala.inline
  def apply(
    ReferenceId: Id,
    S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription,
    TableName: InAppTableName,
    ReferenceSchema: SourceSchema = null
  ): ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(ReferenceId = ReferenceId.asInstanceOf[js.Any], S3ReferenceDataSourceDescription = S3ReferenceDataSourceDescription.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (ReferenceSchema != null) __obj.updateDynamic("ReferenceSchema")(ReferenceSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSourceDescription]
  }
}

