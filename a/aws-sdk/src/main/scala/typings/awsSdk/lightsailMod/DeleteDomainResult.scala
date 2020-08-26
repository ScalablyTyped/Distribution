package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainResult extends js.Object {
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object DeleteDomainResult {
  @scala.inline
  def apply(): DeleteDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDomainResult]
  }
  @scala.inline
  implicit class DeleteDomainResultOps[Self <: DeleteDomainResult] (val x: Self) extends AnyVal {
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
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
  }
  
}

