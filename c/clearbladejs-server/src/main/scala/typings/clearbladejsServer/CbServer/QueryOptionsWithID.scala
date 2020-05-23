package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsWithID
  extends CollectionOptionsWithID
     with QueryOptions

object QueryOptionsWithID {
  @scala.inline
  def apply(
    collectionID: String,
    limit: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined
  ): QueryOptionsWithID = {
    val __obj = js.Dynamic.literal(collectionID = collectionID.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithID]
  }
}

