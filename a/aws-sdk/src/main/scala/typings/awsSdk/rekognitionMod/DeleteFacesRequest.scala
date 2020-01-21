package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFacesRequest extends js.Object {
  /**
    * Collection from which to remove the specific faces.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId = js.native
  /**
    * An array of face IDs to delete.
    */
  var FaceIds: FaceIdList = js.native
}

object DeleteFacesRequest {
  @scala.inline
  def apply(CollectionId: CollectionId, FaceIds: FaceIdList): DeleteFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], FaceIds = FaceIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFacesRequest]
  }
}

