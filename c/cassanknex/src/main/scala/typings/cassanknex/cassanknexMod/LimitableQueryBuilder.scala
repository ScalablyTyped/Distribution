package typings.cassanknex.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitableQueryBuilder extends js.Object {
  def limit(limit: Double): this.type
  def limitPerPartition(limit: Double): this.type
}

object LimitableQueryBuilder {
  @scala.inline
  def apply(limit: Double => LimitableQueryBuilder, limitPerPartition: Double => LimitableQueryBuilder): LimitableQueryBuilder = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction1(limit), limitPerPartition = js.Any.fromFunction1(limitPerPartition))
  
    __obj.asInstanceOf[LimitableQueryBuilder]
  }
}

