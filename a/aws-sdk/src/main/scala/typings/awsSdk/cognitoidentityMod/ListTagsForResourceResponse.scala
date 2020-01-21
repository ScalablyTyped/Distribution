package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * The tags that are assigned to the identity pool.
    */
  var Tags: js.UndefOr[IdentityPoolTagsType] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: IdentityPoolTagsType = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

