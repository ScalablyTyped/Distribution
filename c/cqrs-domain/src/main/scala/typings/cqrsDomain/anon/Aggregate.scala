package typings.cqrsDomain.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  var aggregate: String
  var aggregateId: String
  var context: String
}

object Aggregate {
  @scala.inline
  def apply(aggregate: String, aggregateId: String, context: String): Aggregate = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], aggregateId = aggregateId.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
}

