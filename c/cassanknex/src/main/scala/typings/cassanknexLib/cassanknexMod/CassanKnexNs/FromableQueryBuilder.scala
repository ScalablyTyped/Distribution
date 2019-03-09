package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromableQueryBuilder extends js.Object {
  def from(table: java.lang.String): this.type
}

object FromableQueryBuilder {
  @scala.inline
  def apply(from: js.Function1[java.lang.String, FromableQueryBuilder]): FromableQueryBuilder = {
    val __obj = js.Dynamic.literal(from = from)
  
    __obj.asInstanceOf[FromableQueryBuilder]
  }
}

