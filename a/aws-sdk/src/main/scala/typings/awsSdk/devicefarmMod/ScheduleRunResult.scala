package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleRunResult extends js.Object {
  
  /**
    * Information about the scheduled run.
    */
  var run: js.UndefOr[Run] = js.native
}
object ScheduleRunResult {
  
  @scala.inline
  def apply(): ScheduleRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRunResult]
  }
  
  @scala.inline
  implicit class ScheduleRunResultOps[Self <: ScheduleRunResult] (val x: Self) extends AnyVal {
    
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
    def setRun(value: Run): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
}
