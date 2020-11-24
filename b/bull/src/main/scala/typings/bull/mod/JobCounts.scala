package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobCounts extends js.Object {
  
  var active: Double = js.native
  
  var completed: Double = js.native
  
  var delayed: Double = js.native
  
  var failed: Double = js.native
  
  var waiting: Double = js.native
}
object JobCounts {
  
  @scala.inline
  def apply(active: Double, completed: Double, delayed: Double, failed: Double, waiting: Double): JobCounts = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], delayed = delayed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCounts]
  }
  
  @scala.inline
  implicit class JobCountsOps[Self <: JobCounts] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayed(value: Double): Self = this.set("delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaiting(value: Double): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
}
