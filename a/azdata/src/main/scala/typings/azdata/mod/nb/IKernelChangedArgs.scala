package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKernelChangedArgs extends js.Object {
  var newValue: IKernel | Null
  var oldValue: IKernel | Null
}

object IKernelChangedArgs {
  @scala.inline
  def apply(newValue: IKernel = null, oldValue: IKernel = null): IKernelChangedArgs = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelChangedArgs]
  }
}

