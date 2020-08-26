package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceResponse extends js.Object {
  /**
    * The status of the operation.
    */
  var Status: String = js.native
}

object AddTagsToResourceResponse {
  @scala.inline
  def apply(Status: String): AddTagsToResourceResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceResponse]
  }
  @scala.inline
  implicit class AddTagsToResourceResponseOps[Self <: AddTagsToResourceResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

