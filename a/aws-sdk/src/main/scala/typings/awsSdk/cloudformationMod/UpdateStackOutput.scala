package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStackOutput extends js.Object {
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
}

object UpdateStackOutput {
  @scala.inline
  def apply(): UpdateStackOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackOutput]
  }
  @scala.inline
  implicit class UpdateStackOutputOps[Self <: UpdateStackOutput] (val x: Self) extends AnyVal {
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
    def setStackId(value: StackId): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

