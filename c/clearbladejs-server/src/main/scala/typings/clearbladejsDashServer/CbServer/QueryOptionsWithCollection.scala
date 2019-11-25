package typings.clearbladejsDashServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsWithCollection
  extends CollectionOptionsWithCollection
     with QueryOptions

object QueryOptionsWithCollection {
  @scala.inline
  def apply(collection: String, limit: Int | Double = null, offset: Int | Double = null): QueryOptionsWithCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithCollection]
  }
}

