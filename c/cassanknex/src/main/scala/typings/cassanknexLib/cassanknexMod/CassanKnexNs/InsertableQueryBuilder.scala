package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertableQueryBuilder extends js.Object {
  def ifNotExists(): this.type
  def into(table: java.lang.String): this.type
}

object InsertableQueryBuilder {
  @scala.inline
  def apply(
    ifNotExists: js.Function0[InsertableQueryBuilder],
    into: js.Function1[java.lang.String, InsertableQueryBuilder]
  ): InsertableQueryBuilder = {
    val __obj = js.Dynamic.literal(ifNotExists = ifNotExists, into = into)
  
    __obj.asInstanceOf[InsertableQueryBuilder]
  }
}

