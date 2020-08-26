package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticInferenceAcceleratorHealth extends js.Object {
  /**
    *  The health status of the Elastic Inference Accelerator. 
    */
  var status: js.UndefOr[AcceleratorHealthStatus] = js.native
}

object ElasticInferenceAcceleratorHealth {
  @scala.inline
  def apply(): ElasticInferenceAcceleratorHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAcceleratorHealth]
  }
  @scala.inline
  implicit class ElasticInferenceAcceleratorHealthOps[Self <: ElasticInferenceAcceleratorHealth] (val x: Self) extends AnyVal {
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
    def setStatus(value: AcceleratorHealthStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

