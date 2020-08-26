package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalCluster extends js.Object {
  /**
    *  The default database name within the new global database cluster. 
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    *  The deletion protection setting for the new global database cluster. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The Aurora database engine used by the global database cluster. 
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the global database cluster.
    */
  var GlobalClusterArn: js.UndefOr[String] = js.native
  /**
    *  Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item. 
    */
  var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.native
  /**
    *  The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed. 
    */
  var GlobalClusterResourceId: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this global database cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    *  The storage encryption setting for the global database cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.native
}

object GlobalCluster {
  @scala.inline
  def apply(): GlobalCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalCluster]
  }
  @scala.inline
  implicit class GlobalClusterOps[Self <: GlobalCluster] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setGlobalClusterArn(value: String): Self = this.set("GlobalClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterArn: Self = this.set("GlobalClusterArn", js.undefined)
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = this.set("GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterIdentifier: Self = this.set("GlobalClusterIdentifier", js.undefined)
    @scala.inline
    def setGlobalClusterMembersVarargs(value: GlobalClusterMember*): Self = this.set("GlobalClusterMembers", js.Array(value :_*))
    @scala.inline
    def setGlobalClusterMembers(value: GlobalClusterMemberList): Self = this.set("GlobalClusterMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterMembers: Self = this.set("GlobalClusterMembers", js.undefined)
    @scala.inline
    def setGlobalClusterResourceId(value: String): Self = this.set("GlobalClusterResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterResourceId: Self = this.set("GlobalClusterResourceId", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: BooleanOptional): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
  }
  
}

