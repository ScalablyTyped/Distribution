package typings.cqrsDomain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregate extends js.Object {
  var aggregate: String
  var aggregateId: String
  var context: String
}

object AnonAggregate {
  @scala.inline
  def apply(aggregate: String, aggregateId: String, context: String): AnonAggregate = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], aggregateId = aggregateId.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAggregate]
  }
}

