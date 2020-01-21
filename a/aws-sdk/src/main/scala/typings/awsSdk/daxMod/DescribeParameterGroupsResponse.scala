package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeParameterGroupsResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * An array of parameter groups. Each element in the array represents one parameter group.
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.native
}

object DescribeParameterGroupsResponse {
  @scala.inline
  def apply(NextToken: String = null, ParameterGroups: ParameterGroupList = null): DescribeParameterGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ParameterGroups != null) __obj.updateDynamic("ParameterGroups")(ParameterGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeParameterGroupsResponse]
  }
}

