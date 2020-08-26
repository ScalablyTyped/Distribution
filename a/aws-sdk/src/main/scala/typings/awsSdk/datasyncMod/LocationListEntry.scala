package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * Represents a list of URLs of a location. LocationUri returns an array that contains a list of locations when the ListLocations operation is called. Format: TYPE://GLOBAL_ID/SUBDIR. TYPE designates the type of location. Valid values: NFS | EFS | S3. GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is us-east-2.fs-abcd1234. An example for Amazon S3 is the bucket name, such as myBucket. An example for NFS is a valid IPv4 address or a host name compliant with Domain Name Service (DNS). SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat as the root of the location. 
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
}

object LocationListEntry {
  @scala.inline
  def apply(): LocationListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationListEntry]
  }
  @scala.inline
  implicit class LocationListEntryOps[Self <: LocationListEntry] (val x: Self) extends AnyVal {
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
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
    @scala.inline
    def setLocationUri(value: LocationUri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
  }
  
}

