package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Times extends js.Object {
  
  var cycle: Double = js.native
  
  var elapsed: Double = js.native
  
  var period: Double = js.native
  
  var timeStamp: Double = js.native
}
object Times {
  
  @scala.inline
  def apply(cycle: Double, elapsed: Double, period: Double, timeStamp: Double): Times = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Times]
  }
  
  @scala.inline
  implicit class TimesOps[Self <: Times] (val x: Self) extends AnyVal {
    
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
    def setCycle(value: Double): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
}
