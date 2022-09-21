package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexFacesResponse extends StObject {
  
  /**
    * The version number of the face detection model that's associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An array of faces detected and added to the collection. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. 
    */
  var FaceRecords: js.UndefOr[FaceRecordList] = js.undefined
  
  /**
    * If your collection is associated with a face detection model that's later than version 3.0, the value of OrientationCorrection is always null and no orientation information is returned. If your collection is associated with a face detection model that's version 3.0 or earlier, the following applies:   If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction - the bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. The value of OrientationCorrection is null.   If the image doesn't contain orientation information in its Exif metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform image correction for images. The bounding box coordinates aren't translated and represent the object locations before the image is rotated.   Bounding box information is returned in the FaceRecords array. You can get the version of the face detection model by calling DescribeCollection. 
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.rekognitionMod.OrientationCorrection] = js.undefined
  
  /**
    * An array of faces that were detected in the image but weren't indexed. They weren't indexed because the quality filter identified them as low quality, or the MaxFaces request parameter filtered them out. To use the quality filter, you specify the QualityFilter request parameter.
    */
  var UnindexedFaces: js.UndefOr[typings.awsSdk.rekognitionMod.UnindexedFaces] = js.undefined
}
object IndexFacesResponse {
  
  inline def apply(): IndexFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexFacesResponse]
  }
  
  extension [Self <: IndexFacesResponse](x: Self) {
    
    inline def setFaceModelVersion(value: String): Self = StObject.set(x, "FaceModelVersion", value.asInstanceOf[js.Any])
    
    inline def setFaceModelVersionUndefined: Self = StObject.set(x, "FaceModelVersion", js.undefined)
    
    inline def setFaceRecords(value: FaceRecordList): Self = StObject.set(x, "FaceRecords", value.asInstanceOf[js.Any])
    
    inline def setFaceRecordsUndefined: Self = StObject.set(x, "FaceRecords", js.undefined)
    
    inline def setFaceRecordsVarargs(value: FaceRecord*): Self = StObject.set(x, "FaceRecords", js.Array(value*))
    
    inline def setOrientationCorrection(value: OrientationCorrection): Self = StObject.set(x, "OrientationCorrection", value.asInstanceOf[js.Any])
    
    inline def setOrientationCorrectionUndefined: Self = StObject.set(x, "OrientationCorrection", js.undefined)
    
    inline def setUnindexedFaces(value: UnindexedFaces): Self = StObject.set(x, "UnindexedFaces", value.asInstanceOf[js.Any])
    
    inline def setUnindexedFacesUndefined: Self = StObject.set(x, "UnindexedFaces", js.undefined)
    
    inline def setUnindexedFacesVarargs(value: UnindexedFace*): Self = StObject.set(x, "UnindexedFaces", js.Array(value*))
  }
}
