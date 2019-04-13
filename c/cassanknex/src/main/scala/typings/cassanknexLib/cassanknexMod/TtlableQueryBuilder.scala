package typings
package cassanknexLib.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TtlableQueryBuilder extends js.Object {
  def usingTTL(ttl: scala.Double): this.type
  def usingTimestamp(timestamp: scala.Double): this.type
}

object TtlableQueryBuilder {
  @scala.inline
  def apply(usingTTL: scala.Double => TtlableQueryBuilder, usingTimestamp: scala.Double => TtlableQueryBuilder): TtlableQueryBuilder = {
    val __obj = js.Dynamic.literal(usingTTL = js.Any.fromFunction1(usingTTL), usingTimestamp = js.Any.fromFunction1(usingTimestamp))
  
    __obj.asInstanceOf[TtlableQueryBuilder]
  }
}

