package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalCluster extends StObject {
  
  /**
    * The default database name within the new global cluster.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The deletion protection setting for the new global cluster.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon DocumentDB database engine used by the global cluster. 
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the global cluster.
    */
  var GlobalClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a user-supplied global cluster identifier. This identifier is the unique key that identifies a global cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[typings.awsSdk.docdbMod.GlobalClusterIdentifier] = js.undefined
  
  /**
    * The list of cluster IDs for secondary clusters within the global cluster. Currently limited to one item. 
    */
  var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.undefined
  
  /**
    * The Amazon Web Services Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS customer master key (CMK) for the cluster is accessed. 
    */
  var GlobalClusterResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the current state of this global cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The storage encryption setting for the global cluster.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
}
object GlobalCluster {
  
  inline def apply(): GlobalCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalCluster]
  }
  
  extension [Self <: GlobalCluster](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalClusterArn(value: String): Self = StObject.set(x, "GlobalClusterArn", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterArnUndefined: Self = StObject.set(x, "GlobalClusterArn", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    inline def setGlobalClusterMembers(value: GlobalClusterMemberList): Self = StObject.set(x, "GlobalClusterMembers", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterMembersUndefined: Self = StObject.set(x, "GlobalClusterMembers", js.undefined)
    
    inline def setGlobalClusterMembersVarargs(value: GlobalClusterMember*): Self = StObject.set(x, "GlobalClusterMembers", js.Array(value*))
    
    inline def setGlobalClusterResourceId(value: String): Self = StObject.set(x, "GlobalClusterResourceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterResourceIdUndefined: Self = StObject.set(x, "GlobalClusterResourceId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
  }
}
