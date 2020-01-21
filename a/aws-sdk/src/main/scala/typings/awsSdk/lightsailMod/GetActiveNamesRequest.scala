package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActiveNamesRequest extends js.Object {
  /**
    * A token used for paginating results from your get active names request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetActiveNamesRequest {
  @scala.inline
  def apply(pageToken: String = null): GetActiveNamesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActiveNamesRequest]
  }
}

