package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TtlableQueryBuilder extends js.Object {
  def usingTTL(ttl: scala.Double): this.type
  def usingTimestamp(timestamp: scala.Double): this.type
}

object TtlableQueryBuilder {
  @scala.inline
  def apply(
    usingTTL: js.Function1[scala.Double, TtlableQueryBuilder],
    usingTimestamp: js.Function1[scala.Double, TtlableQueryBuilder]
  ): TtlableQueryBuilder = {
    val __obj = js.Dynamic.literal(usingTTL = usingTTL, usingTimestamp = usingTimestamp)
  
    __obj.asInstanceOf[TtlableQueryBuilder]
  }
}

