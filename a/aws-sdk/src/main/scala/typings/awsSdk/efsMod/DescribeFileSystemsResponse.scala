package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemsResponse extends js.Object {
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[FileSystemDescriptions] = js.native
  /**
    * Present if provided by caller in the request (String).
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.native
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextMarker in the subsequent request to fetch the descriptions.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeFileSystemsResponse {
  @scala.inline
  def apply(FileSystems: FileSystemDescriptions = null, Marker: Marker = null, NextMarker: Marker = null): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystems != null) __obj.updateDynamic("FileSystems")(FileSystems.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
}

