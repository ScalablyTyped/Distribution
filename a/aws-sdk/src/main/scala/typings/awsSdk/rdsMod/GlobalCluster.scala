package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalCluster extends StObject {
  
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
  implicit class GlobalClusterMutableBuilder[Self <: GlobalCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setGlobalClusterArn(value: String): Self = StObject.set(x, "GlobalClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterArnUndefined: Self = StObject.set(x, "GlobalClusterArn", js.undefined)
    
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    @scala.inline
    def setGlobalClusterMembers(value: GlobalClusterMemberList): Self = StObject.set(x, "GlobalClusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterMembersUndefined: Self = StObject.set(x, "GlobalClusterMembers", js.undefined)
    
    @scala.inline
    def setGlobalClusterMembersVarargs(value: GlobalClusterMember*): Self = StObject.set(x, "GlobalClusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setGlobalClusterResourceId(value: String): Self = StObject.set(x, "GlobalClusterResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterResourceIdUndefined: Self = StObject.set(x, "GlobalClusterResourceId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
  }
}
