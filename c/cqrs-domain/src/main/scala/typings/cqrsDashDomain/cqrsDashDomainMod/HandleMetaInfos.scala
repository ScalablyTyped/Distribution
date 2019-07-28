package typings.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleMetaInfos extends js.Object {
  var aggregate: String
  var aggregateId: String
  var context: String
}

object HandleMetaInfos {
  @scala.inline
  def apply(aggregate: String, aggregateId: String, context: String): HandleMetaInfos = {
    val __obj = js.Dynamic.literal(aggregate = aggregate, aggregateId = aggregateId, context = context)
  
    __obj.asInstanceOf[HandleMetaInfos]
  }
}

