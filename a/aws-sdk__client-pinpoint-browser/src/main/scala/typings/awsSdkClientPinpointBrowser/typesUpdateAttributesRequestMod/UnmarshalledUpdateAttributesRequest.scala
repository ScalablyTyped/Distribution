package typings.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledUpdateAttributesRequest extends UpdateAttributesRequest {
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  @JSName("Blacklist")
  var Blacklist_UnmarshalledUpdateAttributesRequest: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledUpdateAttributesRequest {
  @scala.inline
  def apply(): UnmarshalledUpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledUpdateAttributesRequest]
  }
  @scala.inline
  implicit class UnmarshalledUpdateAttributesRequestOps[Self <: UnmarshalledUpdateAttributesRequest] (val x: Self) extends AnyVal {
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
    def setBlacklistVarargs(value: String*): Self = this.set("Blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("Blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("Blacklist", js.undefined)
  }
  
}

