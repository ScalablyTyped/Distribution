package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHttpNamespaceResponse extends js.Object {
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.servicediscoveryMod.OperationId] = js.native
}

object CreateHttpNamespaceResponse {
  @scala.inline
  def apply(): CreateHttpNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHttpNamespaceResponse]
  }
  @scala.inline
  implicit class CreateHttpNamespaceResponseOps[Self <: CreateHttpNamespaceResponse] (val x: Self) extends AnyVal {
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
    def setOperationId(value: OperationId): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
  }
  
}

