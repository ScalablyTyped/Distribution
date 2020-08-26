package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrialComponentRequest extends js.Object {
  /**
    * The name of the trial component to describe.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}

object DescribeTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): DescribeTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrialComponentRequest]
  }
  @scala.inline
  implicit class DescribeTrialComponentRequestOps[Self <: DescribeTrialComponentRequest] (val x: Self) extends AnyVal {
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
    def setTrialComponentName(value: ExperimentEntityName): Self = this.set("TrialComponentName", value.asInstanceOf[js.Any])
  }
  
}

