package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestreamTimestamp extends js.Object {
  
  /**
    * The precision of the timestamp value that results from the expression described in value. Valid values: SECONDS | MILLISECONDS | MICROSECONDS | NANOSECONDS. The default is MILLISECONDS.
    */
  var unit: TimestreamTimestampUnit = js.native
  
  /**
    * An expression that returns a long epoch time value.
    */
  var value: TimestreamTimestampValue = js.native
}
object TimestreamTimestamp {
  
  @scala.inline
  def apply(unit: TimestreamTimestampUnit, value: TimestreamTimestampValue): TimestreamTimestamp = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamTimestamp]
  }
  
  @scala.inline
  implicit class TimestreamTimestampOps[Self <: TimestreamTimestamp] (val x: Self) extends AnyVal {
    
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
    def setUnit(value: TimestreamTimestampUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TimestreamTimestampValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
