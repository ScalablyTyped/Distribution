package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePolicyOutput extends js.Object {
  /**
    * The object lifecycle policy that is assigned to the container.
    */
  var LifecyclePolicy: typings.awsSdk.mediastoreMod.LifecyclePolicy = js.native
}

object GetLifecyclePolicyOutput {
  @scala.inline
  def apply(LifecyclePolicy: LifecyclePolicy): GetLifecyclePolicyOutput = {
    val __obj = js.Dynamic.literal(LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyOutput]
  }
  @scala.inline
  implicit class GetLifecyclePolicyOutputOps[Self <: GetLifecyclePolicyOutput] (val x: Self) extends AnyVal {
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
    def setLifecyclePolicy(value: LifecyclePolicy): Self = this.set("LifecyclePolicy", value.asInstanceOf[js.Any])
  }
  
}

