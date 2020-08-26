package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptionsWithCollection
  extends CollectionOptionsWithCollection
     with QueryOptions

object QueryOptionsWithCollection {
  @scala.inline
  def apply(collection: String): QueryOptionsWithCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithCollection]
  }
}

