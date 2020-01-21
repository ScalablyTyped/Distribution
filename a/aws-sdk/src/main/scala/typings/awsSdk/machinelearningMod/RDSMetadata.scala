package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSMetadata extends js.Object {
  /**
    * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use the ID to find details about the instance in the Data Pipeline console.
    */
  var DataPipelineId: js.UndefOr[EDPPipelineId] = js.native
  /**
    * The database details required to connect to an Amazon RDS.
    */
  var Database: js.UndefOr[RDSDatabase] = js.native
  var DatabaseUserName: js.UndefOr[RDSDatabaseUsername] = js.native
  /**
    * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
    */
  var ResourceRole: js.UndefOr[EDPResourceRole] = js.native
  /**
    * The SQL query that is supplied during CreateDataSourceFromRDS. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.native
  /**
    * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
    */
  var ServiceRole: js.UndefOr[EDPServiceRole] = js.native
}

object RDSMetadata {
  @scala.inline
  def apply(
    DataPipelineId: EDPPipelineId = null,
    Database: RDSDatabase = null,
    DatabaseUserName: RDSDatabaseUsername = null,
    ResourceRole: EDPResourceRole = null,
    SelectSqlQuery: RDSSelectSqlQuery = null,
    ServiceRole: EDPServiceRole = null
  ): RDSMetadata = {
    val __obj = js.Dynamic.literal()
    if (DataPipelineId != null) __obj.updateDynamic("DataPipelineId")(DataPipelineId.asInstanceOf[js.Any])
    if (Database != null) __obj.updateDynamic("Database")(Database.asInstanceOf[js.Any])
    if (DatabaseUserName != null) __obj.updateDynamic("DatabaseUserName")(DatabaseUserName.asInstanceOf[js.Any])
    if (ResourceRole != null) __obj.updateDynamic("ResourceRole")(ResourceRole.asInstanceOf[js.Any])
    if (SelectSqlQuery != null) __obj.updateDynamic("SelectSqlQuery")(SelectSqlQuery.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSMetadata]
  }
}

