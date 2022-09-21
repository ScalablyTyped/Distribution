package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfigurationDescription extends StObject {
  
  /**
    * Describes when the replication configuration was created.
    */
  var CreationTime: js.Date
  
  /**
    * An array of destination objects. Only one destination object is supported.
    */
  var Destinations: typings.awsSdk.efsMod.Destinations
  
  /**
    * The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication configuration.
    */
  var OriginalSourceFileSystemArn: FileSystemArn
  
  /**
    * The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
    */
  var SourceFileSystemArn: FileSystemArn
  
  /**
    * The ID of the source Amazon EFS file system that is being replicated.
    */
  var SourceFileSystemId: FileSystemId
  
  /**
    * The Amazon Web Services Region in which the source Amazon EFS file system is located.
    */
  var SourceFileSystemRegion: RegionName
}
object ReplicationConfigurationDescription {
  
  inline def apply(
    CreationTime: js.Date,
    Destinations: Destinations,
    OriginalSourceFileSystemArn: FileSystemArn,
    SourceFileSystemArn: FileSystemArn,
    SourceFileSystemId: FileSystemId,
    SourceFileSystemRegion: RegionName
  ): ReplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], Destinations = Destinations.asInstanceOf[js.Any], OriginalSourceFileSystemArn = OriginalSourceFileSystemArn.asInstanceOf[js.Any], SourceFileSystemArn = SourceFileSystemArn.asInstanceOf[js.Any], SourceFileSystemId = SourceFileSystemId.asInstanceOf[js.Any], SourceFileSystemRegion = SourceFileSystemRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfigurationDescription]
  }
  
  extension [Self <: ReplicationConfigurationDescription](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setOriginalSourceFileSystemArn(value: FileSystemArn): Self = StObject.set(x, "OriginalSourceFileSystemArn", value.asInstanceOf[js.Any])
    
    inline def setSourceFileSystemArn(value: FileSystemArn): Self = StObject.set(x, "SourceFileSystemArn", value.asInstanceOf[js.Any])
    
    inline def setSourceFileSystemId(value: FileSystemId): Self = StObject.set(x, "SourceFileSystemId", value.asInstanceOf[js.Any])
    
    inline def setSourceFileSystemRegion(value: RegionName): Self = StObject.set(x, "SourceFileSystemRegion", value.asInstanceOf[js.Any])
  }
}
