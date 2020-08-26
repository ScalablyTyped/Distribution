package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexFacesResponse extends js.Object {
  /**
    * The version number of the face detection model that's associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * An array of faces detected and added to the collection. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. 
    */
  var FaceRecords: js.UndefOr[FaceRecordList] = js.native
  /**
    * If your collection is associated with a face detection model that's later than version 3.0, the value of OrientationCorrection is always null and no orientation information is returned. If your collection is associated with a face detection model that's version 3.0 or earlier, the following applies:   If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction - the bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. The value of OrientationCorrection is null.   If the image doesn't contain orientation information in its Exif metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform image correction for images. The bounding box coordinates aren't translated and represent the object locations before the image is rotated.   Bounding box information is returned in the FaceRecords array. You can get the version of the face detection model by calling DescribeCollection. 
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.rekognitionMod.OrientationCorrection] = js.native
  /**
    * An array of faces that were detected in the image but weren't indexed. They weren't indexed because the quality filter identified them as low quality, or the MaxFaces request parameter filtered them out. To use the quality filter, you specify the QualityFilter request parameter.
    */
  var UnindexedFaces: js.UndefOr[typings.awsSdk.rekognitionMod.UnindexedFaces] = js.native
}

object IndexFacesResponse {
  @scala.inline
  def apply(): IndexFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexFacesResponse]
  }
  @scala.inline
  implicit class IndexFacesResponseOps[Self <: IndexFacesResponse] (val x: Self) extends AnyVal {
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
    def setFaceRecordsVarargs(value: FaceRecord*): Self = this.set("FaceRecords", js.Array(value :_*))
    @scala.inline
    def setFaceRecords(value: FaceRecordList): Self = this.set("FaceRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceRecords: Self = this.set("FaceRecords", js.undefined)
    @scala.inline
    def setOrientationCorrection(value: OrientationCorrection): Self = this.set("OrientationCorrection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientationCorrection: Self = this.set("OrientationCorrection", js.undefined)
    @scala.inline
    def setUnindexedFacesVarargs(value: UnindexedFace*): Self = this.set("UnindexedFaces", js.Array(value :_*))
    @scala.inline
    def setUnindexedFaces(value: UnindexedFaces): Self = this.set("UnindexedFaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnindexedFaces: Self = this.set("UnindexedFaces", js.undefined)
  }
  
}

