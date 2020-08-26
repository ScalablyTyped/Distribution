package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitableQueryBuilder extends js.Object {
  def limit(limit: Double): this.type = js.native
  def limitPerPartition(limit: Double): this.type = js.native
}

object LimitableQueryBuilder {
  @scala.inline
  def apply(limit: Double => LimitableQueryBuilder, limitPerPartition: Double => LimitableQueryBuilder): LimitableQueryBuilder = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction1(limit), limitPerPartition = js.Any.fromFunction1(limitPerPartition))
    __obj.asInstanceOf[LimitableQueryBuilder]
  }
  @scala.inline
  implicit class LimitableQueryBuilderOps[Self <: LimitableQueryBuilder] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double => LimitableQueryBuilder): Self = this.set("limit", js.Any.fromFunction1(value))
    @scala.inline
    def setLimitPerPartition(value: Double => LimitableQueryBuilder): Self = this.set("limitPerPartition", js.Any.fromFunction1(value))
  }
  
}

