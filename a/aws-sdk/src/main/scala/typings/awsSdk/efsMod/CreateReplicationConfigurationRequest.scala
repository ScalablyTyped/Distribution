package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationConfigurationRequest extends StObject {
  
  /**
    * An array of destination configuration objects. Only one destination configuration object is supported.
    */
  var Destinations: DestinationsToCreate
  
  /**
    * Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a source or destination file system in another replication configuration.
    */
  var SourceFileSystemId: FileSystemId
}
object CreateReplicationConfigurationRequest {
  
  inline def apply(Destinations: DestinationsToCreate, SourceFileSystemId: FileSystemId): CreateReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal(Destinations = Destinations.asInstanceOf[js.Any], SourceFileSystemId = SourceFileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationConfigurationRequest]
  }
  
  extension [Self <: CreateReplicationConfigurationRequest](x: Self) {
    
    inline def setDestinations(value: DestinationsToCreate): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsVarargs(value: DestinationToCreate*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setSourceFileSystemId(value: FileSystemId): Self = StObject.set(x, "SourceFileSystemId", value.asInstanceOf[js.Any])
  }
}
