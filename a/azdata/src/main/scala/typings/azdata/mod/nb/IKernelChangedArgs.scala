package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKernelChangedArgs extends js.Object {
  var newValue: IKernel | Null = js.native
  var oldValue: IKernel | Null = js.native
}

object IKernelChangedArgs {
  @scala.inline
  def apply(): IKernelChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKernelChangedArgs]
  }
  @scala.inline
  implicit class IKernelChangedArgsOps[Self <: IKernelChangedArgs] (val x: Self) extends AnyVal {
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
    def setNewValue(value: IKernel): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValueNull: Self = this.set("newValue", null)
    @scala.inline
    def setOldValue(value: IKernel): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
  }
  
}

