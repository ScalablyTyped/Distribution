package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionOptionsWithID extends js.Object {
  var collectionID: String = js.native
}

object CollectionOptionsWithID {
  @scala.inline
  def apply(collectionID: String): CollectionOptionsWithID = {
    val __obj = js.Dynamic.literal(collectionID = collectionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptionsWithID]
  }
  @scala.inline
  implicit class CollectionOptionsWithIDOps[Self <: CollectionOptionsWithID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectionID(value: String): Self = this.set("collectionID", value.asInstanceOf[js.Any])
  }
  
}

