package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptionsWithID
  extends CollectionOptionsWithID
     with QueryOptions

object QueryOptionsWithID {
  @scala.inline
  def apply(collectionID: String): QueryOptionsWithID = {
    val __obj = js.Dynamic.literal(collectionID = collectionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithID]
  }
}

