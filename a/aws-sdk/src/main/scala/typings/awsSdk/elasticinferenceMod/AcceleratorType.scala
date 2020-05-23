package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorType extends js.Object {
  /**
    *  The name of the Elastic Inference Accelerator type. 
    */
  var acceleratorTypeName: js.UndefOr[AcceleratorTypeName] = js.native
  /**
    *  The memory information of the Elastic Inference Accelerator type. 
    */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.native
  /**
    *  The throughput information of the Elastic Inference Accelerator type. 
    */
  var throughputInfo: js.UndefOr[ThroughputInfoList] = js.native
}

object AcceleratorType {
  @scala.inline
  def apply(
    acceleratorTypeName: AcceleratorTypeName = null,
    memoryInfo: MemoryInfo = null,
    throughputInfo: ThroughputInfoList = null
  ): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    if (acceleratorTypeName != null) __obj.updateDynamic("acceleratorTypeName")(acceleratorTypeName.asInstanceOf[js.Any])
    if (memoryInfo != null) __obj.updateDynamic("memoryInfo")(memoryInfo.asInstanceOf[js.Any])
    if (throughputInfo != null) __obj.updateDynamic("throughputInfo")(throughputInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorType]
  }
}

