package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManagedScalingPolicyOutput extends js.Object {
  /**
    *  Specifies the managed scaling policy that is attached to an Amazon EMR cluster. 
    */
  var ManagedScalingPolicy: js.UndefOr[typings.awsSdk.emrMod.ManagedScalingPolicy] = js.native
}

object GetManagedScalingPolicyOutput {
  @scala.inline
  def apply(): GetManagedScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedScalingPolicyOutput]
  }
  @scala.inline
  implicit class GetManagedScalingPolicyOutputOps[Self <: GetManagedScalingPolicyOutput] (val x: Self) extends AnyVal {
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
    def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = this.set("ManagedScalingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedScalingPolicy: Self = this.set("ManagedScalingPolicy", js.undefined)
  }
  
}

