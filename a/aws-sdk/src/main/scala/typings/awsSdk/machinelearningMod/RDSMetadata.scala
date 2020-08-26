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
  def apply(): RDSMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSMetadata]
  }
  @scala.inline
  implicit class RDSMetadataOps[Self <: RDSMetadata] (val x: Self) extends AnyVal {
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
    def setDataPipelineId(value: EDPPipelineId): Self = this.set("DataPipelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataPipelineId: Self = this.set("DataPipelineId", js.undefined)
    @scala.inline
    def setDatabase(value: RDSDatabase): Self = this.set("Database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
    @scala.inline
    def setDatabaseUserName(value: RDSDatabaseUsername): Self = this.set("DatabaseUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseUserName: Self = this.set("DatabaseUserName", js.undefined)
    @scala.inline
    def setResourceRole(value: EDPResourceRole): Self = this.set("ResourceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRole: Self = this.set("ResourceRole", js.undefined)
    @scala.inline
    def setSelectSqlQuery(value: RDSSelectSqlQuery): Self = this.set("SelectSqlQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectSqlQuery: Self = this.set("SelectSqlQuery", js.undefined)
    @scala.inline
    def setServiceRole(value: EDPServiceRole): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
  }
  
}

