package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalNetworkRequest extends js.Object {
  /**
    * A description of the global network. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The tags to apply to the resource during creation.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateGlobalNetworkRequest {
  @scala.inline
  def apply(): CreateGlobalNetworkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalNetworkRequest]
  }
  @scala.inline
  implicit class CreateGlobalNetworkRequestOps[Self <: CreateGlobalNetworkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

