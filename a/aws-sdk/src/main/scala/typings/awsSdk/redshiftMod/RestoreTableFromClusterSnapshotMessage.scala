package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableFromClusterSnapshotMessage extends js.Object {
  
  /**
    * The identifier of the Amazon Redshift cluster to restore the table to.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * The name of the table to create as a result of the current request.
    */
  var NewTableName: String = js.native
  
  /**
    * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon Redshift cluster specified by the ClusterIdentifier parameter.
    */
  var SnapshotIdentifier: String = js.native
  
  /**
    * The name of the source database that contains the table to restore from.
    */
  var SourceDatabaseName: String = js.native
  
  /**
    * The name of the source schema that contains the table to restore from. If you do not specify a SourceSchemaName value, the default is public.
    */
  var SourceSchemaName: js.UndefOr[String] = js.native
  
  /**
    * The name of the source table to restore from.
    */
  var SourceTableName: String = js.native
  
  /**
    * The name of the database to restore the table to.
    */
  var TargetDatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The name of the schema to restore the table to.
    */
  var TargetSchemaName: js.UndefOr[String] = js.native
}
object RestoreTableFromClusterSnapshotMessage {
  
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    NewTableName: String,
    SnapshotIdentifier: String,
    SourceDatabaseName: String,
    SourceTableName: String
  ): RestoreTableFromClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], NewTableName = NewTableName.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any], SourceDatabaseName = SourceDatabaseName.asInstanceOf[js.Any], SourceTableName = SourceTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class RestoreTableFromClusterSnapshotMessageOps[Self <: RestoreTableFromClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTableName(value: String): Self = this.set("NewTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDatabaseName(value: String): Self = this.set("SourceDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableName(value: String): Self = this.set("SourceTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSchemaName(value: String): Self = this.set("SourceSchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSchemaName: Self = this.set("SourceSchemaName", js.undefined)
    
    @scala.inline
    def setTargetDatabaseName(value: String): Self = this.set("TargetDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDatabaseName: Self = this.set("TargetDatabaseName", js.undefined)
    
    @scala.inline
    def setTargetSchemaName(value: String): Self = this.set("TargetSchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSchemaName: Self = this.set("TargetSchemaName", js.undefined)
  }
}
