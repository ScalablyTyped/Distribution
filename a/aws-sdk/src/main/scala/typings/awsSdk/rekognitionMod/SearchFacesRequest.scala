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
  def apply(
    CollectionId: CollectionId,
    FaceId: FaceId,
    FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
    MaxFaces: js.UndefOr[MaxFaces] = js.undefined
  ): SearchFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], FaceId = FaceId.asInstanceOf[js.Any])
    if (!js.isUndefined(FaceMatchThreshold)) __obj.updateDynamic("FaceMatchThreshold")(FaceMatchThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxFaces)) __obj.updateDynamic("MaxFaces")(MaxFaces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFacesRequest]
  }
}

