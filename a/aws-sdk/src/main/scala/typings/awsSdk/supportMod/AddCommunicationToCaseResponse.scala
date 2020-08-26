package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCommunicationToCaseResponse extends js.Object {
  /**
    * True if AddCommunicationToCase succeeds. Otherwise, returns an error.
    */
  var result: js.UndefOr[Result] = js.native
}

object AddCommunicationToCaseResponse {
  @scala.inline
  def apply(): AddCommunicationToCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCommunicationToCaseResponse]
  }
  @scala.inline
  implicit class AddCommunicationToCaseResponseOps[Self <: AddCommunicationToCaseResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: Result): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

