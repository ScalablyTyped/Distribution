package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAttributesRequest extends js.Object {
  /**
    * An array of the attributes to remove from all the endpoints that are associated with the application. The array can specify the complete, exact name of each attribute to remove or it can specify a glob pattern that an attribute name must match in order for the attribute to be removed.
    */
  var Blacklist: js.UndefOr[ListOfString] = js.native
}

object UpdateAttributesRequest {
  @scala.inline
  def apply(Blacklist: ListOfString = null): UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (Blacklist != null) __obj.updateDynamic("Blacklist")(Blacklist.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAttributesRequest]
  }
}

