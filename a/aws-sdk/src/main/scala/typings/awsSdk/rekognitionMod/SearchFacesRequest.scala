package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFacesRequest extends js.Object {
  /**
    * ID of the collection the face belongs to.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId = js.native
  /**
    * ID of a face to find matches for in the collection.
    */
  var FaceId: typings.awsSdk.rekognitionMod.FaceId = js.native
  /**
    * Optional value specifying the minimum confidence in the face match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%. 
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
  /**
    * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence in the match.
    */
  var MaxFaces: js.UndefOr[typings.awsSdk.rekognitionMod.MaxFaces] = js.native
}

object SearchFacesRequest {
  @scala.inline
  def apply(CollectionId: CollectionId, FaceId: FaceId): SearchFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], FaceId = FaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFacesRequest]
  }
  @scala.inline
  implicit class SearchFacesRequestOps[Self <: SearchFacesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectionId(value: CollectionId): Self = this.set("CollectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFaceId(value: FaceId): Self = this.set("FaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFaceMatchThreshold(value: Percent): Self = this.set("FaceMatchThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceMatchThreshold: Self = this.set("FaceMatchThreshold", js.undefined)
    @scala.inline
    def setMaxFaces(value: MaxFaces): Self = this.set("MaxFaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFaces: Self = this.set("MaxFaces", js.undefined)
  }
  
}

