package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityProfilesForTargetResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of security profiles and their associated targets.
    */
  var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.native
}

object ListSecurityProfilesForTargetResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, securityProfileTargetMappings: SecurityProfileTargetMappings = null): ListSecurityProfilesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (securityProfileTargetMappings != null) __obj.updateDynamic("securityProfileTargetMappings")(securityProfileTargetMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityProfilesForTargetResponse]
  }
}

