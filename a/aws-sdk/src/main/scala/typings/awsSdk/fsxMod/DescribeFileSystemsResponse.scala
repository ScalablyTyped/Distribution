package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemsResponse extends js.Object {
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[typings.awsSdk.fsxMod.FileSystems] = js.native
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextToken value in the later request to fetch the descriptions. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
}

object DescribeFileSystemsResponse {
  @scala.inline
  def apply(): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
  @scala.inline
  implicit class DescribeFileSystemsResponseOps[Self <: DescribeFileSystemsResponse] (val x: Self) extends AnyVal {
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
    def setFileSystemsVarargs(value: FileSystem*): Self = this.set("FileSystems", js.Array(value :_*))
    @scala.inline
    def setFileSystems(value: FileSystems): Self = this.set("FileSystems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystems: Self = this.set("FileSystems", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

