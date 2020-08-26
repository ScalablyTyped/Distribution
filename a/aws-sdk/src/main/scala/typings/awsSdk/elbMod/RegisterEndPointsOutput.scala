package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterEndPointsOutput extends js.Object {
  /**
    * The updated list of instances for the load balancer.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.native
}

object RegisterEndPointsOutput {
  @scala.inline
  def apply(): RegisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterEndPointsOutput]
  }
  @scala.inline
  implicit class RegisterEndPointsOutputOps[Self <: RegisterEndPointsOutput] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: Instance*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: Instances): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
  }
  
}

