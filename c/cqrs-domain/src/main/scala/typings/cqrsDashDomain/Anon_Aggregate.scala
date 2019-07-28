package typings.cqrsDashDomain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregate extends js.Object {
  var aggregate: String
  var aggregateId: String
  var context: String
}

object Anon_Aggregate {
  @scala.inline
  def apply(aggregate: String, aggregateId: String, context: String): Anon_Aggregate = {
    val __obj = js.Dynamic.literal(aggregate = aggregate, aggregateId = aggregateId, context = context)
  
    __obj.asInstanceOf[Anon_Aggregate]
  }
}

