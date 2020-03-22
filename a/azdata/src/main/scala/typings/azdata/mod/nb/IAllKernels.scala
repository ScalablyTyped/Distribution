package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAllKernels extends js.Object {
  var defaultKernel: String
  var kernels: js.Array[IKernelSpec]
}

object IAllKernels {
  @scala.inline
  def apply(defaultKernel: String, kernels: js.Array[IKernelSpec]): IAllKernels = {
    val __obj = js.Dynamic.literal(defaultKernel = defaultKernel.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAllKernels]
  }
}

