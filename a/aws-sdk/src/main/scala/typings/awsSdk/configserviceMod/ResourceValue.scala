package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceValue extends js.Object {
  /**
    * The value is a resource ID.
    */
  var Value: ResourceValueType = js.native
}

object ResourceValue {
  @scala.inline
  def apply(Value: ResourceValueType): ResourceValue = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceValue]
  }
  @scala.inline
  implicit class ResourceValueOps[Self <: ResourceValue] (val x: Self) extends AnyVal {
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
    def setValue(value: ResourceValueType): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

