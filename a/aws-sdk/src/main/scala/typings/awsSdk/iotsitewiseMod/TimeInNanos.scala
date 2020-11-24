package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeInNanos extends js.Object {
  
  /**
    * The nanosecond offset from timeInSeconds.
    */
  var offsetInNanos: js.UndefOr[OffsetInNanos] = js.native
  
  /**
    * The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by offsetInNanos.
    */
  var timeInSeconds: TimeInSeconds = js.native
}
object TimeInNanos {
  
  @scala.inline
  def apply(timeInSeconds: TimeInSeconds): TimeInNanos = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInNanos]
  }
  
  @scala.inline
  implicit class TimeInNanosOps[Self <: TimeInNanos] (val x: Self) extends AnyVal {
    
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
    def setTimeInSeconds(value: TimeInSeconds): Self = this.set("timeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetInNanos(value: OffsetInNanos): Self = this.set("offsetInNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetInNanos: Self = this.set("offsetInNanos", js.undefined)
  }
}
