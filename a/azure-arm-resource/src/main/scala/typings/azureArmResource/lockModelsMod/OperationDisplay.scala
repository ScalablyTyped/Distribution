package typings.azureArmResource.lockModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationDisplay extends js.Object {
  /**
    * Operation type: Read, write, delete, etc.
    */
  var operation: js.UndefOr[String] = js.native
  /**
    * Service provider: Microsoft.Authorization
    */
  var provider: js.UndefOr[String] = js.native
  /**
    * Resource on which the operation is performed: Profile, endpoint, etc.
    */
  var resource: js.UndefOr[String] = js.native
}

object OperationDisplay {
  @scala.inline
  def apply(): OperationDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDisplay]
  }
  @scala.inline
  implicit class OperationDisplayOps[Self <: OperationDisplay] (val x: Self) extends AnyVal {
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
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

