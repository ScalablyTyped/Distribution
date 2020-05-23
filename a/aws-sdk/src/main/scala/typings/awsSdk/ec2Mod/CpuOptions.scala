package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuOptions extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}

object CpuOptions {
  @scala.inline
  def apply(CoreCount: js.UndefOr[Integer] = js.undefined, ThreadsPerCore: js.UndefOr[Integer] = js.undefined): CpuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CoreCount)) __obj.updateDynamic("CoreCount")(CoreCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ThreadsPerCore)) __obj.updateDynamic("ThreadsPerCore")(ThreadsPerCore.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuOptions]
  }
}

