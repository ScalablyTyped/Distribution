package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityAggregatesResponse extends js.Object {
  /**
    * The number of entities that are affected by each of the specified events.
    */
  var entityAggregates: js.UndefOr[EntityAggregateList] = js.native
}

object DescribeEntityAggregatesResponse {
  @scala.inline
  def apply(): DescribeEntityAggregatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityAggregatesResponse]
  }
  @scala.inline
  implicit class DescribeEntityAggregatesResponseOps[Self <: DescribeEntityAggregatesResponse] (val x: Self) extends AnyVal {
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
    def setEntityAggregatesVarargs(value: EntityAggregate*): Self = this.set("entityAggregates", js.Array(value :_*))
    @scala.inline
    def setEntityAggregates(value: EntityAggregateList): Self = this.set("entityAggregates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityAggregates: Self = this.set("entityAggregates", js.undefined)
  }
  
}

