package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBasedLinear extends js.Object {
  /**
    * The number of minutes between each incremental traffic shift of a TimeBasedLinear deployment.
    */
  var linearInterval: js.UndefOr[WaitTimeInMins] = js.native
  /**
    * The percentage of traffic that is shifted at the start of each increment of a TimeBasedLinear deployment.
    */
  var linearPercentage: js.UndefOr[Percentage] = js.native
}

object TimeBasedLinear {
  @scala.inline
  def apply(): TimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedLinear]
  }
  @scala.inline
  implicit class TimeBasedLinearOps[Self <: TimeBasedLinear] (val x: Self) extends AnyVal {
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
    def setLinearInterval(value: WaitTimeInMins): Self = this.set("linearInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearInterval: Self = this.set("linearInterval", js.undefined)
    @scala.inline
    def setLinearPercentage(value: Percentage): Self = this.set("linearPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearPercentage: Self = this.set("linearPercentage", js.undefined)
  }
  
}

