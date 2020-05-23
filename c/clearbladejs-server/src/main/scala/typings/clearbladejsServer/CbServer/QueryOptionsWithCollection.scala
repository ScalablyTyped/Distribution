package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsWithCollection
  extends CollectionOptionsWithCollection
     with QueryOptions

object QueryOptionsWithCollection {
  @scala.inline
  def apply(
    collection: String,
    limit: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined
  ): QueryOptionsWithCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithCollection]
  }
}

