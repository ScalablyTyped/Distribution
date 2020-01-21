package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCollectionRequest extends js.Object {
  /**
    * ID of the collection to delete.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId = js.native
}

object DeleteCollectionRequest {
  @scala.inline
  def apply(CollectionId: CollectionId): DeleteCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCollectionRequest]
  }
}

