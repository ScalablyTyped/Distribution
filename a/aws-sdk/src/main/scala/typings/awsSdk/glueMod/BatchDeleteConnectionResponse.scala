package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteConnectionResponse extends js.Object {
  /**
    * A map of the names of connections that were not successfully deleted to error details.
    */
  var Errors: js.UndefOr[ErrorByName] = js.native
  /**
    * A list of names of the connection definitions that were successfully deleted.
    */
  var Succeeded: js.UndefOr[NameStringList] = js.native
}

object BatchDeleteConnectionResponse {
  @scala.inline
  def apply(): BatchDeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteConnectionResponse]
  }
  @scala.inline
  implicit class BatchDeleteConnectionResponseOps[Self <: BatchDeleteConnectionResponse] (val x: Self) extends AnyVal {
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
    def setErrors(value: ErrorByName): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    @scala.inline
    def setSucceededVarargs(value: NameString*): Self = this.set("Succeeded", js.Array(value :_*))
    @scala.inline
    def setSucceeded(value: NameStringList): Self = this.set("Succeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSucceeded: Self = this.set("Succeeded", js.undefined)
  }
  
}

