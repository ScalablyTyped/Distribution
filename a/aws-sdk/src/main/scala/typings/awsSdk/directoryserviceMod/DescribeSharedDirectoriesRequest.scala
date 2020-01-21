package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSharedDirectoriesRequest extends js.Object {
  /**
    * The number of shared directories to return in the response object.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The DescribeSharedDirectoriesResult.NextToken value from a previous call to DescribeSharedDirectories. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * Returns the identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: DirectoryId = js.native
  /**
    * A list of identifiers of all shared directories in your account. 
    */
  var SharedDirectoryIds: js.UndefOr[DirectoryIds] = js.native
}

object DescribeSharedDirectoriesRequest {
  @scala.inline
  def apply(
    OwnerDirectoryId: DirectoryId,
    Limit: Int | Double = null,
    NextToken: NextToken = null,
    SharedDirectoryIds: DirectoryIds = null
  ): DescribeSharedDirectoriesRequest = {
    val __obj = js.Dynamic.literal(OwnerDirectoryId = OwnerDirectoryId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SharedDirectoryIds != null) __obj.updateDynamic("SharedDirectoryIds")(SharedDirectoryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSharedDirectoriesRequest]
  }
}

