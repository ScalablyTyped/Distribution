package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOptionsWithID extends js.Object {
  var collectionID: java.lang.String
}

object CollectionOptionsWithID {
  @scala.inline
  def apply(collectionID: java.lang.String): CollectionOptionsWithID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectionID")(collectionID)
    __obj.asInstanceOf[CollectionOptionsWithID]
  }
}

