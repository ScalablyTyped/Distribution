package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChildrenResponse extends js.Object {
  /**
    * The list of children of the specified parent container.
    */
  var Children: js.UndefOr[typings.awsSdk.organizationsMod.Children] = js.native
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListChildrenResponse {
  @scala.inline
  def apply(Children: Children = null, NextToken: NextToken = null): ListChildrenResponse = {
    val __obj = js.Dynamic.literal()
    if (Children != null) __obj.updateDynamic("Children")(Children.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChildrenResponse]
  }
}

