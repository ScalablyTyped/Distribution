package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFacesResponse extends js.Object {
  /**
    * An array of faces that matched the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * ID of the face that was searched for matches in a collection.
    */
  var SearchedFaceId: js.UndefOr[FaceId] = js.native
}

object SearchFacesResponse {
  @scala.inline
  def apply(): SearchFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFacesResponse]
  }
  @scala.inline
  implicit class SearchFacesResponseOps[Self <: SearchFacesResponse] (val x: Self) extends AnyVal {
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
    def setFaceMatchesVarargs(value: FaceMatch*): Self = this.set("FaceMatches", js.Array(value :_*))
    @scala.inline
    def setFaceMatches(value: FaceMatchList): Self = this.set("FaceMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceMatches: Self = this.set("FaceMatches", js.undefined)
    @scala.inline
    def setFaceModelVersion(value: String): Self = this.set("FaceModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceModelVersion: Self = this.set("FaceModelVersion", js.undefined)
    @scala.inline
    def setSearchedFaceId(value: FaceId): Self = this.set("SearchedFaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchedFaceId: Self = this.set("SearchedFaceId", js.undefined)
  }
  
}

