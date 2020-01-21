package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrailsResponse extends js.Object {
  /**
    * The token to use to get the next page of results after a previous API call. If the token does not appear, there are no more results to return. The token must be passed in with the same parameters as the previous call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns the name, ARN, and home region of trails in the current account.
    */
  var Trails: js.UndefOr[typings.awsSdk.cloudtrailMod.Trails] = js.native
}

object ListTrailsResponse {
  @scala.inline
  def apply(NextToken: String = null, Trails: Trails = null): ListTrailsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Trails != null) __obj.updateDynamic("Trails")(Trails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrailsResponse]
  }
}

