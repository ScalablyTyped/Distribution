package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationListEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
  
  /**
    * Represents a list of URLs of a location. LocationUri returns an array that contains a list of locations when the ListLocations operation is called. Format: TYPE://GLOBAL_ID/SUBDIR. TYPE designates the type of location. Valid values: NFS | EFS | S3. GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is us-east-2.fs-abcd1234. An example for Amazon S3 is the bucket name, such as myBucket. An example for NFS is a valid IPv4 address or a host name compliant with Domain Name Service (DNS). SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat as the root of the location. 
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.undefined
}
object LocationListEntry {
  
  @scala.inline
  def apply(): LocationListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationListEntry]
  }
  
  @scala.inline
  implicit class LocationListEntryMutableBuilder[Self <: LocationListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
  }
}
