package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationConfigurationRequest extends StObject {
  
  /**
    * The ID of the source file system in the replication configuration.
    */
  var SourceFileSystemId: FileSystemId
}
object DeleteReplicationConfigurationRequest {
  
  inline def apply(SourceFileSystemId: FileSystemId): DeleteReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal(SourceFileSystemId = SourceFileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationConfigurationRequest]
  }
  
  extension [Self <: DeleteReplicationConfigurationRequest](x: Self) {
    
    inline def setSourceFileSystemId(value: FileSystemId): Self = StObject.set(x, "SourceFileSystemId", value.asInstanceOf[js.Any])
  }
}
