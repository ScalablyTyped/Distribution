package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryLastRun extends js.Object {
  /**
    * The name of the canary.
    */
  var CanaryName: js.UndefOr[typings.awsSdk.syntheticsMod.CanaryName] = js.native
  /**
    * The results from this canary's most recent run.
    */
  var LastRun: js.UndefOr[CanaryRun] = js.native
}

object CanaryLastRun {
  @scala.inline
  def apply(): CanaryLastRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryLastRun]
  }
  @scala.inline
  implicit class CanaryLastRunOps[Self <: CanaryLastRun] (val x: Self) extends AnyVal {
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
    def setCanaryName(value: CanaryName): Self = this.set("CanaryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanaryName: Self = this.set("CanaryName", js.undefined)
    @scala.inline
    def setLastRun(value: CanaryRun): Self = this.set("LastRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRun: Self = this.set("LastRun", js.undefined)
  }
  
}

