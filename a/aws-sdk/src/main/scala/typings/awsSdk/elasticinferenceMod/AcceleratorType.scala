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
  def apply(): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorType]
  }
  @scala.inline
  implicit class AcceleratorTypeOps[Self <: AcceleratorType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceleratorTypeName(value: AcceleratorTypeName): Self = this.set("acceleratorTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorTypeName: Self = this.set("acceleratorTypeName", js.undefined)
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = this.set("memoryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryInfo: Self = this.set("memoryInfo", js.undefined)
    @scala.inline
    def setThroughputInfoVarargs(value: KeyValuePair*): Self = this.set("throughputInfo", js.Array(value :_*))
    @scala.inline
    def setThroughputInfo(value: ThroughputInfoList): Self = this.set("throughputInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThroughputInfo: Self = this.set("throughputInfo", js.undefined)
  }
  
}

