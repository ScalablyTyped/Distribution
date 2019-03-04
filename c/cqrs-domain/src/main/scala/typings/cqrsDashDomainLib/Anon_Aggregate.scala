package typings
package cqrsDashDomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregate extends js.Object {
  var aggregate: java.lang.String
  var aggregateId: java.lang.String
  var context: java.lang.String
}

object Anon_Aggregate {
  @scala.inline
  def apply(aggregate: java.lang.String, aggregateId: java.lang.String, context: java.lang.String): Anon_Aggregate = {
    val __obj = js.Dynamic.literal(aggregate = aggregate, aggregateId = aggregateId, context = context)
  
    __obj.asInstanceOf[Anon_Aggregate]
  }
}

