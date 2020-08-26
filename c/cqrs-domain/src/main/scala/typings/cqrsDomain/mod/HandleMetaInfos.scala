package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleMetaInfos extends js.Object {
  var aggregate: String = js.native
  var aggregateId: String = js.native
  var context: String = js.native
}

object HandleMetaInfos {
  @scala.inline
  def apply(aggregate: String, aggregateId: String, context: String): HandleMetaInfos = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], aggregateId = aggregateId.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleMetaInfos]
  }
  @scala.inline
  implicit class HandleMetaInfosOps[Self <: HandleMetaInfos] (val x: Self) extends AnyVal {
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
    def setAggregate(value: String): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregateId(value: String): Self = this.set("aggregateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

