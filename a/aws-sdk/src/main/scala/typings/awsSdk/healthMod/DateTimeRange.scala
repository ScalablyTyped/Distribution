package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeRange extends js.Object {
  
  /**
    * The starting date and time of a time range.
    */
  var from: js.UndefOr[timestamp] = js.native
  
  /**
    * The ending date and time of a time range.
    */
  var to: js.UndefOr[timestamp] = js.native
}
object DateTimeRange {
  
  @scala.inline
  def apply(): DateTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeRange]
  }
  
  @scala.inline
  implicit class DateTimeRangeOps[Self <: DateTimeRange] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: timestamp): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setTo(value: timestamp): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
