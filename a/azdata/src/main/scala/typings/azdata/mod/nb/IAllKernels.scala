package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAllKernels extends js.Object {
  var defaultKernel: String = js.native
  var kernels: js.Array[IKernelSpec] = js.native
}

object IAllKernels {
  @scala.inline
  def apply(defaultKernel: String, kernels: js.Array[IKernelSpec]): IAllKernels = {
    val __obj = js.Dynamic.literal(defaultKernel = defaultKernel.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAllKernels]
  }
  @scala.inline
  implicit class IAllKernelsOps[Self <: IAllKernels] (val x: Self) extends AnyVal {
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
    def setDefaultKernel(value: String): Self = this.set("defaultKernel", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernelsVarargs(value: IKernelSpec*): Self = this.set("kernels", js.Array(value :_*))
    @scala.inline
    def setKernels(value: js.Array[IKernelSpec]): Self = this.set("kernels", value.asInstanceOf[js.Any])
  }
  
}

