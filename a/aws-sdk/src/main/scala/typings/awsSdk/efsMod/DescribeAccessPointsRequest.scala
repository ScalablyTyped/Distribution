package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPointsRequest extends js.Object {
  /**
    * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with FileSystemId.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.efsMod.AccessPointId] = js.native
  /**
    * (Optional) If you provide a FileSystemId, EFS returns all access points for that file system; mutually exclusive with AccessPointId.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  /**
    * (Optional) When retrieving all access points for a file system, you can optionally specify the MaxItems parameter to limit the number of objects returned in a response. The default value is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.efsMod.MaxResults] = js.native
  /**
    *  NextToken is present if the response is paginated. You can use NextMarker in the subsequent request to fetch the next page of access point descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeAccessPointsRequest {
  @scala.inline
  def apply(
    AccessPointId: AccessPointId = null,
    FileSystemId: FileSystemId = null,
    MaxResults: Int | Double = null,
    NextToken: Token = null
  ): DescribeAccessPointsRequest = {
    val __obj = js.Dynamic.literal()
    if (AccessPointId != null) __obj.updateDynamic("AccessPointId")(AccessPointId.asInstanceOf[js.Any])
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPointsRequest]
  }
}

