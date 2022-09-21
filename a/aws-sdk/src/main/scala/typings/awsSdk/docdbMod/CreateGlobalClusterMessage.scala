package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalClusterMessage extends StObject {
  
  /**
    * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon DocumentDB will not create a database in the global cluster you are creating.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The deletion protection setting for the new global cluster. The global cluster can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the database engine to be used for this cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The engine version of the global cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster identifier of the new global cluster.
    */
  var GlobalClusterIdentifier: typings.awsSdk.docdbMod.GlobalClusterIdentifier
  
  /**
    * The Amazon Resource Name (ARN) to use as the primary cluster of the global cluster. This parameter is optional.
    */
  var SourceDBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The storage encryption setting for the new global cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
}
object CreateGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier): CreateGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalClusterMessage]
  }
  
  extension [Self <: CreateGlobalClusterMessage](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceDBClusterIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceDBClusterIdentifierUndefined: Self = StObject.set(x, "SourceDBClusterIdentifier", js.undefined)
    
    inline def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
  }
}
