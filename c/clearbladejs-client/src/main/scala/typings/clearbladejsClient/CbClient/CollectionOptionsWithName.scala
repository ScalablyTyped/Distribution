package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOptionsWithName extends js.Object {
  var collectionName: String
}

object CollectionOptionsWithName {
  @scala.inline
  def apply(collectionName: String): CollectionOptionsWithName = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectionOptionsWithName]
  }
}

