package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLaunchTemplateVersionsResult extends js.Object {
  /**
    * Information about the launch template versions.
    */
  var LaunchTemplateVersions: js.UndefOr[LaunchTemplateVersionSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLaunchTemplateVersionsResult {
  @scala.inline
  def apply(LaunchTemplateVersions: LaunchTemplateVersionSet = null, NextToken: String = null): DescribeLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateVersions != null) __obj.updateDynamic("LaunchTemplateVersions")(LaunchTemplateVersions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLaunchTemplateVersionsResult]
  }
}

