package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportConfigurationsResponse extends js.Object {
  /**
    * 
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.native
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportConfigurationsResponse {
  @scala.inline
  def apply(exportsInfo: ExportsInfo = null, nextToken: NextToken = null): DescribeExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (exportsInfo != null) __obj.updateDynamic("exportsInfo")(exportsInfo.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportConfigurationsResponse]
  }
}

