package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStaticIpsRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get static IPs request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetStaticIpsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetStaticIpsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticIpsRequest]
  }
}

