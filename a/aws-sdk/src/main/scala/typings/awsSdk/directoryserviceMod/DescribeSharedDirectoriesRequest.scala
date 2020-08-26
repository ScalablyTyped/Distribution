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
  def apply(OwnerDirectoryId: DirectoryId): DescribeSharedDirectoriesRequest = {
    val __obj = js.Dynamic.literal(OwnerDirectoryId = OwnerDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSharedDirectoriesRequest]
  }
  @scala.inline
  implicit class DescribeSharedDirectoriesRequestOps[Self <: DescribeSharedDirectoriesRequest] (val x: Self) extends AnyVal {
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
    def setOwnerDirectoryId(value: DirectoryId): Self = this.set("OwnerDirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSharedDirectoryIdsVarargs(value: DirectoryId*): Self = this.set("SharedDirectoryIds", js.Array(value :_*))
    @scala.inline
    def setSharedDirectoryIds(value: DirectoryIds): Self = this.set("SharedDirectoryIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedDirectoryIds: Self = this.set("SharedDirectoryIds", js.undefined)
  }
  
}

