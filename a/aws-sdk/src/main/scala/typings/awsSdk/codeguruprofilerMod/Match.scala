package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  /**
    * The location in the profiling graph that contains a recommendation found during analysis.
    */
  var frameAddress: js.UndefOr[String] = js.native
  /**
    * The target frame that triggered a match.
    */
  var targetFramesIndex: js.UndefOr[Integer] = js.native
  /**
    * The value in the profile data that exceeded the recommendation threshold.
    */
  var thresholdBreachValue: js.UndefOr[Double] = js.native
}

object Match {
  @scala.inline
  def apply(): Match = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Match]
  }
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
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
    def setFrameAddress(value: String): Self = this.set("frameAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameAddress: Self = this.set("frameAddress", js.undefined)
    @scala.inline
    def setTargetFramesIndex(value: Integer): Self = this.set("targetFramesIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetFramesIndex: Self = this.set("targetFramesIndex", js.undefined)
    @scala.inline
    def setThresholdBreachValue(value: Double): Self = this.set("thresholdBreachValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdBreachValue: Self = this.set("thresholdBreachValue", js.undefined)
  }
  
}

