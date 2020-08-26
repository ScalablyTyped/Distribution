package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationRange extends js.Object {
  /**
    * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
    */
  var maxSeconds: js.UndefOr[AssessmentRunDuration] = js.native
  /**
    * The minimum value of the duration range. Must be greater than zero.
    */
  var minSeconds: js.UndefOr[AssessmentRunDuration] = js.native
}

object DurationRange {
  @scala.inline
  def apply(): DurationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationRange]
  }
  @scala.inline
  implicit class DurationRangeOps[Self <: DurationRange] (val x: Self) extends AnyVal {
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
    def setMaxSeconds(value: AssessmentRunDuration): Self = this.set("maxSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSeconds: Self = this.set("maxSeconds", js.undefined)
    @scala.inline
    def setMinSeconds(value: AssessmentRunDuration): Self = this.set("minSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSeconds: Self = this.set("minSeconds", js.undefined)
  }
  
}

