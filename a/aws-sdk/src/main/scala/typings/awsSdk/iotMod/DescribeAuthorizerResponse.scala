package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuthorizerResponse extends js.Object {
  /**
    * The authorizer description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.native
}

object DescribeAuthorizerResponse {
  @scala.inline
  def apply(authorizerDescription: AuthorizerDescription = null): DescribeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizerDescription != null) __obj.updateDynamic("authorizerDescription")(authorizerDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuthorizerResponse]
  }
}

