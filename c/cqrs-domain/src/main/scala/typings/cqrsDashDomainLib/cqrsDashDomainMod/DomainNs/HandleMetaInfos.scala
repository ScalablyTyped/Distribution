package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleMetaInfos extends js.Object {
  var aggregate: java.lang.String
  var aggregateId: java.lang.String
  var context: java.lang.String
}

object HandleMetaInfos {
  @scala.inline
  def apply(aggregate: java.lang.String, aggregateId: java.lang.String, context: java.lang.String): HandleMetaInfos = {
    val __obj = js.Dynamic.literal(aggregate = aggregate, aggregateId = aggregateId, context = context)
  
    __obj.asInstanceOf[HandleMetaInfos]
  }
}

