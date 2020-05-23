package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  /**
    *  The size in mebibytes of the Elastic Inference Accelerator type. 
    */
  var sizeInMiB: js.UndefOr[Integer] = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(sizeInMiB: js.UndefOr[Integer] = js.undefined): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sizeInMiB)) __obj.updateDynamic("sizeInMiB")(sizeInMiB.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

