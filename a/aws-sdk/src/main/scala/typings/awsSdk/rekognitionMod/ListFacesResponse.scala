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
  def apply(FaceModelVersion: String = null, Faces: FaceList = null, NextToken: String = null): ListFacesResponse = {
    val __obj = js.Dynamic.literal()
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion.asInstanceOf[js.Any])
    if (Faces != null) __obj.updateDynamic("Faces")(Faces.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFacesResponse]
  }
}

