package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAggregate extends js.Object {
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[typings.awsSdk.healthMod.aggregateValue] = js.native
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[typings.awsSdk.healthMod.count] = js.native
}

object EventAggregate {
  @scala.inline
  def apply(): EventAggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAggregate]
  }
  @scala.inline
  implicit class EventAggregateOps[Self <: EventAggregate] (val x: Self) extends AnyVal {
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
    def setAggregateValue(value: aggregateValue): Self = this.set("aggregateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateValue: Self = this.set("aggregateValue", js.undefined)
    @scala.inline
    def setCount(value: count): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
  }
  
}

