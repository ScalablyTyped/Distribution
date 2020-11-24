package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFacesByImageResponse extends js.Object {
  
  /**
    * An array of faces that match the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  
  /**
    * The bounding box around the face in the input image that Amazon Rekognition used for the search.
    */
  var SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.native
  
  /**
    * The level of confidence that the searchedFaceBoundingBox, contains a face.
    */
  var SearchedFaceConfidence: js.UndefOr[Percent] = js.native
}
object SearchFacesByImageResponse {
  
  @scala.inline
  def apply(): SearchFacesByImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFacesByImageResponse]
  }
  
  @scala.inline
  implicit class SearchFacesByImageResponseOps[Self <: SearchFacesByImageResponse] (val x: Self) extends AnyVal {
    
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
    def setSearchedFaceBoundingBox(value: BoundingBox): Self = this.set("SearchedFaceBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchedFaceBoundingBox: Self = this.set("SearchedFaceBoundingBox", js.undefined)
    
    @scala.inline
    def setSearchedFaceConfidence(value: Percent): Self = this.set("SearchedFaceConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchedFaceConfidence: Self = this.set("SearchedFaceConfidence", js.undefined)
  }
}
