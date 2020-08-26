package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddHeaderAction extends js.Object {
  /**
    * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
    */
  var HeaderName: typings.awsSdk.sesMod.HeaderName = js.native
  /**
    * Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
    */
  var HeaderValue: typings.awsSdk.sesMod.HeaderValue = js.native
}

object AddHeaderAction {
  @scala.inline
  def apply(HeaderName: HeaderName, HeaderValue: HeaderValue): AddHeaderAction = {
    val __obj = js.Dynamic.literal(HeaderName = HeaderName.asInstanceOf[js.Any], HeaderValue = HeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddHeaderAction]
  }
  @scala.inline
  implicit class AddHeaderActionOps[Self <: AddHeaderAction] (val x: Self) extends AnyVal {
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
    def setHeaderName(value: HeaderName): Self = this.set("HeaderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderValue(value: HeaderValue): Self = this.set("HeaderValue", value.asInstanceOf[js.Any])
  }
  
}

