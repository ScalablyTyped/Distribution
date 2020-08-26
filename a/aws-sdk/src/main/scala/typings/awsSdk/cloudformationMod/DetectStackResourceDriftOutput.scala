package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackResourceDriftOutput extends js.Object {
  /**
    * Information about whether the resource's actual configuration has drifted from its expected template configuration, including actual and expected property values and any differences detected.
    */
  var StackResourceDrift: typings.awsSdk.cloudformationMod.StackResourceDrift = js.native
}

object DetectStackResourceDriftOutput {
  @scala.inline
  def apply(StackResourceDrift: StackResourceDrift): DetectStackResourceDriftOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrift = StackResourceDrift.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackResourceDriftOutput]
  }
  @scala.inline
  implicit class DetectStackResourceDriftOutputOps[Self <: DetectStackResourceDriftOutput] (val x: Self) extends AnyVal {
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
    def setStackResourceDrift(value: StackResourceDrift): Self = this.set("StackResourceDrift", value.asInstanceOf[js.Any])
  }
  
}

