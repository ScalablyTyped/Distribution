package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryRunTimeline extends js.Object {
  
  /**
    * The end time of the run.
    */
  var Completed: js.UndefOr[Timestamp] = js.native
  
  /**
    * The start time of the run.
    */
  var Started: js.UndefOr[Timestamp] = js.native
}
object CanaryRunTimeline {
  
  @scala.inline
  def apply(): CanaryRunTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunTimeline]
  }
  
  @scala.inline
  implicit class CanaryRunTimelineOps[Self <: CanaryRunTimeline] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: Timestamp): Self = this.set("Completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("Completed", js.undefined)
    
    @scala.inline
    def setStarted(value: Timestamp): Self = this.set("Started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted: Self = this.set("Started", js.undefined)
  }
}
