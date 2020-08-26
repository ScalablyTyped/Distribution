package typings.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPoint extends js.Object {
  /**
    * The time, in epoch format, associated with a particular Value.
    */
  var Timestamp: ISOTimestamp = js.native
  /**
    * The actual value associated with a particular Timestamp.
    */
  var Value: Double = js.native
}

object DataPoint {
  @scala.inline
  def apply(Timestamp: ISOTimestamp, Value: Double): DataPoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
  @scala.inline
  implicit class DataPointOps[Self <: DataPoint] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: ISOTimestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

