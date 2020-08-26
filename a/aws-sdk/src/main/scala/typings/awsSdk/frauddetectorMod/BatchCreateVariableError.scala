package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateVariableError extends js.Object {
  /**
    * The error code. 
    */
  var code: js.UndefOr[integer] = js.native
  /**
    * The error message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.native
}

object BatchCreateVariableError {
  @scala.inline
  def apply(): BatchCreateVariableError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateVariableError]
  }
  @scala.inline
  implicit class BatchCreateVariableErrorOps[Self <: BatchCreateVariableError] (val x: Self) extends AnyVal {
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
    def setCode(value: integer): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

