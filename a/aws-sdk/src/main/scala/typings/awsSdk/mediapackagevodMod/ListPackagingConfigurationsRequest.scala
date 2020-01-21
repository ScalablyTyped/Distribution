package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagingConfigurationsRequest extends js.Object {
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackagevodMod.MaxResults] = js.native
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Returns MediaPackage VOD PackagingConfigurations associated with the specified PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
}

object ListPackagingConfigurationsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: string = null, PackagingGroupId: string = null): ListPackagingConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagingConfigurationsRequest]
  }
}

