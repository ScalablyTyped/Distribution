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
  def apply(): UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttributesRequest]
  }
  @scala.inline
  implicit class UpdateAttributesRequestOps[Self <: UpdateAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlacklistVarargs(value: string*): Self = this.set("Blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: ListOfString): Self = this.set("Blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("Blacklist", js.undefined)
  }
  
}

