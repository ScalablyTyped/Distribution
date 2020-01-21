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
  def apply(FileSystems: FileSystems = null, NextToken: NextToken = null): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystems != null) __obj.updateDynamic("FileSystems")(FileSystems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
}

