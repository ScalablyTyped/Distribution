package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemsRequest extends js.Object {
  /**
    * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
    */
  var FileSystemIds: js.UndefOr[typings.awsSdk.fsxMod.FileSystemIds] = js.native
  /**
    * (Optional) Maximum number of file systems to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.fsxMod.MaxResults] = js.native
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeFileSystems operation (String). If a token present, the action continues the list from where the returning call left off.
    */
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
}

object DescribeFileSystemsRequest {
  @scala.inline
  def apply(FileSystemIds: FileSystemIds = null, MaxResults: Int | Double = null, NextToken: NextToken = null): DescribeFileSystemsRequest = {
    val __obj = js.Dynamic.literal()
    if (FileSystemIds != null) __obj.updateDynamic("FileSystemIds")(FileSystemIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemsRequest]
  }
}

