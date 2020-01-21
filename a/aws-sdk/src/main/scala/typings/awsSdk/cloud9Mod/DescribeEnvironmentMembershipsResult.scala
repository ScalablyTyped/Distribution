package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentMembershipsResult extends js.Object {
  /**
    * Information about the environment members for the environment.
    */
  var memberships: js.UndefOr[EnvironmentMembersList] = js.native
  /**
    * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeEnvironmentMembershipsResult {
  @scala.inline
  def apply(memberships: EnvironmentMembersList = null, nextToken: String = null): DescribeEnvironmentMembershipsResult = {
    val __obj = js.Dynamic.literal()
    if (memberships != null) __obj.updateDynamic("memberships")(memberships.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentMembershipsResult]
  }
}

