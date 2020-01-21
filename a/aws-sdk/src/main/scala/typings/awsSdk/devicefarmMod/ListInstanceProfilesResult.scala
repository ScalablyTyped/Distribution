package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceProfilesResult extends js.Object {
  /**
    * An object that contains information about your instance profiles.
    */
  var instanceProfiles: js.UndefOr[InstanceProfiles] = js.native
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListInstanceProfilesResult {
  @scala.inline
  def apply(instanceProfiles: InstanceProfiles = null, nextToken: PaginationToken = null): ListInstanceProfilesResult = {
    val __obj = js.Dynamic.literal()
    if (instanceProfiles != null) __obj.updateDynamic("instanceProfiles")(instanceProfiles.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceProfilesResult]
  }
}

