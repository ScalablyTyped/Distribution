package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInputRequest extends js.Object {
  /**
    * The name of the input to delete.
    */
  var inputName: InputName = js.native
}

object DeleteInputRequest {
  @scala.inline
  def apply(inputName: InputName): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputRequest]
  }
  @scala.inline
  implicit class DeleteInputRequestOps[Self <: DeleteInputRequest] (val x: Self) extends AnyVal {
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
    def setInputName(value: InputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
  }
  
}

