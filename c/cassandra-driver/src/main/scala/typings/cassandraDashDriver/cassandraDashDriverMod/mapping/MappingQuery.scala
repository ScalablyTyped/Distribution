package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingQuery extends js.Object {
  var isCounter: Boolean
  var isIdempotent: Boolean
  var query: String
}

object MappingQuery {
  @scala.inline
  def apply(isCounter: Boolean, isIdempotent: Boolean, query: String): MappingQuery = {
    val __obj = js.Dynamic.literal(isCounter = isCounter, isIdempotent = isIdempotent, query = query)
  
    __obj.asInstanceOf[MappingQuery]
  }
}

