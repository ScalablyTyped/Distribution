package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagingConfigurationsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * A list of MediaPackage VOD PackagingConfiguration resources.
    */
  var PackagingConfigurations: js.UndefOr[listOfPackagingConfiguration] = js.native
}

object ListPackagingConfigurationsResponse {
  @scala.inline
  def apply(NextToken: string = null, PackagingConfigurations: listOfPackagingConfiguration = null): ListPackagingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PackagingConfigurations != null) __obj.updateDynamic("PackagingConfigurations")(PackagingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagingConfigurationsResponse]
  }
}

