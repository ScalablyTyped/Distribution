package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRefreshSchemasStatusResponse extends js.Object {
  /**
    * The status of the schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typings.awsSdk.dmsMod.RefreshSchemasStatus] = js.native
}

object DescribeRefreshSchemasStatusResponse {
  @scala.inline
  def apply(RefreshSchemasStatus: RefreshSchemasStatus = null): DescribeRefreshSchemasStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (RefreshSchemasStatus != null) __obj.updateDynamic("RefreshSchemasStatus")(RefreshSchemasStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRefreshSchemasStatusResponse]
  }
}

