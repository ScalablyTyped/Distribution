package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuthorizersResponse extends js.Object {
  /**
    * The authorizers.
    */
  var authorizers: js.UndefOr[Authorizers] = js.native
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}

object ListAuthorizersResponse {
  @scala.inline
  def apply(authorizers: Authorizers = null, nextMarker: Marker = null): ListAuthorizersResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizers != null) __obj.updateDynamic("authorizers")(authorizers.asInstanceOf[js.Any])
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuthorizersResponse]
  }
}

