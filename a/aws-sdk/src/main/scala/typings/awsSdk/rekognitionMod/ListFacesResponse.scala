package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFacesResponse extends js.Object {
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * An array of Face objects. 
    */
  var Faces: js.UndefOr[FaceList] = js.native
  /**
    * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of faces.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFacesResponse {
  @scala.inline
  def apply(): ListFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacesResponse]
  }
  @scala.inline
  implicit class ListFacesResponseOps[Self <: ListFacesResponse] (val x: Self) extends AnyVal {
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
    def setFaceModelVersion(value: String): Self = this.set("FaceModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceModelVersion: Self = this.set("FaceModelVersion", js.undefined)
    @scala.inline
    def setFacesVarargs(value: Face*): Self = this.set("Faces", js.Array(value :_*))
    @scala.inline
    def setFaces(value: FaceList): Self = this.set("Faces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaces: Self = this.set("Faces", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

