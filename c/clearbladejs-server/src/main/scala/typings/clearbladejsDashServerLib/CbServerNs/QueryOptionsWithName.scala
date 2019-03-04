package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsWithName
  extends CollectionOptionsWithName
     with QueryOptions

object QueryOptionsWithName {
  @scala.inline
  def apply(
    collectionName: java.lang.String,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): QueryOptionsWithName = {
    val __obj = js.Dynamic.literal(collectionName = collectionName)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithName]
  }
}

