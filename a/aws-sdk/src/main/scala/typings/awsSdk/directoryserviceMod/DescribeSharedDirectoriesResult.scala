package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSharedDirectoriesResult extends js.Object {
  /**
    * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSharedDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * A list of all shared directories in your account.
    */
  var SharedDirectories: js.UndefOr[typings.awsSdk.directoryserviceMod.SharedDirectories] = js.native
}

object DescribeSharedDirectoriesResult {
  @scala.inline
  def apply(): DescribeSharedDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSharedDirectoriesResult]
  }
  @scala.inline
  implicit class DescribeSharedDirectoriesResultOps[Self <: DescribeSharedDirectoriesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSharedDirectoriesVarargs(value: SharedDirectory*): Self = this.set("SharedDirectories", js.Array(value :_*))
    @scala.inline
    def setSharedDirectories(value: SharedDirectories): Self = this.set("SharedDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedDirectories: Self = this.set("SharedDirectories", js.undefined)
  }
  
}

