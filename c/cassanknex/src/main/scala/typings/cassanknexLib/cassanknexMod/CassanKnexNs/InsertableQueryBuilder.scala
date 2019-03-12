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
  def apply(ifNotExists: () => InsertableQueryBuilder, into: java.lang.String => InsertableQueryBuilder): InsertableQueryBuilder = {
    val __obj = js.Dynamic.literal(ifNotExists = js.Any.fromFunction0(ifNotExists), into = js.Any.fromFunction1(into))
  
    __obj.asInstanceOf[InsertableQueryBuilder]
  }
}

