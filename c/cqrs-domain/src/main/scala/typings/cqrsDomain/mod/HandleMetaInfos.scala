package typings.cqrsDomain.mod

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
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], aggregateId = aggregateId.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandleMetaInfos]
  }
}

