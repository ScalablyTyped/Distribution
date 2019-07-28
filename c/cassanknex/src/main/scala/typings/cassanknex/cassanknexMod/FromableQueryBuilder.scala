package typings.cassanknex.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromableQueryBuilder extends js.Object {
  def from(table: String): this.type
}

object FromableQueryBuilder {
  @scala.inline
  def apply(from: String => FromableQueryBuilder): FromableQueryBuilder = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from))
  
    __obj.asInstanceOf[FromableQueryBuilder]
  }
}

