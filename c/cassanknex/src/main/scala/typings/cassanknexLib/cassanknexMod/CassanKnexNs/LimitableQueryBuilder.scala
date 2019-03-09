package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

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
    limit: js.Function1[scala.Double, LimitableQueryBuilder],
    limitPerPartition: js.Function1[scala.Double, LimitableQueryBuilder]
  ): LimitableQueryBuilder = {
    val __obj = js.Dynamic.literal(limit = limit, limitPerPartition = limitPerPartition)
  
    __obj.asInstanceOf[LimitableQueryBuilder]
  }
}

