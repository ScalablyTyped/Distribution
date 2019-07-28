package typings.clearbladejsDashClient.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsWithID
  extends CollectionOptionsWithID
     with QueryOptions

object QueryOptionsWithID {
  @scala.inline
  def apply(collectionID: String, limit: Int | Double = null, offset: Int | Double = null): QueryOptionsWithID = {
    val __obj = js.Dynamic.literal(collectionID = collectionID)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithID]
  }
}

