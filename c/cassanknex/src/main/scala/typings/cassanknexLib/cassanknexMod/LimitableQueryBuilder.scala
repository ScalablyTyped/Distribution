package typings
package cassanknexLib.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitableQueryBuilder extends js.Object {
  def limit(limit: scala.Double): this.type
  def limitPerPartition(limit: scala.Double): this.type
}

object LimitableQueryBuilder {
  @scala.inline
  def apply(
    limit: scala.Double => LimitableQueryBuilder,
    limitPerPartition: scala.Double => LimitableQueryBuilder
  ): LimitableQueryBuilder = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction1(limit), limitPerPartition = js.Any.fromFunction1(limitPerPartition))
  
    __obj.asInstanceOf[LimitableQueryBuilder]
  }
}

