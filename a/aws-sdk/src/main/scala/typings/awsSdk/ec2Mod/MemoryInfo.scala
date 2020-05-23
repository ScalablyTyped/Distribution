package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  /**
    * Size of the memory, in MiB.
    */
  var SizeInMiB: js.UndefOr[MemorySize] = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(SizeInMiB: js.UndefOr[MemorySize] = js.undefined): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SizeInMiB)) __obj.updateDynamic("SizeInMiB")(SizeInMiB.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

